import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class CJogador extends JPanel {
	private JTextField textField;
	private JTextField txtLayer;
	private JTextField txtR;

	/**
	 * Create the panel.
	 */
	public CJogador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio:");
		lblNewLabel.setBounds(23, 58, 56, 22);
		add(lblNewLabel);
		
		JLabel lblOlMartins = new JLabel("Ol\u00E1 Martins!");
		lblOlMartins.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOlMartins.setBounds(128, 60, 114, 14);
		add(lblOlMartins);
		
		JLabel lblDataDaCompra = new JLabel("Data da compra:");
		lblDataDaCompra.setBounds(23, 92, 86, 14);
		add(lblDataDaCompra);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setText("29/04/2016");
		textField.setBounds(128, 87, 114, 22);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.setBounds(385, 382, 313, 71);
		add(btnNewButton);
		
		txtLayer = new JTextField();
		txtLayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLayer.setEditable(false);
		txtLayer.setText("Layers of Fear");
		txtLayer.setBounds(128, 129, 193, 22);
		add(txtLayer);
		txtLayer.setColumns(10);
		
		JLabel lblNomeDoJogo = new JLabel("Nome do jogo:");
		lblNomeDoJogo.setBounds(23, 133, 86, 14);
		add(lblNomeDoJogo);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(23, 176, 56, 14);
		add(lblDescrio);
		
		JTextPane txtpnCamadasDeMedo = new JTextPane();
		txtpnCamadasDeMedo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCamadasDeMedo.setText("Layers of Fear é um jogo de horror psicodélico em primeira pessoa com um foco pesado em história e exploração. Jogadores assumir o controle de um pintor cuja única finalidade é a de terminar a sua Magnum Opus. O jogador deve navegar através de ambos uma mansão da era vitoriana em constante.");
		txtpnCamadasDeMedo.setBounds(128, 176, 280, 142);
		add(txtpnCamadasDeMedo);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(22, 351, 46, 14);
		add(lblPreo);
		
		txtR = new JTextField();
		txtR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtR.setHorizontalAlignment(SwingConstants.RIGHT);
		txtR.setEditable(false);
		txtR.setText("R$ 190,70");
		txtR.setBounds(128, 345, 193, 22);
		add(txtR);
		txtR.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\631510037\\Desktop\\530861 (1).jpg"));
		label.setBounds(418, 22, 502, 323);
		add(label);

	}
}
