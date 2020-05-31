package edu.utm.patterns;

import edu.utm.patterns.behavioral.template.BancaComerciala;
import edu.utm.patterns.behavioral.template.Bank;
import edu.utm.patterns.behavioral.template.VictoriaBank;
import org.junit.jupiter.api.Test;

public class TemplateTest {
    @Test
    public void makeAPayment() {
        Bank bank = null;
        String accountInformation = "Eugeniu Solonari, balance: 499$";
        String paymentsInfomartion = "Send 200$ on 20.06.2020 to Pavel Solonari";

        System.out.print("Init a transaction: ");
        String peymentDetails = "200$ from " + accountInformation + "IBAN: 060015000";

        System.out.println("\nChoose Bank account to make the payment.\n" +
            "1. BancaComerciala\n" +
            "2. VictoriaBank\n");

        int choice = 2;
        if (choice == 1) {
            bank = new BancaComerciala(accountInformation, paymentsInfomartion);
        } else if (choice == 2) {
            bank = new VictoriaBank(accountInformation, paymentsInfomartion);
        }
        bank.executeTransaction(peymentDetails);
    }
}
