package mvc.service.impl;

import mvc.bean.Product;
import mvc.repository.ProductRepository;
import mvc.repository.impl.ProductRepositoryImpl;
import mvc.repository.impl.ProductRepositoryImplCallable;
import mvc.repository.impl.ProductRepositoryImplDB;
import mvc.service.ProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository repository = new ProductRepositoryImplDB();

    @Override
    public void create(Product product) throws Exception {
        repository.create(product);
    }

    @Override
    public void update(Product product) throws Exception {
        repository.update(product);
    }

    @Override
    public void deleteById(String id) throws Exception {
        repository.deleteById(id);
    }

    @Override
    public Product findById(String id) throws SQLException, ClassNotFoundException {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() throws SQLException, ClassNotFoundException {
        return repository.findAll();
    }

    @Override
    public List<Product> findAllWithPaging(int page, int size) throws SQLException, ClassNotFoundException {
        List<Product> productList = repository.findAll();
        int firstRecord = (page - 1) * size + 1;
        int endRecord = page * size;
        List<Product> result = new ArrayList<>();
        for (int i = firstRecord; i <= endRecord && i <= productList.size(); i++) {
            result.add(productList.get(i - 1));
        }
        return result;
    }

    @Override
    public int countPage(int size) {
        try {
            int records = repository.countRecord();
            int page = records % size == 0 ? records/size: records/size + 1;
            return page;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
