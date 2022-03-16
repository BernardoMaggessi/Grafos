package Graph.utils;

import java.util.ArrayList;

public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<T>>();
        this.arestas = new ArrayList<Aresta<T>>();
    }
    public void addVertice(T dado){
        Vertice<T> novoVertice = new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }
    public void addAresta(Double peso, T DadoInicio, T DadoFim){
        Vertice<T> inicio = this.getVertice(DadoInicio);
        Vertice<T> fim = this.getVertice(DadoFim);
        Aresta<T> aresta = new Aresta<>(peso, inicio, fim);
        inicio.addArestaSaida(aresta);
        fim.addArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    public Vertice<T> getVertice(T dado){
         Vertice<T> vertice = null;
         for(int i=0;i<this.vertices.size();i++){
             if(this.vertices.get(i).getDado().equals(dado)){
                 vertice = this.vertices.get(i);
                 break;
             }
         }
         return vertice;
    }
}
