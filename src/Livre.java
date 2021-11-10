public class Livre {

    private String titre;
    private String auteur;
    private String genre;
    private String publicationYear;


    public Livre(String titre, String auteur, String genre, String publicationYear) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublicationYear() {
        return publicationYear;
    }
}
