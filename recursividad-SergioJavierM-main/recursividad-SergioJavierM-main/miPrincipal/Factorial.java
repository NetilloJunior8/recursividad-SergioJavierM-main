package miPrincipal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero >= 0: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número inválido.");
            
            return;
        }

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        int resultado = 0;
        if (opcion == 1) {
            resultado = factorial_iterativo(n);
        } else if (opcion == 2) {
            resultado = factorial_recursivo(n);
        } else {
            System.out.println("Opción inválida.");
            
            return;
        }

        System.out.println("Factorial de " + n + " es " + resultado);
       
    }

    public static int factorial_iterativo(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static int factorial_recursivo(int n) {
        if (n == 0) return 1;
        return n * factorial_recursivo(n - 1);
    }
}

