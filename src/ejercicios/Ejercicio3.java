package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Escribir un programa que lea dos números y realice el cálculo de la
        //suma, la resta, la multiplicación y la división entre ambos valores. Los
        //resultados deben mostrarse por pantalla.
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese dos números");
        System.out.println("Primer número: ");
        float numero1 = s.nextFloat();
        System.out.println("Segundo número: ");
        float numero2 = s.nextFloat();

        System.out.printf("La suma de los números es: %.2f\n", (numero1 + numero2));
        System.out.printf("La resta de los números es: %.2f\n", (numero1 - numero2));
        System.out.printf("La multiplicación de los números es: %.2f\n", (numero1 * numero2));
        System.out.printf("La división de los números es: %.2f\n", (numero1 / numero2));
    }
}