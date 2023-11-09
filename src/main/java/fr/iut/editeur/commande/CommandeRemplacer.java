package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = (parameters.length == 3) ? "" : parameters[3];
        document.remplacer(depart,fin,texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "remplace du texte";
    }

}
