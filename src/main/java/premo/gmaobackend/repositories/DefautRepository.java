package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import premo.gmaobackend.models.TypeDefaut;

import java.util.List;

@Repository
public interface DefautRepository extends JpaRepository<TypeDefaut, Long> {
//    @Query(value = "select * from type_default t, machinee m where t.Typemachaine=m.Etat_Machine and m.No_inve= :No_inve", nativeQuery=true)
//    List<TypeDefaut> getByNo_inve(@Param("No_inve") String No_inve);

}