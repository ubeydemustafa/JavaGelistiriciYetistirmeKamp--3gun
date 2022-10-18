package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;


    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product)throws Exception{ //response request
        //iş kuralları
        if (product.getUnitPrice()<10){
            throw new Exception("ürün fiyatı 10 dan küçük olamaz");
        }
        //ProductDao productDao = new HibernateProductDao();
        productDao.add(product);
        for (Logger logger:loggers) {
            logger.log(product.getName());
        }

    }
}
