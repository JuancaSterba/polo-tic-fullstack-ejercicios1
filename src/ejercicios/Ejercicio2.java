package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Escribir un programa en el cual se le pregunte al usuario su nombre. A
        //continuación, mostrar un mensaje que diga “Hola, ” completando el
        //mensaje con el nombre que ingresó el usuario.
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = s.nextLine();
        System.out.println("Hola " + nombre);
    }
}