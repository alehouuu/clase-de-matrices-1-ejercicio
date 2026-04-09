import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int tamano = r.nextInt(45) + 5;
        int[] arreglo = new int[tamano];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+arreglo[i]+"]");
        }
        int suma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

            if (arreglo[i] % 2 == 0) {
                pares = pares + arreglo[i];
            } else {
                impares = impares + arreglo[i];
            }     }
        System.out.println();
        System.out.println("suma total: " + suma);
        System.out.println("suma de pares: " + pares);
        System.out.println("suma de impares: " + impares);

    }
}