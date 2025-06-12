import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    String nome;
    int id;
    double salario;
    String departamento;

    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Cadastrar funcionário");
            System.out.println("2 - Calcular total de salários por departamento");
            System.out.println("3 - Listar todos os funcionários");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("ID: ");
                int id = scanner.nextInt();

                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();

                Funcionario f = new Funcionario(nome, id, salario, departamento);
                funcionarios.add(f);

                System.out.println("Funcionário cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite o departamento: ");
                String dept = scanner.nextLine();
                double total = 0;

                for (Funcionario f : funcionarios) {
                    if (f.departamento.equalsIgnoreCase(dept)) {
                        total += f.salario;
                    }
                }

                System.out.println("Total de salários no departamento \"" + dept + "\": R$ " + total);
            } else if (opcao == 3) {
                if (funcionarios.isEmpty()) {
                    System.out.println("Nenhum funcionário cadastrado.");
                } else {
                    for (Funcionario f : funcionarios) {
                        f.exibirDados();
                    }
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
