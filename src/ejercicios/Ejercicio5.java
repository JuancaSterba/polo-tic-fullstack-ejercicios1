package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Pedir al usuario que ingrese el valor del radio de una circunferencia.
        //Calcular y mostrar por pantalla el área y el perímetro. Recordá que el
        //área y el perímetro se calculan con las siguientes fórmulas:
        //area = PI × radio²
        //perimetro = 2 × PI × radio
        //Tip: para este ejercicio se puede usar la constante matemática PI ( ) π
        //disponible en la clase Math.
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio de una circunferencia en centímetros");
        Double radio = s.nextDouble();
        Double PI = Math.PI;
        Double area = PI * Math.pow(radio, 2);
        Double perimetro = 2 * PI * radio;

        System.out.printf("El área de la circunferencia es: %.2f cm.\n", area);
        System.out.printf("El perímetro de la circunferencia es: %.2f cm2.\n", perimetro);
    }
}