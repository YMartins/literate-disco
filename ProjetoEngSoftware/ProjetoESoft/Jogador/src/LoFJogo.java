import java.awt.EventQueue;

import javax.swing.JFrame;


public class LoFJogo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoFJogo window = new LoFJogo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoFJogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		CJogador p = new CJogador();
		frame.getContentPane().add(p);
		
		frame.setBounds(100, 100, 948, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
