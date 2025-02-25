import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int menu;
        ContaBasica contaBasica = new ContaBasica("Jorginho");
        ContaPremium contaPremium = new ContaPremium("Jorginho");
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("1-Depositar na conta básica!");
            System.out.println("2-Sacar da conta básica!");
            System.out.println("3-Transferir da Conta Básica para a Conta Premium!");
            System.out.println("4-Depositar na Conta Premium!");
            System.out.println("5-Sacar da Conta Premium!");
            System.out.println("6-Transferir da Conta Premium para a Conta Básica!");
            System.out.println("7-Mostrar saldo!");
            System.out.println("8-Sair! \n");
            System.out.print("Escolha uma opção do menu e digite seu respectivo número:");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Quantos reais você deseja depositar?:");
                    double case1depositoCB = scanner.nextDouble();
                    contaBasica.depositar(case1depositoCB);
                    break;

                case 2:
                    System.out.println("Quantos reais você deseja sacar?:");
                    double case2saqueCB = scanner.nextDouble();
                    contaBasica.sacar(case2saqueCB);
                    break;

                case 3:
                    System.out.println("Quantos reais você deseja transferir para a conta premium?:");
                    double case3TransferenciaCB = scanner.nextDouble();
                    contaBasica.transferir(case3TransferenciaCB, contaPremium);
                    break;

                case 4:
                    System.out.println("Quantos reais você deseja depositar?:");
                    double case4depositoCP = scanner.nextDouble();
                    contaPremium.depositar(case4depositoCP);
                    break;

                case 5:
                    System.out.println("Quantos reais você deseja sacar?:");
                    double case5sacarCP = scanner.nextDouble();
                    contaPremium.sacar(case5sacarCP);
                    break;

                case 6:
                    System.out.println("Quantos reais você deseja transferir para a conta básica?:");
                    double case6transferenciaCP = scanner.nextDouble();
                    contaPremium.transferir(case6transferenciaCP, contaBasica);
                    break;

                case 7:
                    System.out.println("Saldo conta básica: "+ contaBasica.getSaldo()+ "\n Saldo conta premium: "+ contaPremium.getSaldo()+ "\n");
                    break;

                case 8:
                    System.out.println("Fechando o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida! O número digitado não consta no menu.");
                    break;
            }
        }while(menu != 8);
    }
}
