import java.util.Locale;

public class App {
    public static void main(String[] args) {

        System.out.println("Olá, mundo");
        
        int idade = 19;
        System.out.println(idade);
        
        String nome = "Leticia";
        System.out.println(nome);
        
        double x = 10.387482;
        System.out.printf("%.2f%n", x); // para definir a quantidade de pontos flutuantes a serem exebidos.
        // printf indica que algo formatado será impresso. o %n ou \n faz a quebra de linha automaticamente. 
        // O printf pega o formato do computador que está sendo usado. Por isso ele exibe o número com vírgula ao invés de ponto
        
        Locale.setDefault(Locale.US); // muda a configuração para o padrão americano
        System.out.printf("%.4f\n", x);

        // concatenação

        System.out.println(nome + " " + idade);

        // concatenação com o prinf
        System.out.printf("Resultado = " + "%.2f metros\n", x);
        System.out.printf("%s tem %d anos e ganha %.2f reais de salário\n ", nome, idade, x);
        
    }
}
