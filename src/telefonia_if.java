import javax.swing.JOptionPane;

public class telefonia_if {
    public static void main(String[] args) {
        int extras;
        double valorPagar;
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos consumidos"));

        if (minutos <= 100) {
            valorPagar = 50;
            JOptionPane.showMessageDialog(null, "Você consumiu "+ minutos+" minutos de telefone, por isso pagará R$ "+ valorPagar);
        } else if (minutos > 100) {
            extras = minutos - 100;
            valorPagar = 50 + (extras * 2);
            JOptionPane.showMessageDialog(null, "Você consumiu "+ minutos+" minutos de telefone,"+extras+"minutos acima do plano e por isso pagará R$ "+ valorPagar);
        }
        
    
}
}