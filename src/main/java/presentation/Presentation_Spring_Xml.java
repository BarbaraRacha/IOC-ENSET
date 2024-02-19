package presentation;

import metier.IMetier;
import metier.IMetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation_Spring_Xml {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = springContext.getBean(IMetier.class);
        // ou "IMetier metier = (IMetier) springContext.getBean("metier");"
        // metier est l'id de classe sur config.xml
        System.out.println("Res "+metier.calcul());
    }
}
