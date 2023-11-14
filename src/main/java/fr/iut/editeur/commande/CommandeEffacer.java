package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande d'effacement de texte dans un document.
 */
public class CommandeEffacer extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande d'effacement de texte.
     *
     * @param document   Le document duquel le texte doit être effacé.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en effaçant une partie du texte du document en fonction des paramètres spécifiés.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : effacer;depart;fin");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.effacer(depart, fin);
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "efface du texte";
    }
}

