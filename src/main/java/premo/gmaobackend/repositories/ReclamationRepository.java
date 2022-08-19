package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import premo.gmaobackend.models.Reclamation;

import java.util.List;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
    @Query(value = "select * from trace where EtatP = '' ",nativeQuery = true)
    List<Reclamation> getReclamation();

    @Query(value="select * from trace where Id_Ligne= :Id_Ligne", nativeQuery = true)
    List<Reclamation> getReclamationById_Ligne(@Param("Id_Ligne") String Id_Ligne);

    @Query(value="select * from trace where Id_Ligne LIKE :Id_Ligne  AND (EtatP!='Fait' or EtatP is null) AND (Cloture ='' or Cloture is null or Cloture='non' )  ORDER BY datereel Desc ", nativeQuery = true)
    List<Reclamation> getReclamationNotification(@Param("Id_Ligne") String Id_Ligne);

    @Query(value="select * from trace where Id_Ligne LIKE :Id_Ligne  AND EtatP='Non Fait'  AND  Cloture='non'  ORDER BY datereel Desc ", nativeQuery = true)
    List<Reclamation> getReclamationNonFait(@Param("Id_Ligne") String Id_Ligne);


}
