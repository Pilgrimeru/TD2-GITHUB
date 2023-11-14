package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande de mise en majuscules d'une partie du texte dans un document.
 */
public class CommandeMajuscules extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande de mise en majuscules.
     *
     * @param document   Le document dans lequel le texte doit être mis en majuscules.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en mettant en majuscules une partie du texte du document en fonction des paramètres spécifiés.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : majuscules;depart;fin");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(depart, fin);
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "rend du texte en majuscule";
    }
}
