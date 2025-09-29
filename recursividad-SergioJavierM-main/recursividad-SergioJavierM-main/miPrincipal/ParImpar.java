package miPrincipal;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        if (esPar(n)) {
            System.out.println(n + " es par.");
        } else {
            System.out.println(n + " es impar.");
        }
        
    }

    public static boolean esPar(int n) {
        if (n < 0) n = -n;
        if (n == 0) return true;
        if (n == 1) return false;
        return esPar(n - 2);
    }
}

