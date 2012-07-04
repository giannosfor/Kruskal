/*
 * To programma einai to paradeigma pou exei to biblio (h diafaneia )
 */
package kruskal;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {

    private static final int NUMBEROFNODES = 8;
    private static ArrayList<Edge> edges = new ArrayList<Edge>();
    private static ArrayList<Road> roads = new ArrayList<Road>();

    private static void createSchema() {

        for (int i = 0; i < NUMBEROFNODES; i++) {
            edges.add(new Edge(i));
        }
        Edge edge = edges.get(0);
        edge.setRoads(roads);
        edge.addConnection(edges.get(1), 4);
        edge.addConnection(edges.get(2), 6);
        edge.addConnection(edges.get(3), 16);
        edge = edges.get(1);
        edge.addConnection(edges.get(5), 24);
        edge = edges.get(2);
        edge.addConnection(edges.get(3), 8);
        edge.addConnection(edges.get(5), 23);
        edge.addConnection(edges.get(4), 5);
        edge = edges.get(3);
        edge.addConnection(edges.get(4), 10);
        edge.addConnection(edges.get(7), 21);
        edge = edges.get(4);
        edge.addConnection(edges.get(5), 18);
        edge.addConnection(edges.get(7), 14);
        edge.addConnection(edges.get(6), 11);
        edge = edges.get(5);
        edge.addConnection(edges.get(6), 9);
        edge = edges.get(6);
        edge.addConnection(edges.get(7), 7);
    }

    private static void appearLinks() {
        for (Road road : roads) {
            System.out.println(road);
        }
        System.out.println();
    }

    private static void appearNodes() {
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }

    private static void createPath() {
        
        for (Road road : roads) {
            if (!road.getFirstEdge().isCyrcle(road.getSecondEdge(),road)) {
                road.setEnganged(true);
            }
            
        }
    }

    private static void showPath() {
        System.out.println("\nThe Path is :");
        for (Road road : roads) {
            if (road.isEnganged()) {
                System.out.println(road);
            }
        }
    }

    public static void main(String[] args) {

        createSchema();

        Collections.sort(roads);

        appearLinks();

        appearNodes();

        createPath();

        showPath();
    }
}
