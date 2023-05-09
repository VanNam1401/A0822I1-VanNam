package mvc.service.impl;

import mvc.bean.Product;
import mvc.bean.ProductType;
import mvc.repository.ProductTypeRepository;
import mvc.repository.impl.ProductTypeRepositoryImpl;
import mvc.service.ProductTypeService;

import java.sql.SQLException;
import java.util.List;

public class ProductTypeServiceImpl implements ProductTypeService {
    private ProductTypeRepository repository = new ProductTypeRepositoryImpl();
    @Override
    public void create(ProductType productType) throws Exception {

    }

    @Override
    public void update(ProductType productType) throws Exception {

    }

    @Override
    public void deleteById(String id) throws Exception {

    }

    @Override
    public ProductType findById(String id) throws SQLException, ClassNotFoundException {
        return repository.findById(id);
    }

    @Override
    public List<ProductType> findAll() throws SQLException, ClassNotFoundException {
        return repository.findAll();
    }

}
