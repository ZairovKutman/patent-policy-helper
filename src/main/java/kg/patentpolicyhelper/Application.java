package kg.patentpolicyhelper;

import kg.patentpolicyhelper.dto.SecPolicyDto;
import kg.patentpolicyhelper.repository.PolicyRepository;
import kg.patentpolicyhelper.service.SocFundService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@EnableScheduling
@SpringBootApplication
public class Application {
    private final PolicyRepository policyRepository;
    private final SocFundService socFundService;

    public Application(PolicyRepository policyRepository, SocFundService socFundService) {
        this.policyRepository = policyRepository;
        this.socFundService = socFundService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Scheduled(cron = "0 * * * * ?", zone = "Asia/Almaty")
    private void sendPoliciesToSf() throws Exception {
        //chekStatus();
        makePolicies();
        chekStatus();


    }

    private void makePolicies() throws Exception {
        List<SecPolicyDto> dtos;
        List<Object[]> policies;
        List<Integer> k;

        k=new ArrayList<>();
        k.add(0);
        System.out.println("start------");
        policies=policyRepository.findDtos(k,10);
        dtos=new ArrayList<>();
        for(Object[] ob:policies){
            SecPolicyDto dto=new SecPolicyDto(
                    (String)ob[0],
                    ((Timestamp) ob[1]).toLocalDateTime().toLocalDate(),
                    (String)ob[2],
                    (String)ob[3],
                    (String)ob[4],
                    (String)ob[5],
                    (Integer)ob[6],
                    (String)ob[7],
                    (String)ob[8],
                    ((Timestamp) ob[9]).toLocalDateTime().toLocalDate(),
                    ((Timestamp) ob[10]).toLocalDateTime().toLocalDate(),
                    (BigDecimal) ob[11],
                    (BigDecimal)ob[12],
                    (String)ob[13],
                    (String)ob[14],
                    (Integer)ob[15],
                    (String)ob[16]);


            System.out.println("===="+dto.getPin());
            System.out.println("===="+dto.getActivityType());
            System.out.println("===="+dto.getUgns());
            System.out.println("===="+dto.getFio());
            System.out.println("===="+dto.getDatePolicy());

            System.out.println("---"+dto.getUgns()+"---"+dto.getPin());
            dtos.add(dto);

        }
        socFundService.makePolicy(dtos);
    }

    private void chekStatus() throws Exception {
        List<Integer> k=new ArrayList<>();
        k.add(0);
        k.add(2);
        System.out.println("start------");
        List<Object[]> policies=policyRepository.findDtos(k,15);
        List<SecPolicyDto> dtos=new ArrayList<>();
        for(Object[] ob:policies){
            SecPolicyDto dto=new SecPolicyDto(
                    (String)ob[0],
                    ((Timestamp) ob[1]).toLocalDateTime().toLocalDate(),
                    (String)ob[2],
                    (String)ob[3],
                    (String)ob[4],
                    (String)ob[5],
                    (Integer)ob[6],
                    (String)ob[7],
                    (String)ob[8],
                    ((Timestamp) ob[9]).toLocalDateTime().toLocalDate(),
                    ((Timestamp) ob[10]).toLocalDateTime().toLocalDate(),
                    (BigDecimal) ob[11],
                    (BigDecimal)ob[12],
                    (String)ob[13],
                    (String)ob[14],
                    (Integer)ob[15],
                    (String)ob[16]);


            System.out.println("===="+dto.getPin());
            dtos.add(dto);

        }

        socFundService.checkState(dtos);
    }



}
