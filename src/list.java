import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();  // para declarar um List eu coloco o tipo de dado dele entre <> (generics) (tem que ser um tipo referência). Para instanciar é necessário usar uma classe que implemente a interface List

        list.add("Maria");  // para adicionar um item
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Amanda");

        for (String name: list){
            System.out.println(name);
        }

        System.out.println("-------------");
        list.add(2, "Marcos");   // para inserir um registro em uma posição específica.
        
        for (String name: list){
            System.out.println(name);
        }
        System.out.println("-------------");
        System.out.println(list.size()); // para saber o tamanho da lista

        System.out.println("-------------");

        list.remove(4); // para remover um elemento da lista (pode ser através do índice ou do seu valor mesmo)


        System.out.println("Index of Bob: " + list.indexOf("Bob"));  // mostra o index de um elemento, Quando ele não encontra O dito elemento ele retorna -1
        
        System.out.println("-------------");

        
    }
}
