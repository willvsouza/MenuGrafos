package modelo;

public class Grafo {
    public static final int MAX = 10;

    private int[][] matriz;
    private int arestas;
    private int ordem;
    private String tipo;

    public Grafo(int tam, int tipo) {
        if(tam > 0 && tam <= MAX) {
            this.matriz = new int[tam][tam];
            this.arestas = 0;
            if(tipo == 1)
                this.tipo = "Grafo Orientado";
            if(tipo == 2)
                this.tipo = "Grafo Não Orientado";
        }else {
            System.out.println("Erro! O tamanho excede a dimensão máxima admitida. Insira um valor inteiro até 10.");
        }
    }

    public int getArestas() {
        return this.arestas;
    }

    public void inserirArestaGrafoOrientado(int origem, int destino, int peso) {
        this.matriz[origem-1][destino-1] = peso;
        this.arestas++;
    }

    public void inserirArestaGrafoNaoOrientado(int origem, int destino, int peso) {
        this.matriz[origem-1][destino-1] = peso;
        this.matriz[destino-1][origem-1] = peso;
        this.arestas++;
    }

    public boolean removerArestaGrafoOrientado(int origem, int destino) {
        if(this.matriz[origem-1][destino-1] != 0){
            this.matriz[origem-1][destino-1] = 0;
            this.arestas--;
            return true;
        }else return false;
    }

    public boolean removerArestaGrafoNaoOrientado(int origem, int destino) {
        if(this.matriz[origem-1][destino-1] != 0){
            this.matriz[origem-1][destino-1] = 0;
            this.matriz[destino-1][origem-1] = 0;
            this.arestas--;
            return true;
        }else return false;
    }

    public int[] obterGrauVerticeGO(int vertice){
        //posição zero (grau[0) => grau de emissão | posição um (grau[1]) => grau de recepção
        int grau[] = {0,0};
        for(int i=0; i < this.matriz.length; i++){
            if(this.matriz[vertice-1][i] != 0) grau[0]++;
            if(this.matriz[i][vertice-1] != 0) grau[1]++;
        }
        return grau;
    }
    public int obterGrauVerticeGNO(int vertice){
        int grau = 0;
        for(int i=0; i < this.matriz.length; i++){
            if(this.matriz[vertice-1][i] != 0) grau++;
        }
        return grau;
    }

    //A LÓGICA ESTÁ ERRADA!!!
    public int obterOrdemGrafoOrientado(){
        this.ordem = 0;
        for(int i=0; i < this.matriz.length; i++){
            for(int j=0; j < this.matriz.length; j++){
                if(this.matriz[i][j] != 0) this.ordem++;
            }
        }
        return this.ordem;
    }

    //A LÓGICA ESTÁ ERRADA!!!
    public int obterOrdemGrafoNaoOrientado(){
        this.ordem = 0;
        for(int i=0; i < this.matriz.length; i++){
            for(int j=0; j < this.matriz.length; j++){
                if(this.matriz[i][j] != 0) this.ordem++;
            }
        }
        return this.ordem;
    }

    public void imprimeMatrizAdj() {
        System.out.println(this.tipo);
        System.out.print(" ");
        for(int i=0; i<this.matriz.length; i++)
            System.out.print(" "+(i+1)); // mostra identificador da coluna
        System.out.print("\n");
        for(int i=0; i<this.matriz.length; i++) {
            System.out.print(i+1); // mostra identificador da linha
            for(int j=0; j<this.matriz.length; j++)
                System.out.print(" "+this.matriz[i][j]);
            System.out.print("\n");
        }
        System.out.println("");
    }

}
