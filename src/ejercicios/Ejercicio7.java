package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Escribir un programa que reciba el valor de dos edades y las guarde
        //en dos variables. Luego el programa debe intercambiar los valores de
        //ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
        //ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
        //mostrar edad1 = 35 y edad2 = 24.
        //Tip: para intercambiar los valores de dos variables se debe utilizar
        //una variable auxiliar.
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese dos edades, las intercambiaremos");
        System.out.print("Edad 1: ");
        int edad1 = s.nextInt();
        System.out.print("Edad 2: ");
        int edad2 = s.nextInt();
        int aux = edad1;
        edad1 = edad2;
        edad2 = aux;
        System.out.println("Edad 1: " + edad1);
        System.out.println("Edad 2: " + edad2);
        // tambien se podia simplemente intercambiar las variables en el print...
    }
}