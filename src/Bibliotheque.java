import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {
        private ArrayList<Livre> livres;
        private ArrayList<Dvd> dvd;
        private ArrayList<Revue> revue;
        private Scanner sc;
        public Bibliotheque(){

            livres = new ArrayList<Livre>();
            dvd =  new ArrayList<Dvd>();
            revue = new ArrayList<Revue>();
        }

        public void ajouterLivre(Livre livre){
                livres.add(livre);
        }
        public void ajouterRevue(Revue revues){
            revue.add(revues);
        }
        public void ajouterDvd(Dvd dvds){
            dvd.add(dvds);
        }

        public void chercherAuteur(){
            sc = new Scanner(System.in);

            Livre l = null;
            System.out.println("Veuillez entrer le nom de l'auteur");
            String auteurClavier = sc.nextLine();
            for (int i=0; i< livres.size(); i++){
                if(livres.get(i).getAuteur().equals(auteurClavier)){
                    System.out.println("Voici les informations de l'auteur trouvé");
                    System.out.println("Titre :" + livres.get(i).getTitre().toString());
                    System.out.println("Auteur :" + livres.get(i).getAuteur().toString());
                    System.out.println("Genre :"+ livres.get(i).getGenre().toString());
                    System.out.println("Année dde publication :" + livres.get(i).getPublicationYear().toString());
                }else {
                    System.out.println("Votre auteur n'a pas était retrouvé");
                }
            }
        }

        public void chercherArtiste(){
            System.out.println("Veuillez entrer le nom d'un artiste");
            String nomArtiste = sc.nextLine();
            for (int i=0;i<dvd.size();i++){
                if(dvd.get(i).getAuteur().equals(nomArtiste)){
                    System.out.println("Voici les informations de l'auteur trouvé");
                    System.out.println("Titre :" + dvd.get(i).getTitre().toString());
                    System.out.println("Auteur :" + dvd.get(i).getAuteur().toString());
                    System.out.println("Année de publication :" + dvd.get(i).getPublicationYear().toString());
                }else {
                    System.out.println("Votre artiste n'a pas était trouvé");
                }
            }
        }

    public void chercherAuteurRevue(){
        System.out.println("Veuillez entrer le nom d'un auteru d'une revue");
        String nomAuteurRevue = sc.nextLine();
        for (int i=0;i<revue.size();i++){
            if(revue.get(i).getAuteur().equals(nomAuteurRevue)){
                System.out.println("Voici les informations de l'auteur de la revue trouvé");
                System.out.println("Titre :" + revue.get(i).getTitre().toString());
                System.out.println("Auteur :" + revue.get(i).getAuteur().toString());
                System.out.println("Année de publication :" + revue.get(i).getPublicationYear().toString());
            }else {
                System.out.println("Votre auteur n'a pas était trouvé");
            }
        }
    }

}
