package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.models.Floor;
import Hotel.Registry.System.hotelsystem.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("http://localhost:3000")
public class FloorController {

    @Autowired
    private FloorRepository floorRepository;

    @PostMapping("/floor")
    Floor newFloor(@RequestBody Floor newFloor) {
        return floorRepository.save(newFloor);
    }

    @GetMapping("/floors")
    List<Floor> getAllFloors() {return floorRepository.findAll();}
}
