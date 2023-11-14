package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe abstraite sert de base pour les commandes agissant sur un document.
 */
public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[] parameters;

    /**
     * Crée une nouvelle instance de la commande sur un document avec les paramètres spécifiés.
     *
     * @param document   Le document sur lequel la commande doit agir.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Exécute la commande par défaut en affichant le contenu du document.
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}

