package example2_two_way_adapter;


import example2_two_way_adapter.adapter.*;

public class Main {

    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Music on");
            }
        };

//        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("London Radio playing");
            }
        };

//        ukSocket.plugIn(ukRadio);

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio,continentalRadio);
        ukSocket.plugIn(adapter);
        continentalSocket.plugIn(adapter);
    }
}
