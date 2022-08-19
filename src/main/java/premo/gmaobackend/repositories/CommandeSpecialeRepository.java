package premo.gmaobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import premo.gmaobackend.models.CommandeSpeciale;

public interface CommandeSpecialeRepository extends JpaRepository<CommandeSpeciale, Long> {
}
