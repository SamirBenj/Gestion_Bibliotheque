import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private Bibliotheque bibliotheque;
    private Scanner sc;



    public Livre creerLivre() {
        bibliotheque = new Bibliotheque();

        sc = new Scanner(System.in);

        ArrayList<String> livres = new ArrayList<String>();
        System.out.println("Titre du livre ?");
        String titre = sc.nextLine();
        System.out.println("Nom de l'auteur ?");
        String nomAuteur = sc.nextLine();
        System.out.println("Année de publication");
        String anneePublication = sc.nextLine();
        System.out.println("Genre du livre");
        String genreLivre = sc.nextLine();
        Livre livre = new Livre(titre, nomAuteur,genreLivre,anneePublication);
        sc.close();
        return livre;

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.creerLivre();
    }
}
