package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Escribir un programa que lea la estatura de tres personas, calcule el
        //promedio de la altura de ellos y lo informe.
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la estatura de tres personas");
        System.out.println("Persona 1: ");
        float persona1 = s.nextFloat();
        System.out.println("Persona 2: ");
        float persona2 = s.nextFloat();
        System.out.println("Persona 3: ");
        float persona3 = s.nextFloat();

        float promedio = (persona1 + persona2 + persona3)/3;

        System.out.printf("La estatura promedio es: %.2f\n", promedio);
    }
}