package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String majPart = texte.substring(start, end);
        majPart = majPart.toUpperCase();
        remplacer(start, end, majPart);
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        texte = "";
    }

    public void inserer(int position, String insertion){
        String leftPart = texte.substring(0, position);
        String rightPart = texte.substring(position);
        texte = leftPart + insertion + rightPart;
    }

    public void minuscules(int start, int end) {
        String minPart = texte.substring(start, end);
        minPart = minPart.toLowerCase();
        remplacer(start, end, minPart);
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
