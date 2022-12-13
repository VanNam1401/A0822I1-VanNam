package bai_tap;

import java.util.*;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                return;
            }
        }
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return;
            }
        }
    }

    public List<Product> searchProduct(String name) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                result.add(products.get(i));
            }
        }
        return result;
    }

    public void sortProductASC() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
//        Collections.sort(products);
    }

    public void sortProductDEC() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return -((int) (o1.getPrice() - o2.getPrice()));
            }
        });
    }

    public List<Product> copy() {
        return products;
    }
}
