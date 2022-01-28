package Exercício1;

public class Mensagem {
    public static void obterMensagem( int hora)
    {
       switch ( hora )
       {
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
               enviaBomDia();
               break;
           case 13:
           case 14:
           case 15:
           case 16:
           case 17:
               enviaBoaTarde();
               break;
           case 18:
           case 19:
           case 20:
           case 21:
           case 22:
           case 23:
           case 24:
               enviaBoaNoite();
               break;
           default:

       }

    }
    public static void enviaBomDia(){
        System.out.println("Bom-dia, ainda não almocei");
    }
    public static void enviaBoaTarde(){
        System.out.println("Boa Tarde, Tudo bem ?");
    }
    public static void enviaBoaNoite(){
        System.out.println("Boa noite, ainda não dirmiu?");
    }
}
