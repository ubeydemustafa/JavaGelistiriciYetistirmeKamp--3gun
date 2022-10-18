package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadecce ve sadece db erişim kodları buraya yaılır... SQL
        System.out.println("JDBC ile veri tabanına eklendi ");
    }
}
