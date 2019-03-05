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


	//Unlocked 1-5 control whether the check buttons are checked
	boolean unlocked1 = true;
	boolean unlocked2 = true;
	boolean unlocked3 = true;
	boolean unlocked4 = true;
	boolean unlocked5 = true;
	
	//checkBonusUnlocked checks whether or not you are eligible for a bonus
	boolean checkBonusUnlocked = true;
	
	//FIX ME: rollCount will display the amount of times you've rolled
	int rollcount = 0;
	
	//FIX ME: roundNumber will tell you what round you are on
	// big logic here
	int roundNumber;
	


	protected Shell shell;

	// Declaration of text fields where user will enter data
	private Text yahtzee, chance, lgStr, smStr, boat, fourOfAKind, threeOfAKind, sixes, fives, fours, threes, twos,
			ones, bonusYahtzee;

	/**
	 * Launch the application.
	 * 
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
		shell.setSize(980, 682);
		shell.setText("Yahtzee");

		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		
		//first die
		Label lblDie1 = new Label(shell, SWT.NONE);
		lblDie1.setText("0");
		lblDie1.setBounds(699, 137, 19, 25);

		
		//second die
		Label lblDie2 = new Label(shell, SWT.NONE);
		lblDie2.setText("0");
		lblDie2.setBounds(738, 137, 19, 25);

		//third die
		Label lblDie3 = new Label(shell, SWT.NONE);
		lblDie3.setText("0");
		lblDie3.setBounds(779, 137, 19, 25);

		//fourth die
		Label lblDie4 = new Label(shell, SWT.NONE);
		lblDie4.setText("0");
		lblDie4.setBounds(822, 137, 19, 25);

		//fifth die
		Label lblDie5 = new Label(shell, SWT.NONE);
		lblDie5.setText("0");
		lblDie5.setBounds(863, 137, 19, 25);

		//roll count label
		Label lblRollCount = new Label(shell, SWT.NONE);
		lblRollCount.setBounds(793, 10, 32, 25);
		lblRollCount.setText("0");

		//initialize the button that rolls the die
		Button btnRoll = new Button(shell, SWT.NONE);

		btnRoll.addMouseListener(new MouseAdapter() {

			// this is the logic for the die, randomly gives the labels a value from 1-6
			@Override
			public void mouseUp(MouseEvent e) {
				if (unlocked1) {
					lblDie1.setText(((int) (6 * Math.random()) + 1) + "");
				}
				if (unlocked2) {
					lblDie2.setText(((int) (6 * Math.random()) + 1) + "");
				}
				if (unlocked3) {
					lblDie3.setText(((int) (6 * Math.random()) + 1) + "");
				}
				if (unlocked4) {
					lblDie4.setText(((int) (6 * Math.random()) + 1) + "");
				}
				if (unlocked5) {
					lblDie5.setText(((int) (6 * Math.random()) + 1) + "");
				}
				if (rollcount < 14) {
					lblRollCount.setText(rollcount++ + "");

				}

			}
		});

		btnRoll.setBounds(750, 81, 91, 35);
		btnRoll.setText("Roll");

		//initializing check button
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton = (Button) event.getSource();
				if (btnCheckButton.getSelection() == true) {

					unlocked1 = false;
				} else {
					unlocked1 = true;
				}
			}
		});

		btnCheckButton.setBounds(699, 180, 19, 25);
		btnCheckButton.setText("");

		//initializing check button
		Button btnCheckButton1 = new Button(shell, SWT.CHECK);
		btnCheckButton1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton1 = (Button) event.getSource();
				if (btnCheckButton1.getSelection() == true) {

					unlocked2 = false;
				} else {
					unlocked2 = true;
				}
			}
		});

		btnCheckButton1.setBounds(738, 180, 19, 25);
		btnCheckButton1.setText("");

		//initializing check button
		Button btnCheckButton2 = new Button(shell, SWT.CHECK);
		btnCheckButton2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton2 = (Button) event.getSource();
				if (btnCheckButton2.getSelection() == true) {

					unlocked3 = false;
				} else {
					unlocked3 = true;
				}
			}
		});
		btnCheckButton2.setText("");
		btnCheckButton2.setBounds(779, 180, 19, 25);

		//initializing check button
		Button btnCheckButton3 = new Button(shell, SWT.CHECK);
		btnCheckButton3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton3 = (Button) event.getSource();
				if (btnCheckButton3.getSelection() == true) {

					unlocked4 = false;
				} else {
					unlocked4 = true;
				}
			}
		});

		btnCheckButton3.setText("");
		btnCheckButton3.setBounds(822, 180, 19, 25);

		//initializing check button
		Button btnCheckButton4 = new Button(shell, SWT.CHECK);
		btnCheckButton4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btnCheckButton4 = (Button) event.getSource();
				if (btnCheckButton4.getSelection() == true) {

					unlocked5 = false;
				} else {
					unlocked5 = true;
				}
			}
		});

		btnCheckButton4.setText("");
		btnCheckButton4.setBounds(863, 180, 19, 25);

		
		
		//welcome label
		Label lblWelcomeToYahtzee = new Label(shell, SWT.NONE);
		lblWelcomeToYahtzee.setBounds(322, 10, 179, 25);
		lblWelcomeToYahtzee.setText("Welcome to Yahtzee!");

		//the following are labels for the score sheet, will end with ..
		Label lblOnes = new Label(shell, SWT.NONE);
		lblOnes.setBounds(10, 86, 81, 25);
		lblOnes.setText("Ones");

		Label lblTwos = new Label(shell, SWT.NONE);
		lblTwos.setText("Twos");
		lblTwos.setBounds(10, 137, 81, 25);

		Label lblThrees = new Label(shell, SWT.NONE);
		lblThrees.setText("Threes");
		lblThrees.setBounds(10, 180, 81, 25);

		Label lblFours = new Label(shell, SWT.NONE);
		lblFours.setText("Fours");
		lblFours.setBounds(10, 227, 81, 25);

		Label lblFives = new Label(shell, SWT.NONE);
		lblFives.setText("Fives");
		lblFives.setBounds(10, 275, 81, 25);

		Label lblSixes = new Label(shell, SWT.NONE);
		lblSixes.setText("Sixes");
		lblSixes.setBounds(10, 320, 81, 25);

		Label lblBonus = new Label(shell, SWT.NONE);
		lblBonus.setText("Bonus");
		lblBonus.setBounds(10, 366, 81, 25);

		Label lbl3ofKind = new Label(shell, SWT.NONE);
		lbl3ofKind.setText("3 of a Kind");
		lbl3ofKind.setBounds(346, 86, 98, 25);

		Label lbl4ofKind = new Label(shell, SWT.NONE);
		lbl4ofKind.setText("4 of a Kind");
		lbl4ofKind.setBounds(346, 137, 98, 25);

		Label lblBoat = new Label(shell, SWT.NONE);
		lblBoat.setText("Full House");
		lblBoat.setBounds(346, 180, 98, 25);

		Label lblsmStr = new Label(shell, SWT.NONE);
		lblsmStr.setText("Sm Straight");
		lblsmStr.setBounds(346, 227, 98, 25);

		Label lbllgStr = new Label(shell, SWT.NONE);
		lbllgStr.setText("Lg Straight");
		lbllgStr.setBounds(346, 275, 91, 25);

		Label lblYahtzee = new Label(shell, SWT.NONE);
		lblYahtzee.setText("YAHTZEE");
		lblYahtzee.setBounds(346, 320, 81, 25);

		Label lblBY = new Label(shell, SWT.NONE);
		lblBY.setBounds(346, 413, 122, 25);
		lblBY.setText("Bonus Yahtzee");

		Label lblRigthTotal = new Label(shell, SWT.NONE);
		lblRigthTotal.setText("Right Total");
		lblRigthTotal.setBounds(346, 445, 122, 25);

		Label lblTotal = new Label(shell, SWT.NONE);
		lblTotal.setText("Grand Total");
		lblTotal.setBounds(221, 489, 95, 25);

		Label lblChance = new Label(shell, SWT.NONE);
		lblChance.setBounds(346, 366, 91, 25);
		lblChance.setText("Chance");

		Label lblTopSection = new Label(shell, SWT.NONE);
		lblTopSection.setBounds(10, 10, 109, 25);
		lblTopSection.setText("Top Section");

		Label lblLeftTotal = new Label(shell, SWT.NONE);
		lblLeftTotal.setBounds(10, 445, 81, 25);
		lblLeftTotal.setText("Left Total");

		Label lblScoring = new Label(shell, SWT.NONE);
		lblScoring.setBounds(125, 10, 81, 25);
		lblScoring.setText("Scoring");

		Label lblCountAndAdd = new Label(shell, SWT.NONE);
		lblCountAndAdd.setBounds(83, 55, 126, 25);
		lblCountAndAdd.setText("Count and Add");

		Label lblOnlyOnes = new Label(shell, SWT.NONE);
		lblOnlyOnes.setBounds(97, 86, 91, 25);
		lblOnlyOnes.setText("Only Ones");

		Label lblOnlyTwos = new Label(shell, SWT.NONE);
		lblOnlyTwos.setBounds(97, 137, 81, 25);
		lblOnlyTwos.setText("Only Twos");

		Label lblOnlyThrees = new Label(shell, SWT.NONE);
		lblOnlyThrees.setBounds(97, 180, 109, 25);
		lblOnlyThrees.setText("Only Threes");

		Label lblOnlyFours = new Label(shell, SWT.NONE);
		lblOnlyFours.setBounds(97, 227, 109, 25);
		lblOnlyFours.setText("Only Fours");

		Label lblOnlyFives = new Label(shell, SWT.NONE);
		lblOnlyFives.setBounds(97, 275, 81, 25);
		lblOnlyFives.setText("Only Fives");

		Label lblOnlySixes = new Label(shell, SWT.NONE);
		lblOnlySixes.setBounds(97, 320, 81, 25);
		lblOnlySixes.setText("Only Sixes");

		Label lblIfScore = new Label(shell, SWT.NONE);
		lblIfScore.setBounds(10, 397, 126, 25);
		lblIfScore.setText("if Score > 62");

		Label label = new Label(shell, SWT.NONE);
		label.setBounds(97, 366, 32, 25);
		label.setText("35");

		Label lblAddTotal = new Label(shell, SWT.NONE);
		lblAddTotal.setBounds(467, 86, 81, 25);
		lblAddTotal.setText("Add Total");

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("Add Total");
		label_1.setBounds(467, 137, 81, 25);

		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(482, 180, 81, 25);
		label_2.setText("25");

		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBounds(482, 227, 81, 25);
		label_3.setText("30");

		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setBounds(482, 275, 81, 25);
		label_4.setText("40");

		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setBounds(482, 320, 81, 25);
		label_5.setText("50");

		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("Add Total");
		label_6.setBounds(467, 366, 81, 25);

		Label lblPer = new Label(shell, SWT.NONE);
		lblPer.setBounds(474, 413, 81, 25);
		lblPer.setText("100 per");

		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setText("Scoring");
		label_7.setBounds(467, 55, 81, 25);

		Label lblRoundsLeft = new Label(shell, SWT.NONE);
		lblRoundsLeft.setBounds(665, 10, 122, 25);
		lblRoundsLeft.setText("Rounds Left:");
		
		//..

		//the following are texts that set the bounds, ends at ..
		ones = new Text(shell, SWT.BORDER);
		ones.setBounds(240, 86, 80, 25);

		twos = new Text(shell, SWT.BORDER);
		twos.setBounds(240, 137, 80, 25);

		threes = new Text(shell, SWT.BORDER);
		threes.setBounds(240, 180, 80, 25);

		fours = new Text(shell, SWT.BORDER);
		fours.setBounds(240, 227, 80, 25);

		fives = new Text(shell, SWT.BORDER);
		fives.setBounds(240, 272, 80, 25);

		sixes = new Text(shell, SWT.BORDER);
		sixes.setBounds(240, 317, 80, 25);

		threeOfAKind = new Text(shell, SWT.BORDER);
		threeOfAKind.setBounds(579, 86, 80, 25);

		fourOfAKind = new Text(shell, SWT.BORDER);
		fourOfAKind.setBounds(579, 134, 80, 25);

		boat = new Text(shell, SWT.BORDER);
		boat.setBounds(579, 177, 80, 25);

		smStr = new Text(shell, SWT.BORDER);
		smStr.setBounds(579, 224, 80, 25);

		lgStr = new Text(shell, SWT.BORDER);
		lgStr.setBounds(579, 275, 80, 25);

		yahtzee = new Text(shell, SWT.BORDER);
		yahtzee.setBounds(579, 320, 80, 25);

		chance = new Text(shell, SWT.BORDER);
		chance.setBounds(579, 363, 80, 25);

		bonusYahtzee = new Text(shell, SWT.BORDER);
		bonusYahtzee.setBounds(579, 413, 80, 25);
		//..
	

		//initializing the label to be changed by the logic
		Label checkBonus = new Label(shell, SWT.NONE);
		checkBonus.setBounds(252, 366, 32, 25);
		checkBonus.setText("?");

		//logic for the button to tell whether or not you are eligible for a bonus
		Button btnCheck = new Button(shell, SWT.NONE);
		btnCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				//change all of the strings into integers
				int onesValue = Integer.parseInt(ones.getText().toString());
				int twosValue = Integer.parseInt(twos.getText().toString());
				int threesValue = Integer.parseInt(threes.getText().toString());
				int foursValue = Integer.parseInt(fours.getText().toString());
				int fivesValue = Integer.parseInt(fives.getText().toString());
				int sixesValue = Integer.parseInt(sixes.getText().toString());
				
				//adds all the integers
				int checkBonusValue = onesValue + twosValue + threesValue + foursValue + fivesValue + sixesValue;
				
				//loophole to display values with strings
				int thirtyFive = 35;
				int zeroValue = 0;

				//changing those integers into strings
				String thirtyFiveString = Integer.toString(thirtyFive);
				String zeroString = Integer.toString(zeroValue);

				//logic to tell what number to display to user when whether or not they got the bonus
				if (checkBonusValue > 62) {
					checkBonusUnlocked = true;
					checkBonus.setText(thirtyFiveString);

				} else {
					checkBonusUnlocked = false;
					checkBonus.setText(zeroString);
				}

			}
		});
		btnCheck.setBounds(150, 361, 59, 35);
		btnCheck.setText("Check");

		
		//initialize label for the left value that will be changed by the following logic
		Label lblLeftTotalValue = new Label(shell, SWT.NONE);
		lblLeftTotalValue.setBounds(252, 445, 57, 25);
		lblLeftTotalValue.setText("?");
		
		
		//logic to get the total of the left side of the score sheet
		Button leftAdd = new Button(shell, SWT.NONE);
		leftAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//change all of the users strings into integers
				int onesValue = Integer.parseInt(ones.getText().toString());
				int twosValue = Integer.parseInt(twos.getText().toString());
				int threesValue = Integer.parseInt(threes.getText().toString());
				int foursValue = Integer.parseInt(fours.getText().toString());
				int fivesValue = Integer.parseInt(fives.getText().toString());
				int sixesValue = Integer.parseInt(sixes.getText().toString());
				
				//adds all of the integers to see if you are eligible for a bonus
				int checkBonusValue = onesValue + twosValue + threesValue + foursValue + fivesValue + sixesValue;
				
				//initialize a local variable to store the left hand column
				int leftTotal = 0;
				
				//logic to change the value of the left total based upon whether or not the bonus was given
				if (checkBonusUnlocked == true) {
					checkBonusValue = checkBonusValue + 35;
					leftTotal = checkBonusValue;
				} else {
					leftTotal = checkBonusValue;
					lblLeftTotalValue.setText("0");
				}

				//changing the label using a string to display the value to the user
				String leftTotalString = Integer.toString(leftTotal);
				lblLeftTotalValue.setText(leftTotalString);

			}
		});
		leftAdd.setText("Add");
		leftAdd.setBounds(150, 440, 59, 35);

		
		//initialize the label for the right total that will be changed by the logic
		Label lblRightTotalValue = new Label(shell, SWT.NONE);
		lblRightTotalValue.setText("?");
		lblRightTotalValue.setBounds(590, 450, 57, 25);

		//the logic to change the total of the right column
		Button rightAdd = new Button(shell, SWT.NONE);
		rightAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				//changing all the string user input to integers to be added
				int threeKindValue = Integer.parseInt(threeOfAKind.getText().toString());
				int fourKindValue = Integer.parseInt(fourOfAKind.getText().toString());
				int boatValue = Integer.parseInt(boat.getText().toString());
				int smStrValue = Integer.parseInt(smStr.getText().toString());
				int lgStrValue = Integer.parseInt(lgStr.getText().toString());
				int yahtzeeValue = Integer.parseInt(yahtzee.getText().toString());
				int bonusYahtzeeValue = Integer.parseInt(bonusYahtzee.getText().toString());
				int chanceValue = Integer.parseInt(chance.getText().toString());
				
				//adding all the integers to form a right total
				int rightTotal = threeKindValue + fourKindValue + boatValue + smStrValue + lgStrValue + yahtzeeValue
						+ bonusYahtzeeValue + chanceValue;

				//converting the integers to a string so the label can be changed
				String rightTotalString = Integer.toString(rightTotal);
				lblRightTotalValue.setText(rightTotalString);

			}
		});
		rightAdd.setText("Add");
		rightAdd.setBounds(474, 445, 59, 35);

		//initialize label for the user to see the total value
		Label lblGrandTotalValue = new Label(shell, SWT.NONE);
		lblGrandTotalValue.setBounds(341, 489, 59, 25);
		lblGrandTotalValue.setText("?");

		
		
		//FIX ME: Make leftTotal and rightTotal global variable so you do not have to reiterate everything here
		
		//logic to show the value of the whole score card
		
		Button grandAdd = new Button(shell, SWT.NONE);
		grandAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int onesValue = Integer.parseInt(ones.getText().toString());
				int twosValue = Integer.parseInt(twos.getText().toString());
				int threesValue = Integer.parseInt(threes.getText().toString());
				int foursValue = Integer.parseInt(fours.getText().toString());
				int fivesValue = Integer.parseInt(fives.getText().toString());
				int sixesValue = Integer.parseInt(sixes.getText().toString());
				int checkBonusValue = onesValue + twosValue + threesValue + foursValue + fivesValue + sixesValue;
				int leftTotal = 0;

				if (checkBonusUnlocked == true) {
					checkBonusValue = checkBonusValue + 35;
					leftTotal = checkBonusValue;
				} else {
					leftTotal = checkBonusValue;
					lblLeftTotalValue.setText("0");
				}

				String leftTotalString = Integer.toString(leftTotal);
				lblLeftTotalValue.setText(leftTotalString);

				int threeKindValue = Integer.parseInt(threeOfAKind.getText().toString());
				int fourKindValue = Integer.parseInt(fourOfAKind.getText().toString());
				int boatValue = Integer.parseInt(boat.getText().toString());
				int smStrValue = Integer.parseInt(smStr.getText().toString());
				int lgStrValue = Integer.parseInt(lgStr.getText().toString());
				int yahtzeeValue = Integer.parseInt(yahtzee.getText().toString());
				int bonusYahtzeeValue = Integer.parseInt(bonusYahtzee.getText().toString());
				int chanceValue = Integer.parseInt(chance.getText().toString());
				int rightTotal = threeKindValue + fourKindValue + boatValue + smStrValue + lgStrValue + yahtzeeValue
						+ bonusYahtzeeValue + chanceValue;

				String rightTotalString = Integer.toString(rightTotal);
				lblRightTotalValue.setText(rightTotalString);

				int grandTotal = leftTotal + rightTotal; 
				
				String grandTotalString = Integer.toString(grandTotal);
				lblGrandTotalValue.setText(grandTotalString);
				
				
			}
		});
		grandAdd.setText("Add");
		grandAdd.setBounds(272, 524, 59, 35);

		/*
		*/

	}
}
