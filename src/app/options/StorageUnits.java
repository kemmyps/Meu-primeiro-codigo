//Código do Diego
package app.options;

import java.util.Scanner;

import app.App;
import app.Util;

public class StorageUnits {

    private final Scanner scan;

    private final String[] quastionList = {
            "1 - O quê é unidade de armazenamento?",
            "2 - Cite exemplos de unidades de armazenamento?",
            "3 - Qual a menor unidade de armazenamento?",
            "4 - Como um computador representa as unidades de armazenamento?",
            "5 - Como quantificar a capacidade  de armazenamento de um dispositivo?",
            "0 - Voltar"
    };

    public StorageUnits() {scan = new Scanner(System.in);}

    /*
     * Aprender algo sobre o Java e retornar false quando for para finalizar o aprendizado
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
        System.out.println("Sobre a linguagem de programação Java, o que deseja saber?\n");

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
            case 1 -> System.out.println("As unidades de armazenamento de medida referem-se a medidas utilizadas para expressar a quantidade de dados que podem ser armazenados num dispositivo de armazenamento. Esses recursos são expressos em termos de bytes.\n");
            case 2 -> System.out.println("Exemplos:\n\nDisco Rígido. Por meios ópticos, CD, DVD.\nPor meios eletrônicos (SSDs), cartão de memória, pen-drive.\n");
            case 3 -> System.out.println("Um bit é a unidade de medida mínima para armazenamento em um computador. Pode ter apenas o valor de 0 ou 1, como o valor elétrico de desligado / ligado ou falso / verdadeiro.\n");
            case 4 -> System.out.println("Um computador digital moderno representa dados usando o sistema de numeração binária. Texto, números, imagens, audio e quase qualquer outra forma de informar  o podem ser convertidos em uma sequência de bits ou de gitos binarios, cada um dos quais tem um valor de 0 ou 1. A unidade mais comum de armazenamento   o byte, igual para 8 bits.\n");
            case 5 -> System.out.println("As unidades de medida utilizadas para quantificar a memória principal e indicar a capacidade de armazenamento de dispositivos são:\n\nK quilo (mil)\nM mega (milhão) \nG giga (bilhão) \nT tera (trilhão) \n");
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
