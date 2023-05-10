package example1.officer;

import example1.message.Message;

public class Sergeant extends  Officer{

    private static final int CODE = 10;
    private static final String NAME = "Sierżant Nowak";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.SERGEANT) && message.getCode() == CODE){
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        }else{
            getSuperOfficer().processMessage(message);
        }

    }
}
