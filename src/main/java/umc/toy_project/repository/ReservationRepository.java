package umc.toy_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.toy_project.domain.mapping.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
