package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.Commande;

import java.util.Stack;

/**
 * Cette classe est responsable de l'invocation des commandes en les exécutant.
 */
public class CommandeInvoker {

    private static CommandeInvoker instance;

    /**
     * Obtient une instance de la CommandeInvoker (singleton).
     *
     * @return L'instance de la CommandeInvoker.
     */
    public static synchronized CommandeInvoker getInstance() {
        if (instance == null) {
            instance = new CommandeInvoker();
        }
        return instance;
    }

    private CommandeInvoker() {
    }

    /**
     * Exécute la commande spécifiée.
     *
     * @param commande La commande à exécuter.
     */
    public void executer(Commande commande) {
        commande.executer();
    }
}

