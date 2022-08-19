package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import premo.gmaobackend.models.PdrTrace;

import javax.transaction.Transactional;
import java.util.Optional;

public interface PdrTraceRepository extends JpaRepository<PdrTrace, Long> {

    @Query(value = "select * from pdr_trace p WHERE p.Id_Trace = :Id", nativeQuery = true)
    Optional<PdrTrace> getPdrTraceById_Trace(long Id);



@Modifying
@Transactional
    @Query(value = "update pdr_trace p set p.Id_PDR= :Id_PDR, p.Qte = :Qte, p.Id_Trace = :Id_Trace WHERE p.Id_P_T= :Id", nativeQuery = true)
    void updatePdrTrace(@Param("Id_PDR") String Id_PDR,@Param("Qte") int Qte,@Param("Id_Trace") int Id_Trace,@Param("Id") int Id);

}
