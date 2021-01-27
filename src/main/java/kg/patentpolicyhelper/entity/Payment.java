package kg.patentpolicyhelper.entity;

import kg.patentpolicyhelper.utility.Time;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "payments_list")
public class Payment {

    @Id
    @Column(name = "id")
    protected Long id;

    @DateTimeFormat(pattern = Time.DATE_TIME_FORMAT)
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @DateTimeFormat(pattern = Time.DATE_TIME_FORMAT)
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "payment_date")
    @DateTimeFormat(pattern = Time.DATE_FORMAT)
    private LocalDate paymentDate;
}
