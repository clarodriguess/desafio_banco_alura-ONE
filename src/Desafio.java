import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Benedito Perez";
        String tipoDaConta = "Conta Corrente";
        double saldo = 1599.90;
        int opcao = 0;

        while (opcao != 4){

        String cabecalho = ("""
                ***********************
                
                Nome do Cliente: %s
                Tipo de conta: %s
                
                ***********************
                
                Escolha uma opçao:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                """).formatted(nome, tipoDaConta, saldo);
        System.out.println(cabecalho);
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Saldo atual: R$ " +saldo);//formatar 2 casas
                break;
            case 2:
                System.out.println("Qual o valor a receber?");
                double valorRecebido = scanner.nextInt();
                saldo += valorRecebido;
                System.out.println("Valor recebido. Saldo atual: R$ " +saldo);
                break;
            case 3:
                System.out.println("Qual o valor da transferencia?");
                double valorTransferido = scanner.nextInt();
                if (valorTransferido > saldo){
                    System.out.println("Saldo insuficiente");
                } else{
                    saldo -= valorTransferido;
                    System.out.println("Transferencia realizada. Saldo atual: R$ " +saldo);
                }
                break;
            case 4:
                System.out.println("Operação finalizada");
                break;
            default:
                System.out.println("Opção Invalida");
        }
        }
    }
}
