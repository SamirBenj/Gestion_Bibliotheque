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

        public void chercherAuteur(String auteur){
            sc = new Scanner(System.in);

            Livre l =null;
            System.out.println("Veuillez entrer le nom de l'auteur");
            String auteurClavier = sc.nextLine();
            for (int i=0; i< livres.size(); i++){
                if(livres.get(i).getAuteur().equals(auteurClavier)){
                    System.out.println("Voici les information de l'auteur trouvé");
                    System.out.println("Titre :" + livres.get(i).getTitre().toString());
                    System.out.println("Auteur :" + livres.get(i).getAuteur().toString());
                    System.out.println("Genre :"+ livres.get(i).getGenre().toString());
                    System.out.println("Année dde publication :" + livres.get(i).getPublicationYear().toString());
                }else {
                    System.out.println("Votre n'a pas était retrouvé");
                }
            }
        }

}
