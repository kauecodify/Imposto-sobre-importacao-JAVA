import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        // Iniciar
        JFrame f = new JFrame("impostos sobre importações");
        JButton b = new JButton("Iniciar");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        // Valores iniciais
        JFrame f2 = new JFrame("Tarifas aduaneiras");

        double impostoSobreImportacoes = 0.0;

        if (valor > 50) {
            System.out.println("Juros aplicado");
        } else {
            System.out.println("N/se aplica");
        }

        JButton b2 = new JButton("confirmar valores");
        b2.setBounds(50, 100, 95, 30);
        f2.add(b2);
        f2.setSize(500, 500);
        f2.setLayout(null);
        f2.setVisible(true);

        // Valores
        double valorProdutoLiquido = 0.0;
        double valorProdutoBruto = 0.0;

        JButton b3 = new JButton("Acesso");
    }
}
