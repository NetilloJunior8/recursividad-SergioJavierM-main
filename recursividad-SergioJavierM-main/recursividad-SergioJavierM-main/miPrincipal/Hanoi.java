package miPrincipal;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de discos (>0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido.");
            
            return;
        }

        System.out.println("Movimientos para resolver Torres de Hanoi:");
        hanoi('A', 'B', 'C', n);
        
    }

    public static void hanoi(char origen, char auxiliar, char destino, int n) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde varilla " + origen + " a varilla " + destino);
            return;
        }
        hanoi(origen, destino, auxiliar, n - 1);
        System.out.println("Mover disco " + n + " desde varilla " + origen + " a varilla " + destino);
        hanoi(auxiliar, origen, destino, n - 1);
    }
}
