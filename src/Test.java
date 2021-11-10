import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private Bibliotheque bibliotheque;
    private Scanner sc;

    public Test(){
        bibliotheque = new Bibliotheque();

    }


    public Livre creerLivre() {
        ArrayList<String> livres = new ArrayList<String>();
        System.out.println("Titre du livre ?");
        String titre = sc.nextLine();
        System.out.println("Nom de l'auteur ?");
        String nomAuteur = sc.nextLine();
        System.out.println("Année de publication");
        String anneePublication = sc.nextLine();
        Livre livre = new Livre(titre, nomAuteur,)
    }

    public static void main(String[] args) {

    }
}
