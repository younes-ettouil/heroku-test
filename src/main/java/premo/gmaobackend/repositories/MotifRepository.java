package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import premo.gmaobackend.models.Motif;

public interface MotifRepository extends JpaRepository<Motif, Long> {
}
