// import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String name = "leticia";
        String sub = "Let" + "icia";

        System.out.println(name.toUpperCase()); // deixa tudo em maiúsculo

        System.out.println(name.charAt(3)); // identifica o caracter localizado em determinado index

        System.out.println(name.length()); // o tamanho da string

        System.out.println(name.substring(3)); // corta a string do index indicado até o final

        System.out.println(name.equals(sub)); // retorna booleano indicando se as duas strings são iguais (conta o case)

        System.out.println(name.equalsIgnoreCase(sub)); // retorna booleano indicando se as duas strings são iguais,
                                                        // ignorando o case

        System.out.println(name.toCharArray()); // converte a string para um array de caracteres

        // String strObj = new String("Hello!"); // um objeto que referencia uma string,
        // essa string não vai para a pool de strings
        // String str = "Hello!"; // uma literal que referencia uma string, essa string
        // vai para a pool de strings

        // // The two string references point two strings that are equal // tem valor
        // igual, mas não apontam para a mesma intância

        // if (strObj.equals(str)) { // o equal vai comparar o valor de string do objeto
        // e da literal, mas não leva em conta se apontam para a mesma instância
        // System.out.println("The strings are equal");
        // }

        // // The two string references do not point to the same object
        // if (strObj != str) { // o == e o != vão levar em conta o fato de não fazerem
        // referência à mesma instância
        // System.out.println("The strings are not the same object");
        // }

        // // If we intern a string that is equal to a given literal, the result is
        // // a string that has the same reference as the literal.

        // String internedStr = strObj.intern(); // usando o método intern() nesse
        // objeto, o seu valor passa a apontar para a mesma instância na pool de
        // strings.
        // if (internedStr == str) {
        // System.out.println("The interned string and the literal are the same
        // object");
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the String");

        // String palavra = scanner.next(); // pega a palavra

        // char[] listaPalavra = palavra.toCharArray(); // cria um array com as letras
        // da palavra

        // System.out.println("Enter the character you are looking for");
        // System.out.println(palavra);

        // String caracter = scanner.next(); // pega a letra q se deve alterar
        // char d = caracter.charAt(0); // transforma a string num char

        // for (int i = 0; i <= palavra.length(); i++) { // faz um looping pela string

        // if (listaPalavra[i] == d) { // se a letra da vez for igual ao caracter que
        // procuramos
        // if (d >= 'a' && d <= 'z') { // se a letra estiver em minúscula
        // d -= 32; // transforma em maiúscula
        // } else if (d >= 'A' && d <= 'Z') { // se estiver em maiúscula
        // d += 32; // transforma em minúscula
        // }
        // listaPalavra[i] = d; // substitui a letra do array pelo char que
        // trasnformamos
        // break;
        // }
        // }
        // palavra = String.valueOf(listaPalavra); // a palavra agora tem o valor do
        // array que alteramos
        // System.out.println(palavra);

        // scanner.close();

    }
}
