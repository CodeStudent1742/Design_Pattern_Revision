package example1.visitor;

import example1.activity.Squash;
import example1.activity.Treadmill;
import example1.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
