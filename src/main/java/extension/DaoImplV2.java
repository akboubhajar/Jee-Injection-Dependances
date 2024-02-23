package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Webservice Version");
        double t = 50;
        return t;
    }
}
