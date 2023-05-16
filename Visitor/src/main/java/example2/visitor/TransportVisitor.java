package example2.visitor;

import example2.transport.Animal;
import example2.transport.Person;
import example2.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);

}
