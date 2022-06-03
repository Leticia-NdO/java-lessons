import java.util.Random;

public class estruturas_condicionais {
    public static void main(String[] args) {
        Random random = new Random();
        int x;
        x = random.nextInt(20);

        if (x <= 5) {
            System.out.println("Bom dia!");
            System.out.println(x);
        } else if (x >= 6 && x <= 10) {
            System.out.println("Boa tarde!");
            System.out.println(x);
        } else {
            System.out.println("Boa noite");
            System.out.println(x);
        }
    }

}
