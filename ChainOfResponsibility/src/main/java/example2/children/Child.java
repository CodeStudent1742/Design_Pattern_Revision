package example2.children;

import example2.request.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

}
