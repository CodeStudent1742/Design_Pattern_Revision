package example2.transport;

import example1.visitor.Visitor;
import example2.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
