package kruskal;

import java.util.ArrayList;

public class Edge {

    private ArrayList<Edge> edges = new ArrayList<Edge>();
    private static ArrayList<Road> roads;
    private int id;

    public Edge(int di) {
        id = di;
    }

    public int getId() {
        return id;
    }

    public void setRoads(ArrayList<Road> rds) {
        roads = rds;
    }

    public void addConnection(Edge edg, int distance) {
        if (!edges.contains(edg)) {
            edges.add(edg);
            if (!edg.contains(this)) {
                edg.addConnection(this);
                roads.add(new Road(distance, this, edg));
            }
        }
    }

    public void addConnection(Edge edg) {
        edges.add(edg);
    }

    public boolean contains(Edge edge) {
        if (edges.contains(edge)) {
            return true;
        }
        return false;
    }

    public boolean isCyrcle(Edge edge,Road rd) {

        for (Road road : roads) {
            
            if (road.isEnganged() && !road.equals(rd)) {
                if (road.hasForEdge(this)) {   
                    if (road.hasForEdge(edge)) {
                        return true;
                    }
                    if (road.getFirstEdge().equals(this)) {
                        if (road.getSecondEdge().isCyrcle(edge,road)) {
                            return true;
                        }
                    } else {
                        if (road.getFirstEdge().isCyrcle(edge,road)) {
                            return true;
                        }
                    }
                }

            }

        }
        return false;
    }

    @Override
    public String toString() {
        String string;
        string = String.format("Node with id : %d and edges : ", id);
        for (Edge edge : edges) {
            string = String.format("%s%d ", string, edge.getId());
        }
        return string;
    }
}
