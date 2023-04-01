package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Scanner;

@Entity
public class Payment {

    public Customer customer;
    public @Id @GeneratedValue int paymentId;
    public int inputPayment;
    public boolean isCash;
    public  String cardHolder;
    private String cardNumber;
    private String cardExpiration;
    private String cardSecurityCode;
    private String zipCode;
    private String billingAddress;

    Scanner scanner = new Scanner(System.in);

    public Payment(Customer customer, String cardHolder, String cardNumber, String cardSecurityCode, String cardExpiration, String zipCode, String billingAddress){
        this.customer = customer;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardSecurityCode = cardSecurityCode;
        this.cardExpiration = cardExpiration;
        this.zipCode = zipCode;
        this.billingAddress = billingAddress;


    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCardHolder(){
        System.out.print("Enter Card Holder Name");
        cardHolder = scanner.nextLine();
    }
    public String getCardHolder(Payment payment){
        return payment.cardHolder;
    }

    public void setCardNumber(){
        System.out.print("Enter card number");
        cardNumber = scanner.nextLine();
    }

    public String getCardNumber(Payment payment){
        return payment.cardNumber;
    }
    public void setSecurityCode(){
        System.out.print("Enter security code");
        cardSecurityCode = scanner.nextLine();
    }

    public String getSecurityCode(Payment payment){
        return payment.cardSecurityCode;
    }
    public void setCardExpiration(){
        System.out.print("Enter card expiration date");
        cardExpiration = scanner.nextLine();
    }

    public String getCardExpiration(Payment payment){
        return payment.cardExpiration;
    }
    public void setZipCode(){
        System.out.print("Enter zip code");
        zipCode = scanner.nextLine();
    }

    public String getZipCode(Payment payment){
        return payment.zipCode;

    }
    public void setBillingAddress(){
        System.out.print("Enter billing Address");
        billingAddress = scanner.nextLine();
    }

    public String getBillingAddress(Payment payment){
        return payment.billingAddress;
    }
}
