package miPrincipal;

import java.util.Scanner;

public class Pared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de líneas para la pared: ");
        int n = sc.nextInt();

        System.out.println("Dibujando pared recursivamente:");
        dibujar_pared(n);
        
    }

    public static void dibujar_pared(int n) {
        if (n <= 0) return;
        dibujar_pared(n - 1);
        System.out.println("*****");
    }
}
