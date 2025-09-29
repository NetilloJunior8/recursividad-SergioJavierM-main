package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    @Test
    public void testMetodoA() {
        // Redirigir la salida estándar
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método
        Alfabeto.metodoA('Z');

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Verificar la salida
        String expectedOutput = "Z\nY\nX\nW\nV\nU\nT\nS\nR\nQ\nP\nO\nN\nM\nL\nK\nJ\nI\nH\nG\nF\nE\nD\nC\nB\nA\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void testBusquedaBinariaIterativa() {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Prueba con un valor que está en el arreglo
        assertEquals(4, BusquedaBinaria.busquedaBinaria_iterativa(arreglo, 9));

        // Prueba con un valor que no está en el arreglo
        assertEquals(-1, BusquedaBinaria.busquedaBinaria_iterativa(arreglo, 8));

        // Prueba con el primer valor del arreglo
        assertEquals(0, BusquedaBinaria.busquedaBinaria_iterativa(arreglo, 1));

        // Prueba con el último valor del arreglo
        assertEquals(9, BusquedaBinaria.busquedaBinaria_iterativa(arreglo, 19));

        // Prueba con un valor fuera del rango del arreglo
        assertEquals(-1, BusquedaBinaria.busquedaBinaria_iterativa(arreglo, 20));
    }
    @Test
    public void testFactorialIterativo() {
        assertEquals(1, Factorial.factorial_iterativo(0));
        assertEquals(1, Factorial.factorial_iterativo(1));
        assertEquals(2, Factorial.factorial_iterativo(2));
        assertEquals(6, Factorial.factorial_iterativo(3));
        assertEquals(24, Factorial.factorial_iterativo(4));
        assertEquals(120, Factorial.factorial_iterativo(5));
        assertEquals(720, Factorial.factorial_iterativo(6));
    }

    @Test
    public void testFactorialRecursiva() {
        assertEquals(1, Factorial.factorial_recursivo(0));
        assertEquals(1, Factorial.factorial_recursivo(1));
        assertEquals(2, Factorial.factorial_recursivo(2));
        assertEquals(6, Factorial.factorial_recursivo(3));
        assertEquals(24, Factorial.factorial_recursivo(4));
        assertEquals(120, Factorial.factorial_recursivo(5));
        assertEquals(720, Factorial.factorial_recursivo(6));
    }
    @Test
    public void testIncremento() {
        assertEquals(11, Incremento.incrementar(10));
        assertEquals(1, Incremento.incrementar(0));
        assertEquals(-9, Incremento.incrementar(-10));
        assertEquals(101, Incremento.incrementar(100));
    }

    @Test
    public void testMcdIterativa() {
        assertEquals(2, MaximoComunDivisor.mcd_iterativa(4, 10));
        assertEquals(1, MaximoComunDivisor.mcd_iterativa(17, 13));
        assertEquals(6, MaximoComunDivisor.mcd_iterativa(54, 24));
        assertEquals(12, MaximoComunDivisor.mcd_iterativa(36, 60));
        assertEquals(1, MaximoComunDivisor.mcd_iterativa(7, 9));
    }

    @Test
    public void testMcdRecursiva() {
        assertEquals(2, MaximoComunDivisor.mcd_recursiva(4, 10));
        assertEquals(1, MaximoComunDivisor.mcd_recursiva(17, 13));
        assertEquals(6, MaximoComunDivisor.mcd_recursiva(54, 24));
        assertEquals(12, MaximoComunDivisor.mcd_recursiva(36, 60));
        assertEquals(1, MaximoComunDivisor.mcd_recursiva(7, 9));
    }
    @Test
    public void testDibujarPared() {
        // Redirigir la salida estándar
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método
        Pared.dibujar_pared(3);

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Verificar la salida
        String expectedOutput = "*****\n*****\n*****\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void testOrdenaSeleccionIterativa() {
        // Arreglo desordenado
        int[] arregloDesordenado = {5, 3, 2, 4, 1};
        
        // Arreglo esperado después de ordenar
        int[] arregloEsperado = {1, 2, 3, 4, 5};
        
        // Llamar al método a probar
        int[] arregloOrdenado = OrdenamientoSeleccion.ordenaSeleccion_iterativa(arregloDesordenado);
        
        // Verificar que el arreglo ordenado es igual al arreglo esperado
        assertArrayEquals(arregloEsperado, arregloOrdenado);
    }
    @Test
    public void testOrdenaSeleccionRecursiva() {
        // Arreglo desordenado
        int[] arregloDesordenado = {5, 3, 2, 4, 1};
        
        // Arreglo esperado después de ordenar
        int[] arregloEsperado = {1, 2, 3, 4, 5};
        
        // Llamar al método a probar
        int[] arregloOrdenado = OrdenamientoSeleccion.ordenaSeleccion_recursiva(arregloDesordenado, 0);
        
        // Verificar que el arreglo ordenado es igual al arreglo esperado
        assertArrayEquals(arregloEsperado, arregloOrdenado);
    }

    @Test
    public void testHanoi() {
        // Redirigir la salida estándar para capturar la salida del método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Llamar al método a probar
        Hanoi.hanoi('A', 'B', 'C', 3);

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Verificar la salida
        String expectedOutput = 
            "Mover disco 1 desde varilla A a varilla C\n" +
            "Mover disco 2 desde varilla A a varilla B\n" +
            "Mover disco 1 desde varilla C a varilla B\n" +
            "Mover disco 3 desde varilla A a varilla C\n" +
            "Mover disco 1 desde varilla B a varilla A\n" +
            "Mover disco 2 desde varilla B a varilla C\n" +
            "Mover disco 1 desde varilla A a varilla C\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testFibonacciRecursivo() {
        assertEquals(0, Fibonacci.fibonacci_recursivo(0));
        assertEquals(1, Fibonacci.fibonacci_recursivo(1));
        assertEquals(1, Fibonacci.fibonacci_recursivo(2));
        assertEquals(2, Fibonacci.fibonacci_recursivo(3));
        assertEquals(3, Fibonacci.fibonacci_recursivo(4));
        assertEquals(5, Fibonacci.fibonacci_recursivo(5));
        assertEquals(8, Fibonacci.fibonacci_recursivo(6));
        assertEquals(13, Fibonacci.fibonacci_recursivo(7));
    }

    @Test
    public void testFibonacciIterativo() {
        assertEquals(0, Fibonacci.fibonacci_iterativo(0));
        assertEquals(1, Fibonacci.fibonacci_iterativo(1));
        assertEquals(1, Fibonacci.fibonacci_iterativo(2));
        assertEquals(2, Fibonacci.fibonacci_iterativo(3));
        assertEquals(3, Fibonacci.fibonacci_iterativo(4));
        assertEquals(5, Fibonacci.fibonacci_iterativo(5));
        assertEquals(8, Fibonacci.fibonacci_iterativo(6));
        assertEquals(13, Fibonacci.fibonacci_iterativo(7));
    }

    @Test
    public void testOrdenarMezclaIterativo() {
        OrdenamientoMezcla ordenamientoMezcla = new OrdenamientoMezcla();

        // Caso de prueba 1: Ambos arreglos no vacíos
        int[] ArregloA = {1, 3, 5};
        int[] ArregloB = {2, 4, 6};
        int[] resultadoEsperado = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(resultadoEsperado, ordenamientoMezcla.ordenar_iterativo(ArregloA, ArregloB));

        // Caso de prueba 2: Un arreglo vacío
        int[] ArregloC = {};
        int[] ArregloD = {1, 2, 3};
        int[] resultadoEsperado2 = {1, 2, 3};
        assertArrayEquals(resultadoEsperado2, ordenamientoMezcla.ordenar_iterativo(ArregloC, ArregloD));

        // Caso de prueba 3: Ambos arreglos vacíos
        int[] ArregloE = {};
        int[] ArregloF = {};
        int[] resultadoEsperado3 = {};
        assertArrayEquals(resultadoEsperado3, ordenamientoMezcla.ordenar_iterativo(ArregloE, ArregloF));

        // Caso de prueba 4: Arreglos con elementos repetidos
        int[] ArregloG = {1, 3, 5};
        int[] ArregloH = {1, 3, 5};
        int[] resultadoEsperado4 = {1, 1, 3, 3, 5, 5};
        assertArrayEquals(resultadoEsperado4, ordenamientoMezcla.ordenar_iterativo(ArregloG, ArregloH));
    }

    @Test
    public void testOrdenarMezlaRecursivo() {
        OrdenamientoMezcla ordenamientoMezcla = new OrdenamientoMezcla();

        // Caso de prueba 1: Ambos arreglos no vacíos
        int[] ArregloA = {1, 3, 5};
        int[] ArregloB = {2, 4, 6};
        int[] resultadoEsperado = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(resultadoEsperado, ordenamientoMezcla.ordenar_recursivo(ArregloA, ArregloB));

        // Caso de prueba 2: Un arreglo vacío
        int[] ArregloC = {};
        int[] ArregloD = {1, 2, 3};
        int[] resultadoEsperado2 = {1, 2, 3};
        assertArrayEquals(resultadoEsperado2, ordenamientoMezcla.ordenar_recursivo(ArregloC, ArregloD));

        // Caso de prueba 3: Ambos arreglos vacíos
        int[] ArregloE = {};
        int[] ArregloF = {};
        int[] resultadoEsperado3 = {};
        assertArrayEquals(resultadoEsperado3, ordenamientoMezcla.ordenar_recursivo(ArregloE, ArregloF));

        // Caso de prueba 4: Arreglos con elementos repetidos
        int[] ArregloG = {1, 3, 5};
        int[] ArregloH = {1, 3, 5};
        int[] resultadoEsperado4 = {1, 1, 3, 3, 5, 5};
        assertArrayEquals(resultadoEsperado4, ordenamientoMezcla.ordenar_recursivo(ArregloG, ArregloH));
    }

    
}