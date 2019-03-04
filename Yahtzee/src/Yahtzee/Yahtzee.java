package Yahtzee;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class Yahtzee {

	
	
	final int highscore = 209; //i love you Dana
	
	 	boolean unlocked1 = true;
		boolean unlocked2 = true;
		boolean unlocked3 = true;
		boolean unlocked4 = true;
		boolean unlocked5 = true;
	
	protected Shell shell;
	
	
	private Text text,text_1,text_2,text_4,text_3,text_5,text_6 ,text_7,text_8,text_9,text_10,text_11,text_12,text_13,text_14 ,text_15,text_16,text_17,text_18;
	 

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
		
		Label lblOnes = new Label(shell, SWT.NONE);
		lblOnes.setBounds(10, 44, 81, 25);
		lblOnes.setText("Ones");
		
		Label lblTwos = new Label(shell, SWT.NONE);
		lblTwos.setText("Twos");
		lblTwos.setBounds(10, 75, 81, 25);
		
		Label lblThrees = new Label(shell, SWT.NONE);
		lblThrees.setText("Threes");
		lblThrees.setBounds(10, 110, 81, 25);
		
		Label lblFours = new Label(shell, SWT.NONE);
		lblFours.setText("Fours");
		lblFours.setBounds(10, 151, 81, 25);
		
		Label lblFives = new Label(shell, SWT.NONE);
		lblFives.setText("Fives");
		lblFives.setBounds(10, 195, 81, 25);
		
		Label lblSixes = new Label(shell, SWT.NONE);
		lblSixes.setText("Sixes");
		lblSixes.setBounds(10, 235, 81, 25);
		
		Label lblBonus = new Label(shell, SWT.NONE);
		lblBonus.setText("Bonus");
		lblBonus.setBounds(10, 275, 81, 25);
		
		Label lblTopTotal = new Label(shell, SWT.NONE);
		lblTopTotal.setText("Total");
		lblTopTotal.setBounds(10, 327, 81, 25);
		
		Label lbl3ofKind = new Label(shell, SWT.NONE);
		lbl3ofKind.setText("3 of a Kind");
		lbl3ofKind.setBounds(10, 374, 122, 25);
		
		Label lbl4ofKind = new Label(shell, SWT.NONE);
		lbl4ofKind.setText("4 of a King");
		lbl4ofKind.setBounds(10, 408, 122, 25);
		
		Label lblBoat = new Label(shell, SWT.NONE);
		lblBoat.setText("Full House");
		lblBoat.setBounds(10, 439, 122, 25);
		
		Label lblSmStr = new Label(shell, SWT.NONE);
		lblSmStr.setText("Sm Straight");
		lblSmStr.setBounds(10, 470, 122, 25);
		
		Label lblLgStr = new Label(shell, SWT.NONE);
		lblLgStr.setText("Lg Straight");
		lblLgStr.setBounds(10, 501, 122, 25);
		
		Label lblYahtzee = new Label(shell, SWT.NONE);
		lblYahtzee.setText("YAHTZEE");
		lblYahtzee.setBounds(10, 545, 81, 25);
		
		Label lblBY = new Label(shell, SWT.NONE);
		lblBY.setBounds(10, 578, 122, 25);
		lblBY.setText("Bonus Yahtzee");
	
		//didn't need to create top total
		lblTopTotal.setText("Top Total");
		lblTopTotal.setBounds(10, 712, 98, 25);
		
		Label lblBottomTotal = new Label(shell, SWT.NONE);
		lblBottomTotal.setText("Bottom Total");
		lblBottomTotal.setBounds(10, 738, 122, 25);
		
		Label lblTotal = new Label(shell, SWT.NONE);
		lblTotal.setText("Total");
		lblTotal.setBounds(10, 779, 109, 25);
		
		Label lblChance = new Label(shell, SWT.NONE);
		lblChance.setBounds(10, 635, 81, 25);
		lblChance.setText("Chance");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(135, 545, 80, 25);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(135, 743, 80, 25);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(135, 779, 80, 25);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(135, 707, 80, 25);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(135, 578, 80, 25);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(135, 501, 80, 25);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setBounds(135, 470, 80, 25);
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setBounds(135, 439, 80, 25);
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setBounds(135, 408, 80, 25);
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setBounds(135, 374, 80, 25);
		
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
		text_17.setBounds(135, 41, 80, 25);
		
		text_18 = new Text(shell, SWT.BORDER);
		text_18.setBounds(135, 635, 80, 25);
		
		
		

		
		
		
	
		
		
		/*
		*/

		
		
	}
}

