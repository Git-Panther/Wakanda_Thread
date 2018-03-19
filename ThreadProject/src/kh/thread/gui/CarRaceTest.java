package kh.thread.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarRaceTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7656103699065658025L;

	private JLabel[] labels = new JLabel[3];
	
	public CarRaceTest() {
		super("자동차");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		setResizable(false);
		setLayout(null);
		
		for(int index = 0; index < labels.length; index++) {
			labels[index] = new JLabel();
			labels[index].setIcon(new ImageIcon("images/race/car" + (index + 1) + ".gif"));
			labels[index].setBounds(100, (index + 1) * 100, 100, 100);
			add(labels[index]);
		}
		
		setVisible(true);
		new CarRaceThread().start();
	}
	
	class CarRaceThread extends Thread{
		
		@Override
		public void run() {
			int distance = 0;
			// TODO Auto-generated method stub
			for(int i = 0 ; i < 200 ; i++){			
				try{
					Thread.sleep(100); // 0.1초 간격
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				for(int index = 0; index < labels.length; index++) {
					distance = (int)(Math.random() * 10) + 1;
					labels[index].setBounds(labels[index].getLocation().x + distance, labels[index].getLocation().y, 100, 100);
				}	
			}
			
		}
	}
	
}
