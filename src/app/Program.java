package app;

import Graph.utils.Grafo;

public class Program {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.addVertice("João");
        grafo.addVertice("Lorenzo");
        grafo.addVertice("Pedro");
        grafo.addVertice("Kleber");
        grafo.addVertice("Phelipe");

        grafo.addAresta(2.0,"João", "Lorenzo");
        grafo.addAresta(3.0,"Lorenzo", "Kleber");
        grafo.addAresta(1.0, "Kleber", "Pedro");
        grafo.addAresta(2.0,"João", "Pedro");
        grafo.addAresta(3.0, "Pedro", "Phelipe");
        grafo.addAresta(2.0, "Phelipe", "Kleber");
    }


}
