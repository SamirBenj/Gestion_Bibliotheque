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

}
