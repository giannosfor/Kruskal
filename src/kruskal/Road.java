package kruskal;

public class Road implements Comparable {

    private int weight;
    private Edge firstEdge, secondEdge;
    private boolean enganged = false;

    public Road(int wght, Edge fedge, Edge sedge) {
        weight = wght;
        firstEdge = fedge;
        secondEdge = sedge;
    }

    public int getWeight() {
        return weight;
    }

    public Edge getFirstEdge() {
        return firstEdge;
    }

    public Edge getSecondEdge() {
        return secondEdge;
    }

    public boolean hasForEdge(Edge edge) {
        if (firstEdge.equals(edge) || secondEdge.equals(edge)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Path with distance : %d and edges %s and %s ", weight, firstEdge.getId(), secondEdge.getId());
    }

    @Override
    public int compareTo(Object rd) {
        Road theRoad = (Road) rd;

        if (weight > theRoad.getWeight()) {
            return 1;
        } else if (weight < theRoad.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isEnganged() {
        return enganged;
    }

    public void setEnganged(boolean enganged) {
        this.enganged = enganged;
    }
}
