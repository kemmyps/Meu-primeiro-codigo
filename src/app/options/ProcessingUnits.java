//Código do Guilherme
package app.options;

import java.util.Scanner;
import app.Util;
import app.App;

public class ProcessingUnits {

    private Scanner scan;

    public ProcessingUnits() {
        scan = new Scanner(System.in);
    }

    public void options() {
        String[] questions = { "1 - O que é uma unidade de processamento?",
                "2 - Quais são os tipos de unidades de processamento?", "3 - O que é a CPU?",
                "4 - Como funciona a execução de um programa em um processador?",
                "5 - Como a velocidade de um processador é medida?",
                "6 - Qual é a diferença entre processadores de 32 bits e 64 bits?",
                "7 - Como é feito o resfriamento de um processador?",
                "8 - Qual é a importância da cache em um processador?",
                "0 - Voltar" };

        System.out.println("Sobre unidades de processamento, o que deseja saber?\n\n");

        for (String question : questions) {
            System.out.println(question);
        }

        System.out.print("\n>> ");
        processingUnitOptionsSelection();

    }

    private void processingUnitOptionsSelection() {

        int choice;

        if (scan.hasNextInt()) {

            choice = scan.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    App app = new App();
                    Util.clearScreen();
                    app.mainOptions();
                    break;
                case 1:
                    System.out.println(
                            "Uma unidade de processamento é um componente de hardware responsável por executar operações em um computador. É comumente associado a um processador, que é a unidade central de processamento (CPU) de um computador.");
                    break;
                case 2:
                    System.out.println("Os tipos de unidades de processamento incluem CPUs, GPUs, DSPs e FPGAs.");
                    break;
                case 3:
                    System.out.println(
                            "A CPU (Central Processing Unit) é o tipo mais comum de unidade de processamento em um computador. É responsável por executar a maioria das operações em um sistema, incluindo cálculos matemáticos, lógicos e de controle.");
                    break;
                case 4:
                    System.out.println(
                            "A execução de um programa em um processador geralmente envolve a busca de instruções em memória, decodificação dessas instruções e execução das operações correspondentes. O processador pode usar vários níveis de cache para melhorar o desempenho da execução.");
                    break;
                case 5:
                    System.out.println(
                            "A velocidade de um processador é medida em GHz (gigahertz), que indica o número de ciclos de clock que o processador pode executar por segundo. Quanto maior a velocidade de clock, mais operações o processador pode executar em um determinado período de tempo.");
                    break;
                case 6:
                    System.out.println(
                            "Processadores de 32 bits e 64 bits diferem na quantidade de dados que podem ser processados ​​de uma vez. Um processador de 32 bits pode lidar com palavras de 32 bits (4 bytes) de uma vez, enquanto um processador de 64 bits pode lidar com palavras de 64 bits (8 bytes). Isso pode afetar o desempenho e a capacidade do sistema em lidar com grandes quantidades de dados.");
                    break;
                case 7:
                    System.out.println(
                            "O resfriamento de um processador é importante para garantir que ele não superaqueça e pare de funcionar. Isso geralmente é feito usando um cooler, que é um componente que ajuda a dissipar o calor gerado pelo processador.");
                    break;
                case 8:
                    System.out.println(
                            "A cache é uma memória de acesso rápido que armazena dados que são frequentemente acessados ​​pelo processador. Isso pode melhorar significativamente o desempenho do sistema, pois o acesso à cache é muito mais rápido do que o acesso à memória principal.");
                    break;
                default:
                    invalidOptions();
                    options();
            }

            if (choice != 0) {
                System.out.print("\n\n");
                options();
            }

        } else {
            invalidOptions();
            options();
        }

    }

    private void invalidOptions() {
        scan.nextLine();
        Util.clearScreen();
        System.out.println("Não consegui te entender. Só posso te ajudar com as opções abaixo.");
    }
}
