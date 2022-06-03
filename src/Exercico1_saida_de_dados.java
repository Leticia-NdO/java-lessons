import java.util.Locale;

public class Exercico1_saida_de_dados {
    public static void main(String[] args) {
        
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5362;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.2364724;

        System.out.print("Products: \n");
        System.out.println(" ");
        System.out.printf("%s which price is $ %.2f\n", product1, price1);
        System.out.printf("%s which price is $ %.2f\n", product2, price2);
        System.out.println(" ");
        
        System.out.printf("Record: %s years old, code %d and gender %c\n", age, code, gender);
        System.out.println(" ");
        System.out.printf("Mesure with eight decimal places: %f\n", measure);
        System.out.printf("Rouded (three decimal places: %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %f\n", measure);



        
    }
}
