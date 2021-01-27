package kg.patentpolicyhelper.controller;

import kg.patentpolicyhelper.entity.Patent;
import kg.patentpolicyhelper.entity.Payment;
import kg.patentpolicyhelper.entity.Policy;
import kg.patentpolicyhelper.repository.PatentRepository;
import kg.patentpolicyhelper.repository.PaymentRepository;
import kg.patentpolicyhelper.repository.PolicyRepository;
import kg.patentpolicyhelper.utility.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class MainController {

    private final PatentRepository patentRepository;
    private final PolicyRepository policyRepository;
    private final PaymentRepository paymentRepository;

    @Autowired
    public MainController(PatentRepository patentRepository,
                          PolicyRepository policyRepository,
                          PaymentRepository paymentRepository) {
        this.patentRepository = patentRepository;
        this.policyRepository = policyRepository;
        this.paymentRepository = paymentRepository;
    }

    @GetMapping
    public ModelAndView get() {
        return new ModelAndView("index");
    }

    @PostMapping
    public ModelAndView post(@RequestParam("id") Long id,
                             @RequestParam("dateFrom") String dateFrom) {
        Optional<Patent> optional = patentRepository.findById(id);
        if (optional.isPresent()) {
            LocalTime time = LocalTime.now();
            LocalDate date = Time.DATE_V2_FORMATTER.parse(dateFrom, LocalDate::from);
            LocalDateTime dateTime = date.atTime(time);
            Patent patent = optional.get();
            patent.setCreatedAt(dateTime);
            patent.setUpdatedAt(dateTime.plusMinutes(3));
            patent.setDateFrom(date);
            patent.setDateTo(patent.getDateFrom().plusDays(patent.getDaysCount() - 1));
            patentRepository.save(patent);
            Payment patentPayment = patent.getPayment();
            if (Objects.nonNull(patentPayment)) {
                patentPayment.setCreatedAt(dateTime.plusMinutes(3));
                patentPayment.setUpdatedAt(null);
                patentPayment.setPaymentDate(date);
                paymentRepository.save(patentPayment);
            }
            Policy policy = patent.getPolicy();
            if (Objects.nonNull(policy)) {
                policy.setCreatedAt(patent.getCreatedAt());
                policy.setUpdatedAt(patent.getUpdatedAt());
                policy.setDateFrom(patent.getDateFrom());
                policy.setDateTo(patent.getDateTo());
                policyRepository.save(policy);
                Payment policyPayment = policy.getPayment();
                if (Objects.nonNull(policyPayment)) {
                    policyPayment.setCreatedAt(dateTime.plusMinutes(3));
                    policyPayment.setUpdatedAt(null);
                    policyPayment.setPaymentDate(date);
                    paymentRepository.save(policyPayment);
                }
            }
            return new ModelAndView("index")
                    .addObject("pdf", String.format("http://92.62.72.170:14002/patent/%d/pdf/%s", patent.getId(), patent.getHash()));
        }
        return new ModelAndView("index");
    }
}