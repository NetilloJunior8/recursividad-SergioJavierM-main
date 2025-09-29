package miPrincipal;

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño del arreglo ordenado: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ingrese los elementos ordenados:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Número a buscar: ");
        int target = sc.nextInt();

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        int resultado = -1;
        if (opcion == 1) {
            resultado = busquedaBinaria_iterativa(arr, target);
        } else if (opcion == 2) {
            resultado = busquedaBinaria_recursiva(arr, target, 0, arr.length - 1);
        } else {
            System.out.println("Opción inválida.");
            
            return;
        }

        if (resultado != -1) {
            System.out.println("Elemento encontrado en índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
       
    }

    public static int busquedaBinaria_iterativa(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int busquedaBinaria_recursiva(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return busquedaBinaria_recursiva(arr, target, mid + 1, right);
        else return busquedaBinaria_recursiva(arr, target, left, mid - 1);
    }
}


