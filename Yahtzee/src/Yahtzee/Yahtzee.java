package Yahtzee;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Yahtzee {

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

		boolean unlocked1 = true;
		boolean unlocked2 = true;
		boolean unlocked3 = true;
		boolean unlocked4 = true;
		boolean unlocked5 = true;
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		Label label1 = new Label(shell, SWT.NONE);
		label1.setBounds(322, 666, 25, 25);
		
		Label label2 = new Label(shell, SWT.NONE);
		label2.setBounds(361, 666, 25, 25);
		
		Label label3 = new Label(shell, SWT.NONE);
		label3.setBounds(403, 666, 25, 25);
		
		Label label4 = new Label(shell, SWT.NONE);
		label4.setBounds(450, 666, 25, 25);
		
		Label label5 = new Label(shell, SWT.NONE);
		label5.setBounds(494, 666, 25, 25);
		
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
		
		
		
		btnRoll.setBounds(188, 702, 91, 35);
		btnRoll.setText("Roll");
		
		
		
		
		
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
		});
		
		
		btnCheckButton.setBounds(344, 707, 19, 25);
		btnCheckButton.setText("");
		
		Button btnCheckButton_1 = new Button(shell, SWT.CHECK);
		btnCheckButton_1.setBounds(386, 707, 19, 25);
		btnCheckButton_1.setText("");
		
		Button button = new Button(shell, SWT.CHECK);
		button.setText("");
		button.setBounds(422, 707, 19, 25);
		
		Button button_1 = new Button(shell, SWT.CHECK);
		button_1.setText("");
		button_1.setBounds(468, 707, 19, 25);
		
		Button button_2 = new Button(shell, SWT.CHECK);
		button_2.setText("");
		button_2.setBounds(510, 707, 19, 25);
		
		
		Label lblWelcomeToYahtzee = new Label(shell, SWT.NONE);
		lblWelcomeToYahtzee.setBounds(322, 10, 179, 25);
		lblWelcomeToYahtzee.setText("Welcome to Yahtzee!");
		

		
		
		
	
		
		
		/*
		*/

		
		
	}
	
	
}

