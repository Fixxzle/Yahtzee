/*
 * 
 */
package Test;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * The Class GUI.
 */
@SuppressWarnings("serial")
public class GUI extends JFrame {

	/** The content pane. */
	private JPanel contentPane;

	
	
	/** The roll. */
	Roll roll = new Roll();
	
	/** The top val. */
	TopValue topVal = new TopValue();
	
	/** The die val. */
	DieValue dieVal = new DieValue();
	
	/** The bottom val. */
	BottomValue bottomVal = new BottomValue();
	
	/** The reset. */
	Reset reset = new Reset();
	

	


	
	/** The one. */
	int one;
	
	/** The onescounter. */
	int onescounter = 0;
	
	/** The twoscounter. */
	int twoscounter = 0;
	
	/** The threescounter. */
	int threescounter = 0;
	
	/** The fourscounter. */
	int fourscounter = 0;
	
	/** The fivescounter. */
	int fivescounter = 0;
	
	/** The sixescounter. */
	int sixescounter = 0;
	
	

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem newGame = new JMenuItem("New Game");
		mnGame.add(newGame);
		
		JMenuItem quit = new JMenuItem("Quit");
		mnGame.add(quit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem howToPlay = new JMenuItem("How To Play");
		mnHelp.add(howToPlay);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// die labels
		JLabel d1 = new JLabel("?");
		d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d1.png")));
		d1.setBounds(467, 246, 60, 60);
		contentPane.add(d1);
		
		JLabel d2 = new JLabel("?");
		d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d2.png")));
		d2.setBounds(542, 246, 60, 60);
		contentPane.add(d2);
		
		JLabel d3 = new JLabel("?");
		d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d3.png")));
		d3.setBounds(617, 246, 60, 60);
		contentPane.add(d3);
		
		JLabel d4 = new JLabel("?");
		d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d4.png")));
		d4.setBounds(692, 246, 60, 60);
		contentPane.add(d4);
		
		JLabel d5 = new JLabel("?");
		d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d5.png")));
		d5.setBounds(768, 246, 60, 60);
		contentPane.add(d5);
		
		
		//checkbox labels, they stay blank
		JCheckBox cb1 = new JCheckBox("");
		cb1.setBounds(485, 318, 29, 29);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("");
		cb2.setBounds(562, 321, 29, 29);
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("");
		cb3.setBounds(637, 321, 29, 29);
		contentPane.add(cb3);
		
		JCheckBox cb4 = new JCheckBox("");
		cb4.setBounds(712, 321, 29, 29);
		contentPane.add(cb4);
		
		JCheckBox cb5 = new JCheckBox("");
		cb5.setBounds(788, 321, 29, 29);
		contentPane.add(cb5);
		

		
		// round counter label
		JLabel lblRoundCount = new JLabel("Round Count: 0");
		lblRoundCount.setBounds(481, 81, 121, 20);
		contentPane.add(lblRoundCount);
		
		// roll counter label
		JLabel rollCountLabel = new JLabel("Roll Count: " + roll.rollCount() + "");
		rollCountLabel.setBounds(675, 81, 121, 20);
		contentPane.add(rollCountLabel);
		
		
		//labels for the changed value score
		JLabel oneValLbl = new JLabel("?");
		oneValLbl.setBounds(157, 30, 69, 20);
		contentPane.add(oneValLbl);
		
		JLabel twoValLbl = new JLabel("?");
		twoValLbl.setBounds(157, 81, 69, 20);
		contentPane.add(twoValLbl);
		
		JLabel threeValLbl = new JLabel("?");
		threeValLbl.setBounds(157, 128, 69, 20);
		contentPane.add(threeValLbl);
		
		JLabel fourValLbl = new JLabel("?");
		fourValLbl.setBounds(157, 174, 69, 20);
		contentPane.add(fourValLbl);
		
		JLabel fiveValLbl = new JLabel("?");
		fiveValLbl.setBounds(157, 226, 69, 20);
		contentPane.add(fiveValLbl);
		
		JLabel sixValLbl = new JLabel("?");
		sixValLbl.setBounds(157, 279, 69, 20);
		contentPane.add(sixValLbl);
		
		JLabel bonusValLbl = new JLabel("?");
		bonusValLbl.setBounds(157, 330, 69, 20);
		contentPane.add(bonusValLbl);
		
		JLabel topTotValLbl = new JLabel("?");
		topTotValLbl.setBounds(157, 389, 69, 20);
		contentPane.add(topTotValLbl);
		
		JLabel threeOfKindLbl = new JLabel("?");
		threeOfKindLbl.setBounds(383, 30, 69, 20);
		contentPane.add(threeOfKindLbl);
		
		JLabel fourOfKindLbl = new JLabel("?");
		fourOfKindLbl.setBounds(383, 81, 69, 20);
		contentPane.add(fourOfKindLbl);
		
		JLabel boatLbl = new JLabel("?");
		boatLbl.setBounds(383, 128, 69, 20);
		contentPane.add(boatLbl);
		
		JLabel smStrLbl = new JLabel("?");
		smStrLbl.setBounds(383, 178, 69, 20);
		contentPane.add(smStrLbl);
		
		JLabel lgStrLbl = new JLabel("?");
		lgStrLbl.setBounds(383, 226, 69, 20);
		contentPane.add(lgStrLbl);
		
		JLabel yahtzeeLbl = new JLabel("?");
		yahtzeeLbl.setBounds(383, 279, 69, 20);
		contentPane.add(yahtzeeLbl);
		
		JLabel chanceLbl = new JLabel("?");
		chanceLbl.setBounds(383, 330, 69, 20);
		contentPane.add(chanceLbl);
		
		JLabel lowerTotalLbl = new JLabel("?");
		lowerTotalLbl.setBounds(383, 389, 69, 20);
		contentPane.add(lowerTotalLbl);
		
		JLabel grandTotalLbl = new JLabel("?");
		grandTotalLbl.setBounds(383, 453, 69, 20);
		contentPane.add(grandTotalLbl);


		
		
		//menu bar Game > New Game
		newGame.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			oneValLbl.setText(Integer.toString(reset.zero()));
			twoValLbl.setText(Integer.toString(reset.zero()));
			threeValLbl.setText(Integer.toString(reset.zero()));
			fourValLbl.setText(Integer.toString(reset.zero()));
			fiveValLbl.setText(Integer.toString(reset.zero()));
			sixValLbl.setText(Integer.toString(reset.zero()));
			bonusValLbl.setText(Integer.toString(reset.zero()));
			topTotValLbl.setText(Integer.toString(reset.zero()));
			threeOfKindLbl.setText(Integer.toString(reset.zero()));
			fourOfKindLbl.setText(Integer.toString(reset.zero()));
			boatLbl.setText(Integer.toString(reset.zero()));
			smStrLbl.setText(Integer.toString(reset.zero()));
			lgStrLbl.setText(Integer.toString(reset.zero()));
			yahtzeeLbl.setText(Integer.toString(reset.zero()));
			chanceLbl.setText(Integer.toString(reset.zero()));
			lowerTotalLbl.setText(Integer.toString(reset.zero()));
			grandTotalLbl.setText(Integer.toString(reset.zero()));
			
			}
		});
		
		//menu bar Game > Quit 
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
	
		howToPlay.addActionListener(new ActionListener() {
		                                        
		   
		
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String url_open = "https://howdoyouplayit.com/yahtzee-rules-play-yahtzee/";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}  
		});
		
		
	
		
		JButton btnAdd = new JButton("Ones");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
			if (onescounter == 0) {
			oneValLbl.setText(Integer.toString(topVal.getOnes()));
			onescounter++;
			} else if (onescounter >= 1) { 
				
				onescounter = 0;
				topVal.resetOnes();
	
			
			}
			

			
			}
		});
		btnAdd.setBounds(15, 16, 103, 48);
		contentPane.add(btnAdd);
	
		
		//add twos
		JButton button_1 = new JButton("Twos");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				if (twoscounter == 0) {
				twoValLbl.setText(Integer.toString(topVal.getTwos()));
				twoscounter++;
				} else if (twoscounter >= 1) {
				twoscounter = 0;
				
				topVal.resetTwos();
			}
			
			}
		});
		button_1.setBounds(15, 67, 103, 48);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Threes");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (threescounter == 0) {
				threeValLbl.setText(Integer.toString(topVal.getThrees()));
				threescounter++;
				} else if (threescounter >= 1) {
					threescounter = 0;
					topVal.resetThrees();
				}
				
				
				
			}
		});
		button_2.setBounds(15, 115, 103, 46);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Fours");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (fourscounter == 0) {
				fourValLbl.setText(Integer.toString(topVal.getFours()));
				fourscounter++;
				} else if (fourscounter >= 1) {
					fourscounter = 0;
					topVal.resetFours();
				}
				
			}
		});
		button_3.setBounds(15, 161, 103, 46);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Fives");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (fivescounter == 0) {
			    fiveValLbl.setText(Integer.toString(topVal.getFives()));
				fivescounter++;
				} else if (fivescounter >= 1) {
					fivescounter = 0;
					topVal.resetFives();
				}
				
			}
		});
		button_4.setBounds(15, 212, 103, 48);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Sixes");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (sixescounter == 0) {
				sixValLbl.setText(Integer.toString(topVal.getSixes()));
				sixescounter++;
				} else if (sixescounter >= 0) {
					sixescounter = 0;
					topVal.resetSixes();
				}
				
			}
		});
		button_5.setBounds(15, 265, 103, 48);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Bonus");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				bonusValLbl.setText(Integer.toString(topVal.getBonus()));
				
			}
		});
		button_6.setBounds(13, 316, 103, 48);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Top Total");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				topTotValLbl.setText(Integer.toString(topVal.getTopTotal()));
			
				
			}
		});
		button_7.setBounds(13, 375, 103, 48);
		contentPane.add(button_7);
	
		
		//New round
		
				JButton btnRoll = new JButton("New Round");
				btnRoll.setBounds(471, 114, 136, 48);
				btnRoll.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
					
						roll.rollCount = 0;
					
						rollCountLabel.setText("Roll Count: " + roll.rollCount());
						
						d1.setText(Integer.toString(topVal.dieVal.getD1()));
						d2.setText(Integer.toString(topVal.dieVal.getD2()));
						d3.setText(Integer.toString(topVal.dieVal.getD3()));
						d4.setText(Integer.toString(topVal.dieVal.getD4()));
						d5.setText(Integer.toString(topVal.dieVal.getD5()));
					
						
						cb1.setSelected(false);
						cb2.setSelected(false);
						cb3.setSelected(false);
						cb4.setSelected(false);
						cb5.setSelected(false);
						
						lblRoundCount.setText("Round Count: " + roll.roundCount());	
					
									
					}
				});
				contentPane.setLayout(null);
				contentPane.add(btnRoll);
				contentPane.add(d1);
				
				
				
				
				// Roll button
				
				JButton button = new JButton("Roll");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
			
						//first die Logic
						if (!cb1.isSelected()) {
							d1.setText(Integer.toString(topVal.dieVal.getD1()));
							int lol;
							
							lol = Integer.parseInt(d1.getText());
							
							if (lol == 1) {
								d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d1.png")));
							}
							
							if (topVal.dieVal.val1 == 2) {
								d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d2.png")));
							}
							
							if (topVal.dieVal.val1 == 3) {
								d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d3.png")));
							}
							
							if (topVal.dieVal.val1 == 4) {
								d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d4.png")));
							}
							
							if (topVal.dieVal.val1 == 5) {
								d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d5.png")));
							}
							
							if (topVal.dieVal.val1 == 6) {
								d1.setIcon(new ImageIcon(GUI.class.getResource("/Test/d6.png")));
							}
							
						
						}
						
						//second die logic
						if (!cb2.isSelected()) {
							d2.setText(Integer.toString(topVal.dieVal.getD2()));
							
							if (topVal.dieVal.val2 == 1) {
								d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d1.png")));
							}
							
							if (topVal.dieVal.val2 == 2) {
								d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d2.png")));
							}
							
							if (topVal.dieVal.val2 == 3) {
								d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d3.png")));
							}
							
							if (topVal.dieVal.val2 == 4) {
								d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d4.png")));
							}
							
							if (topVal.dieVal.val2 == 5) {
								d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d5.png")));
							}
							
							if (topVal.dieVal.val2 == 6) {
								d2.setIcon(new ImageIcon(GUI.class.getResource("/Test/d6.png")));
							}
							
							
							
						}
						
						//third die logic
						if (!cb3.isSelected()) {
							d3.setText(Integer.toString(topVal.dieVal.getD3()));
							if (topVal.dieVal.val3 == 1) {
								d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d1.png")));
							}
							
							if (topVal.dieVal.val3 == 2) {
								d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d2.png")));
							}
							
							if (topVal.dieVal.val3 == 3) {
								d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d3.png")));
							}
							
							if (topVal.dieVal.val3 == 4) {
								d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d4.png")));
							}
							
							if (topVal.dieVal.val3 == 5) {
								d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d5.png")));
							}
							
							if (topVal.dieVal.val3 == 6) {
								d3.setIcon(new ImageIcon(GUI.class.getResource("/Test/d6.png")));
							}
							
						}
						
						//fourth die logic
						if (!cb4.isSelected()) {
							d4.setText(Integer.toString(topVal.dieVal.getD4()));
							if (topVal.dieVal.val4 == 1) {
								d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d1.png")));
							}
							
							if (topVal.dieVal.val4 == 2) {
								d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d2.png")));
							}
							
							if (topVal.dieVal.val4 == 3) {
								d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d3.png")));
							}
							
							if (topVal.dieVal.val4 == 4) {
								d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d4.png")));
							}
							
							if (topVal.dieVal.val4 == 5) {
								d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d5.png")));
							}
							
							if (topVal.dieVal.val4 == 6) {
								d4.setIcon(new ImageIcon(GUI.class.getResource("/Test/d6.png")));
							}
							
							
						}
						
						//fifth die logic
						if (!cb5.isSelected()) {
							d5.setText(Integer.toString(topVal.dieVal.getD5()));
							if (topVal.dieVal.val5 == 1) {
								d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d1.png")));
							}
							
							if (topVal.dieVal.val5 == 2) {
								d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d2.png")));
							}
							
							if (topVal.dieVal.val5 == 3) {
								d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d3.png")));
							}
							
							if (topVal.dieVal.val5 == 4) {
								d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d4.png")));
							}
							
							if (topVal.dieVal.val5 == 5) {
								d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d5.png")));
							}
							
							if (topVal.dieVal.val5 == 6) {
								d5.setIcon(new ImageIcon(GUI.class.getResource("/Test/d6.png")));
							}
							
						
						}
						
						
		
							
						
						roll.rollCount++;
						
						rollCountLabel.setText("Roll Count: " + roll.rollCount());
					}
				});
				button.setBounds(662, 114, 135, 48);
				contentPane.add(button);
				
				
				
				
				//three of a kind button
				JButton button_8 = new JButton("3 of a kind");
				button_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
					threeOfKindLbl.setText(Integer.toString(topVal.getThreeOfKind()));
						
					}
				});
				button_8.setBounds(232, 16, 136, 48);
				contentPane.add(button_8);
				
				JButton button_9 = new JButton("4 of a kind");
				button_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						fourOfKindLbl.setText(Integer.toString(topVal.getFourOfKind()));
					}
				});
				button_9.setBounds(232, 67, 136, 48);
				contentPane.add(button_9);
				
				JButton button_10 = new JButton("Full House");
				button_10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int case1 = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						
						if (case1 == 5 || case1 == 8 || case1 == 9 
								|| 
								case1 == 11 || case1 == 12 || case1 == 13 
								|| 
								case1 == 14 || case1 == 15 || case1 == 16
								|| 
								case1 == 17 || case1 == 18 || case1 == 19 
								|| 
								case1 == 20 || case1 == 21 || case1 == 22 
								|| 
								case1 == 23 || case1 == 24 || case1 == 26 
								|| 
								case1 == 27 || case1 == 28) {
							boatLbl.setText(Integer.toString(bottomVal.getBoat()));
						} else {
							boatLbl.setText("x");
						}
						
					}
				});
				button_10.setBounds(232, 117, 136, 46);
				contentPane.add(button_10);
				
				JButton button_11 = new JButton("Sequence of 4");
				button_11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int case1 = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						int case2 = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						int case3 = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						if (case1 == 10 || case2 == 14 || case3 == 18) {
							smStrLbl.setText(Integer.toString(bottomVal.getSmStraight()));
						} else {
							smStrLbl.setText("x");
						}
						
						
						
					}
				});
				button_11.setBounds(232, 164, 136, 48);
				contentPane.add(button_11);
				
				JButton button_12 = new JButton("Sequence of 5");
				button_12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int case1 = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						int case2 = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						
						 if (case1 == 15 || case2 == 20) {
						
						lgStrLbl.setText(Integer.toString(bottomVal.getLgStraight()));
					} else {
						lgStrLbl.setText("x");
					}
					}
						
				});
				button_12.setBounds(232, 212, 136, 48);
				contentPane.add(button_12);
				
				JButton button_13 = new JButton("Yahtzee");
				button_13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int totalDie = topVal.dieVal.val1 + topVal.dieVal.val2 + topVal.dieVal.val3 + topVal.dieVal.val4 + topVal.dieVal.val5;
						
						if (totalDie == 5 || totalDie == 10 || totalDie == 15 || totalDie == 20 || totalDie == 25 || totalDie == 30) {

							yahtzeeLbl.setText(Integer.toString(topVal.getYahtzee()));
						} else {
						
						yahtzeeLbl.setText("x");
						}
					}
				});
				button_13.setBounds(232, 265, 136, 48);
				contentPane.add(button_13);
				
				JButton button_14 = new JButton("Chance");
				button_14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						chanceLbl.setText(Integer.toString(topVal.getChance()));
					}
				});
				button_14.setBounds(232, 316, 136, 48);
				contentPane.add(button_14);
				
				JButton button_16 = new JButton("Bottom Total");
				button_16.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						lowerTotalLbl.setText(Integer.toString(topVal.getBottom()));
						
					}
				});
				button_16.setBounds(232, 375, 136, 48);
				contentPane.add(button_16);
				
				JButton button_17 = new JButton("Grand Total");
				button_17.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						grandTotalLbl.setText(Integer.toString(topVal.getGrandTotal()));
					}
				});
				button_17.setBounds(15, 439, 353, 48);
				contentPane.add(button_17);
				
				
				
			
				JButton mainMenu = new JButton();
				mainMenu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						mainMenu.setVisible(false);
					}
				});
				mainMenu.setBounds(0, 0, 878, 613);
				
				Image red = new ImageIcon(this.getClass().getResource("/yahtzee.png")).getImage();
				mainMenu.setIcon(new ImageIcon(red));
	
				contentPane.add(mainMenu);
	
	
				
			
			
				
		
	
	}
}
	

	
	

