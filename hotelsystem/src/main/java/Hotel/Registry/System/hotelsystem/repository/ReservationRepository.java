package Hotel.Registry.System.hotelsystem.repository;

import Hotel.Registry.System.hotelsystem.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
