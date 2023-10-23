import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("A", 1, 1000);
        Product p2 = new Product("B", 2, 5000);
        Product p3 = new Product("C", 3, 2000);
        Product p4 = new Product("J", 4, 4000);

        List<Product> productList = new ArrayList<>();
        productList.add(p4);
        ProductManagement productManagement = new ProductManagement(productList);
        productManagement.add(p1);
        productManagement.add(p2);
        productManagement.add(p3);

        System.out.println("List: ");
        System.out.println(productManagement);

        System.out.println("\n List after sorting price increasing");
        productManagement.sortPriceIncreasing();
        System.out.println(productManagement);


        System.out.println("\n List after sorting price decreasing");
        productManagement.sortPriceDecreasing();
        System.out.println(productManagement);

        Product remove = productManagement.remove(2);
        System.out.println("List after removing product " + remove.getName());
        System.out.println(productManagement);


        System.out.println("Product A is " +  productManagement.find("A"));
//        System.out.println("Product D is " +  productManagement.find("D"));

        productManagement.replace(1, new Product("F", 4, 9000));
        System.out.println("List after replacing product: ");
        System.out.println(productManagement);

        System.out.println(productManagement.size());

    }
}
