package example2.operating_system;

import example1.smart_app.SmartAppMemento;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Zapisano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}
