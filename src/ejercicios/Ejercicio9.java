package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //A partir de una cantidad de pesos que el usuario ingresa a través del
        //teclado se debe obtener su equivalente en dólares, en euros, en
        //guaraníes y en reales. Para este ejercicio se consideran las siguientes
        //tasas:
        //1 dólar = 231,68 pesos
        //1 euro = 250,69 pesos
        //1 peso = 31,00 guaraníes
        //1 real = 46,81 pesos
        //Tip: en este ejercicio se puede usar la función printf y mostrar el
        //resultado con dos decimales.
        Scanner s = new Scanner(System.in);
        float peso, dolar, euro, guarani, real;
        dolar = 231.68f;
        euro = 250.69f;
        guarani = 1f/31f;
        real = 46.81f;

        System.out.println("Ingrese un monto en pesos para ver sus cotizaciones.");
        peso = s.nextFloat();
        System.out.printf("Dolares: %.2f\n", peso / dolar);
        System.out.printf("Euros: %.2f\n", peso / euro);
        System.out.printf("Guaraníes: %.2f\n", peso / guarani);
        System.out.printf("Reales: %.2f\n", peso / real);
    }
}