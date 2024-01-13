package phase1;
import phase1.controllers.*;
import phase1.models.Enseignant;
import phase1.models.Etudiant;
import phase1.services.DB;

import java.util.Scanner;

public class Main {

    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static int getIntInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);
        int num = scan.nextInt();

        return num;
    }

    public static String getStringInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un texte : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);
        String str = scan.nextLine();

        return str;
    }

    public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        //"Veuillez sélectionner une option : ")
        int option = getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                DepartementsController.showMenu();
                break;
            case 2:
                EnseignantsController.showMenu();
                break;
            case 3:
                EtudiantsController.showMenu();
                break;
            case 4:
                FiliereController.showMenu();
                break;
            case 5:
                ModulesController.showMenu();
                break;
            default: System.out.println("vous avez rien selectionner");

        }
  switch(option) {
            case 1:
                DepartementsController.showMenu();
                break;
            case 2: EtudiantsController.showMenu();
                break;
            case 3:EnseignantsController.showMenu();
                break;
            case 4:FiliereController.showMenu();
                break;
            case 5:ModulesController.showMenu();
                break;
            default:

        }


    }
    public static void main(String[] args) {

        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Amine");
        enseignant.setPrenom("Ben Charif");
        enseignant.setEmail("test@gmail.com");
        enseignant.setGrade("PES");
        enseignant.setId(DB.getEnsId());
        DB.enseignants.add(enseignant);
        showPrincipalMenu();
    }
}

