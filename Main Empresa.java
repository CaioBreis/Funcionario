package teste;

import enti.funcionario;

import java.util.Scanner;

public class empresa {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String nome;
        int id;
        double salario;
        int cont;

        System.out.print("Numeros de funcionarios:");
        cont = sc.nextInt();

        funcionario d[] = new funcionario[cont];

        for (int i = 0; i < cont; i++) {
            System.out.println(" ");
            System.out.println("funcionario " + (i + 1) + ":");
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("id: ");
            id = sc.nextInt();
            System.out.print("Valor do Salario: R$");
            salario = sc.nextDouble();

            funcionario f = new funcionario(nome, id, salario);
            d[i] = f;

        }

        int op = 1;
        while (op != -1) {

            System.out.println("Pressione 0 para para sair ou o ID do funcionario: ");
            op = sc.nextInt();

            if (op == 0) {
                System.out.println("Fim do programa");
            } else {
                id = op;
                for (int i = 0; i < cont; i++) {
                    if (d[i].getId() == id) {

                        int op2 = 1;

                        while (op2 != 0) {
                            System.out.println("Funcionario: " + d[i].getNome());

                            System.out.println("Pressione 0 para sair e mudar o id: ");
                            System.out.println("1 para mostrar funcionario");
                            System.out.println("2 para aumentar salario");
                            System.out.println("3 para reduzir salario");
                            op2 = sc.nextInt();
                            switch (op2) {

                                case 1:
                                    System.out.println(d[i].toString());
                                    break;

                                case 2:
                                    System.out.println("O salario atual de " + d[i].getNome() + " é R$" + d[i].getSalario());
                                    System.out.println("quantos por centos vai aumentar salario ");
                                    d[i].alteraSalario(sc.nextDouble());
                                    System.out.println("salario atual agora R$" + d[i].getSalario());
                                    System.out.println("");
                                    break;

                                case 3:
                                    System.out.println("O salario atual de " + d[i].getNome() + " é R$" + d[i].getSalario());
                                    System.out.println("quantos por centos vai reduzir salario ");
                                    d[i].nalteraSalario(sc.nextDouble());
                                    System.out.println("salario atual agora R$" + d[i].getSalario());
                                    System.out.println("");
                                    break;
                                case 0:
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("Opiço invalida");
                                    break;
                            }


                        }

                    }
                    }
                }
            }


        }

    }

