import java.util.Scanner;


public class arquivo {
    public static void main(String[] args) {

        int opcao;
       do {

           System.out.println(" |  ---------------  |");
           System.out.println(" |  MENU DE OPÇÕES   |");
           System.out.println(" |    1- Opção 1     |");
           System.out.println(" |    2- Opção 2     |");
           System.out.println(" |    3- Sair        |");
           System.out.println(" |  ---------------  |");
           Scanner menu = new Scanner(System.in);


           System.out.println(" Selecione uma opção: ");
           opcao = menu.nextInt();


           switch (opcao) {
               case 1:
                   System.out.println("Você escolheu a primeira opção");
                   break;
               case 2:
                   System.out.println("Você escolheu a segunda opção");
                   break;
               case 3:
                   System.out.println("O programa foi encerrado");
                   break;
               default:
                   System.out.println("Seleção inválida");
                   break;


           }
       }while (opcao!=3);
    }
}