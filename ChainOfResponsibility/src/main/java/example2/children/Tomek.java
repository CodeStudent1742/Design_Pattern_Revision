package example2.children;

import example2.request.MotherRequest;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjął słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }

}
