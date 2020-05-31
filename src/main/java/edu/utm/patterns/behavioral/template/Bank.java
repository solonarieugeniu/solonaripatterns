package edu.utm.patterns.behavioral.template;

public abstract class Bank {

    String accountInformation;
    String paymentsInformation;

    public void executeTransaction(String paymentDetails) {
        if (authorizeUser(this.accountInformation)) {
            sendAccountConsent(paymentDetails.getBytes());
            initiatePayment(this.paymentsInformation);
        }
    }

    abstract boolean authorizeUser(String accountInformation);
    abstract boolean sendAccountConsent(byte[] paymentDetails);
    abstract void initiatePayment(String paymentsInformation);
}
