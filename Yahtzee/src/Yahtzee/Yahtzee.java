package Yahtzee;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

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
		shell.setText("SWT Application");

	}
	
	int value1;
	int value2;
	int value3;
	int value4;
	int value5;

	
	//value1 = (int)(6 * Math.random()) + 1;
	//Label lblNewLabel = new Label(shell, SWT.NONE);
	//lblNewLabel.setBounds(346, 681, 11, 25);
	//lblNewLabel.setText(value1 + " ");
	
	//value2 = (int)(6 * Math.random()) + 1;
	////Label label_20 = new Label(shell, SWT.NONE);
	//label_20.setText(value2+ " ");
	//label_20.setBounds(424, 681, 11, 25);
	
	
	//value3 = (int)(6 * Math.random()) + 1;
	//Label label_21 = new Label(shell, SWT.NONE);
	//label_21.setText(value3 + " ");
	//label_21.setBounds(499, 681, 11, 25);
	
	//value4 = (int)(6 * Math.random()) + 1;
	//Label label_22 = new Label(shell, SWT.NONE);
	//label_22.setText(value4 + " ");
	//label_22.setBounds(582, 681, 11, 25);
	
	
	//value5 = (int)(6 * Math.random()) + 1;
	//Label label_23 = new Label(shell, SWT.NONE);
	//label_23.setText(value5 + " ");
	//label_23.setBounds(661, 681, 11, 25);

}
