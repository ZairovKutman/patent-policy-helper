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
@Table(name = "patent")
public class Patent {

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

    @Column(name = "days_count")
    private Integer daysCount;

    @OneToOne(mappedBy = "patent")
    private Policy policy;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @Column(name = "hash")
    private String hash;
}
