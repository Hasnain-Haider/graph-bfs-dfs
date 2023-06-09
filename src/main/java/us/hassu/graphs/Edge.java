package us.hassu.graphs;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Edge<T> {
    int weight;

    private Node<T> from;
    private Node<T> to;

    public Edge(Node<T> from, Node<T> to) {
        this(from, to, 1);
    }

    public Edge(Node<T> from, Node<T> to, int weight) {
        this.from= from;
        this.to = to;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Node<T> getFrom() {
        return from;
    }

    public Node<T> getTo() {
        return to;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("weight", weight)
//                .add("from", from)
                .add("to", to)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge<?> edge = (Edge<?>) o;
        return weight == edge.weight && Objects.equal(from, edge.from) && Objects.equal(to, edge.to);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weight, from, to);
    }
}
