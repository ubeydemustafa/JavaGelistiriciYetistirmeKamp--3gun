package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //sadecce ve sadece db erişim kodları buraya yaılır... SQL
        System.out.println("Hibernate ile veri tabanına eklendi ");
    }
}
