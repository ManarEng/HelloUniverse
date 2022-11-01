public class Vaisseau {
    String type;
    int nbrPassager;
    int blindage;
    int resistenceDuBouclier;



    void activerBouclier()
    {
        System.out.println("Activation du bouclier pour le vaisseau de type "+type);
    }
    void desactiverBouclier()
    {
        System.out.println("Desactivation du bouclier pour le vaisseau de type "+type);
    }
}
