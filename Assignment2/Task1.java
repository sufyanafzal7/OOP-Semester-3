package Assignment2;

class Product {

    private String name;
    private int productID;
    private double price;
    private int quantity;
    private Category category;

    public Product(String name, int productID, double price, int quantity, Category category) {
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void display() {
        System.out.printf("Product Name: %s, Product ID: %d, Price: %.2f, Quantity: %d, Category: %s\n",
                name, productID, price, quantity, category.getName());
    }
}

class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Customer {
    private int customerID;
    private String name;
    private String emailID;
    private String address;

    public Customer(int customerID, String name, String emailID, String address) {
        this.customerID = customerID;
        this.name = name;
        this.emailID = emailID;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.printf("Customer ID: %d, Name: %s, Email: %s, Address: %s\n",
                customerID, name, emailID, address);
    }
}

class Review {
    private int rating;
    private String comments;
    private Product product;

    public Review(int rating, String comments, Product product) {
        this.rating = (rating >= 1 && rating <= 5) ? rating : 1;
        this.comments = comments;
        this.product = product;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = (rating >= 1 && rating <= 5) ? rating : 1;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void display() {
        System.out.printf("Rating: %d/5, Comments: %s, Product: %s\n",
                rating, comments, product.getName());
    }
}

class Order {
    private int orderID;
    private String orderDate;
    private Product[] products;
    private int productCount;

    public Order(int orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.products = new Product[10];
        this.productCount = 0;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Maximum product limit reached!");
        }
    }

    public void display() {
        System.out.printf("Order ID: %d, Order Date: %s\n", orderID, orderDate);
        System.out.println("Products in this order:");
        for (int i = 0; i < productCount; i++) {
            products[i].display();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Category freshProduce = new Category("FreshProduce");
        Category dairy = new Category("Dairy");
        Category bakedGoods = new Category("BakedGoods");
        Category householdItems = new Category("HouseholdItems");

        Product apple = new Product("Apple", 101, 1.5, 50, freshProduce);
        Product milk = new Product("Milk", 102, 2.0, 30, dairy);
        Product bread = new Product("Bread", 103, 3.0, 20, bakedGoods);
        Product detergent = new Product("Detergent", 104, 5.0, 10, householdItems);

        Customer customer = new Customer(1, "Sufyan Afzal", "sufyan@gmail.com", "123 Main sdfghj");

        Order order1 = new Order(1, "2025-03-23");
        order1.addProduct(apple);
        order1.addProduct(milk);
        customer.display();

        Review review1 = new Review(5, "asdf asdfdfsfadqdqd", apple);

        System.out.println("\nOrder Details:");
        order1.display();

        System.out.println("\nReview Details:");
        review1.display();
    }
}
