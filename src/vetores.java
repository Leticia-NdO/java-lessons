import java.util.Scanner;

public class vetores {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        String[] quartos = new String[10];

        for (int i = 0; i < n; i++){
            System.out.println();

            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            String no = sc.next();
            String me = sc.nextLine();
            String nome = no + me;
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quarto = sc.nextInt();

            quartos[quarto] = nome + ", " + email;
        }
        
        System.out.println();
        System.out.println("Busy rooms:");
        for(int i = 0; i < quartos.length ; i++){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }



        sc.close();

    }
}
