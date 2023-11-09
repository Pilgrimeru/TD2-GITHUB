package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument {


    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : minuscules;depart;fin");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.minuscules(depart, fin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "rend du texte en minuscule";
    }

}
