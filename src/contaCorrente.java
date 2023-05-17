import java.util.Scanner;

public class contaCorrente {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
    int escolha;
    double saldo, saque, deposito;
    saldo = 50;

    Scanner leitor = new Scanner(System.in);

    do{
    System.out.println("Bem vindo ao banco X, verifique as opções abaixo.");
    System.out.println("1 - Obter saldo");
    System.out.println("2 - Sacar");
    System.out.println("3 - Depositar");
    System.out.println("4 - Sair do sistema");
    System.out.println("Digite o número correspondente a sua opção:");  
    escolha = leitor.nextInt();
    
    switch(escolha){
        case(1):
        System.out.println("Seu saldo é" + saldo);
        break;
        
        case(2):
        System.out.println("Seu saldo é " + saldo);
        System.out.println("Para o saque, será cobrado uma taxa de 0,5%.");
        System.out.println("Digite o valor que você deseja sacar:");

        saque = leitor.nextDouble();
        
        saque = saque * 1.05;
        saldo = saldo - saque;
        
        System.out.println("Taxa aplicada");
        System.out.println("Seu saldo é " + saldo);
        break;
        
        case (3):
        System.out.println("Seu saldo é " + saldo);
        System.out.println("Digite o valor que você deseja depositar:");
        deposito = leitor.nextDouble();

        saldo = saldo + deposito;
        System.out.println("Depósito realizado, o saldo total é:" + saldo);
        break;

        case(4):
        System.out.println("Fim do programa");
        break;
  
        }
    }while(escolha != 4);

    }
}

