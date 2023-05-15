//Código do Guilherme
package app.options;

import java.util.Scanner;
import app.Util;
import app.App;

public class ProcessingUnits {

    private final Scanner scan;
    private final String[] quastionList = {
            "1 - O que é uma unidade de processamento?",
            "2 - Quais são os tipos de unidades de processamento?",
            "3 - O que é a CPU?",
            "4 - Como funciona a execução de um programa em um processador?",
            "5 - Como a velocidade de um processador é medida?",
            "6 - Qual é a diferença entre processadores de 32 bits e 64 bits?",
            "7 - Como é feito o resfriamento de um processador?",
            "8 - Qual é a importância da cache em um processador?",
            "0 - Voltar" };

    public ProcessingUnits() {scan = new Scanner(System.in);}

    /*
     * Aprender algo sobre Unidades de Processamento e retornar false quando for para finalizar o aprendizado
     * */
    public boolean learn() {
        printOptions();
        int selectedOption = selectOption();

        if (selectedOption == 0) {
            return false;
        }

        boolean isValidOption = selectedOption > 0 && selectedOption <= quastionList.length;
        if (isValidOption) {
            printSelectedOption(selectedOption);
        } else {
            printMessageForInvalidOptions();
        }

        return true;
    }

    private void printOptions() {
        System.out.println("Sobre Unidades de Processamento, o que deseja saber?\n");

        for (String question : quastionList) {
            System.out.println(question);
        }
    }

    /*
     * Seleciona um numero inteiro do teclado que é referente à opcão selecionada do menu.
     * Caso selecione uma opção inválida e/ou aconteça algum error, retorna -1.
     * */
    private int selectOption() {
        System.out.print("\n>> ");
        return scan.hasNextInt() ? scan.nextInt() : -1;
    }

    /*
     * Imprimir no terminal os detalhes da opção selecionada
     * */
    private void printSelectedOption(int selectedOption) {
        switch (selectedOption) {
                case 1 -> System.out.println("Uma unidade de processamento é um componente de hardware responsável por executar operações em um computador. É comumente associado a um processador, que é a unidade central de processamento (CPU) de um computador.");
                case 2 -> System.out.println("Os tipos de unidades de processamento incluem CPUs, GPUs, DSPs e FPGAs.");
                case 3 -> System.out.println("A CPU (Central Processing Unit) é o tipo mais comum de unidade de processamento em um computador. É responsável por executar a maioria das operações em um sistema, incluindo cálculos matemáticos, lógicos e de controle.");
                case 4 -> System.out.println("A execução de um programa em um processador geralmente envolve a busca de instruções em memória, decodificação dessas instruções e execução das operações correspondentes. O processador pode usar vários níveis de cache para melhorar o desempenho da execução.");
                case 5 -> System.out.println("A velocidade de um processador é medida em GHz (gigahertz), que indica o número de ciclos de clock que o processador pode executar por segundo. Quanto maior a velocidade de clock, mais operações o processador pode executar em um determinado período de tempo.");
                case 6 -> System.out.println("Processadores de 32 bits e 64 bits diferem na quantidade de dados que podem ser processados ​​de uma vez. Um processador de 32 bits pode lidar com palavras de 32 bits (4 bytes) de uma vez, enquanto um processador de 64 bits pode lidar com palavras de 64 bits (8 bytes). Isso pode afetar o desempenho e a capacidade do sistema em lidar com grandes quantidades de dados.");
                case 7 -> System.out.println("O resfriamento de um processador é importante para garantir que ele não superaqueça e pare de funcionar. Isso geralmente é feito usando um cooler, que é um componente que ajuda a dissipar o calor gerado pelo processador.");
                case 8 ->System.out.println("A cache é uma memória de acesso rápido que armazena dados que são frequentemente acessados ​​pelo processador. Isso pode melhorar significativamente o desempenho do sistema, pois o acesso à cache é muito mais rápido do que o acesso à memória principal.");
            default -> {
                printMessageForInvalidOptions();
                printOptions();
            }
        }
    }
    // método para limpar a tela
    private void printMessageForInvalidOptions() {
        Util.clearScreen();
        System.out.println("Não consegui te entender. Só posso te ajudar com as opções informadas.\n");
    }
}