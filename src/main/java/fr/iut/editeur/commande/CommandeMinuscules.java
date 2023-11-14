package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande de mise en minuscules d'une partie du texte dans un document.
 */
public class CommandeMinuscules extends CommandeDocument {

    /**
     * Crée une nouvelle instance de la commande de mise en minuscules.
     *
     * @param document   Le document dans lequel le texte doit être mis en minuscules.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande en mettant en minuscules une partie du texte du document en fonction des paramètres spécifiés.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : minuscules;depart;fin");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.minuscules(depart, fin);
        super.executer();
    }

    /**
     * Obtient la description de la commande.
     *
     * @return La description de la commande.
     */
    @Override
    public String getDescriptionCommande() {
        return "rend du texte en minuscule";
    }
}

