package example1;

import example1.socket.*;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Music on");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("London Radio playing");
            }
        };
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);
    }
}
