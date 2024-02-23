package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Database Version");
        double temp = 50;
        return temp;
    }
}
