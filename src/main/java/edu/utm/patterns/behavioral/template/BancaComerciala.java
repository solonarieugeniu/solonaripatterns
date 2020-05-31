package edu.utm.patterns.behavioral.template;

public class BancaComerciala extends Bank {

    public BancaComerciala(String accountInformation, String paymentsInformation) {
        this.accountInformation = accountInformation;
        this.paymentsInformation = paymentsInformation;
    }

    public boolean authorizeUser(String accountInformation) {
        System.out.println("User Info: " + this.accountInformation);
        System.out.println("\nUser account information validated successfully.");
        return true;
    }

    public boolean sendAccountConsent(byte[] accountDetails) {
            System.out.println("User with account details: '" + new String(accountDetails) + "' obtains a valid consent.");
            return true;
    }

    public void initiatePayment(String paymentsInformation) {
        System.out.println(paymentsInformation + " return 200 OK");
    }
}
