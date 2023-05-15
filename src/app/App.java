package app;

import java.util.Scanner;
import app.options.*;

public class App {

    private String name;
    private Scanner scan;

    public App() {
        scan = new Scanner(System.in);
    }

    public void start() {
        Util.clearScreen();
        System.out.println("Olá humano!");
        System.out.println("Eu me chamo Bit. Antes de começarmos preciso que me diga o seu nome.\n");

        System.out.print(">> ");
        name = scan.nextLine();

        Util.clearScreen();
        if (name.isEmpty()) {
            System.out.println("Então você não quer me contar como se chama? Tudo bem! :(");
        } else {
            System.out.println("Então é assim que te chamam aí do outro lado da tela!😁");
        }

        mainOptions();
    }

    public void mainOptions() {
        String[] questions = { "1 - Desejo saber sobre unidades de armazenamento.",
                "2 - Desejo saber sobre unidades de processamento.",
                "3 - Desejo saber sobre proposições e seus conectivos.",
                "4 - Desejo saber sobre algoritmo e lógica de programação.",
                "5 - Desejo saber sobre programação Java.",
                "0 - Encerrar a conversa." };

        System.out.printf("%s, sobre o quê deseja saber?\n\n%n", name);

        for (String question : questions) {
            System.out.println(question);
        }

        System.out.print("\n>> ");
        selectAppOption();

    }

    private void selectAppOption() {

        int choice;

        if (scan.hasNextInt()) {

            Util.clearScreen();
            choice = scan.nextInt();

            switch (choice) {
                case 0:
                    System.out.printf("Até mais %s!%n", name);
                    scan.close();
                    break;
                case 1:
                    StorageUnits storage = new StorageUnits();
                    while(storage.learn());
                    mainOptions();
                    break;
                case 2:
                    ProcessingUnits processing = new ProcessingUnits();
                    while (processing.learn()) { }
                    mainOptions();
                    break;
                case 3:
                    Fundamentals fundamentals = new Fundamentals();
                    while (fundamentals.learn()) { }
                    mainOptions();
                    break;
                case 4:
                    Algorithm algorithm = new Algorithm();
                    while(algorithm.learn()) { }
                    mainOptions();
                    break;
                case 5:
                    Java java = new Java();
                    while(java.learn()) { }
                    mainOptions();
                    break;
                default:
                    invalidOptions();
                    mainOptions();
            }

        } else {
            invalidOptions();
            mainOptions();
        }
    }

    private void invalidOptions() {
        Util.clearScreen();
        System.out.printf("%s, não consegui te entender. Só posso te ajudar com as opções abaixo.%nn", name);
    }
}
