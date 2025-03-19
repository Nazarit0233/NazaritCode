package IfJava;

public class EjercicioIf {

    float salarioInicial;
    float porcentajeAjuste;
    float salarioFinal;
    float salarioMinimo;
    public EjercicioIf(float salarioInicial, float porcentajeAjuste, float salarioFinal) {
        this.salarioInicial = salarioInicial;
        this.porcentajeAjuste = porcentajeAjuste;
        this.salarioFinal = salarioFinal;
    }
    public float calcularSalario(){
        if (salarioInicial<1300606) {
            salarioFinal = salarioInicial+(salarioInicial*porcentajeAjuste);
        } else {
            salarioFinal = salarioInicial;
        }
        return salarioFinal;
    }

}