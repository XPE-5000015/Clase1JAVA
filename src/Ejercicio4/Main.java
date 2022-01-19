package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad del premio total: ");
        double premio = teclado.nextDouble();
        double impuesto1 = premio * 0.0245;
        double impuesto2 = premio * 0.15;
        double impuesto3 = premio * 0.03;
        double montoTotal = premio - impuesto1 - impuesto2 - impuesto3;
        System.out.print("El monto total después de impuestos es: ");
        System.out.printf("%.2f", montoTotal);
    }
}
