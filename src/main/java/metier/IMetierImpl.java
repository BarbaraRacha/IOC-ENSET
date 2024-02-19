package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier{
    //@Autowired // c'est pa recommendé d'utiliser // car ça touche le principe d'encapsulation (accès direct aux variables)
    //@Qualifier("dao") // s'il ya deux versions dans le meme package on définit cette notation, et on écrit dedans le meme nom donné dans @compenent de la classe voulue
    IDao dao; // Couplage Faible

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data * 11.4;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao; // pour permettre d'injecter dans la varibale Dao un objet d'une classe qui implémente l'interface Idao
    }
}
