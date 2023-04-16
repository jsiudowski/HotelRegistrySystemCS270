package Hotel.Registry.System.hotelsystem.repository;

import Hotel.Registry.System.hotelsystem.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
