package app.options;

import java.util.ArrayList;
import java.util.Scanner;
import app.Util;
import app.App;

public class Java {
    private final Scanner scan;

    private final String[] questionList = {
            "1 - O que é Java e como surgiu ?",
            "2 - O que é Máquina Virtual Java (JVM) ?",
            "3 - O que são variáveis e seus tipos no Java ?",
            "4 - Me mostre um exemplo simples de como aplicar a linguagem Java",
            "0 - Voltar"
    };

    public Java() {
        scan = new Scanner(System.in);
    }

    /*
     * Aprender algo sobre o Java e retornar false quando for para finalizar o aprendizado
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
        System.out.println("Sobre a linguagem de programação Java, o que deseja saber?\n");

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
            case 1 -> System.out.println("A linguagem Java foi desenvolvida pela Sun Microsystems em 1991, para criar software em vários dispositivos eletrônicos.\nA linguagem foi liderada por James Gosling e inicialmente chamada de Oak. Posteriormente, o nome foi alterado para Java para contornar problemas de patentes.\nA filosofia de Gosling era que a linguagem pudesse ser compilada uma vez e executada em qualquer ambiente, slogan conhecido como: write once, run anywhere.");
            case 2 -> System.out.println("Na máquina virtual Java, ou JVM, é onde a sua aplicação será executada. É ela, também, a responsável pela característica multiplataforma do Java.\nUm programa escrito nessa linguagem será executado em qualquer plataforma, seja ela um notebook, smartphone ou torradeira, desde que possua uma JVM implementada.");
            case 3 -> System.out.println("Variáveis são locais na memória principal que armazenam algum conteúdo, elas devem ser declaradas no Java da seguinte maneira:\n Tipo da variável Nome da variável \n Aqui estão os tipos de variáveis: \n int: valores inteiros (que não admitem casas decimais), \n float: valores reais (que admitem casas decimais), \n char:letras (caracteres), \n string: sequência de caracteres (palavras, frases), \n boolean: valores lógicos:1/true ou 0/false.");
            case 4 -> {
                String javaCode = """
                        public class HelloWorld {
                           public static void main(String[] args) {
                              System.out.println(''Hello world'');
                           }
                        }
                        """;
                System.out.println("Claro! Segue abaixo um exemplo simples de como criar um programa em Java que escreve Hello world na tela:\n\n"
                        + javaCode
                        + "\nEste programa simplesmente imprime a frase Hello world na tela usando o método System.out.println().\n"
                        + "Para executar o programa, salve o código acima em um arquivo com o nome HelloWorld.java e compile-o usando o comando javac HelloWorld.java.\n"
                        + "Em seguida, execute o programa usando o comando java HelloWorld.");
            }
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
