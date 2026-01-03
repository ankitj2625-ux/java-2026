package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String salary;

    public Product(String ankit, String s) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

public class Details {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("ankit", "100"));
        products.add(new Product("anamika", "200"));
        products.add(new Product("vidhal", "300"));
        products.add(new Product("vibha", "400"));

        List<Product> productList = (products.stream().filter(p -> p.getName()!=null && p.getName().startsWith("a")).collect(Collectors.toList()));
        System.out.println(productList);
    }
}
