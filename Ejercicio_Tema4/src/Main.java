import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        // Mandar mensaje
        System.out.println("Escribe un número:");
        // Leer lo que se introduce
        double numeroIf  = escaner.nextDouble();
        // Comparar
        if (numeroIf  == 0) {
            System.out.println("El número es neutro");
        } else if (numeroIf  < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
}

