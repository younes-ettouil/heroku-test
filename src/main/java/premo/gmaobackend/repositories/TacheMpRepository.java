package premo.gmaobackend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import premo.gmaobackend.models.TacheMp;

import java.util.List;

public interface TacheMpRepository extends JpaRepository<TacheMp, Long> {
    @Query(value = "select * from tache_mp where Id_Ligne = :Id_Ligne and Id_Machine = :Id_Machine", nativeQuery = true)
    List<TacheMp> getTacheMpBy(@Param("Id_Ligne") String Id_Ligne, @Param("Id_Machine") Long Id_Machine);
}
