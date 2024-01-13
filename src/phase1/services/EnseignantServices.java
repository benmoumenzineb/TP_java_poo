package phase1.services;

import phase1.models.Departement;
import phase1.models.Enseignant;
import phase1.services.DB;
import java.util.ArrayList;

public class EnseignantServices {

    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement dept) {
        return new Enseignant();
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement dept) {
        return new Enseignant();
    }

    public static ArrayList<Enseignant> deleteEnsById(int id) {
        return DB.enseignants;
    }

    public static Enseignant getEnsById(int id) {
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) return enseignant;
        }
        return new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEns() {
        return DB.enseignants;
    }

    public static void updateDept(int id, String nom, Enseignant ensById) {
    }

    public static void deleteDeptById(int id) {
    }
}
