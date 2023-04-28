package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.exception.RoomNotFoundException;
import Hotel.Registry.System.hotelsystem.models.Room;
import Hotel.Registry.System.hotelsystem.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("http://localhost:3000")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/room")
    Room newRoom(@RequestBody Room newRoom) {
        return roomRepository.save(newRoom);
    }

    @GetMapping("/rooms")
    List<Room> getAllRooms() {return roomRepository.findAll();}

    @GetMapping("/room/{id}")
    Room getRoomById(@PathVariable Long id){
        return roomRepository.findById(id)
                .orElseThrow(() -> new RoomNotFoundException(id));
    }
}
