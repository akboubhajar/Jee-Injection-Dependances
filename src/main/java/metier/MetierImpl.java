package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier") //<bean id="metier" class="metier.MetierImpl">

public class MetierImpl implements IMetier {
    @Autowired // inject
    private IDao dao;

    public MetierImpl() {}

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }


    public double calcul(){
        double t = dao.getData();
        double res = t * 23 ;
        return res;
    }







}
