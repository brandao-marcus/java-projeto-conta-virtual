import java.util.Scanner;

public class DesafioContaVirtual {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente = "Marcus";
        String tipoDeConta = "Corrente";
        double saldoAtual = 1000;
        double valor = 0;

        int opcaoDesejada = 1;

        System.out.println("*************************\n");
        System.out.printf("Nome do Cliente: %s\n", nomeCliente);
        System.out.printf("Tipo de conta: %s\n", tipoDeConta);
        System.out.printf("Saldo atual: %.2f\n", saldoAtual);
        System.out.println("\n*************************");

        String menu = """
                ** Digite sua opção **
                1 - Consulta saldo bancario
                2 - Transferir valor
                3 - Receber valor
                4 - Finalizar
                """;

        while (opcaoDesejada != 4){
            System.out.println(menu);
            opcaoDesejada = leitura.nextInt();
            switch (opcaoDesejada){
                case 1:
                    System.out.printf("Saldo da conta: %.2f\n", saldoAtual);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja transferir:");
                    valor = leitura.nextDouble();
                    if(valor > saldoAtual){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldoAtual -= valor;
                        System.out.printf("Saldo atualizado: R$ %.2f\n", saldoAtual);
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja receber:");
                    valor = leitura.nextDouble();
                    saldoAtual += valor;
                    System.out.printf("Saldo atualizado: R$ %.2f\n", saldoAtual);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção errada entre 1 a 4");
            }
        }
        System.out.println("Programa finalizado.");
    }
}