package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class IDaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version bases de données");
        double data = 34;
        return data;
    }
}

