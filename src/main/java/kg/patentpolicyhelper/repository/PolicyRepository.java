package kg.patentpolicyhelper.repository;

import kg.patentpolicyhelper.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

    @Query(value = "select substring(r.code_rayon,1,3) as kod,sp.created_at, sp.number as polucy_num,      " +
            "                        sp.pin,     " +
            "                        sp.full_name as fio ,    " +
            "                        ta.code as tariff_code,    " +
            "                        ta.sf_voluntary as seven,    " +
            "                        ta.sf_category as eight,    " +
            "                        null\\:\\:varchar as highland_code,    " +
            "                        sp.date_from as datebegin,    " +
            "                        sp.date_to as dateend,    " +
            "                        sp.insurance_base as fot,    " +
            "                        coalesce(sp.accumulative_sum,0) + coalesce(sp.pensioner_sum,0) as total,    " +
            "                        null\\:\\:varchar as activity_type,    " +
            "                        sp.employee_pin as tax_officer_pin,    " +
            "              case when substring(r.code_rayon,1,3) in ('057','058','059','060')   " +
            "              then    " +
            "               case when ta.truncated=true    " +
            "                 then 4   " +
            "                 else 2   " +
            "               end   " +
            "              else   " +
            "               case when ta.truncated=true    " +
            "                 then 3   " +
            "                 else 1   " +
            "               end   " +
            "              end    " +
            "              as average,     " +
            "                        null\\:\\:varchar as comment     " +
            "                        from policy sp     " +
            "                       inner join dict_rayons r on r.id=sp.rayon_fk   " +
            "                " +
            "                        inner join dict_tariff ta on ta.id=sp.tariff_fk  " +
            "                           " +
            "                          " +
            "            where ta.sf_category is not null and (sp.sys_doc_status in (?1) or sp.sys_doc_status is null) order by sp.created_at DESC limit ?2", nativeQuery = true )
    List<Object[]> findDtos(List<Integer> status, Integer limit);

    Policy findPolicyByNumber(String number);

}
