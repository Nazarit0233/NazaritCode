package IfJava;

public class MainSOUT {
    public static void main(String[] args) {
        EjercicioIf sout = new EjercicioIf(1300000, 0.15f, 0);
        float salarioFinal = sout.calcularSalario();
        System.out.println("El salario con ajuste es igual a: "+salarioFinal);
    }

    
}
