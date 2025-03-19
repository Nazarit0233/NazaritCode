var salarioInicial, porcentajeAumento, salarioFinal;

salarioInicial=parseFloat(prompt("ingrese su salario"));
porcentajeAjuste=parseFloat(prompt("ingrese el porcentaje de su aumento"));
if (salarioInicial<1300606) {
    salarioFinal = salarioInicial+(salarioInicial*porcentajeAjuste);
} else {
    salarioFinal = salarioInicial
}
alert("Su salario con ajuste es "+salarioFinal)
