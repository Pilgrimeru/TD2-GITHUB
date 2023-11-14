package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande de suppression de tout le texte d'un document.
 */
public class CommandeClear extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande de suppression de tout le texte.
     *
     * @param document   Le document duquel le texte doit être supprimé.
     * @param parameters Les paramètres de la commande (non utilisés dans ce cas).
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en retirant tout le texte du document.
     */
    @Override
    public void executer() {
        this.document.clear();
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "retire le texte";
    }
}

