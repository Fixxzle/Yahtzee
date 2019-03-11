package Yahtzee;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Yahtzee {


  //checkBonusUnlocked checks whether or not you are eligible for a bonus
  boolean checkBonusUnlocked = true;


  //the amount of times you've rolled
  int rollCount = 0;



  //what round the user is on
  int roundNumber = 0;


  protected Shell shell;

  // Declaration of text fields where user will enter data
  public Text yahtzee;
  public Text chance;
  public Text lgStr;
  public Text smStr;
  public Text boat;
  public Text fourOfAKind;
  public Text threeOfAKind;
  public Text sixes;
  public Text fives;
  public Text fours;
  public Text threes;
  public Text twos;
  public Text ones;
  public Text bonusYahtzee;

  /**
* Launch the application.
*  
* @param args Y 
*/

  void main(final String[] args) {
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





    //FIX ME: MENU 
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
    lblRollCount.setBounds(809, 10, 32, 25);
    lblRollCount.setText("0");

    //round Number label
    Label lblRoundNumber = new Label(shell, SWT.NONE);
    lblRoundNumber.setText("0");
    lblRoundNumber.setBounds(809, 41, 32, 25);

    //initialize the button that rolls the die
    Button btnRoll = new Button(shell, SWT.NONE);

    Button cb1 = new Button(shell, SWT.CHECK);
    Button cb2 = new Button(shell, SWT.CHECK);
    Button cb3 = new Button(shell, SWT.CHECK);
    Button cb4 = new Button(shell, SWT.CHECK);
    Button cb5 = new Button(shell, SWT.CHECK);

    btnRoll.addMouseListener(new MouseAdapter() {
      // this is the logic for the die, randomly gives the labels a value from 1-6
      @Override
//Initialization of the buttons for the die 


public void mouseUp(final MouseEvent e) {
        if (cb1.getSelection() == false) {
          lblDie1.setText(((int) (6 * Math.random()) + 1) + "");
        }
        if (cb2.getSelection() == false) {
          lblDie2.setText(((int) (6 * Math.random()) + 1) + "");
        }
        if (cb3.getSelection() == false) {
          lblDie3.setText(((int) (6 * Math.random()) + 1) + "");
        }
        if (cb4.getSelection() == false) {
          lblDie4.setText(((int) (6 * Math.random()) + 1) + "");
        }
        if (cb5.getSelection() == false) {
          lblDie5.setText(((int) (6 * Math.random()) + 1) + "");
        }



        rollCount++;


        //FIX ME: Add logic to now allow user to roll  no more than twice in one round, but if the

        if (rollCount == 1) { 

          String rollCountString = Integer.toString(rollCount);
          lblRollCount.setText(rollCountString);
        } else if (rollCount == 2) { 

          rollCount = 2;


          String rollCountString = Integer.toString(rollCount);
          lblRollCount.setText(rollCountString);

        } else if (rollCount > 2) {
          //FIX ME: Display error on screen
          System.out.println("Please enter data and press new Round!");
        }


        }
    });
    btnRoll.setBounds(809, 81, 91, 35);
    btnRoll.setText("Roll");

    cb1.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent event) {

        }
    });
    cb1.setBounds(699, 180, 19, 25);
    cb1.setText("");

    cb2.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent event) {
        }
    });

    cb2.setBounds(738, 180, 19, 25);
    cb2.setText("");

    cb3.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent event) {
        }
    });
    cb3.setText("");
    cb3.setBounds(779, 180, 19, 25);

    cb4.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent event) {
        }
    });
    cb4.setText("");
    cb4.setBounds(822, 180, 19, 25);

    cb5.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent event) {
        }
    });

    cb5.setText("");
    cb5.setBounds(863, 180, 19, 25);

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

    Label lblBy = new Label(shell, SWT.NONE);
    lblBy.setBounds(346, 413, 122, 25);
    lblBy.setText("Bonus Yahtzee");

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

    Label label1 = new Label(shell, SWT.NONE);
    label1.setText("Add Total");
    label1.setBounds(467, 137, 81, 25);

    Label label2 = new Label(shell, SWT.NONE);
    label2.setBounds(482, 180, 81, 25);
    label2.setText("25");

    Label label3 = new Label(shell, SWT.NONE);
    label3.setBounds(482, 227, 81, 25);
    label3.setText("30");

    Label label4 = new Label(shell, SWT.NONE);
    label4.setBounds(482, 275, 81, 25);
    label4.setText("40");

    Label label5 = new Label(shell, SWT.NONE);
    label5.setBounds(482, 320, 81, 25);
    label5.setText("50");

    Label label6 = new Label(shell, SWT.NONE);
    label6.setText("Add Total");
    label6.setBounds(467, 366, 81, 25);

    Label lblPer = new Label(shell, SWT.NONE);
    lblPer.setBounds(474, 413, 81, 25);
    lblPer.setText("100 per");

    Label label7 = new Label(shell, SWT.NONE);
    label7.setText("Scoring");
    label7.setBounds(467, 55, 81, 25);

    Label lblRollNumber = new Label(shell, SWT.NONE);
    lblRollNumber.setBounds(665, 10, 122, 25);
    lblRollNumber.setText("Roll Number:");
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
public void widgetSelected(final SelectionEvent e) {


        //change all of the strings into integers
        int onesValue = Integer.parseInt(ones.getText().toString());
        int twosValue = Integer.parseInt(twos.getText().toString());
        int threesValue = Integer.parseInt(threes.getText().toString());
        int foursValue = Integer.parseInt(fours.getText().toString());
        int fivesValue = Integer.parseInt(fives.getText().toString());
        int sixesValue = Integer.parseInt(sixes.getText().toString());

        //adds all the integers
        int checkBonusValue = onesValue + twosValue + threesValue + foursValue 
            + fivesValue + sixesValue;

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
public void widgetSelected(final SelectionEvent e) {

        //change all of the users strings into integers
        int onesValue = Integer.parseInt(ones.getText().toString());
        int twosValue = Integer.parseInt(twos.getText().toString());
        int threesValue = Integer.parseInt(threes.getText().toString());
        int foursValue = Integer.parseInt(fours.getText().toString());
        int fivesValue = Integer.parseInt(fives.getText().toString());
        int sixesValue = Integer.parseInt(sixes.getText().toString());

        //adds all of the integers to see if you are eligible for a bonus
        int checkBonusValue = onesValue + twosValue 
            + threesValue + foursValue + fivesValue + sixesValue;

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
public void widgetSelected(final SelectionEvent e) {

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
        int rightTotal = threeKindValue + fourKindValue + boatValue + smStrValue 
            + lgStrValue + yahtzeeValue
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

    //FIX ME: Make leftTotal and rightTotal global variable so you do not 
    //have to reiterate everything here
    //logic to show the value of the whole score card
    Button grandAdd = new Button(shell, SWT.NONE);
    grandAdd.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent e) {

        int onesValue = Integer.parseInt(ones.getText().toString());
        int twosValue = Integer.parseInt(twos.getText().toString());
        int threesValue = Integer.parseInt(threes.getText().toString());
        int foursValue = Integer.parseInt(fours.getText().toString());
        int fivesValue = Integer.parseInt(fives.getText().toString());
        int sixesValue = Integer.parseInt(sixes.getText().toString());
        int checkBonusValue = onesValue + twosValue 
            + threesValue + foursValue + fivesValue + sixesValue;
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
        int rightTotal = threeKindValue + fourKindValue + boatValue 
            + smStrValue + lgStrValue + yahtzeeValue
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


    Button btnNewRoll = new Button(shell, SWT.NONE);

    btnNewRoll.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent e) {
        roundNumber++;
        rollCount = 0;

        String rollCountString = Integer.toString(rollCount);
        lblRollCount.setText(rollCountString);

        if (cb1.getSelection() == true || cb2.getSelection() == true || cb3.getSelection() == true 
            || cb4.getSelection() == true || cb5.getSelection() == true) {
          cb1.setSelection(false);
          cb2.setSelection(false);
          cb3.setSelection(false);
          cb4.setSelection(false);
          cb5.setSelection(false);
        }
        lblDie1.setText(((int) (6 * Math.random()) + 1) + "");
        lblDie2.setText(((int) (6 * Math.random()) + 1) + "");
        lblDie3.setText(((int) (6 * Math.random()) + 1) + "");
        lblDie4.setText(((int) (6 * Math.random()) + 1) + "");
        lblDie5.setText(((int) (6 * Math.random()) + 1) + "");
        String roundNumberString = Integer.toString(roundNumber);
        lblRoundNumber.setText(roundNumberString);
        }
    });

    btnNewRoll.setText("New Round");
    btnNewRoll.setBounds(689, 81, 98, 35);

    Label lblRn = new Label(shell, SWT.NONE);
    lblRn.setBounds(665, 41, 133, 25);
    lblRn.setText("Round Number:");
    Button btnNewGame = new Button(shell, SWT.NONE);

    btnNewGame.addSelectionListener(new SelectionAdapter() {
      @Override
public void widgetSelected(final SelectionEvent e) {
        yahtzee.setText("");
        chance.setText("");
        lgStr.setText(""); 
        smStr.setText(""); 
        boat.setText(""); 
        fourOfAKind.setText(""); 
        threeOfAKind.setText(""); 
        sixes.setText(""); 
        fives.setText(""); 
        fours.setText(""); 
        threes.setText(""); 
        twos.setText("");
        ones.setText("");
        bonusYahtzee.setText("");
        checkBonus.setText("0");
        lblLeftTotalValue.setText("0");
        lblRightTotalValue.setText("0");
        lblGrandTotalValue.setText("0");
        lblRollCount.setText("0");
        lblRoundNumber.setText("0");
        lblDie1.setText("0");
        lblDie2.setText("0");
        lblDie3.setText("0");
        lblDie4.setText("0");
        lblDie5.setText("0");
        }
    });
    btnNewGame.setBounds(759, 524, 105, 35);
    btnNewGame.setText("New Game");

  }
}
