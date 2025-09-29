package miPrincipal;

import java.util.Scanner;

public class MuestraNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n (>0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido.");
            
            return;
        }

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            mostrar_iterativo(n);
        } else if (opcion == 2) {
            mostrar_recursivo(n);
            System.out.println();
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public static void mostrar_iterativo(int n) {
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();
    }

    public static void mostrar_recursivo(int n) {
        if (n == 0) return;
        mostrar_recursivo(n - 1);
        System.out.print(n + " ");
    }
}