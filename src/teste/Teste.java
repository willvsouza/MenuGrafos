package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            int menu = menu();
            if (menu == 1){
                menuNovoGrafo();
            }else if (menu == 2){
                System.out.println("menu abrir");
            } else if (menu == 3) {
                System.out.println("até logo");
                break;
            }
        }

    }

    private static void menuNovoGrafo() {
        while (true) {
            int submenu = subMenuOpcao1();
            if (submenu == 1){
                criarGrafo();
            }else if (submenu == 8){
                System.out.println("menu abrir");
            }else if (submenu == 9){
                System.out.println("menu abrir");
            } else if (submenu == 10) {
                break;
            }
        }
    }

    private static void criarGrafo() {

        ArrayList<String> lista = new ArrayList<>();

//        Vertice v = new Vertice("A");
//        lista.add(v);

        lista.add("abc");
        lista.add("def");
        lista.add("fgh");

        lista.remove(1);

        lista.size();

    }

    private static int subMenuOpcao1() {
        System.out.println("####### Menu Novo Grafo");
        System.out.println("## 1 - Criar Grafo");
        System.out.println("## 8 - Exportar Grafo");
        System.out.println("## 9 - Informações do Grafo");
        System.out.println("## 10 - voltar");
        return leitura.nextInt();
    }

    private static int menu() {
        System.out.println("####### Menu Principal");
        System.out.println("## 1 - Novo Grafo");
        System.out.println("## 2 - Abrir Grafo");
        System.out.println("## 3 - Sair");
        return leitura.nextInt();
    }
}