package Backend;

import java.util.Scanner;

public class Payment {
    public int inputPayment;
    public boolean isCash;
    public  String cardHolder;
    private String cardNumber;
    private String cardExpiration;
    private String cardSecurityCode;
    private String zipCode;
    private String billingAddress;

    Scanner scanner = new Scanner(System.in);

    public Payment(String cardHolder, String cardNumber, String cardSecurityCode, String cardExpiration, String zipCode, String billingAddress){
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardSecurityCode = cardSecurityCode;
        this.cardExpiration = cardExpiration;
        this.zipCode = zipCode;
        this.billingAddress = billingAddress;


    }

    public void setCardHolder(){
        System.out.print("Enter Card Holder Name");
        cardHolder = scanner.nextLine();
    }
    public String getCardHolder(Payment cardHolder){
        return Payment.cardHolder;
    }

    public void setCardNumber(){
        System.out.print("Enter card number");
        cardNumber = scanner.nextLine();
    }

    public String getCardNumber(){
        return Payment.cardNumber;
    }
    public void setSecurityCode(){
        System.out.print("Enter security code");
        cardSecurityCode = scanner.nextLine();
    }

    public int getSecurityCode(){
        return Payment.cardSecurityCode;
    }
    public void setCardExpiration(){
        System.out.print("Enter card expiration date");
        cardExpiration = scanner.nextLine();
    }

    public int getCardExpiration(){
        return Payment.cardExpiration;
    }
    public void setZipCode(){
        System.out.print("Enter zip code");
        zipCode = scanner.nextLine();
    }

    public int getZipCode(){
        return Payment.zipCode;

    }
    public void setBillingAddress(){
        System.out.print("Enter billing Address");
        billingAddress = scanner.nextLine();
    }

    public int getBillingAddress(){
        return Payment.billingAddress;
    }
}
