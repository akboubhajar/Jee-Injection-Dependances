package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    public double getData() {
        System.out.println("Database Version");
        double temp;
        temp = 30;
        return temp;
    }
}
