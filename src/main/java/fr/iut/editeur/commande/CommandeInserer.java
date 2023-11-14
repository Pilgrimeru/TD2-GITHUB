package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande d'insertion de texte dans un document.
 */
public class CommandeInserer extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande d'insertion de texte.
     *
     * @param document   Le document dans lequel le texte doit être inséré.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en insérant du texte à une position spécifiée dans le document.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : inserer;position;chaine");
            return;
        }
        int position = Integer.parseInt(parameters[1]);
        String texte = (parameters.length == 2) ? "" : parameters[2];
        document.inserer(position, texte);
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "insère du texte";
    }
}

