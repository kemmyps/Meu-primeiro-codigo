package app.options;

import java.util.Scanner;
import app.Util;
import app.App;

public class Fundamentals {
    private Scanner scan;

    public Fundamentals() {
        scan = new Scanner(System.in);
    }

    public void options() {

        System.out.println("Me fale o que você deseja saber sobre Cálculo proposicional e seus Conectivos\n\n");
        String[] questions = { "1 - O que é um cálculo proposicional ?",
                "2 - O que são símbolos auxiliadores?",
                "3 - Quais os principios básicos de uma proposiçaõ ?",
                "4 - Como calcular o conectivo lógico condicional?",
                "5 - O que são conectivos lógicos?",
                "0 - Voltar"
        };

        for (String question : questions) {
            System.out.println(question);
        }

        System.out.print("\n>> ");
        answer();
    }

    public void answer() {

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
                    System.out.print(
                            "É um sistema da lógica matemática que representa os princípios é operações da lógica proposicional.\n");
                    break;
                case 2:
                    System.out.print(
                            "Assim como na matemática, os cálculos podem começar a ficar mais profundos e chega uma hora que precisamos de símbolos auxiliares para facilitar um pouco nossa vida .(),parênteses que serve para denotar o alcance dos conectivos.\n");
                    break;
                case 3:
                    System.out.print(
                            "Alguns princípios básicos que regem as proposições são: princípio da identidade : uma proposição verdadeira é verdadeira, e uma proposição falsa é falsa. Principio do terceiro excluído: uma proposição ou é verdadeira ou é falsa não existe uma terceira possibilidade. Princípio da não contradição: uma proposição não pode ser verdadeira e falsa simultaneamente.\n");
                    break;
                case 4:
                    System.out.print(
                            " P->Q; Pratico esportes, então tenho um bom preparo físico. O conectivo lógico condicional é formado por dois condicionais. Utilizamos uma condicional quando temos p->q e q->p. A condicional será falsa quando a primeira proposição utilizada possuir o valor lógico verdadeiro e a segunda proposição possuir valor lógico falso.\n");
                    break;
                case 5:
                    System.out.print(
                            "O conectivo lógico é um símbolo ou palavra que usamos para conectar duas ou mais proposições para que elas sejam válidas, de modo que a composta formada dependa apenas das proposições que a originou. Por causa dos conectivos conseguimos dar um valor lógico para esta proposição formada. OS conectivos lógicos mais comuns são os conectivos binários (também chamados de conectivos diádicos),que juntam duas sentenças, que podem ser consideradas os operadores da função. É também comum considerar negação como um conectivo unàrio.\n");
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
