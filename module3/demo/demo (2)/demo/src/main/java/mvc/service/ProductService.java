package mvc.service;

import mvc.bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService extends CRUDService<Product> {
    List<Product> findAllWithPaging(int page, int size) throws SQLException, ClassNotFoundException;
    int countPage(int size);
}
