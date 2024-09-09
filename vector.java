
package analisis;

public class vector {

    // Método para contar los pares con suma impar
    public static int sumPair(int[] v) {
        int n = v.length;
        int result = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (((v[i] + v[j]) % 2) == 1) {
                    result = result + 1;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {

        // Medir el tiempo inicial
        long tiempoInicial = System.nanoTime();

        // Código a medir
        int[] array = {1, 2, 3, 4};
        int resultado = sumPair(array);
        System.out.println("El número de pares con suma impar es: " + resultado);

        // Medir el tiempo final
        long tiempoFinal = System.nanoTime();

        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFinal - tiempoInicial;

        // Mostrar el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoEjecucion);

        // Convertir a milisegundos si es necesario
        double tiempoEjecucionMs = tiempoEjecucion / 1_000_000.0;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoEjecucionMs);
    }
}
   

               
    
        
    
