package Exercício1;

public class Emprestimo
{
    public static int getDuasParcela()
    {
    return 2;
     }
    public static int getTresParcela()
    {
        return 3;
    }
    public static double getTaxaDuasParcela()
    {
        return 0.3;
    }
    public static double getTaxaTresParcela()
    {
        return 0.45;
    }

    public static void calculator(double valor, int parcelas)
    {
        if (parcelas == 2)
        {
            double valorTotal = valor + (valor * getTaxaDuasParcela());
            System.out.println("Valor Total emprestado  em 2 : " +valorTotal);
        }
        else if (parcelas == 3){
            double valorTotal = valor + (valor * getTaxaTresParcela());
            System.out.println("Valor Total emprestado em 3  : " +valorTotal);
        } else
            System.out.println("Quantidade de parcela não aceita");
    }
}
