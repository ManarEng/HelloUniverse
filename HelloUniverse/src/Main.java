public class Main {

    public static void main(String... args) {
      /* Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        mars.rotation(-684);
        venus.rotation(1250);*/


      /*  mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("Fregate");
        System.out.println("Le nombre d'humains ayant deja sejourne sur Mars est actuellement de "+mars.totalVisiteur);*/

        //appel methode d acceuille vaisseau fusionnee

       /*Vaisseau nouveauVaisseau=new Vaisseau();
        nouveauVaisseau.type="Fregate";
        nouveauVaisseau.nbrPassager=9;
        mars.acceuillirVaisseau(nouveauVaisseau);
        Vaisseau autreVaisseau=new Vaisseau();
        autreVaisseau.type="Croiseur";
        autreVaisseau.nbrPassager=42;
        mars.acceuillirVaisseau(autreVaisseau);


        Atmosphere atmosphereUranus=new Atmosphere();
        atmosphereUranus.hydrogene=30;
        atmosphereUranus.argon=50;
        atmosphereUranus.azote=70;
        atmosphereUranus.helium=20;
        atmosphereUranus.methane=30;
        atmosphereUranus.dioxydeCarbone=60;
        atmosphereUranus.sodium=40;
        uranus.atmosphere=atmosphereUranus;
        System.out.println("taux d'hydrogene pour la planete uranis est:"+uranus.atmosphere.hydrogene); */

        Planete newPlanete=new Planete("balou");
        System.out.println(newPlanete.i);

        VaisseauDeGuerre chasseur=new VaisseauDeGuerre();
        chasseur.blindage=156;
        chasseur.resistenceDuBouclier=2;
        chasseur.type="Chasseur";
        VaisseauCivil vaisseauMonde=new VaisseauCivil();
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistenceDuBouclier=30;
        vaisseauMonde.type="Vaisseau-Monde";

        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();

        chasseur.attack(vaisseauMonde,"lasers photoniques",3);

        vaisseauMonde.desactiverBouclier();

        System.out.println("La resistance du bouclier Vaisseau-Monde est de:"+vaisseauMonde.resistenceDuBouclier);
        System.out.println("Le blindage du Vaisseau-Monde est de:"+vaisseauMonde.blindage);
    }

}