package Hotel.Registry.System.hotelsystem.exception;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(Long id) {
        super("Could not find hotel with ID: "+id);

    }
}
