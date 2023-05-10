package app.options;

import java.util.Scanner;
import app.Util;
import app.App;

public class Algorithm {
    private Scanner scan;

    public Algorithm() {
        scan = new Scanner(System.in);
    }

    public void options() {
        String[] questions = {
                "1 - O que é Lógica de Programação?",
                "2 - O que é Algoritmo?",
                "3 - Quero um exemplo de Algoritmo.",
                "4 - Por onde devo começar se desejo aprender Lógica e Algoritmo?",
                "0 - Voltar"
        };

        System.out.println("O que deseja saber sobre algoritmo e lógica de programação?\n\n");

        for (String question : questions) {
            System.out.println(question);
        }

        System.out.print("\n>> ");
        algorithmOptionsSelection();
    }

    private void algorithmOptionsSelection() {
        int choice;
        String[] info;

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
                    info = new String[3];
                    info[0] = "Lógica de programação é a organização coesa de uma sequência de instruções voltadas à resolução de um problema, ou à criação de um software ou aplicação.\n";

                    info[1] = "A lógica de programação é o conhecimento anterior a qualquer outro quando falamos em desenvolvimento web porque é a partir dele que os aprendizados posteriores, como por exemplo o das linguagens de programação, farão sentido.\n";

                    info[2] = "Cada linguagem tem suas próprias particularidades, como sua sintaxe, seus tipos de dados e sua orientação, mas a lógica por trás de todas é a mesma.\n";

                    printText(info);

                    break;
                case 2:
                    info = new String[4];
                    info[0] = "O algoritmo é o conjunto de instruções e regras que um programa de computador (mas não apenas ele) possui para executar suas funções. O conceito é bastante simples e mesmo tarefas simples podem ser descritas\nna forma de algoritmos, até mesmo as do dia a dia.\n";

                    info[1] = "Quando você está escrevendo um programa, você o faz na forma de linhas de código, usando uma entre as diversas linguagens de programação que exitem. No entanto, antes de começar a 'codar' é preciso definir o que você quer que\nseu programa faça. Para isso, é preciso definir uma série de regras e passos que o programa deverá executar, como forma de realizar a tarefa desejada.\n";

                    info[2] = "O algoritmo é esse conjunto de regras. De maneira geral, ele compreende uma sequência finita de ações executáveis (passos) para resolver um problema, ou no caso mais comum em Ciência da Computação, executar uma tarefa.\nO algoritmo em si não é o programa, mas a sequência de ações e condições que devem ser obedecidas para que o problema seja resolvido.\n";

                    info[3] = "Um algoritmo pode ser executado por um computador, por um outro tipo de autômato (como uma máquina eletromecânica programável), ou mesmo por um ser humano, por exemplo, os passos para fazer um bolo,\nou como ir do ponto A ao ponto B.\n";

                    printText(info);

                    break;

                case 3:
                    info = new String[4];
                    info[0] = "Não é só no ambiente digital que os algoritmos estão presentes. Você provavelmente já os usou em diversos momentos da sua vida. Um exemplo, utilizado pelos autores de Algoritmos, é a receita culinária.\n";

                    info[1] = "Segundo eles, toda receita é dividida em dois blocos de ação:\n";

                    info[2] = "- Ingredientes: definição dos dados a serem usados e suas quantidades;\n- Modo de preparo: programa de ação e sequência das atividades.\n";

                    info[3] = "Seguindo o roteiro dos ingredientes e do modo de preparo, qualquer pessoa consegue preparar a refeição sem muitas dificuldades. Dessa forma, um problema foi solucionado em uma sequência finita de etapas. A receita é o algoritmo.\n";

                    printText(info);

                    break;
                case 4:
                    info = new String[3];
                    info[0] = "Então a primeira dica para acelerar o aprendizado em lógica de programação é começar pelas bases, ou seja, estudar matemática, principalmente a disciplina de lógica. Existem muitos livros do ensino fundamental que vem com vários exercícios de lógica aplicada que são legais para se fazer e é um bom ponto para começar.\n";

                    info[1] = "Depois de organizar a base matemática, o próximo passo é compreender os principais temas abordados no estudo de lógica de programação, como algoritmos e os principios básicos de programação.\n";

                    info[2] = "Depois de entender como funcionam os algoritmos e os princípios básicos da programação, é hora de por em pratica fazendo um programa de verdade, para isto será preciso aprender a utilizar alguma linguagem de programação. Uma que vem ganhando destaque no mundo é a Python.\n";

                    printText(info);

                    break;
                default:
                    invalidOptions();
                    options();
            }

            if (choice != 0) {
                System.out.print("\n\n");
                options();
            }

        } else

        {
            invalidOptions();
            options();
        }
    }

    private void printText(String[] info) {
        for (String s : info) {
            System.out.println(s);
        }
    }

    // método para limpar a tela
    private void invalidOptions() {
        scan.nextLine();
        Util.clearScreen();
        System.out.println("Não consegui te entender. Só posso te ajudar com as opções abaixo.");
    }
}
