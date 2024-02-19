package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class Presentation_Spring_Annotation {
    public static void main(String[] args) {
        ApplicationContext contextSpring = new AnnotationConfigApplicationContext("extension","metier");
        IMetier metier = contextSpring.getBean(IMetier.class);
        System.out.println("Res "+metier.calcul());
    }
}
