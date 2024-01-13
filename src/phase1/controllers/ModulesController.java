package phase1.controllers;

import phase1.Main;
import phase1.models.Enseignant;
import phase1.models.Filiere;
import phase1.services.DB;
import phase1.services.EnseignantServices;
import phase1.services.FiliereServices;
import phase1.controllers.FiliereController;
import phase1.services.ModuleServices;

public class ModulesController {
    public static void showMenu() {
          System.out.println("-------------------------[ Modules ]---------------------------");

        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createmodules();
                break;
            case 2:
                showmodules();
                break;
            case 3:
                editmodules();
                break;
            case 4:
                destroymodules();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }


    private static void destroymodules() {
        showModules();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        ModuleServices.deleteModuleById(id);
        showModules();
    }

    private static void showmodules() {

    }

    private static void createmodules() {

        //String nom = Main.getStringInput("Entrez nom :");
        EtudiantsController.showEtudiants();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        // EtudiantServices.addDept(nom, EtudiantServices.getEtuById(id));

        showmodules();
        showMenu();
    }

    private static void editmodules() {
        showModules();
        int id = Main.getIntInput("Sélecionnez un module par id :");
        String intitule = Main.getStringInput("Entrez l'intitule':");
        EnseignantsController.showEnseignants();
    }

    private static void showModules() {

    }


}

