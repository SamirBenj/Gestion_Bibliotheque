import java.util.ArrayList;

public class Bibliotheque {
        private ArrayList<Livre> livres;
        private ArrayList<Dvd> dvd;
        private ArrayList<Revue> revue;

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
            Livre l =null;
            System.out.println("Salut");
            for (int i=0; i< livres.size(); i++){
                System.out.println(livres.get(i).getAuteur().toString());
                if(livres.get(i).getAuteur().equals(auteur.toString())){
                    System.out.println("Trouvé");
                }else {
                    System.out.println("Pas trouvé");
                }
            }
        }

}
