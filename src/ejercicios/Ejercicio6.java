package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Pedir al usuario que ingrese el precio de un producto y el porcentaje
        //de descuento. A continuación mostrar por pantalla el importe
        //descontado y el importe a pagar.
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese por favor el precio del producto: ");
        Double precio = s.nextDouble();
        System.out.println("Ingrese por favor el descuento a aplicar: ");
        Double descuento = s.nextDouble();
        Double total = precio * (1 - (descuento / 100));

        System.out.printf("El total a abonar es: $ %.2f.", total);
    }
}