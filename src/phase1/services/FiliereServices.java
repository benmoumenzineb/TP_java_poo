package phase1.services;
import phase1.models.Departement;
import phase1.models.Enseignant;
import phase1.models.Filiere;
import java.util.ArrayList;

public class FiliereServices {

    public static Filiere addFiliere(String intitule, Enseignant chef, Departement dept) {
        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String intitule, Enseignant chef, Departement dept){
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        return  DB.filieres;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  DB.filieres;
    }

    public static Object getAllFiliere(int idFl) {
        return null;
    }

    public static void updateFiliere(int id, String intitule, Object allFiliere) {
    }
}

