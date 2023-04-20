package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.models.Hotel;
import Hotel.Registry.System.hotelsystem.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("http://localhost:3000")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @PostMapping("/hotel")
    Hotel newHotel(@RequestBody Hotel newHotel) {
        return hotelRepository.save(newHotel);
    }

    @GetMapping("/hotels")
    List<Hotel> getAllHotels() {return hotelRepository.findAll();}
}
