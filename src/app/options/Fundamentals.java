package app.options;

import java.util.Scanner;
import app.Util;
import app.App;

public class Fundamentals {
    private final Scanner scan;

    private final String[] questionList = {
            "1 - O que é um cálculo proposicional ?",
            "2 - O que são símbolos auxiliadores?",
            "3 - Quais os principios básicos de uma proposiçaõ ?",
            "4 - Como calcular o conectivo lógico condicional?",
            "5 - O que são conectivos lógicos?",
            "0 - Voltar"
    };

    public Fundamentals (){scan = new Scanner(System.in);}
    /*
     * Aprender algo sobre o Fundamentos e retornar false quando for para finalizar o aprendizado
     * */
    public boolean learn() {
        printOptions();
        int selectedOption = selectOption();

        if(selectedOption == 0) {
            return false;
        }

        boolean isValidOption = selectedOption > 0 && selectedOption <= questionList.length;
        if (isValidOption) {
            printSelectedOption(selectedOption);
        } else {
            printMessageForInvalidOptions();
        }

        return true;
    }
    private void printOptions() {
        System.out.println("Sobre fundamentos de computação, o que deseja saber?\n");

        for (String question : questionList) {
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
            case 1 -> System.out.println("É um sistema da lógica matemática que representa os princípios é operações da lógica proposicional.\n");
            case 2 -> System.out.println("Assim como na matemática, os cálculos podem começar a ficar mais profundos e chega uma hora que precisamos de símbolos auxiliares para facilitar um pouco nossa vida .(),parênteses que serve para denotar o alcance dos conectivos.\n");
            case 3 -> System.out.println("Alguns princípios básicos que regem as proposições são: princípio da identidade : uma proposição verdadeira é verdadeira, e uma proposição falsa é falsa. Principio do terceiro excluído: uma proposição ou é verdadeira ou é falsa não existe uma terceira possibilidade. Princípio da não contradição: uma proposição não pode ser verdadeira e falsa simultaneamente.\n");
            case 4 -> System.out.println(" P->Q; Pratico esportes, então tenho um bom preparo físico. O conectivo lógico condicional é formado por dois condicionais. Utilizamos uma condicional quando temos p->q e q->p. A condicional será falsa quando a primeira proposição utilizada possuir o valor lógico verdadeiro e a segunda proposição possuir valor lógico falso.\n");
            case 5 -> System.out.println("O conectivo lógico é um símbolo ou palavra que usamos para conectar duas ou mais proposições para que elas sejam válidas, de modo que a composta formada dependa apenas das proposições que a originou. Por causa dos conectivos conseguimos dar um valor lógico para esta proposição formada. OS conectivos lógicos mais comuns são os conectivos binários (também chamados de conectivos diádicos),que juntam duas sentenças, que podem ser consideradas os operadores da função. É também comum considerar negação como um conectivo unàrio.\n");
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