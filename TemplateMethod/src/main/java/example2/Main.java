package example2;

import example2.templateMethod.MyDay;
import example2.templateMethod.TypeOfTransport;
import example2.templateMethod.WeekDay;

public class Main {

    public static void main(String[] args) {

        WeekDay day = new MyDay();
        day.everyDayIsExaclyTheSame(TypeOfTransport.BIKE);
    }
}
