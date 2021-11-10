public class Revue {
    private String titre;
    private String auteur;
    private int publicationYear;

    public Revue(String titre, String auteur, int publicationYear) {
        this.titre = titre;
        this.auteur = auteur;
        this.publicationYear = publicationYear;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
