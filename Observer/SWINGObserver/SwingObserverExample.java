import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JButton btn = new JButton("Should I do it?");

	public static void main(String[] args) {
		new SwingObserverExample();
	}

	public SwingObserverExample() {
		JFrame frm = new JFrame("Angels and Devils");
		frm.setSize(260, 200);
		frm.add(btn);
		// ===============================================
		// OBSERVER PATTERN IN ACTION!!!
		// Approach with seperate classes for the actions
		// btn.addActionListener(new Angel());
		// btn.addActionListener(new Devil());

		// using lambdas
		btn.addActionListener(event -> {
			System.out.println("Do it!");
		});
		btn.addActionListener(event -> {
			System.out.println("Don't it!");
		});

		// ===============================================

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

	class Angel implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Do it!");
		}
	}

	class Devil implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it!!!");
		}
	}
}
