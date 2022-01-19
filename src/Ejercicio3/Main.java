package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días de campaña: ");
        int dias = teclado.nextInt();
        int montoTotal = dias * 2;
        System.out.print("El costo total de la campaña sería: " + montoTotal);
    }
}
