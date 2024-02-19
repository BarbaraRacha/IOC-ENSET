package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("extension")
public class IDaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web services");
        double data = 55;
        return data;
    }
}
