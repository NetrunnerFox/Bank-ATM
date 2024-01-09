import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Jonh Wick";
        String tipoConta = "Corrente";
        double saldo = 2_500.00;
        double valor = 0;
        String resposta;
        Scanner leitura = new Scanner(System.in);
        Scanner leituraTexto = new Scanner(System.in);

        String extrato = ("""
                ********************************************************************************
                Dados da conta:
                                
                Nome:              %s
                Tipo de conta:     %s
                Saldo:             %.2f
                ********************************************************************************
                """.formatted(nomeCliente, tipoConta, saldo));

        System.out.println(extrato);

        int operacao = 0;
        String menu = """
                Selecione a operação desejada:
                                    
                1 - Conferir extrato
                2 - Deposito
                3 - Transferir
                4 - Saque
                5 - Sair
                """;
        while (operacao != 5) {
            System.out.println(menu);

            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("""
                ********************************************************************************
                Dados da conta:
                                
                Nome:              %s
                Tipo de conta:     %s
                Saldo:             %.2f
                ********************************************************************************
                """.formatted(nomeCliente, tipoConta, saldo));
                    break;

                case 2:
                        System.out.println("Insira o valor desejado:");
                        valor = leitura.nextDouble();

                        System.out.println("""
                                Realizar depósito no valor de R$%.2f ?
                                                                
                                S - Confirma
                                N - Cancela
                                """.formatted(valor));

                        resposta = leituraTexto.nextLine();

                        if (resposta.equalsIgnoreCase("s")){
                            saldo += valor;
                            System.out.println("""
                                        Operação realizada com sucesso!
                                        seu novo saldo é de %.2f
                                        """.formatted(saldo));
                            break;
                            } else if (resposta.equals("n")) {
                            System.out.println("Operação cancelada");
                            break;
                        } else {
                            System.out.println("""
                                    Resposta invalida.
                                    cancelando operação...
                                    operação cancelada.
                                    """);
                            break;
                        }

                case 3:
                    System.out.println("Insira o valor a ser transferido:");
                    valor = leitura.nextDouble();

                    if (valor > saldo){
                        System.out.println("Saldo insuficiente");
                        break;
                    } else {
                        System.out.println("""
                                Realizar transferência no valor de R$%.2f ?
                                                                
                                S - Confirma
                                N - Cancela
                                """.formatted(valor));

                        resposta = leituraTexto.nextLine();

                        if (resposta.equalsIgnoreCase("s")){
                            saldo -= valor;
                            System.out.println("""
                                        Transferência realizada com sucesso!
                                        seu novo saldo é de %.2f
                                        """.formatted(saldo));
                            break;
                        } else if (resposta.equalsIgnoreCase("n")) {
                            System.out.println("Operação cancelada");
                            break;
                        } else {
                            System.out.println("""
                                    Resposta invalida.
                                    cancelando operação...
                                    operação cancelada.
                                    """);
                            break;
                        }
                    }

                case 4:
                    System.out.println("Insira o valor a ser sacado:");
                    valor = leitura.nextDouble();

                    if (valor > saldo){
                        System.out.println("Saldo insuficiente");
                        break;
                    } else {
                        System.out.println("""
                                Realizar saque no valor de R$%.2f ?
                                                                
                                S - Confirma
                                N - Cancela
                                """.formatted(valor));

                        resposta = leituraTexto.nextLine();

                        if (resposta.equalsIgnoreCase("s")){
                            saldo -= valor;
                            System.out.println("""
                                        Retire o dinheiro no local indicado.
                                        Saque realizado com sucesso.
                                        seu novo saldo é de %.2f
                                        """.formatted(saldo));
                            break;
                        } else if (resposta.equals("n")) {
                            System.out.println("Operação cancelada");
                            break;
                        } else {
                            System.out.println("""
                                    Resposta invalida.
                                    cancelando operação...
                                    operação cancelada.
                                    """);
                            break;
                        }
                    }
                case 5:
                    System.out.println("Obrigado por utilizar nossos serviços");


            }


            }
        }
    }

