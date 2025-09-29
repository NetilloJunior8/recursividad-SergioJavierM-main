package miPrincipal;

import java.util.Scanner;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingrese elementos:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        int[] resultado;
        if (opcion == 1) {
            resultado = ordenaSeleccion_iterativa(arr);
        } else if (opcion == 2) {
            resultado = ordenaSeleccion_recursiva(arr, 0);
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.print("Arreglo ordenado: ");
        for (int v : resultado) System.out.print(v + " ");
        System.out.println();
        
    }

    public static int[] ordenaSeleccion_iterativa(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) minIdx = j;
            }
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static int[] ordenaSeleccion_recursiva(int[] arr, int inicio) {
        int[] a = arr.clone();
        ordenarRec(a, inicio);
        return a;
    }

    private static void ordenarRec(int[] a, int inicio) {
        int n = a.length;
        if (inicio >= n - 1) return;
        int minIdx = inicio;
        for (int j = inicio + 1; j < n; j++) {
            if (a[j] < a[minIdx]) minIdx = j;
        }
        int temp = a[minIdx];
        a[minIdx] = a[inicio];
        a[inicio] = temp;
        ordenarRec(a, inicio + 1);
    }
}
