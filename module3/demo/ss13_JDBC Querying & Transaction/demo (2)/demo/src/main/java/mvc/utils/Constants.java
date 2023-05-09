package mvc.utils;

public interface Constants {
    String SELECT_ALL_FROM_PRODUCT = "Select * from Product";
    String INSERT_INTO_PRODUCT = "Insert into Product values (?, ?, ?, ?, ?, ?)";
    String UPDATE_PRODUCT = "Update Product set name = ?, price = ?, date_release = ?, quantity = ? where id = ?";
    String FIND_PRODUCT_BY_ID = "select * from product where id = ?";
    String FIND_PRODUCT_TYPE_BY_ID = "select * from product_type where id = ?";
    String FIND_ALL_PRODUCT_TYPE = "select * from product_type";
    String COUNT_RECORD_PRODUCT = "select count(1) from product";
}
