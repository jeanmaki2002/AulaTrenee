package Exercício3;

public class Quadrilatero {
    public static double area(double lado)
    {
        double resultado = lado * lado;
        System.out.println("A area de um quadrado: " + resultado);
        return resultado;
    }
    public static double area(double lado1, double lado2)
    {
        double resultado = lado1 * lado2;
        System.out.println("A area de um triangulo: " + resultado);
        return resultado;
    }
    public static double area(double baseMaior, double baseMenor, double altura)
    {
        double resultado = ((baseMaior+baseMenor)*altura)/2;
        System.out.println("A area do trapezio: " + resultado);
        return resultado;
    }
    public static float area(float diametro1, float diametro2)
    {
        float resultado = (diametro1+diametro2)/2;
        System.out.println("A area de um lozango: " + resultado);
        return resultado;
    }

}
