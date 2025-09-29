
package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Alfabeto");
            System.out.println("2. BusquedaBinaria");
            System.out.println("3. Factorial");
            System.out.println("4. Fibonacci");
            System.out.println("5. Hanoi");
            System.out.println("6. Incremento");
            System.out.println("7. MaximoComunDivisor");
            System.out.println("8. MuestraNaturales");
            System.out.println("9. OrdenamientoMezcla");
            System.out.println("10. OrdenamientoSeleccion");
            System.out.println("11. Pared");
            System.out.println("12. ParImparRecursivo");
            System.out.println("13. SumaDigitos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Alfabeto.main(new String[0]);
                    break;
                case 2:
                    BusquedaBinaria.main(new String[0]);
                    break;
                case 3:
                    Factorial.main(new String[0]);
                    break;
                case 4:
                    Fibonacci.main(new String[0]);
                    break;
                case 5:
                    Hanoi.main(new String[0]);
                    break;
                case 6:
                    Incremento.main(new String[0]);
                    break;
                case 7:
                    MaximoComunDivisor.main(new String[0]);
                    break;
                case 8:
                    MuestraNaturales.main(new String[0]);
                    break;
                case 9:
                    OrdenamientoMezcla.main(new String[0]);
                    break;
                case 10:
                    OrdenamientoSeleccion.main(new String[0]);
                    break;
                case 11:
                    Pared.main(new String[0]);
                    break;
                case 12:
                    ParImpar.main(new String[0]);
                    break;
                case 13:
                    SumaDigitos.main(new String[0]);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 0);

        sc.close();
    }
}