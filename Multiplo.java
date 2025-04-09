import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        System.out.print("Ingrese el primer número entero positivo: ");
        A = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero positivo: ");
        B = scanner.nextInt();

        if (A % B == 0) {
            System.out.println(A + " es múltiplo de " + B);
        } else {
            if (B % A == 0) {
                System.out.println(B + " es múltiplo de " + A);
            } else {
                System.out.println("Ningúno de los números es múltiplo del otro.");
            }
        }


        scanner.close();
    }
}
