package Domotica;
import java.util.Scanner;

public class Domotica {
    static boolean h1 = false; // llums
    static boolean h2 = false; // temperatura
    static boolean h3 = false; // cortines
    static boolean h4 = false; // forn
    static boolean h5 = false; // cameres
    // variables forn (estat forn, temperatura, temporitzador, mode cocció, apagada automàtica)
    static int quantitatTemperatura = 0; // temperatura inicial
    static int quantitatForn = 0; // temperatura forn inicial
    static int temporitzadorForn = 0; // temporitzador forn inicial
    static String modeCocio = ""; // mode de cocció inicial
    static int temporitzadorApagatForn = 0; // temporitzador apagada automàtica forn inicial
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu Domotica");
            System.out.println("1. Consulta estat de les llums"); 
            System.out.println("2. Consulta la temperatura de les habitacions"); 
            System.out.println("3. Consulta l'estat de les cortines"); 
            System.out.println("4. Consulta l'estat del forn"); 
            System.out.println("5. Consulta l'estat de les càmeres de seguretat"); 
            System.out.println("6. Sortir");
            int seleccio = scanner.nextInt();
            switch (seleccio) {
                case 1:
                    menuLlumsHabitacio();
                    break;
                case 2:
                    temperaturaHabitacio();
                    break;
                case 3:
                    menuCortines();
                    break;
                case 4:
                    menuForn();
                    break;
                case 5:
                    menuCameresSeguretat();
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

    // Inici funcions llums

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

    // Inici funcions temperatura

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
                    consultaTemperatura();
                    break;
                case 2:
                    augmentarTemperatura();
                    break;
                case 3:
                    disminuirTemperatura();
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
   public static void consultaTemperatura() {
    System.out.println("La temperatura actual és de: " + quantitatTemperatura + "°C");
}

public static void augmentarTemperatura() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Augmentar Temperatura: ");
        System.out.println("1. Augmentar 1 grau");
        System.out.println("2. Escollir quantitat a augmentar");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                for (int i= 0; i<1; i++)
                quantitatTemperatura ++;
                System.out.println("La temperatura s'ha augmentat en 1 grau.");
                System.out.println("Temperatura actual: " + quantitatTemperatura + "°C");
                break;
            case 2:
                System.out.println("Introdueix la quantitat a augmentar:");
                int quantitatAugment = scanner.nextInt();
                for (int i= 0; i < quantitatAugment; i++)
                quantitatTemperatura ++; 
                System.out.println("La temperatura s'ha augmentat en " + quantitatAugment + " graus.");
                System.out.println("Temperatura actual: " + quantitatTemperatura + "°C");
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu d'augmentar temperatura");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void disminuirTemperatura() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Disminuir Temperatura: ");
        System.out.println("1. Disminuir 1 grau");
        System.out.println("2. Escollir quantitat a disminuir");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
            for (int i= 0; i<1; i++)
                quantitatTemperatura --;
                System.out.println("La temperatura s'ha disminuït en 1 grau.");
                System.out.println("Temperatura actual: " + quantitatTemperatura + "°C");
                break;
            case 2:
                System.out.println("Introdueix la quantitat a disminuir:");
                int quantitatDisminuir = scanner.nextInt();
                for (int i= 0; i <quantitatDisminuir; i++)
                quantitatTemperatura --; 
                System.out.println("La temperatura s'ha disminuït en " + quantitatDisminuir + " graus.");
                System.out.println("Temperatura actual: " + quantitatTemperatura + "°C");
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu de disminuir temperatura");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}

// Inici funcions cortines

public static void menuCortines() {
   boolean opcio = true;
   while (opcio) {
    System.out.println("Menu Cortines:");
    System.out.println("1. Consulta estat de les cortines");
    System.out.println("2. Escollir habitació de les cortines");
    System.out.println("3. Obrir/Tancar totes les cortines");
    System.out.println("4. Sortir");
    int seleccio = scanner.nextInt();
    switch (seleccio) {
        case 1:
            estatCortines();
            break;
        case 2:
            cortinesHabitacio();
            break;
        case 3:
            if (h3) {
                h3 = false;
                System.out.println("Totes les cortines s'han tancat.");
            } else {
                h3 = true;
                System.out.println("Totes les cortines s'han obert.");
            }
            break;
        case 4:
            opcio = false;
            System.out.println("Sortint del menu de cortines");
            break;
        default:
            System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
}
}
public static void cortinesHabitacio() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Cortines Habitació: ");
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
                cortinesUnaHabitacio();
                break;
            case 2:
                estatCortines();
                break;
            case 3:
                cortinesUnaHabitacio();
                break;
            case 4:
                cortinesUnaHabitacio();
                break;
            case 5:
                cortinesUnaHabitacio();   
                break;
            case 6:
                cortinesUnaHabitacio();
                break;
            case 7:
                opcio = false;
                System.out.println("Sortint del menu de cortines habitació");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void cortinesUnaHabitacio() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Finestres: ");
        System.out.println("1. Finestra 1");
        System.out.println("2. Finestra 2");
        System.out.println("3. Finestra 3");
        System.out.println("4. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                tancarObrir();
                break;
            case 2:
                tancarObrir();
                break;
            case 3:
                tancarObrir();
                break;
            case 4:
                opcio = false;
                System.out.println("Sortint del menu de finestres");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
    }
}
}
public static void tancarObrir() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Tancar/Obrir Cortines: ");
        System.out.println("1. Estat de la cortina"); 
        System.out.println("2. Obrir cortina");
        System.out.println("3. Tancar cortina");
        System.out.println("4. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                estatCortines();
                break;
            case 2:
                h3 = true;
                System.out.println("La cortina s'ha obert.");
                break;
            case 3:
                h3 = false;
                System.out.println("La cortina s'ha tancat.");
                break;
            case 4:
                opcio = false;
                System.out.println("Sortint del menu de tancar/obrir cortines");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void estatCortines() { //Menu extra (No esta en el drive, pero crec que es util i millora la qualitat).
     if (h3) {
         System.out.println("Les/La cortines estan obertes.");
     } else {
         System.out.println("Les/La cortines estan tancades.");
     } 
}

// Inici funcions forn
// Nota: moltes d'aquestes funcions o menus no estaven contemplades en el drive, pero he considerat que eren necessaries per a un bon funcionament del forn.

public static void menuForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Forn: ");
        System.out.println("1. Funcions del forn");
        System.out.println("2. Encen/Apaga el forn");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                funcioForn();
                break;
            case 2:
                if (h4) {
                    h4 = false;
                    System.out.println("El forn s'ha apagat.");
                } else {
                    h4 = true;
                    System.out.println("El forn s'ha encès.");
                }
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }  
}
public static void funcioForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Funció Forn: ");
        System.out.println("1. Estat del forn");
        System.out.println("2. Determinar temperatura del forn"); 
        System.out.println("3. Temporitzador del forn");
        System.out.println("4. Mode de cocció");
        System.out.println("5. Apagar forn automàticament"); 
        System.out.println("6. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                estatForn();
                break;
            case 2:
                temperaturaForn();
                break;
            case 3:
                temporitzadorForn();
                break;
            case 4:
                modeCocio();
                break;
            case 5:
                apagarAutomaticForn();
                break;
            case 6:
                opcio = false;
                System.out.println("Sortint del menu de funció del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
         }
         }
        }
public static void estatForn() {
    System.out.println("Estat actual del forn:");
    if (h4) { // forn encès o apagat
        System.out.println("Estat: Encès");
    } else {
        System.out.println("Estat: Apagat");
    }
    System.out.println("Temperatura actual: " + quantitatForn + "°C"); // temperatura del forn
    if (temporitzadorForn > 0) {
        System.out.println("Temporitzador: " + temporitzadorForn + " minuts restants");
    } else {
        System.out.println("Temporitzador: No configurat");
    }
    if (modeCocio != null && !modeCocio.isEmpty()) { // mode de cocció
        System.out.println("Mode de cocció: " + modeCocio);
    } else {
        System.out.println("Mode de cocció: No seleccionat");
    }
    if (temporitzadorApagatForn > 0) { // apagada automàtica
        System.out.println("Apagada automàtica: " + temporitzadorApagatForn + " minuts");
    } else {
        System.out.println("Apagada automàtica: Desactivada");
    }
}
public static void temperaturaForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Temperatura Forn: ");
        System.out.println("1. Consulta temperatura actual del forn");
        System.out.println("2. Augmentar temperatura del forn");
        System.out.println("3. Disminuir temperatura del forn");
        System.out.println("4. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                estatTemperaturaForn();
                break;
            case 2:
                if (h4) { 
                    augmentarTemperaturaForn();
                } else {
                    System.out.println("No pots augmentar la temperatura perquè el forn està apagat.");
                }
                break;
            case 3:
                if (h4) { 
                    disminuirTemperaturaForn();
                } else {
                    System.out.println("No pots disminuir la temperatura perquè el forn està apagat.");
                }
                break;
            case 4:
                opcio = false;
                System.out.println("Sortint del menú de temperatura del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void estatTemperaturaForn() {
    System.out.println("La temperatura actual del forn és de: " + quantitatForn + "°C");
}
public static void augmentarTemperaturaForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Augmentar Temperatura Forn: ");
        System.out.println("1. Augmentar 10 graus");
        System.out.println("2. Escollir quantitat a augmentar");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
            for (int i= 0; i <10; i ++)
                quantitatForn ++;
                System.out.println("La temperatura del forn s'ha augmentat en 10 graus.");
                System.out.println("Temperatura actual del forn: " + quantitatForn + "°C");
                break;
            case 2:
                System.out.println("Introdueix la quantitat a augmentar:");
                int quantitatAugment = scanner.nextInt();
                for (int i= 0; i <quantitatAugment; i++)
                quantitatForn ++;
                System.out.println("La temperatura del forn s'ha augmentat en " + quantitatAugment + " graus.");
                System.out.println("Temperatura actual del forn: " + quantitatForn + "°C");
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu d'augmentar temperatura del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void disminuirTemperaturaForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Disminuir Temperatura Forn: ");
        System.out.println("1. Disminuir 10 graus");
        System.out.println("2. Escollir quantitat a disminuir");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
            for (int i= 0; i<10; i++)
                quantitatForn --;
                System.out.println("La temperatura del forn s'ha disminuït en 10 graus.");
                System.out.println("Temperatura actual del forn: " + quantitatForn + "°C");
                break;
            case 2:
                System.out.println("Introdueix la quantitat a disminuir:");
                int quantitatDisminuir = scanner.nextInt();
                for (int i= 0; i <quantitatDisminuir; i++)
                quantitatForn --;
                System.out.println("La temperatura del forn s'ha disminuït en " + quantitatDisminuir + " graus.");
                System.out.println("Temperatura actual del forn: " + quantitatForn + "°C");
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu de disminuir temperatura del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void temporitzadorForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Temporitzador Forn: ");
        System.out.println("1. Consulta estat del temporitzador");
        System.out.println("2. Configura temporitzador");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                estatTemporitzadorForn();
                break;
            case 2:
                configurarTemporitzadorForn();
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu de temporitzador del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void estatTemporitzadorForn() {
    System.out.println("El temps actual del temporitzador del forn és de: " + temporitzadorForn + " minuts");
}
public static void configurarTemporitzadorForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Configurar Temporitzador Forn: ");
        System.out.println("1. Determinar temps del temporitzador");
        System.out.println("2. Augmentar/Disminuir temps del temporitzador");
        System.out.println("3. Cancel·lar temporitzador");
        System.out.println("4. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
            for (;;) { 
                System.out.println("Introdueix el temps del temporitzador en minuts:");
                int temps = scanner.nextInt();
                if (temps >= 0) {
                     temporitzadorForn = temps;
                     System.out.println("El temporitzador del forn s'ha configurat a " + temporitzadorForn + " minuts.");
                     break; 
                     } else {
                         System.out.println("Si us plau, introdueix un valor vàlid (0 o més).");
                     }
                }
                break;
            case 2:
                while (true) {
                    System.out.println("Vols augmentar o disminuir el temps del temporitzador? (A/B):");
                    String eleccio = scanner.next();
                    if (eleccio.equalsIgnoreCase("A")) {
                        augmentarTempsTemporitzadorForn();
                        break;
                    } else if (eleccio.equalsIgnoreCase("B")) {
                        disminuirTempsTemporitzadorForn();
                        break;
                    } else {
                        System.out.println("Si us plau, introdueix una opció vàlida (A/B).");
                    }
                }
                break;
            case 3:
                pararTemporitzadorForn();
                break;
            case 4:
                opcio = false;
                System.out.println("Sortint del menu de configurar temporitzador del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
static void augmentarTempsTemporitzadorForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Augmentar Temps Temporitzador Forn: ");
        System.out.println("1. Augmentar 5 minuts");
        System.out.println("2. Augmentar 10 minuts");
        System.out.println("3. Augmentar 30 minuts");
        System.out.println("4. Agumentar quantitat personalitzada");
        System.out.println("5. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
            for (int i= 0; i<5; i++)
                temporitzadorForn ++;
                System.out.println("El temps del temporitzador del forn s'ha augmentat en 5 minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 2:
            for (int i= 0; i<10; i++)
                temporitzadorForn ++;
                System.out.println("El temps del temporitzador del forn s'ha augmentat en 10 minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 3:
            for (int i= 0; i<30; i++)
                temporitzadorForn ++;
                System.out.println("El temps del temporitzador del forn s'ha augmentat en 30 minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 4:
                System.out.println("Introdueix la quantitat a augmentar en minuts:");
                int quantitatAugment = scanner.nextInt();
                for (int i= 0; i<quantitatAugment; i++)
                temporitzadorForn ++;
                System.out.println("El temps del temporitzador del forn s'ha augmentat en " + quantitatAugment + " minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 5:
                opcio = false;
                System.out.println("Sortint del menu d'augmentar temps del temporitzador del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
}
}
public static void disminuirTempsTemporitzadorForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Disminuir Temps Temporitzador Forn: ");
        System.out.println("1. Disminuir 5 minuts");
        System.out.println("2. Disminuir 10 minuts");
        System.out.println("3. Disminuir 30 minuts");
        System.out.println("4. Disminuir quantitat personalitzada");
        System.out.println("5. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
            for (int i= 0; i<5; i++)
                temporitzadorForn --;
                System.out.println("El temps del temporitzador del forn s'ha disminuït en 5 minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 2:
            for (int i=0; i<10; i++)
                temporitzadorForn --;
                System.out.println("El temps del temporitzador del forn s'ha disminuït en 10 minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 3:
            for (int i=0; i<30; i++)
                temporitzadorForn --; 
                System.out.println("El temps del temporitzador del forn s'ha disminuït en 30 minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 4:
                System.out.println("Introdueix la quantitat a disminuir en minuts:");
                int quantitatDisminuir = scanner.nextInt();
                for (int i= 0; i <quantitatDisminuir; i++)
                temporitzadorForn --;
                System.out.println("El temps del temporitzador del forn s'ha disminuït en " + quantitatDisminuir + " minuts.");
                System.out.println("Temps actual del temporitzador del forn: " + temporitzadorForn + " minuts");
                break;
            case 5:
                opcio = false;
                System.out.println("Sortint del menu de disminuir temps del temporitzador del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void pararTemporitzadorForn() {
    temporitzadorForn = 0;
    System.out.println("El temporitzador del forn s'ha cancel·lat.");
}
public static void modeCocio() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Seleccionar Mode de Cocció Forn: ");
        System.out.println("1. Mode Convecció");
        System.out.println("2. Mode Grill");
        System.out.println("3. Mode Descongelar");
        System.out.println("4. Mode Eco");
        System.out.println("5. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                modeCocio = "Convecció";
                System.out.println("Has seleccionat el Mode Convecció.");
                break;
            case 2:
                modeCocio = "Grill";
                System.out.println("Has seleccionat el Mode Grill.");
                break;
            case 3:
                modeCocio = "Descongelar";
                System.out.println("Has seleccionat el Mode Descongelar.");
                break;
            case 4:
                modeCocio = "Eco";
                System.out.println("Has seleccionat el Mode Eco.");
                break;
            case 5:
                opcio = false;
                System.out.println("Sortint del menu de seleccionar mode de cocció del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
public static void apagarAutomaticForn() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Configurar Apagada Automàtica Forn: ");
        System.out.println("1. Determinar temps per apagada automàtica");
        System.out.println("2. Desactivar apagada automàtica");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                for (;;) {
                System.out.println("Introdueix el temps per l'apagada automàtica en minuts:");
                int temps = scanner.nextInt();
                if (temps >= 0) {
                        temporitzadorApagatForn = temps;
                        System.out.println("L'apagada automàtica del forn s'ha configurat a " + temporitzadorApagatForn + " minuts.");
                        break;
                    } else {
                        System.out.println("Si us plau, introdueix un valor vàlid (0 o més).");
                    }
                }
                break;
            case 2:
                temporitzadorApagatForn = 0;
                System.out.println("L'apagada automàtica del forn s'ha desactivat.");
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu de configurar apagada automàtica del forn");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}

// funcions cameres de seguretat 

public static void menuCameresSeguretat() {
    System.out.println("Menu cameres de seguretat:");
    System.out.println("1. Escollir habitació");
    System.out.println("2. Encen/Apaga totes les cameres de seguretat");
    System.out.println("3. Sortir");
    int seleccio = scanner.nextInt();
    switch (seleccio) { 
        case 1:
            cameresSeguretatHabitacio();
            break;
        case 2:
            if (h5) {
                h5 = false;
                System.out.println("Totes les cameres de seguretat s'han apagat.");
            } else {
                h5 = true;
                System.out.println("Totes les cameres de seguretat s'han encès.");
            }
            break;
        case 3:
            System.out.println("Sortint del menu de cameres de seguretat");
            break;
        default:
            System.out.println("Selecció no vàlida. Torna-ho a intentar.");
    }
}
public static void cameresSeguretatHabitacio() {
    boolean opcio = true;
    while (opcio) {
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
            estatCameresSeguretat();
            break;
        case 2:
            estatCameresSeguretat();
            break;
        case 3:
            estatCameresSeguretat();
            break;
        case 4:
            estatCameresSeguretat();
            break;
        case 5:
            estatCameresSeguretat();   
            break;
        case 6:
            estatCameresSeguretat();
            break;
        case 7:
            opcio = false;
            System.out.println("Sortint del menu de cameres de seguretat habitació");
            break;
        default:
            System.out.println("Selecció no vàlida. Torna-ho a intentar.");
    }
}
}
public static void estatCameresSeguretat() {
    boolean opcio = true;
    while (opcio) {
        System.out.println("Menu Estat Cameres de Seguretat: ");
        System.out.println("1. Consulta video de la càmera de seguretat");
        System.out.println("2. Encen/Apaga la càmera de seguretat");
        System.out.println("3. Sortir");
        int seleccio = scanner.nextInt();
        switch (seleccio) {
            case 1:
                System.out.println("Mostrant video de la càmera de seguretat...");
                break;
            case 2:
                if (h5) {
                    h5 = false;
                    System.out.println("La càmera de seguretat s'ha apagat.");
                } else {
                    h5 = true;
                    System.out.println("La càmera de seguretat s'ha encès.");
                }
                break;
            case 3:
                opcio = false;
                System.out.println("Sortint del menu d'estat de cameres de seguretat");
                break;
            default:
                System.out.println("Selecció no vàlida. Torna-ho a intentar.");
        }
    }
}
}