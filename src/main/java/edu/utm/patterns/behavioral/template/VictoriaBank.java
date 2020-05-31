package edu.utm.patterns.behavioral.template;

public class VictoriaBank extends Bank{
    public VictoriaBank(String accountInformation, String paymentsInformation) {
        this.accountInformation = accountInformation;
        this.paymentsInformation = paymentsInformation;
    }

    public boolean authorizeUser(String accountInformation) {
        System.out.println("User Info: " + this.accountInformation);
        System.out.println("\nUser account information is waiting approval.");
        return true;
    }

    public boolean sendAccountConsent(byte[] accountDetails) {
        System.out.println("User with account details: '" + new String(accountDetails) + "is rejected");
        return true;
    }

    public void initiatePayment(String paymentsInformation) {
        System.out.println(paymentsInformation + " return 400 Bad Request");
    }
}
