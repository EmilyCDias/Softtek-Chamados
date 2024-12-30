import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para leitura da entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Mensagem inicial para o usuário escolher a área de ajuda
        System.out.println("Olá! Sou o suporte da SmartHelp e estou aqui para te ajudar. Digite a opção para qual área você precisa de ajuda!");
        System.out.println("1- Suporte");
        System.out.println("2- Projetos");
        System.out.println("3- Melhoria");
        System.out.println("4- Manutenção");
        System.out.println("5- Transporte");

        // Lendo a escolha do usuário
        int escolha = scanner.nextInt();

        // Variáveis para armazenar os detalhes com base na escolha
        String analista = "";
        String senioridade = "";
        String nivel = "";
        double custoPorHora = 0;
        String tipo = "";
        double horas = 0;

        // Atribuindo valores com base na escolha do usuário
        switch (escolha) {
            case 1:
                analista = "Jhon";
                senioridade = "Sr";
                nivel = "N2";
                custoPorHora = 60;
                tipo = "Suporte";
                horas = 2.4;
                break;
            case 2:
                analista = "Maria";
                senioridade = "Sr";
                nivel = "N1";
                custoPorHora = 55;
                tipo = "Projetos";
                horas = 2.5;
                break;
            case 3:
                analista = "Mah";
                senioridade = "Ex";
                nivel = "N2";
                custoPorHora = 74.32;
                tipo = "Melhoria";
                horas = 1.5;
                break;
            case 4:
                analista = "Fra";
                senioridade = "Pr";
                nivel = "N1";
                custoPorHora = 45;
                tipo = "Manutenção";
                horas = 4.3;
                break;
            case 5:
                analista = "João";
                senioridade = "Jr";
                nivel = "N2";
                custoPorHora = 20;
                tipo = "Transporte";
                horas = 6;
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha um número de 1 a 5.");
                return;
        }

        // Calculando o custo total
        double custoTotal = custoPorHora * horas;

        // Exibindo a mensagem personalizada com os detalhes
        System.out.println("Certo! Para te fornecer o serviço de " + tipo + " com a melhor qualidade possível, irei te direcionar para o(a) Analista "
                + senioridade + " " + analista + " de nível " + nivel + ". Esta demanda deverá custar aproximadamente R$"
                + String.format("%.2f", custoTotal) + " e levará por volta de " + horas + " horas para ser concluída. Abaixo o link da Task para que converse com seu Analista. A SmartHelp agradece seu contato!");

        // Fechando Scanner
        scanner.close();
    }
}
