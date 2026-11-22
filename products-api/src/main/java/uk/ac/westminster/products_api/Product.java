package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    //Add this no argument constructor
    public Product() {}

    //Adding the constructor
    public Product(Long id,String name,double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Adding getters question number 18 answers
    public long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

}
