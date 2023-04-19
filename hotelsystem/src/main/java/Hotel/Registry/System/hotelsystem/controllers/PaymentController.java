package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.models.Payment;
import Hotel.Registry.System.hotelsystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("http://localhost:3000")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping("/payment")
    Payment newPayment(@RequestBody Payment newPayment) {
        return paymentRepository.save(newPayment);
    }

    @GetMapping("/payments")
    List<Payment> getAllPayments() {return paymentRepository.findAll();}
}
