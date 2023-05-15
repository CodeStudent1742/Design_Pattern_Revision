package example2;

import example2.operating_system.OperatingSystem;
import example2.operating_system.OperatingSystemCaretaker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystemCaretaker.addMemento(operatingSystem.save());
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.load(operatingSystemCaretaker.getMemento());
    }
}
