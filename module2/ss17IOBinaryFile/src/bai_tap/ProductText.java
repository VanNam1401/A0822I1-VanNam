package bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductText {
    static void writeFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Ao", "Viet Nam", 40000, "khac"));
        products.add(new Product(2, "Quan", "Viet Nam", 50000, "khac"));
        products.add(new Product(3, "Giay", "Viet Nam", 60000, "khac"));
        writeFile("src/bai_tap/product.txt", products);
        List<Product> productList = readFile("src/bai_tap/product.txt");
        for (Product product :
                productList) {
            System.out.println(product);
        }
    }
}
