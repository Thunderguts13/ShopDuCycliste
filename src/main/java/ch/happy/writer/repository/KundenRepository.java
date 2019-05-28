package ch.happy.writer.repository;

import ch.happy.writer.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface KundenRepository extends JpaRepository<Kunde, Long>, CrudRepository<Kunde, Long> {
    @Override
    Optional<Kunde> findById(Long aLong);
}
