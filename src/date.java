import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException{

        Date x1 = new Date();  // cria uma data com o horário de agora

        Date x2 = new Date(System.currentTimeMillis());  // outro jeito
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");   // definimos que queremos o formato da data assim

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/06/2018");  // passamos uma string e o parse do simpledateformat a transforma em um objeto Date

        Date y2 = sdf2.parse("23/08/2001 15:42:08");


        System.out.println(y1);   // ele vai imprimir a data no seu formato padrão
        System.out.println(y2);


        System.out.println(sdf1.format(y1));   // para imprimir a data no formato que especificamos devemos usar o format() do simpledateformat
        System.out.println(sdf2.format(y2));

        System.out.println(sdf2.format(x1));

        System.out.println(sdf2.format(x2));

    }
}
