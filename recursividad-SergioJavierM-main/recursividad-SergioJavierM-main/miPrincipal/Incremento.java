package miPrincipal;

import java.util.Scanner;

public class Incremento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("Incrementado: " + incrementar(n));
    }

    public static int incrementar(int n) {
        return n + 1;
    }
}

