package example1;

import example1.message.Message;
import example1.officer.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Atakować",100, OfficerRank.GENERAL);

        Officer sergant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergant.setSuperOfficer(captain);
        captain.setSuperOfficer(general);

        sergant.processMessage(message);
    }
}