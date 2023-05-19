package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Pedir al usuario que ingrese una temperatura en grados Celsius y
        //mostrar por pantalla su equivalente en kelvin y grados Fahrenheit. Las
        //fórmulas para conversiones son:
        //Kelvin = 273,15 + Celsius
        //Fahrenheit = 1,8 × Celsius
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en Celcius");
        float celcius = s.nextFloat();
        float kelvin = 273.15f + celcius;
        float fahrenheit = 1.8f * celcius;

        System.out.println("El equivalente en Kelvin es: " + kelvin);
        System.out.println("El equivalente en Fahrenheit es: " + fahrenheit);
    }
}