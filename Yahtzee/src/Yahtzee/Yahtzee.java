package Yahtzee;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.events.TouchListener;
//import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class Yahtzee {

	
	 boolean unlocked1 = true;
		boolean unlocked2 = true;
		boolean unlocked3 = true;
		boolean unlocked4 = true;
		boolean unlocked5 = true;
	
	protected Shell shell;
	private Text text_4;
	private Text text_1;
	private Text text;
	private Text text_2;
	private Text text_3;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Text text_15;
	private Text text_16;
	private Text text_17;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Yahtzee window = new Yahtzee();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(900, 900);
		shell.setText("Yahtzee");

	   
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		Label label1 = new Label(shell, SWT.NONE);
		label1.setText("0");
		label1.setBounds(616, 676, 19, 25);
		
		Label label2 = new Label(shell, SWT.NONE);
		label2.setText("0");
		label2.setBounds(655, 676, 19, 25);
		
		Label label3 = new Label(shell, SWT.NONE);
		label3.setText("0");
		label3.setBounds(691, 676, 19, 25);
		
		Label label4 = new Label(shell, SWT.NONE);
		label4.setText("0");
		label4.setBounds(729, 676, 19, 25);
		
		Label label5 = new Label(shell, SWT.NONE);
		label5.setText("0");
		label5.setBounds(770, 676, 19, 25);
		
		Button btnRoll = new Button(shell, SWT.NONE);
		
		
		btnRoll.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mouseUp(MouseEvent e) {
				if (unlocked1) {
					label1.setText(((int)(6 * Math.random()) + 1)+ "");
				}
				if (unlocked2) {
					label2.setText(((int)(6 * Math.random()) + 1)+ "");
				}
				if (unlocked3) {
					label3.setText(((int)(6 * Math.random()) + 1)+ "");
				}
				if (unlocked4) {
					label4.setText(((int)(6 * Math.random()) + 1)+ "");
				}
				if (unlocked5) {
					label5.setText(((int)(6 * Math.random()) + 1)+ "");
				}
				
				
			}
		});
		
		//buttons
		
		btnRoll.setBounds(497, 707, 91, 35);
		btnRoll.setText("Roll");
		
		
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton = (Button) event.getSource();
				if(btnCheckButton.getSelection() == true) {
					
				unlocked1 = false;
				}else{
					unlocked1 = true;
				}
			}
		});
		
	
		
		btnCheckButton.setBounds(616, 712, 19, 25);
		btnCheckButton.setText("");
		
		Button btnCheckButton1 = new Button(shell, SWT.CHECK);
		btnCheckButton1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton1 = (Button) event.getSource();
				if(btnCheckButton1.getSelection() == true) {
					
				unlocked2 = false;
				}else{
					unlocked2 = true;
				}
			}
		});
		
		btnCheckButton1.setBounds(655, 712, 19, 25);
		btnCheckButton1.setText("");
		
		
		
		
		Button btnCheckButton2 = new Button(shell, SWT.CHECK);
		btnCheckButton2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton2 = (Button) event.getSource();
				if(btnCheckButton2.getSelection() == true) {
					
				unlocked3 = false;
				}else{
					unlocked3 = true;
				}
			}
		});
		btnCheckButton2.setText("");
		btnCheckButton2.setBounds(691, 712, 19, 25);
		
		
		
		Button btnCheckButton3 = new Button(shell, SWT.CHECK);
		btnCheckButton3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton3 = (Button) event.getSource();
				if(btnCheckButton3.getSelection() == true) {
					
				unlocked4 = false;
				}else{
					unlocked4 = true;
				}
			}
		});
		
		btnCheckButton3.setText("");
		btnCheckButton3.setBounds(729, 712, 19, 25);
		
		
		
		Button btnCheckButton4 = new Button(shell, SWT.CHECK);
		btnCheckButton4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton4 = (Button) event.getSource();
				if(btnCheckButton4.getSelection() == true) {
					
				unlocked5 = false;
				}else{
					unlocked5 = true;
				}
			}
		});
		
		btnCheckButton4.setText("");
		btnCheckButton4.setBounds(770, 712, 19, 25);
		
		
		
		
		
		Label lblWelcomeToYahtzee = new Label(shell, SWT.NONE);
		lblWelcomeToYahtzee.setBounds(322, 10, 179, 25);
		lblWelcomeToYahtzee.setText("Welcome to Yahtzee!");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 44, 81, 25);
		lblNewLabel.setText("Ones");
		
		Label label = new Label(shell, SWT.NONE);
		label.setText("Twos");
		label.setBounds(10, 75, 81, 25);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("Threes");
		label_1.setBounds(10, 110, 81, 25);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("Fours");
		label_2.setBounds(10, 151, 81, 25);
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText("Fives");
		label_3.setBounds(10, 195, 81, 25);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("Sixes");
		label_4.setBounds(10, 235, 81, 25);
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("Bonus");
		label_5.setBounds(10, 275, 81, 25);
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("Total");
		label_6.setBounds(10, 327, 81, 25);
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setText("3 of a Kind");
		label_7.setBounds(10, 399, 98, 25);
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setText("4 of a King");
		label_8.setBounds(10, 442, 98, 25);
		
		Label label_9 = new Label(shell, SWT.NONE);
		label_9.setText("Full House");
		label_9.setBounds(10, 489, 98, 25);
		
		Label label_10 = new Label(shell, SWT.NONE);
		label_10.setText("Sm Straight");
		label_10.setBounds(10, 533, 98, 25);
		
		Label label_11 = new Label(shell, SWT.NONE);
		label_11.setText("Lg Straight");
		label_11.setBounds(10, 574, 98, 25);
		
		Label label_12 = new Label(shell, SWT.NONE);
		label_12.setText("YAHTZEE");
		label_12.setBounds(10, 620, 81, 25);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 664, 122, 25);
		lblNewLabel_1.setText("Bonus Yahtzee");
		
		Label label_13 = new Label(shell, SWT.NONE);
		label_13.setText("Top Total");
		label_13.setBounds(10, 707, 98, 25);
		
		Label label_14 = new Label(shell, SWT.NONE);
		label_14.setText("Bottom Total");
		label_14.setBounds(10, 738, 122, 25);
		
		Label label_15 = new Label(shell, SWT.NONE);
		label_15.setText("Total");
		label_15.setBounds(10, 779, 109, 25);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(135, 620, 80, 25);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(135, 743, 80, 25);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(135, 779, 80, 25);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(135, 707, 80, 25);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(135, 664, 80, 25);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(135, 574, 80, 25);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setBounds(135, 533, 80, 25);
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setBounds(135, 489, 80, 25);
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setBounds(135, 442, 80, 25);
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setBounds(135, 399, 80, 25);
		
		text_10 = new Text(shell, SWT.BORDER);
		text_10.setBounds(135, 327, 80, 25);
		
		text_11 = new Text(shell, SWT.BORDER);
		text_11.setBounds(135, 275, 80, 25);
		
		text_12 = new Text(shell, SWT.BORDER);
		text_12.setBounds(135, 235, 80, 25);
		
		text_13 = new Text(shell, SWT.BORDER);
		text_13.setBounds(135, 195, 80, 25);
		
		text_14 = new Text(shell, SWT.BORDER);
		text_14.setBounds(135, 151, 80, 25);
		
		text_15 = new Text(shell, SWT.BORDER);
		text_15.setBounds(135, 110, 80, 25);
		
		text_16 = new Text(shell, SWT.BORDER);
		text_16.setBounds(135, 75, 80, 25);
		
		text_17 = new Text(shell, SWT.BORDER);
		text_17.setBounds(135, 44, 80, 25);
		

		
		
		
	
		
		
		/*
		*/

		
		
	}
}

