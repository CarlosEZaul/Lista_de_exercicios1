import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Adicionar contato");
            System.out.println("2 - Listar todos os contatos");
            System.out.println("3 - Buscar contato por nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                if (contatos.size() >= 10) {
                    System.out.println("Limite de 10 contatos atingido.");
                    continue;
                }

                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();

                Contato contato = new Contato(nome, telefone, email);
                contatos.add(contato);
                System.out.println("Contato adicionado com sucesso!");

            } else if (opcao == 2) {
                if (contatos.isEmpty()) {
                    System.out.println("Nenhum contato cadastrado.");
                } else {
                    for (Contato c : contatos) {
                        c.exibir();
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o nome do contato: ");
                String nomeBusca = scanner.nextLine();
                boolean encontrado = false;

                for (Contato c : contatos) {
                    if (c.nome.equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Telefone: " + c.telefone);
                        System.out.println("Email: " + c.email);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Contato não encontrado.");
                }

            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
