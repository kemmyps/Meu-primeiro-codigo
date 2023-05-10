//Código do Diego
package app.options;

import java.util.Scanner;

import app.App;
import app.Util;

public class StorageUnits {

    private Scanner scan;

    public StorageUnits() {
        scan = new Scanner(System.in);
    }

    public void options() {
        String[] questions = {
                "1 - O quê é unidade de armazenamento?",
                "2 - Cite exemplos de unidades de armazenamento?",
                "3 - Qual a menor unidade de armazenamento?",
                "4 - Como um computador representa as unidades de armazenamento?",
                "5 - Como quantificar a capacidade  de armazenamento de um dispositivo?",
                "0 - Voltar" };

        System.out.println("Me fale o que você deseja saber sobre unidades de armazenamento:\n\n");

        for (String question : questions) {
            System.out.println(question);
        }

        System.out.print("\n>> ");
        storageUnitsOptionsSelection();
    }

    private void storageUnitsOptionsSelection() {

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
                            "As unidades de armazenamento de medida referem-se a medidas utilizadas para expressar a quantidade de dados que podem ser armazenados num dispositivo de armazenamento. Esses recursos são expressos em termos de bytes.\n");
                    break;
                case 2:
                    System.out.println(
                            "Exemplos:\n\nDisco Rígido. Por meios ópticos, CD, DVD.\nPor meios eletrônicos (SSDs), cartão de memória, pen-drive.\n");
                    break;
                case 3:
                    System.out.println(
                            "Um bit é a unidade de medida mínima para armazenamento em um computador. Pode ter apenas o valor de 0 ou 1, como o valor elétrico de desligado / ligado ou falso / verdadeiro.\n");
                    break;
                case 4:
                    System.out.println(
                            "Um computador digital moderno representa dados usando o sistema de numeração binária. Texto, números, imagens, audio e quase qualquer outra forma de informar  o podem ser convertidos em uma sequência de bits ou de gitos binarios, cada um dos quais tem um valor de 0 ou 1. A unidade mais comum de armazenamento   o byte, igual para 8 bits.\n");
                    break;
                case 5:
                    System.out.println(
                            "As unidades de medida utilizadas para quantificar a memória principal e indicar a capacidade de armazenamento de dispositivos são:\n\n");
                    System.out.println("K quilo (mil)\nM mega (milhão) \nG giga (bilhão) \nT tera (trilhão) \n");
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

    // método para limpar a tela
    private void invalidOptions() {
        scan.nextLine();
        Util.clearScreen();
        System.out.println("Não consegui te entender. Só posso te ajudar com as opções abaixo.");
    }
}
