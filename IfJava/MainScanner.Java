package IfJava;

import java.util.scanner;

public class MainScanner {

    public static void main(String[] args ) {
        Scanner Consola = new Scanner(System.in);

        System.out.println("ingrese en salario sin ajuste: ");
        salarioInicialConsola = Consola.nextFloat();
        System.out.println("Ingrese el pocenteje de ajuste: ");
        pocentejeAjusteConsola = Consola.nextFloat();
        EjercicioIf pruebaScanner = new EjercicioIf(salarioInicialConsola, pocentejeAjusteConsola, 0);
        System.out.println("El salario con ajuste es: "+salarioFinal);

        Scanner.close();
    }
}