package example2.transport;

import example2.visitor.TransportVisitor;

public class Animal implements  Transportable{

    private String kind;

    private int weight;

    public String getKind() {
        return kind;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String kind, int weight) {
        this.kind = kind;
        this.weight = weight;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }
}
