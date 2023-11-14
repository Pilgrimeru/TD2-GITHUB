package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande de remplacement de texte dans un document.
 */
public class CommandeRemplacer extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande de remplacement de texte.
     *
     * @param document   Le document dans lequel le texte doit être remplacé.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en remplaçant une partie du texte du document par un nouveau texte,
     * en fonction des paramètres spécifiés.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = (parameters.length == 3) ? "" : parameters[3];
        document.remplacer(depart, fin, texte);
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "remplace du texte";
    }
}

