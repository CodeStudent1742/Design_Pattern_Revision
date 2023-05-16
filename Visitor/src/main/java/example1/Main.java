package example1;

import example1.activity.Activity;
import example1.activity.Squash;
import example1.activity.Treadmill;
import example1.activity.Weights;
import example1.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        VisitorImpl visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("------------------------------------------------");

        List<Activity> activityList = Arrays.asList(treadmill,squash,weights);

        activityList.forEach(activity -> activity.accept(visitor));

    }
}
