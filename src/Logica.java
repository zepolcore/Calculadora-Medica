import java.util.Scanner;
/*
* La idea es llevarlo en algun momento a una interfaz grafica y agregarle otras funciones
* */
public class Logica {
    public static void main(String[] args) {
        //la entrada de datos se hace por teclado con el objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //vemos que usamos un solo Scanner, se invoca a al objeto con parametro cada vez que
        // llamo con nextTipoDeDato()
        System.out.println("ingrese altura en metros");
        float altura = entrada.nextFloat();

        System.out.println("Altura ingresada: " + altura);

        System.out.println("ingrese su peso en kilogramos");
        float masa = entrada.nextFloat();
        System.out.println("Masa ingresada: " + masa);

        //formula para el calculo
        float indiceMasaCorporal = masa / (altura * altura);
        System.out.println("IMC= "+indiceMasaCorporal);

        if (indiceMasaCorporal < 18.5) {
            System.out.println("Sujeto con bajo peso");
        } else if (18.5 <= indiceMasaCorporal && indiceMasaCorporal < 24.9) {
            System.out.println("Sujeto con peso en los valores normales deseados");
        } else if (24.9 <= indiceMasaCorporal && indiceMasaCorporal < 29.9) {
            System.out.println("Sujeto con sobrepeso");
        } else if (indiceMasaCorporal >= 30) {
            System.out.println("Sujeto obeso");
        }
    }
}