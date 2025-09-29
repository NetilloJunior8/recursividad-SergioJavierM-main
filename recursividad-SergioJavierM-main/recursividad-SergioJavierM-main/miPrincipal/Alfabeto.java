package miPrincipal;

import java.util.Scanner;

public class Alfabeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alfabeto: 1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            imprimirIterativo();
        } else if (opcion == 2) {
            imprimirRecursivo('A');
            System.out.println();
        } else {
            System.out.println("Opción inválida.");
        }
        
    }

    public static void imprimirIterativo() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void imprimirRecursivo(char c) {
        if (c > 'Z') return;
        System.out.print(c + " ");
        imprimirRecursivo((char)(c + 1));
    }

    
    public static void metodoA(char c) {
        if (c < 'A') return;
        System.out.println(c);
        metodoA((char)(c - 1));
    }
}




