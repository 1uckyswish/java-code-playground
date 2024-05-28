import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {
        Shirt shirt  = new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setBrand("Gucci");
        shirt.setPrice(3.99);
        shirt.setColor("Green");

        shirt.fold();

    }

}
