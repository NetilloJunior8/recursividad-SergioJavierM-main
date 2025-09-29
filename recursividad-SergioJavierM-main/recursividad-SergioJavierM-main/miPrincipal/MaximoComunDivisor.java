package miPrincipal;

import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer número (>0): ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número (>0): ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Números inválidos.");
            return;
        }

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        int resultado = 0;
        if (opcion == 1) {
            resultado = mcd_iterativa(a, b);
        } else if (opcion == 2) {
            resultado = mcd_recursiva(a, b);
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.println("MCD de " + a + " y " + b + " es " + resultado);
    }

    public static int mcd_iterativa(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int mcd_recursiva(int a, int b) {
        if (b == 0) return a;
        return mcd_recursiva(b, a % b);
    }
}

