package modelo;

public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private int peso;

    Aresta(Vertice origem, Vertice destino, int peso){
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }
}
