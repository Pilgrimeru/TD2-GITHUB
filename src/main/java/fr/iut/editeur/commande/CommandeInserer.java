package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer(){
        if(parameters.length < 3){
            System.err.println("Format attendu : inserer;position;chaine");
            return;
        }
        int position = Integer.parseInt(parameters[1]);
        String texte = (parameters.length == 2) ? "" : parameters[2];
        document.inserer(position, texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "insere du texte";
    }
}
