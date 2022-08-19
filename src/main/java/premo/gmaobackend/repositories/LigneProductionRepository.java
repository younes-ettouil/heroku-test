package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import premo.gmaobackend.models.LigneProduction;

@Repository
public interface LigneProductionRepository extends JpaRepository<LigneProduction,String> {
}
