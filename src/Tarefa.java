import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<Boolean> tarefasConcluidas = new ArrayList<>();
        boolean continuar = true;


        System.out.println("*Armazenador e confirmador de tarefas*");


        while (continuar ) {

            System.out.println("menu\n 1 = Criar tarefa\n 2 = Confirmar tarefas\n 3 = exibir tarefas concluidas\n 4 = finalizar programa");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                System.out.println("*Armazenador de tarefas*");

                System.out.println("Digite sua tarefa:");
                String tarefa = sc.nextLine();
                tarefas.add(tarefa);
                tarefasConcluidas.add(false);


                System.out.println("\nTarefa anotada.");

                System.out.println("Suas tarefas são:\n" + tarefas);


            } else if (menu == 2) {

                System.out.println("*Confirmador de tarefas*");

                int i = 0;
                while (i < tarefas.size()) {

                    System.out.println("Você concluiu a tarefa: " + tarefas.get(i) + "? (s/n)");
                    String resposta = sc.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {

                        tarefasConcluidas.set(i, true);

                        System.out.println("tarefa marcada como concluida.");
                    } else {

                        tarefasConcluidas.set(i, false);
                        System.out.println("tarefa marcada como não concluida");

                    }
                    i++;
                }


            }        else if (menu == 3) {

                int t = 0;

                     System.out.println("*tabela de confirmação*");

                     while (t < tarefas.size()){
                         String status = tarefasConcluidas.get(t) ? "[✔]" : "[  ]";
                         System.out.println(status + " " + tarefas.get(t));



                         t++;
                     }
            }

                    else if (menu == 4) {

                    continuar = false;
                    System.out.println("Programa finalizado.");

                }
                    else {

                    System.out.println("Opção inválida.");

                }

            } sc.close();

        }
    }







