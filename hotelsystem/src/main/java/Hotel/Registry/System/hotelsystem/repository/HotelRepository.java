package Hotel.Registry.System.hotelsystem.repository;

import Hotel.Registry.System.hotelsystem.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
