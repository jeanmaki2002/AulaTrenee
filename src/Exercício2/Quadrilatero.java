package Exercício2;

public class Quadrilatero {
    public static void area(double lado)
    {
        System.out.println("A area de um quadrado: " + lado * lado);
    }
    public static void area(double lado1, double lado2)
    {
        System.out.println("A area de um triangulo: " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura)
    {
        System.out.println("A area do trapezio: " +((baseMaior+baseMenor)*altura)/2);
    }
    public static void area(float diametro1, float diametro2)
    {
        System.out.println("A area de um lozango: " + (diametro1+diametro2)/2);
    }

}
