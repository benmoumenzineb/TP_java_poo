package phase1.controllers;

import phase1.Main;
import phase1.models.Enseignant;
import phase1.models.Filiere;
import phase1.services.DB;
import phase1.services.FiliereServices;

public class FiliereController {
    public static void showMenu() {
        System.out.println("-------------------------[ Filiers ]---------------------------");

        System.out.println("1: Pour ajouter une filiere");
        System.out.println("2: Pour afficher les filieres");
        System.out.println("3: Pour modifier une filiere");
        System.out.println("4: Pour supprimer une filiere");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createFilieres();
                break;
            case 2:
                showFilieres();
                break;
            case 3:
                editFilieres();
                break;
            case 4:
                destroyFilieres();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    private static int getIntInput(String s) {
        return 0;
    }

    public static void showFiliere(){
        for (Filiere filiere : DB.filieres) {
            System.out.print("Id : " + filiere.getId());
            System.out.print(" | intitule : " + filiere.getIntitule() );
            System.out.print(" | chef: " + filiere.getChef() );
            System.out.print(" | dept: " + filiere.getDept() );
            System.out.println("");
        }
    }
    public static void createFiliere(){
        String intitule = Main.getStringInput("Entrez l'intitule:");
        Enseignant chef;Main.getStringInput("Entrez le nom et le prenom:");
        String dept;Main.getStringInput("Entrez le dept:");
        FiliereController.showFiliere();
        showFiliere();
        showMenu();

    }
    public static void editFiliere(){
        showFiliere();
        int id = Main.getIntInput("Sélecionnez un filiere par id :");
        String intitule = Main.getStringInput("Entrez l'intitule :");
        FiliereController.showFiliere();

        int idFl = Main.getIntInput("Sélecionnez un filiere par id :");

        FiliereServices.updateFiliere(id,intitule, FiliereServices.getAllFiliere(idFl));

        showFiliere();
        showPrincipalMenu();
    }

    private static void showPrincipalMenu() {

    }
    public static void deleteFiliere(){
        showFiliere();
        int id;
        id = Main.getIntInput("Sélecionnez un filiere par id :");
        FiliereServices.getFiliereById(id);
        showFiliere();

    }


    private static void showFilieres() {
    }

    private static void createFilieres() {

    }

    private static void editFilieres() {
    }
    private static void destroyFilieres() {

    }
}

