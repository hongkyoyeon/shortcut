
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class imageicon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imageicon frame = new imageicon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public imageicon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uBC84\uC2A4\uC815\uB958\uC7A51");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\\uC7AC\uC2E0\\bus.jpg"));
		btnNewButton.setBounds(217, 48, 594, 419);
		panel.add(btnNewButton);
		btnNewButton.setPreferredSize(new Dimension(200,50));
		btnNewButton.setToolTipText(" 3분 뒤 1030 번 버스 도착!"
				+ "5분 뒤 2000 번 버스 도착!\t"
				+ "10분뒤 3000번 버스 도착!\t");
	}
}
