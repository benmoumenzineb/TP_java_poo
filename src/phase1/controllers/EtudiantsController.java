package phase1.controllers;

import phase1.Main;
import phase1.models.Etudiant;
import phase1.services.DB;
import phase1.services.EtudiantServices;
import phase1.services.FiliereServices;


public class EtudiantsController {
    public static void showMenu() {
        System.out.println("-------------------------[ Etudiants ]---------------------------");


        System.out.println("1: Pour ajouter un etudiant");
        System.out.println("2: Pour afficher les etudiants");
        System.out.println("3: Pour modifier un etudiant");
        System.out.println("4: Pour supprimer un etudiant");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createEtudiants();
                break;
            case 2:
                showEtudiants();
                break;
            case 3:
                editEtudiants();
                break;
            case 4:
                destroyEtudiants();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
   private static void createEtudiants() {

        String nom = Main.getStringInput("Entrez nom :");
       String prenom = Main.getStringInput("Entrez le prenom :");
       String email = Main.getStringInput("Entrez l'email' :");
       int apogee = Main.getIntInput("Entrez le code apogee :");
        EtudiantsController.showEtudiants();
        int id = Main.getIntInput("Sélecionnez un etudiant par id :");
        EtudiantServices.addEtd(nom,prenom,email,apogee, FiliereServices.getFiliereById(id));
        showEtudiants();
        showMenu();
    }
    public static void showEtudiants() {
        for (Etudiant etudiant : DB.etudiants) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print(" | nom: " + etudiant.getNom());
            System.out.print(" | prenom: " + etudiant.getPrenom());
            System.out.print(" | email: " + etudiant.getEmail());
            System.out.print(" | apogee: " + etudiant.getApogee());
            System.out.print(" | filiere: " + etudiant.getFiliere());
            System.out.println("");
        }
    }
    private static void editEtudiants() {

        showEtudiants();
        int id = Main.getIntInput("Sélecionnez un etudiant par id :");
        String nom = Main.getStringInput("Entrez le nom :");
        EtudiantsController.showEtudiants();
        int idEns = Main.getIntInput("Sélecionnez un etudiant par id :");

        EtudiantServices.updateEtd(id, nom, EtudiantServices.getEntById(idEns));

        showEtudiants();
        showMenu();

    }
    private static void destroyEtudiants() {

         showEtudiants();
        int id = Main.getIntInput("Sélecionnez un etudiant par id :");
        EtudiantServices.deleteEtdById(id);
        showEtudiants();

    }




        }



