import java.util.Scanner;

public class Domotica {
    static boolean h1 = false; // llums
    static boolean h2 = false; // temperatura
    static boolean h3 = false; // cortines
    static boolean h4 = false; // forn
    static boolean h5 = false; // cameres
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu Domotica");
            System.out.println("1. Consulta estat de les llums"); //funcionalitat completa
            System.out.println("2. Consulta la temperatura de les habitacions"); //funcionalitat en procés
            System.out.println("3. Consulta l'estat de les cortines"); //funcionalitat pendent
            System.out.println("4. Consulta l'estat del forn"); //funcionalitat pendent
            System.out.println("5. Consulta l'estat de les càmeres de seguretat"); //funcionalitat pendent
            System.out.println("6. Sortir");
            int seleccio = scanner.nextInt();
            switch (seleccio) {
                case 1:
                    menuLlumsHabitacio();
                    break;
                case 2:
                    temperaturaHabitacio();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Sortint del menú domòtica...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
        }
    }
    public static void menuLlumsHabitacio() {
        boolean opcio = true;
        while (opcio) {
            System.out.println("Menu Llums Habitació: ");
            System.out.println("1. Menjador");
            System.out.println("2. Bany");
            System.out.println("3. Cuina");
            System.out.println("4. Habitació 1");
            System.out.println("5. Habitació 2");
            System.out.println("6. Habitació 3");
            System.out.println("7. Sortir");
            int seleccio = scanner.nextInt();
            switch (seleccio) {
                case 1:
                    menuLlums();
                    break;
                case 2:
                    menuLlums();
                    break;
                case 3:
                    menuLlums();
                    break;
                case 4:
                    menuLlums();
                    break;
                case 5:
                    menuLlums();   
                    break;
                case 6:
                    menuLlums();
                    break;
                case 7:
                    opcio = false;
                    System.out.println("Sortint del menu de llums habitació");
                    break;
                default:
                    System.out.println("Selecció no vàlida. Torna-ho a intentar.");
            }
        }
    }
    public static void menuLlums() {
        boolean opcio = true;
        while (opcio) {
            System.out.println("Menu Llums: ");
            System.out.println("1. Consulta estat de les llums");
            System.out.println("2. Encen les llums");
            System.out.println("3. Apaga les llums");
            System.out.println("4. Sortir");
            int seleccio = scanner.nextInt();
            switch (seleccio) {
                case 1:
                    llums(h1);
                    break;
                case 2:
                    h1 = true;
                    System.out.println("Les llums s'han encès");
                    break;
                case 3:
                    h1 = false;
                    System.out.println("Les llums s'han apagat");
                    break;
                case 4:
                    opcio = false;
                    System.out.println("Sortint del menu de llums");
                    break;
                default:
                    System.out.println("Selecció no vàlida. Torna-ho a intentar.");
            }
        }
    }
    public static void llums (boolean h1) {
        if (h1) {
            System.out.println("Les llums estan enceses");
        } else {
            System.out.println("Les llums estan apagades");
        }
    }
    public static void temperaturaHabitacio() {
        boolean opcio = true;
        while (opcio) {
            System.out.println("Menu Temperatura Habitació: ");
            System.out.println("1. Menjador");
            System.out.println("2. Bany");
            System.out.println("3. Cuina");
            System.out.println("4. Habitació 1");
            System.out.println("5. Habitació 2");
            System.out.println("6. Habitació 3");
            System.out.println("7. Sortir");
            int seleccio = scanner.nextInt();
            switch (seleccio) {
                case 1:
                    temperatura(h2);
                    break;
                case 2:
                    temperatura(h2);
                    break;
                case 3:
                    temperatura(h2);
                    break;
                case 4:
                    temperatura(h2);
                    break;
                case 5:
                    temperatura(h2);   
                    break;
                case 6:
                    temperatura(h2);
                    break;
                case 7:
                    opcio = false;
                    System.out.println("Sortint del menu de temperatura habitació");
                    break;
                default:
                    System.out.println("Selecció no vàlida. Torna-ho a intentar.");
            }
        }
    }
    public static void temperatura (boolean h2) {
        boolean opcio = true;
        while (opcio) {
            System.out.println("Menu Temperatura: ");
            System.out.println("1. Consulta temperatura actual");
            System.out.println("2. Augmentar temperatura");
            System.out.println("3. Disminuir temperatura");
            System.out.println("4. Sortir");
            int seleccio = scanner.nextInt();
            switch (seleccio) {
                case 1:
                    // Implementar consulta de temperatura
                    break;
                case 2:
                    // Implementar canvi de temperatura
                    break;
                case 3:
                    // Implementar canvi de temperatura
                    break;
                case 4:
                    opcio = false;
                    System.out.println("Sortint del menu de temperatura");
                    break;
                default:
                    System.out.println("Selecció no vàlida. Torna-ho a intentar.");
            }
        }

    }
}