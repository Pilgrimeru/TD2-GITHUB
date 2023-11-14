package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    /**
     * Obtient une instance de la CommandeFactory (singleton).
     *
     * @return L'instance de la CommandeFactory.
     */
    public static CommandeFactory getInstance() {
        if (instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {
    }

    /**
     * Crée une instance de commande en fonction du nom de la commande, du document et des paramètres.
     *
     * @param name       Le nom de la commande.
     * @param document   Le document sur lequel la commande doit être exécutée.
     * @param parameters Les paramètres de la commande.
     * @return Une instance de la commande correspondante ou null si le nom de la commande est inconnu.
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter":
                return new CommandeAjouter(document, parameters);
            case "remplacer":
                return new CommandeRemplacer(document, parameters);
            case "majuscules":
                return new CommandeMajuscules(document, parameters);
            case "effacer":
                return new CommandeEffacer(document, parameters);
            case "clear":
                return new CommandeClear(document, parameters);
            case "inserer":
                return new CommandeInserer(document, parameters);
            case "minuscules":
                return new CommandeMinuscules(document, parameters);
            default:
                return null;
        }
    }
}