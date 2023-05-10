package example1.officer;


import example1.message.Message;

public abstract class Officer {

    private Officer superOfficer;

    public void setSuperOfficer(Officer superOfficer) {
        this.superOfficer = superOfficer;
    }

    public Officer getSuperOfficer() {
        return superOfficer;
    }

    public abstract void processMessage(Message message);


}
