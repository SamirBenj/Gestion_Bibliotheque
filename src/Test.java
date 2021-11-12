import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private Bibliotheque bibliotheque;

    private Scanner sc;

    public Test(){
        bibliotheque = new Bibliotheque();

        sc = new Scanner(System.in);
        this.affichageMenue();
        sc.close();
    }

    public Livre creerLivre() {
       // bibliotheque = new Bibliotheque();

        //sc = new Scanner(System.in);

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
       // sc.close();
        return livre;

    }


    public Revue creerRevue(){
        //bibliotheque = new Bibliotheque();

        //sc = new Scanner(System.in);
        ArrayList<String> revues = new ArrayList<String>();
        System.out.println("Titre de la revue");
        String titreRevue = sc.nextLine();
        System.out.println("Auteru de la revue");
        String auteurRevue = sc.nextLine();
        System.out.println("Année de publication de la revue");
        String publicationYear = sc.nextLine();

        Revue revue = new Revue(titreRevue,auteurRevue,publicationYear);

        sc.close();
        return revue;
    }
    public Dvd creerDvd(){
        //bibliotheque = new Bibliotheque();

        //sc = new Scanner(System.in);
        ArrayList<String> dvdList = new ArrayList<String>();
        System.out.println("Titre du film ?");
        String titreFilm = sc.nextLine();
        System.out.println("Auteur du film");
        String auteurFilm = sc.nextLine();
        System.out.println("Année de publication");
        String publicationYear = sc.nextLine();

        Dvd dvd = new Dvd(titreFilm,auteurFilm,publicationYear);
        //sc.close();
        return dvd;
    }

    public void affichageMenue() {
        int choix;
        do {
            System.out.println();
            System.out.println("-------GESTION DE LA BIBLIOTHETHEQUE ------");
            System.out.println();
            System.out.println("1 - Ajouter un livre");
            System.out.println("2 - Ajouter une Revue");
            System.out.println("3 - Ajouter un  DVD");
            System.out.println("4 - Chercher un auteur");
            System.out.println("5 - Chercher un Artiste(dvd)");
            System.out.println("6 - Chercher un Auteur(revue)");
            System.out.println("0 - Quitter");
            System.out.println();
            System.out.println("Entrer votre choix : ");
            System.out.println();
            choix = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (choix){
                case 1 :
                    Livre livre = this.creerLivre();
                    bibliotheque.ajouterLivre(livre);
                    break;
                case 2 :
                    Revue revue = this.creerRevue();
                    bibliotheque.ajouterRevue(revue);
                    break;
                case 3 :
                    Dvd dvd = this.creerDvd();
                    bibliotheque.ajouterDvd(dvd);
                    break;
                case 4 :
                    bibliotheque.chercherAuteur();
                    break;
                case 5 :
                    bibliotheque.chercherArtiste();
                    break;
                case 6 :
                    bibliotheque.chercherAuteurRevue();
                    break;
            }
        }
        while (choix != 0);
    }


    public static void main(String[] args) {
        Test test = new Test();
        //test.creerLivre();
        //test.creerDvd();

    }
}
