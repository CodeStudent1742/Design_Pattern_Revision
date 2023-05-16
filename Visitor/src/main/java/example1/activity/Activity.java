package example1.activity;

import example1.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
