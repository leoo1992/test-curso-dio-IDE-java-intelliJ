package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro valor: ");
        a=scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b=scan.nextInt();
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Soma é :"+somar);
        System.out.println("Subtração é :"+subtrair);
        System.out.println("Divisão é :"+dividir);
        System.out.println("Multiplicação é :"+multiplicar);

    }

    private static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }




}
