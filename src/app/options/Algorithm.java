package app.options;

import java.util.Scanner;
import app.Util;
import app.App;

import static java.awt.SystemColor.info;

public class Algorithm {
    private final Scanner scan;

    private final String[] questionList = {
            "1 - O que é Lógica de Programação?",
            "2 - O que é Algoritmo?",
            "3 - Quero um exemplo de Algoritmo.",
            "4 - Por onde devo começar se desejo aprender Lógica e Algoritmo?",
            "0 - Voltar"
    };

    public Algorithm() {
        scan = new Scanner(System.in);
    }

    /*
     * Aprender algo sobre algoritmos e retornar false quando for para finalizar o aprendizado
     * */
    public boolean learn() {
        printOptions();
        int selectedOption = selectOption();

        if (selectedOption == 0) {
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
        System.out.println("O que deseja saber sobre algoritmo e lógica de programação?\n");

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

    private void printSelectedOption(int selectedOption) {
        switch (selectedOption) {
            case 1 -> System.out.println("Lógica de programação é a organização coesa de uma sequência de instruções voltadas à resolução de um problema, ou à criação de um software ou aplicação.\\nA lógica de programação é o conhecimento anterior a qualquer outro quando falamos em desenvolvimento web porque é a partir dele que os aprendizados posteriores, como por exemplo o das linguagens de programação, farão sentido.\\nCada linguagem tem suas próprias particularidades, como sua sintaxe, seus tipos de dados e sua orientação, mas a lógica por trás de todas é a mesma.\n");
            case 2 -> System.out.println("O algoritmo é o conjunto de instruções e regras que um programa de computador (mas não apenas ele) possui para executar suas funções. O conceito é bastante simples e mesmo tarefas simples podem ser descritas\n" +
                    "na forma de algoritmos, até mesmo as do dia a dia.\nQuando você está escrevendo um programa, você o faz na forma de linhas de código, usando uma entre as diversas linguagens de programação que exitem. No entanto, antes de começar a 'codar' é preciso definir o que você quer que\nseu programa faça. Para isso, é preciso definir uma série de regras e passos que o programa deverá executar, como forma de realizar a tarefa desejada.\nO algoritmo é esse conjunto de regras. De maneira geral, ele compreende uma sequência finita de ações executáveis(passos) para resolver um problema, ou no caso mais comum em Ciência da Computação, executar uma tarefa.\nO algoritmo em si não é o programa, mas a sequência de ações e condições que devem ser obedecidas para que o problema seja resolvido.\n" +
                    "Um algoritmo pode ser executado por um computador, por um outro tipo de autômato (como uma máquina eletromecânica programável), ou mesmo por um ser humano, por exemplo, os passos para fazer um bolo,\nou como ir do ponto A ao ponto B.\n");
            case 3 -> System.out.println("Não é só no ambiente digital que os algoritmos estão presentes. Você provavelmente já os usou em diversos momentos da sua vida. Um exemplo, utilizado pelos autores de Algoritmos, é a receita culinária.\n" +
                    "Segundo eles, toda receita é dividida em dois blocos de ação:\n" +
                    "Ingredientes: definição dos dados a serem usados e suas quantidades;\n- Modo de preparo: programa de ação e sequência das atividades.\n" +
                    "Seguindo o roteiro dos ingredientes e do modo de preparo, qualquer pessoa consegue preparar a refeição sem muitas dificuldades. Dessa forma, um problema foi solucionado em uma sequência finita de etapas. A receita é o algoritmo.\n");
            case 4 -> System.out.println("Então a primeira dica para acelerar o aprendizado em lógica de programação é começar pelas bases, ou seja, estudar matemática, principalmente a disciplina de lógica. Existem muitos livros do ensino fundamental que vem com vários exercícios de lógica aplicada que são legais para se fazer e é um bom ponto para começar.\n" +
                    "Depois de organizar a base matemática, o próximo passo é compreender os principais temas abordados no estudo de lógica de programação, como algoritmos e os principios básicos de programação.\n" +
                    "Depois de entender como funcionam os algoritmos e os princípios básicos da programação, é hora de por em pratica fazendo um programa de verdade, para isto será preciso aprender a utilizar alguma linguagem de programação. Uma que vem ganhando destaque no mundo é a Python.\n");
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