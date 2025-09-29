package miPrincipal;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        System.out.println("1. Suma iterativa");
        System.out.println("2. Suma recursiva");
        System.out.print("Seleccione opción: ");
        int opcion = sc.nextInt();

        int resultado = 0;
        if (opcion == 1) {
            resultado = suma_iterativa(n);
        } else if (opcion == 2) {
            resultado = suma_recursiva(n);
        } else {
            System.out.println("Opción inválida.");
            
            return;
        }

        System.out.println("La suma de los dígitos de " + n + " es: " + resultado);
       
    }

    public static int suma_iterativa(int n) {
        n = Math.abs(n);
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static int suma_recursiva(int n) {
        n = Math.abs(n);
        if (n == 0) return 0;
        return (n % 10) + suma_recursiva(n / 10);
    }
}
