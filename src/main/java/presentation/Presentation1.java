package presentation;

import dao.IDaoImpl;
import extension.IDaoImpl2;
import metier.IMetier;
import metier.IMetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        // la couche presentation n'est pas fermée à la modification
        // parcequ'on fait appel aux classes (couplage fort)
        // parcequ'on utilise l'instanciation statique : "IDaoImpl2 iDao = new IDaoImpl2();"
        // DONC pour résoudre ce prblm on doit utiliser l'instanciation dynamique
        IDaoImpl2 iDao = new IDaoImpl2();
        IMetierImpl iMetierImpl = new IMetierImpl(iDao); // Injection des dépendances via Constructeur
        // iMetierImpl.setDao(iDao); // Injection des dépendances
        System.out.println("reultat = "+iMetierImpl.calcul());
    }
}
