package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import premo.gmaobackend.models.Intervenant;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<Intervenant, Integer> {

    @Query(value = "SELECT * FROM intervenant WHERE Login = :username AND Password = :password", nativeQuery = true)
    Intervenant checkUserUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT * FROM intervenant i,ligne_inter l  WHERE l.Id_Inter = i.Id_Inter AND i.Type_Inter = 'CHEF DEQUIPE' AND l.Id_Ligne = :id_Ligne", nativeQuery = true)
    List<Intervenant> getChefDequipe(@Param("id_Ligne") String id_Ligne);
}