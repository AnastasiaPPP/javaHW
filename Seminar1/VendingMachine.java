package Seminar1;

public interface VendingMachine {
    void addProduct(Object product);
    <T> T getProduct(String name, int price);

}
