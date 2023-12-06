package gelato;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaC extends JFrame {

    private SingletonMenu menuC;

    public TelaC() {
        menuC = SingletonMenu.getInstancia();

        JButton btnVerCardapio = new JButton("Ver Cardápio");
        JButton btnVerCarrinho = new JButton("Ver Carrinho");
        JButton btnRemoverCarrinho = new JButton("Remover do Carrinho");
        JButton btnFinalizarCompra = new JButton("Finalizar Compra");

        btnVerCardapio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuC.verCardapio();
            }
        });

        btnVerCarrinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuC.verCart();
            }
        });

        btnRemoverCarrinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuC.delCart();
            }
        });

        btnFinalizarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!menuC.buy()) {
                    JOptionPane.showMessageDialog(TelaC.this, "Obrigado por comprar conosco!");
                    dispose(); // Fecha a janela ao finalizar a compra
                }
            }
        });

        JPanel botoesPanel = new JPanel();
        
        botoesPanel.add(btnVerCardapio);
        botoesPanel.add(btnVerCarrinho);
        botoesPanel.add(btnRemoverCarrinho);
        botoesPanel.add(btnFinalizarCompra);

        setLayout(new BorderLayout());
        add(botoesPanel, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaC());
    }
}
