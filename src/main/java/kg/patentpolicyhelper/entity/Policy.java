package kg.patentpolicyhelper.entity;

import kg.patentpolicyhelper.utility.Time;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "policy")
public class Policy {

    @Id
    @Column(name = "id")
    protected Long id;

    @DateTimeFormat(pattern = Time.DATE_TIME_FORMAT)
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @DateTimeFormat(pattern = Time.DATE_TIME_FORMAT)
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @DateTimeFormat(pattern = Time.DATE_FORMAT)
    @Column(name = "date_from")
    private LocalDate dateFrom;

    @DateTimeFormat(pattern = Time.DATE_FORMAT)
    @Column(name = "date_to")
    private LocalDate dateTo;

    @OneToOne
    @JoinColumn(name = "patent_fk")
    private Patent patent;

    @ManyToOne
    @JoinColumn(name = "payment_fk")
    private Payment payment;
}
