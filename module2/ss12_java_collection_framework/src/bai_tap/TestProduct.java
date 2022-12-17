package bai_tap;

import java.util.List;
import java.util.Scanner;

public class TestProduct {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();

    private static void model() {
        while (true) {
            System.out.print("Quản lý sản phẩm: ");
            System.out.print("\n1. Thêm sản phẩm." + "\n2. Sửa thông tin sản phẩm" + "\n3. Xóa sản phầm theo id." + "\n4. Hiển thị danh sách sản phẩm." + "\n5. Tìm kiếm sản phầm theo tên." + "\n6. Sắp xếp sản phẩm." + "\n7. Thoát");
            System.out.print("\nNhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

    private static void addProduct() {
        while (true) {
            System.out.print("Nhập mã sản phẩm: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập loại sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            double price = Double.parseDouble(scanner.nextLine());
            Product product = new Product(id, name, price);
            productManager.addProduct(product);
            System.out.print("Bạn có muốn thêm sản phẩm không Y/N: ");
            char choose = scanner.nextLine().charAt(0);
            if (choose == 'N' || choose == 'n') {
                model();
            }
        }

    }

    private static void updateProduct() {
        System.out.print("Nhập mã sản pẩm muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại sản phẩm mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá tiền sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        productManager.updateProduct(product);
    }

    private static void deleteProduct() {
        System.out.print("Nhập mã sản phẩm muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        productManager.deleteProduct(id);
        displayProduct();
    }

    private static void displayProduct() {
        List<Product> productList = productManager.copy();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void searchProduct() {
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        List<Product> productList = productManager.searchProduct(name);
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    private static void sortProduct() {
        System.out.println("Muốn sắp xếp giá " + "\n1. Tăng dần." + "\n2. Giảm dần.");
        System.out.println("Bạn muốn??? ");
        int choose = Integer.parseInt(scanner.nextLine());
        productManager.sort(choose == 1);
        displayProduct();
    }

    public static void main(String[] args) {
        model();
    }
}
