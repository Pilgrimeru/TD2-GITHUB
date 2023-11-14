package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande d'ajout de texte à un document.
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande d'ajout de texte.
     *
     * @param document   Le document auquel le texte doit être ajouté.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en ajoutant du texte au document.
     */
    @Override
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "ajoute du texte";
    }
}
