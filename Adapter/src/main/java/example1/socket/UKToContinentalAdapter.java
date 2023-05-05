package example1.socket;

public class UKToContinentalAdapter implements ContinentalDevice {

    UKDevice device;

    public UKToContinentalAdapter(UKDevice device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.powerOn();
    }
}
