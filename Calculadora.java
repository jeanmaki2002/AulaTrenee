package Exercício1;

public class Calculadora
{
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println( "soma = "+resultado);
    }
    public static void substração(double numero1, double numero2)
    {
        double resultado = numero1 - numero2;
        System.out.println("substração = " +resultado);
    }
    public static void multiplicação(double numero1, double numero2)
    {
        double resultado = numero1 * numero2;
        System.out.println("multiplicação = " +resultado);
    }
    public static void divisão(double numero1, double numero2)
    {
        double resultado = numero1 / numero2;
        System.out.println("Divisão = " +resultado);
    }

}
