package mvc.repository;

import mvc.bean.Product;

import java.sql.SQLException;

public interface ProductRepository extends CRUDRepository<Product> {
    int countRecord() throws SQLException, ClassNotFoundException;
}
