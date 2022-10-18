package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)throws Exception{
        Product product1 = new Product(1,"telefon",10000);
        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());
        loggers.add(new FileLogger());


        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);



    }
}
