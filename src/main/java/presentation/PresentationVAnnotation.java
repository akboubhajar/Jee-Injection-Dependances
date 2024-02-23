package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationVAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("extension","metier","dao");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result: "+metier.calcul());
    }
}
