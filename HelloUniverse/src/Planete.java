public class Planete {
    String nom;
    int diametre;
    String matiere;
    int i;
    int totalVisiteur=0;
    Vaisseau vaisseauActuellemetAcoste;
    Atmosphere atmosphere;

   /* void accueillirVaisseau(int totalVisiteur){
        this.totalVisiteur=this.totalVisiteur+totalVisiteur;
    }
    void accueillirVaisseau(String typeVisiteur){
        if (typeVisiteur.equals("Chasseur")){
            this.totalVisiteur=this.totalVisiteur+3;
        } else if (typeVisiteur.equals("Fregate")) {
            this.totalVisiteur=this.totalVisiteur+12;
        } else if (typeVisiteur.equals("Croiseur")) {
            this.totalVisiteur=this.totalVisiteur+50;
        }
    }*/
    //fusionner les 2 methodes

    Vaisseau acceuillirVaisseau(Vaisseau vaisseau) {
        this.totalVisiteur = this.totalVisiteur + vaisseau.nbrPassager;
        if (vaisseauActuellemetAcoste == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Le vaisseau de type "+vaisseauActuellemetAcoste.type+" doit s'en aller");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellemetAcoste;
        vaisseauActuellemetAcoste = vaisseau;
        return vaisseauPrecedent;
    }



    void revolution(){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile.");
    }

    void rotation(){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même.");
    }

    void rotation(float angle){
        int tour=(int)angle/360;
        System.out.println(nom+" a effectue "+tour+" tours complets autour de son etoile.");


    }

    Planete(String nom)
    {
        this.nom=nom;
        i++;
    }
}
