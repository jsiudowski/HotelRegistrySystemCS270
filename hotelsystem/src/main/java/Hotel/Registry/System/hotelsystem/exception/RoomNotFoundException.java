package Hotel.Registry.System.hotelsystem.exception;

public class RoomNotFoundException extends RuntimeException {
    public RoomNotFoundException(Long id) {
        super("Could not find room with ID: "+id);

    }

}
