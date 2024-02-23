package extension;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Webservice Version");
        double t = 53;
        return t;
    }
}
