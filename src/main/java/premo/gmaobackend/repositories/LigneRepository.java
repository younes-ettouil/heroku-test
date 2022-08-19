package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import premo.gmaobackend.models.LigneInter;
import premo.gmaobackend.models.LigneProduction;

import java.util.List;

@Repository
public interface LigneRepository extends JpaRepository<LigneInter, String> {
    @Query(value="select * from  ligne_inter i where i.Id_Inter = :id_Inter", nativeQuery = true)
    List<LigneInter> getById_Inter(@Param("id_Inter") String id_Inter);
}