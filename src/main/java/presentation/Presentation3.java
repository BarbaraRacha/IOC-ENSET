package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation3 {
    public static void main(String[] args) throws Exception{
        // IDaoImpl2 iDao = new IDaoImpl2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner la classe de la couche Dao: ");
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao dao = (IDao) cdao.getConstructor().newInstance(); // <=> new IDaoImpl

        // IMetierImpl iMetierImpl = new IMetierImpl();
        System.out.print("Donner la classe de la couche Metier: ");
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        // iMetierImpl.setDao(iDao); // Injection des dépendances (statiquement)
        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao); // Injection des dépendances (dynamiquement)

        // System.out.println("reultat = "+iMetierImpl.calcul());
        System.out.println("reultat = "+metier.calcul());
    }
}
