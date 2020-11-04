package kg.patentpolicyhelper.repository;

import kg.patentpolicyhelper.entity.Patent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatentRepository extends JpaRepository<Patent, Long> {

}
