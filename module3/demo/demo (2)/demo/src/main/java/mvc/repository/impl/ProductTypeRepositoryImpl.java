package mvc.repository.impl;

import mvc.bean.Product;
import mvc.bean.ProductType;
import mvc.repository.ProductTypeRepository;
import mvc.utils.ConnectionUtils;
import mvc.utils.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductTypeRepositoryImpl implements ProductTypeRepository {
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
        try (
                Connection connection = ConnectionUtils.getConnection();
                PreparedStatement statement = connection.prepareStatement(Constants.FIND_PRODUCT_TYPE_BY_ID);
        ) {
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                return new ProductType(id, name);
            }
        }
        return null;
    }

    @Override
    public List<ProductType> findAll() throws SQLException, ClassNotFoundException {
        List<ProductType> productTypes = new ArrayList<>();
        try (Connection connection = ConnectionUtils.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(Constants.FIND_ALL_PRODUCT_TYPE);) {
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                productTypes.add(new ProductType(id, name));
            }
        }
        return productTypes;
    }
}
