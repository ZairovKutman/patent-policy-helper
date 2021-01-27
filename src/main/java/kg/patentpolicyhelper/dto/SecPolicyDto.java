package kg.patentpolicyhelper.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Getter
@Setter
public class SecPolicyDto {

private String ugns;
private LocalDate datePolicy;
private String policyNum;
private String pin;
private String fio;
private String tarriffCode;
private Integer seven;
private String eight;
private String highlandCode;
private LocalDate dateBegin;
private LocalDate dateEnd;
private BigDecimal fot;
private BigDecimal sum;
private String activityType;
private String taxOfficesPin;
private Integer averageSalary;
private String comment;

    public SecPolicyDto(String ugns, LocalDate datePolicy, String policyNum, String pin, String fio, String tarriffCode, Integer seven, String eight, String highlandCode, LocalDate dateBegin, LocalDate dateEnd, BigDecimal fot, BigDecimal sum, String activityType,
                        String taxOfficesPin, Integer averageSalary, String comment) {
        this.ugns = ugns;
        this.datePolicy = datePolicy;
        this.policyNum = policyNum;
        this.pin = pin;
        this.fio = fio;
        this.tarriffCode = tarriffCode;
        this.seven = seven;
        this.eight = eight;
        this.highlandCode = highlandCode;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.fot = fot;
        this.sum = sum;
        this.activityType = activityType;
        this.taxOfficesPin = taxOfficesPin;
        this.averageSalary = averageSalary;
        this.comment=comment;
    }
    public SecPolicyDto(){
    }
}
