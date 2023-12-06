package gelato;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaF extends JFrame {

    private final JTextArea areaTexto;
    private Produto[] vetor;
    SingletonMenu menuF = SingletonMenu.getInstancia();

    public TelaF() {

        vetor = menuF.juntarVetoresP();

        areaTexto = new JTextArea(vetor.length, 30);
        areaTexto.setEditable(false); // Impede a edição do JTextArea

        JButton botaoMostrar = new JButton("Mostrar Produtos");
        botaoMostrar.addActionListener((ActionEvent e) -> {
            mostrarVetor();
        });

        JButton botaoInserir = new JButton("Inserir Produto");
        botaoInserir.addActionListener((ActionEvent e) -> {
            inserirProduto();
        });

        JButton botaoRemover = new JButton("Remover Produto");
        botaoRemover.addActionListener((ActionEvent e) -> {
            removerProduto();
        });

        JPanel botoesPanel = new JPanel();
        botoesPanel.add(botaoMostrar);
        botoesPanel.add(botaoInserir);
        botoesPanel.add(botaoRemover);

        setLayout(new BorderLayout());
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        add(botoesPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(550, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void mostrarVetor() {
        // Limpa a área de texto antes de exibir o vetor
        areaTexto.setText("");

        // Adiciona cada elemento do vetor à área de texto
        for (Produto elemento : vetor) {
            areaTexto.append(elemento.getNome() + " R$ " + elemento.getPreco() + "\n");
        }
    }

    private void inserirProduto() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        float valor = (float) Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));

        // Cria um novo Produto e adiciona ao vetor
        Produto novoProduto = new Produto(nome, valor);

        // Cria um novo vetor com tamanho aumentado
        Produto[] novoVetor = new Produto[vetor.length + 1];

        // Copia os elementos do vetor antigo para o novo vetor
        System.arraycopy(vetor, 0, novoVetor, 0, vetor.length);

        // Adiciona o novo Produto ao final do novo vetor
        novoVetor[novoVetor.length - 1] = novoProduto;

        // Atualiza o vetor
        vetor = novoVetor;

        // Atualiza a exibição
        mostrarVetor();
    }

    private void removerProduto() {
        int index = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice do produto a ser removido:"));

        if (index >= 0 && index < vetor.length) {
            // Cria um novo vetor com tamanho reduzido
            Produto[] novoVetor = new Produto[vetor.length - 1];

            // Copia os elementos do vetor antigo para o novo vetor, excluindo o elemento a ser removido
            System.arraycopy(vetor, 0, novoVetor, 0, index);
            System.arraycopy(vetor, index + 1, novoVetor, index, vetor.length - index - 1);

            // Atualiza o vetor
            vetor = novoVetor;

            // Atualiza a exibição
            mostrarVetor();
        } else {
            JOptionPane.showMessageDialog(this, "Índice inválido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaF());
    }
}
