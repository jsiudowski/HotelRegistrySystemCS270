package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.*;


@Entity
public class Payment {

    public @ManyToOne Customer customer;
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) int paymentId;
    public int inputPayment;
    public boolean isCash;
    public  String cardHolder;
    private String cardNumber;
    private String cardExpiration;
    private String cardSecurityCode;
    private String zipCode;
    private String billingAddress;

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

    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }
    public String getCardHolder(Payment payment){
        return payment.cardHolder;
    }

    public void setCardNumber(String cardNum){
        this.cardNumber = cardNum;

    }

    public String getCardNumber(Payment payment){
        return payment.cardNumber;
    }
    public void setSecurityCode(String secutiryCode){
        this.cardSecurityCode = secutiryCode;
    }

    public String getSecurityCode(Payment payment){
        return payment.cardSecurityCode;
    }
    public void setCardExpiration(String cardExp){
        this.cardExpiration = cardExp;
    }

    public String getCardExpiration(Payment payment){
        return payment.cardExpiration;
    }
    public void setZipCode(String zip){
        this.zipCode = zip;
    }

    public String getZipCode(Payment payment){
        return payment.zipCode;

    }
    public void setBillingAddress(String billingAdd){
        this.billingAddress = billingAdd;
    }

    public String getBillingAddress(Payment payment){
        return payment.billingAddress;
    }
}
