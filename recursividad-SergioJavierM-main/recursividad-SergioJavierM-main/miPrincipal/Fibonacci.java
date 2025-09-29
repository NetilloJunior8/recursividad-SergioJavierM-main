package miPrincipal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el índice n para Fibonacci (>=0): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número inválido.");
           
            return;
        }

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        int resultado = 0;
        if (opcion == 1) {
            resultado = fibonacci_iterativo(n);
        } else if (opcion == 2) {
            resultado = fibonacci_recursivo(n);
        } else {
            System.out.println("Opción inválida.");
            
            return;
        }

        System.out.println("Fibonacci(" + n + ") = " + resultado);
    }

    public static int fibonacci_iterativo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacci_recursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2);
    }
}