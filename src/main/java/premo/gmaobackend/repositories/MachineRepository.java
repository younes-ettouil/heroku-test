package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import premo.gmaobackend.models.Machine;
import premo.gmaobackend.models.Reclamation;

import java.util.List;

@Repository
public interface MachineRepository extends JpaRepository<Machine, String> {
    @Query(value="select * from machinee where Id_Ligne = :Id_Ligne", nativeQuery = true)
    List<Machine> getById_Ligne(@Param("Id_Ligne") String Id_Ligne);

    @Query(value="select * from trace t, machinee m where t.Id_Machine = m.No_inve and t.EtatP = 'NON FAIT' and t.Id_Ligne= :Id_Ligne", nativeQuery = true)
    List<Machine> getReclamationMById_Ligne(@Param("Id_Ligne") String Id_Ligne);
}