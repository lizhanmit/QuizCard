package test;

import java.awt.event.*;

import javax.swing.*;

public class QuizCardInterface {

	private JFrame frame;
	private JPanel mainPanel;
	
	public static void main(String[] args) {
		QuizCardInterface quizCardInterface = new QuizCardInterface();
		quizCardInterface.buildGUI();
	}

	private void buildGUI() {
		frame = new JFrame("Quiz Card App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		
		JButton builderButton = new JButton("Quiz Card Builder");
		builderButton.addActionListener(new BuilderButtonListener());
        buttonBox.add(builderButton);    
        
        JButton readerButton = new JButton("Quiz Card Reader");
        readerButton.addActionListener(new ReaderButtonListener());
        buttonBox.add(readerButton); 
        
        mainPanel.add(builderButton);
        mainPanel.add(readerButton);
        
        frame.getContentPane().add(mainPanel);
        
        frame.setBounds(50,50,300,300);
        frame.pack();
        frame.setVisible(true);
	}

	public class BuilderButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			QuizCardBuilder builder = new QuizCardBuilder();
			builder.go();
        }
	}
	
	public class ReaderButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			QuizCardReader reader = new QuizCardReader();
			reader.go();
        }
	}
}
