package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {

    private IDao dao;

   // public MetierImpl() {}

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul(){
        double t = dao.getData();
        double res = t * 20 ;
        return res;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
