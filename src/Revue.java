public class Revue {
    private String titre;
    private String auteur;
    private String publicationYear;

    public Revue(String titre, String auteur, String publicationYear) {
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

    public String getPublicationYear() {
        return publicationYear;
    }
}
