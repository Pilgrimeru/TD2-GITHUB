package fr.iut.editeur.document;

/**
 * Cette classe représente un document textuel qui peut être modifié à l'aide de commandes.
 */
public class Document {

    private String texte;

    /**
     * Crée un nouveau document initialisé avec une chaîne vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Obtient le texte actuel du document.
     *
     * @return Le texte du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Modifie le texte du document avec une nouvelle chaîne.
     *
     * @param texte La nouvelle chaîne de texte.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute une chaîne de texte à la fin du document.
     *
     * @param texte La chaîne de texte à ajouter.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace une portion du texte par une nouvelle chaîne, en fonction des indices de début et de fin spécifiés.
     *
     * @param start       L'indice de début de la portion à remplacer.
     * @param end         L'indice de fin de la portion à remplacer.
     * @param remplacement La nouvelle chaîne de remplacement.
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Met en majuscules une portion du texte, en fonction des indices de début et de fin spécifiés.
     *
     * @param start L'indice de début de la portion à mettre en majuscules.
     * @param end   L'indice de fin de la portion à mettre en majuscules.
     */
    public void majuscules(int start, int end) {
        String majPart = texte.substring(start, end);
        majPart = majPart.toUpperCase();
        remplacer(start, end, majPart);
    }

    /**
     * Efface une portion du texte, en fonction des indices de début et de fin spécifiés.
     *
     * @param start L'indice de début de la portion à effacer.
     * @param end   L'indice de fin de la portion à effacer.
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * Efface tout le texte du document.
     */
    public void clear() {
        texte = "";
    }

    /**
     * Insère une chaîne de texte à une position spécifiée dans le document.
     *
     * @param position   La position d'insertion.
     * @param insertion  La chaîne de texte à insérer.
     */
    public void inserer(int position, String insertion){
        String leftPart = texte.substring(0, position);
        String rightPart = texte.substring(position);
        texte = leftPart + insertion + rightPart;
    }

    /**
     * Met en minuscules une portion du texte, en fonction des indices de début et de fin spécifiés.
     *
     * @param start L'indice de début de la portion à mettre en minuscules.
     * @param end   L'indice de fin de la portion à mettre en minuscules.
     */
    public void minuscules(int start, int end) {
        String minPart = texte.substring(start, end);
        minPart = minPart.toLowerCase();
        remplacer(start, end, minPart);
    }

    /**
     * Obtient une représentation textuelle du document.
     *
     * @return La chaîne de texte représentant le document.
     */
    @Override
    public String toString() {
        return this.texte;
    }
}

