public class VaisseauDeGuerre extends Vaisseau{

    void attack(Vaisseau vaisseauAttack,String armeUtilisee,int dureeAttack)
    {
        System.out.println("un vaisseau de type "+type+" attaque un vaisseau de type "+vaisseauAttack.type+ " en utilisant l'arme "+armeUtilisee+ " pendant "+dureeAttack+" min");
        vaisseauAttack.resistenceDuBouclier=0;
        vaisseauAttack.blindage=vaisseauAttack.blindage/2;
    }

}
