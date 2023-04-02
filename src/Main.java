import java.util.Scanner;

public class Main {
    private static String name;
    private static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        clearScreen();
        greetings();
    }

    private static void greetings() {
        System.out.println("Ol� estranho(a)!");
        System.out.println("Eu me chamo Bit. Antes de come�armos preciso que me diga o seu nome.\n");

        System.out.print(">> ");
        name = scan.nextLine();

        clearScreen();
        if (name.isEmpty()) {
            System.out.println("Ent�o voc� n�o quer me contar como se chama? Tudo bem! :(");
        } else {
            System.out.println("Ent�o � assim que te chamam a� do outro lado da tela?");
        }

        mainOptions();
    }

    private static void mainOptions() {
        String[] questions = {"1 - Desejo saber sobre unidades de armazenamento.", "2 - Desejo saber sobre unidades de processamento.", "3 - Desejo saber sobre proposi��es e seus conectivos.", "4 - Desejo saber sobre algoritmo e l�gica de programa��o.", "5 - Desejo saber sobre programa��o Java.", "6 - Desejo encerrar a conversa."};

        System.out.println("Sobre o qu� deseja saber?\n\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
        }

        System.out.print("\n>> ");
        mainOptionsSelection();
    }

    private static void storageUnits() {
        // "1 - Desejo saber sobre unidades de armazenamento."
    }

    private static void processingUnits() {
        String[] questions = {"1 - O que é uma unidade de processamento?", "2 - Quais são os tipos de unidades de processamento?", "3 - O que é a CPU?", "4 - Como funciona a execução de um programa em um processador?", "5 - Como a velocidade de um processador é medida?", "6 - Qual é a diferença entre processadores de 32 bits e 64 bits?", "7 - Como é feito o resfriamento de um processador?", "8 - Qual é a importância da cache em um processador?"};

        System.out.println("Sobre unidades de processamento, o que deseja saber?\n\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
        }

        System.out.print("\n>> ");
        processingUnitOptionsSelection();
    }

    private static void processingUnitOptionsSelection() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
        }
    }


    private static void fundamentals() {
        // "3 - Desejo saber sobre proposi��es e seus conectivos."
    }

    private static void algorithm() {
        // "4 - Desejo saber sobre algoritmo e l�gica de programa��o.",
    }

    private static void java() {
        //"5 - Desejo saber sobre programa��o Java."
    }

    private static void mainOptionsSelection() {
        int opt;

        if (scan.hasNextInt()) {
            clearScreen();
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Me fale o que voc� deseja saber sobre unidades de armazenamento\n");
                    System.out.print("1- O qu� � unnidade de armazenamento ?\n");
                    System.out.print("2- Cite exemplos de unidades de armazenamento ?\n");
                    System.out.print("3- Qual a menor unidade de armazenamento ?\n");
                    System.out.print("4- Como um computador representa as unidades de armazenamneto?\n");
                    System.out.print("5- Como quantificar a capacidade  de armazenamento de um dispositivo ?\n");
                    System.out.print("\n>> ");
                    clearScreen();
                    opt = scan.nextInt();
                    switch (opt) {
                        case 1:System.out.println("As unidades de armazenamento de medida referem-se a medidas utilizadas para expressar a quantidade de dados que podem ser armazenados num dispositivo de armazenamento. Esses recursos s�o expressos em termos de bytes.\n");
                            break;
                        case 2:System.out.println("Exemplos: Disco R�gido. Por meios �pticos. " +
                                " Exemplos: CD, DVD. Por meios eletr�nicos (SSDs) ? chip ? " +
                                "Exemplos: cart�o de mem�ria, pen drive.\n");
                            break;
                        case 3:System.out.println("Um bit � a unidade de medida m�nima para armazenamento em um computador. Pode ter apenas o valor de ?0? ou ?1?, como o valor el�trico de desligado / ligado ou falso / verdadeiro.\n");
                            break;
                        case 4:  System.out.println("Um computador digital moderno representa dados usando o sistema de numera��o bin�ria. Texto, n�meros, imagens, �udio e quase qualquer outra forma de informa��o podem ser convertidos em uma sequ�ncia de bits ou d�gitos bin�rios, cada um dos quais tem um valor de 0 ou 1. A unidade mais comum de armazenamento � o byte, igual para 8 bits.\n");
                            break;
                        case 5:System.out.println("As unidades de medida utilizadas para quantificar a mem�ria principal e indicar a capacidade\n" +
                                "de armazenamento de dispositivos s�o:\n" +
                                "\n" +
                                "K quilo (mil) \n" +
                                "M mega (milh�o) \n" +
                                "G giga (bilh�o) \n" +
                                "T tera (trilh�o) \n" +
                                "\n");
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            processingUnitOptionsSelection();
                            break;
                    }
                    storageUnits();
                    break;
                case 2:
                    System.out.println("Me fale o que voc� deseja saber sobre unidades de processamento.\n");
                    System.out.print("1- O qu� � unidade de processamento ?\n");
                    System.out.print("2- Quais os tipos de unidade de processamento ?\n");
                    System.out.print("3- O que é a CPU ?\n");
                    System.out.print("4- Como um computador executa um programa ?\n");
                    System.out.print("5- Como quantificar a velocidade de um processador ?\n");
                    System.out.print("6- Diferença entre processadores de de 32 bits e 644 bits ?\n");
                    System.out.print("7- Qual a importância do resfriamento de um processador e como isso é feito ?\n");
                    System.out.print("8- o que é a memória cache ?\n");
                    System.out.print("\n>> ");
                    clearScreen();
                    opt = scan.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("Uma unidade de processamento é um componente de hardware responsável por executar operações em um computador. É comumente associado a um processador, que é a unidade central de processamento (CPU) de um computador.");
                            break;
                        case 2:
                            System.out.println("Os tipos de unidades de processamento incluem CPUs, GPUs, DSPs e FPGAs.");
                            break;
                        case 3:
                            System.out.println("A CPU (Central Processing Unit) é o tipo mais comum de unidade de processamento em um computador. É responsável por executar a maioria das operações em um sistema, incluindo cálculos matemáticos, lógicos e de controle.");
                            break;
                        case 4:
                            System.out.println("A execução de um programa em um processador geralmente envolve a busca de instruções em memória, decodificação dessas instruções e execução das operações correspondentes. O processador pode usar vários níveis de cache para melhorar o desempenho da execução.");
                            break;
                        case 5:
                            System.out.println("A velocidade de um processador é medida em GHz (gigahertz), que indica o número de ciclos de clock que o processador pode executar por segundo. Quanto maior a velocidade de clock, mais operações o processador pode executar em um determinado período de tempo.");
                            break;
                        case 6:
                            System.out.println("Processadores de 32 bits e 64 bits diferem na quantidade de dados que podem ser processados ​​de uma vez. Um processador de 32 bits pode lidar com palavras de 32 bits (4 bytes) de uma vez, enquanto um processador de 64 bits pode lidar com palavras de 64 bits (8 bytes). Isso pode afetar o desempenho e a capacidade do sistema em lidar com grandes quantidades de dados.");
                            break;
                        case 7:
                            System.out.println("O resfriamento de um processador é importante para garantir que ele não superaqueça e pare de funcionar. Isso geralmente é feito usando um cooler, que é um componente que ajuda a dissipar o calor gerado pelo processador.");
                            break;
                        case 8:
                            System.out.println("A cache é uma memória de acesso rápido que armazena dados que são frequentemente acessados ​​pelo processador. Isso pode melhorar significativamente o desempenho do sistema, pois o acesso à cache é muito mais rápido do que o acesso à memória principal.");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            processingUnitOptionsSelection();
                            break;
                    }
                    break;
                case 3:
                    fundamentals();
                    break;
                case 4:
                    algorithm();
                    break;
                case 5:
                    java();
                    break;
                case 6:
                    System.out.println("Adeus!");
                    break;
                default:
                    invalidOptions();
            }

        } else {
            invalidOptions();
        }

    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void invalidOptions() {
        scan.next();
        clearScreen();
        System.out.println("N�o consegui te entender. S� posso te ajudar com as op��es abaixo.");
        mainOptions();
    }

}