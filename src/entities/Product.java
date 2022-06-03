package entities;

public class Product {

    // Atributos //
    private String name;
    private double price;
    private int quantity;

    // Construtores //
    public Product(){  // assim, permitimos que o construtor padrão também exista

    }

    public Product(String name, double price, int quantity){   // contrutor personalizado, vem depois dos atributos. É executado no momento da instanciação do objeto
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // sobrecarga é disponibilizar mais de uma versão da mesma operação, onde a diferença se encontra nos parâmetros passados

    public Product (String name, double price){    // ter dois construtores, um com o quantity, outro sem o quantity, torna a definição do quantity na instanciação opcional.
        this.name = name;
        this.price = price;
    }

    // Setters e getters //

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    // Métodos //

    public double totalValueInStock() {

        double totalValue = price * quantity;
        return totalValue;

    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return String.format("%s, $ %.2f, %d units, total: %.2f\n", name, price, quantity, totalValueInStock());

    }

}
