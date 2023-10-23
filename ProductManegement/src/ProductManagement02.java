import java.util.*;

public class ProductManagement02 {
    private final List<Product> productList;

    public ProductManagement02() {
        productList = new LinkedList<>();
    }

    public ProductManagement02(List<Product> productList) {
        this.productList = productList;
    }


    public void add(Product p) {
        productList.add(p);
    }

    public void replace(int index, Product p) {
        productList.set(index, p);
    }

    public Product remove(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                productList.remove(p);
                return p;
            }
        }
        throw new RuntimeException("Id not found");
    }

    public Product find(String name) {
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        throw new RuntimeException("Name not found");
    }

    public int size() {
        return productList.size();
    }

    public void sortPriceIncreasing() {
        productList.sort((o1, o2) -> {
            int o1Price = o1.getPrice();
            int o2Price = o2.getPrice();
            return Integer.compare(o1Price , o2Price);
        });
    }

    public void sortPriceDecreasing() {
        productList.sort((o1, o2) -> {
            int o1Price = o1.getPrice();
            int o2Price = o2.getPrice();
            return -Integer.compare(o1Price , o2Price);
        });
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[ \n");
        for (Product p : productList) {
            result.append(p.toString()).append(",\n");
        }
        result.deleteCharAt(result.length() - 2);
        result.append("]");

        return result.toString();
    }



}
