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

public class Yahtzee {

	
	 boolean unlocked1 = true;
		boolean unlocked2 = true;
		boolean unlocked3 = true;
		boolean unlocked4 = true;
		boolean unlocked5 = true;
	
	protected Shell shell;

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
		label1.setBounds(339, 676, 19, 25);
		
		Label label2 = new Label(shell, SWT.NONE);
		label2.setText("0");
		label2.setBounds(379, 676, 19, 25);
		
		Label label3 = new Label(shell, SWT.NONE);
		label3.setText("0");
		label3.setBounds(422, 676, 19, 25);
		
		Label label4 = new Label(shell, SWT.NONE);
		label4.setText("0");
		label4.setBounds(468, 676, 19, 25);
		
		Label label5 = new Label(shell, SWT.NONE);
		label5.setText("0");
		label5.setBounds(510, 676, 19, 25);
		
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
		
		btnRoll.setBounds(188, 702, 91, 35);
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
		
	
		
		btnCheckButton.setBounds(339, 707, 19, 25);
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
		
		btnCheckButton1.setBounds(379, 707, 19, 25);
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
		btnCheckButton2.setBounds(422, 707, 19, 25);
		
		
		
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
		btnCheckButton3.setBounds(468, 707, 19, 25);
		
		
		
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
		btnCheckButton4.setBounds(510, 707, 19, 25);
		
		
		
		
		
		Label lblWelcomeToYahtzee = new Label(shell, SWT.NONE);
		lblWelcomeToYahtzee.setBounds(322, 10, 179, 25);
		lblWelcomeToYahtzee.setText("Welcome to Yahtzee!");
		

		
		
		
	
		
		
		/*
		*/

		
		
	}
	
	
}

