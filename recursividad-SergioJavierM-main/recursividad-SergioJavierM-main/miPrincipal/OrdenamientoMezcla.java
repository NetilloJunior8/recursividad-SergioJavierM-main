package miPrincipal;

import java.util.Scanner;

public class OrdenamientoMezcla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño arreglo A: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Ingrese elementos ordenados de A:");
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        System.out.print("Ingrese tamaño arreglo B: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        System.out.println("Ingrese elementos ordenados de B:");
        for (int i = 0; i < m; i++) B[i] = sc.nextInt();

        System.out.println("1. Iterativo  2. Recursivo");
        int opcion = sc.nextInt();

        int[] resultado;
        if (opcion == 1) {
            resultado = ordenar_iterativo(A, B);
        } else if (opcion == 2) {
            resultado = ordenar_recursivo(A, B);
        } else {
            System.out.println("Opción inválida.");
            
            return;
        }

        System.out.print("Arreglo combinado ordenado: ");
        for (int v : resultado) System.out.print(v + " ");
        System.out.println();
        
    }

    public static int[] ordenar_iterativo(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[] res = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (A[i] <= B[j]) res[k++] = A[i++];
            else res[k++] = B[j++];
        }
        while (i < n) res[k++] = A[i++];
        while (j < m) res[k++] = B[j++];
        return res;
    }

    public static int[] ordenar_recursivo(int[] A, int[] B) {
        int[] res = new int[A.length + B.length];
        mergeRec(A, 0, B, 0, res, 0);
        return res;
    }

    private static void mergeRec(int[] A, int i, int[] B, int j, int[] res, int k) {
        if (i == A.length && j == B.length) return;
        if (i == A.length) {
            res[k] = B[j];
            mergeRec(A, i, B, j + 1, res, k + 1);
        } else if (j == B.length) {
            res[k] = A[i];
            mergeRec(A, i + 1, B, j, res, k + 1);
        } else if (A[i] <= B[j]) {
            res[k] = A[i];
            mergeRec(A, i + 1, B, j, res, k + 1);
        } else {
            res[k] = B[j];
            mergeRec(A, i, B, j + 1, res, k + 1);
        }
    }
}

	