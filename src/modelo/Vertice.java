package modelo;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String name;
    private List<Aresta> adj;

    public Vertice(String name) {
        this.name = name;
        this.adj = new ArrayList<Aresta>();
    }

    public void adicionaAdj(Aresta a){
        adj.add(a);
    }

    public String toString(){
        return name;
    }
}
