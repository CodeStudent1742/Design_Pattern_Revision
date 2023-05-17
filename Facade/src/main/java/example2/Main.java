package example2;

import example2.bank.AtmMachineFacade;

public class Main {

    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
