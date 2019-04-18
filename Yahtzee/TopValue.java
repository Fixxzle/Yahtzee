package Test;


/**
 * The Class topValue.
 */
public class TopValue {

	/** The die val. */
	DieValue dieVal = new DieValue();
	
	/** The bottom val. */
	BottomValue bottomVal = new BottomValue();

	
	
	/** The total ones. */
	int totalOnes = 0;
	
	/** The total twos. */
	int totalTwos = 0;
	
	/** The total threes. */
	int totalThrees = 0;
	
	/** The total fours. */
	int totalFours = 0;
	
	/** The total fives. */
	int totalFives = 0;
	
	/** The total sixes. */
	int totalSixes = 0;
	
	/** The total bonus. */
	int totalBonus = 0;
	
	/** The top total. */
	int topTotal = 0;
	
	/** The three of kind. */
	int threeOfKind = 0;
	
	/** The four of kind. */
	int fourOfKind = 0;
	
	/** The yahtzee. */
	int yahtzee = 0;
	
	/** The chance. */
	int chance = 0;
	
	/** The lower total. */
	int lowerTotal = 0;
	
	/** The grand total. */
	int grandTotal = 0;
	
	
	
	/**
	 * Gets the ones.
	 *
	 * @return the ones
	 */
	public int getOnes() {
	if (dieVal.val1 == 1) {
		totalOnes = totalOnes + 1;
	}
	
	if (dieVal.val2 == 1) {
		totalOnes = totalOnes + 1;
	}
	
	if (dieVal.val3 == 1) {
		totalOnes = totalOnes + 1;
	}
	
	if (dieVal.val4 == 1) {
		totalOnes = totalOnes + 1;
	}
	
	if (dieVal.val5 == 1) {
		totalOnes = totalOnes + 1;
	}
	
	
	
	return (totalOnes);
}
	
	

	 /**
 	 * Reset ones.
 	 *
 	 * @return the int
 	 */
 	public int resetOnes() {
			
			totalOnes = 0;
			
			return (totalOnes);
		}
		
		
		/**
		 * Gets the twos.
		 *
		 * @return the twos
		 */
		public int getTwos() {
				
			if (dieVal.val1 == 2) {
				
				totalTwos = totalTwos + 2;
			}
			
			if (dieVal.val2 == 2) {
				
				totalTwos = totalTwos + 2;
			}

			if (dieVal.val3 == 2) {
				
				totalTwos = totalTwos + 2;
			}
			
			if (dieVal.val4 == 2) {
				
				totalTwos = totalTwos + 2;
			}
			
			if (dieVal.val5 == 2) {
				
				totalTwos = totalTwos + 2;
			}
			
			return (totalTwos);
			}
		

	/**
	 * Reset twos.
	 *
	 * @return the int
	 */
	public int resetTwos() {
			
			totalTwos = 0;
			
			return (totalTwos);
		}

		/**
		 * Gets the threes.
		 *
		 * @return the threes
		 */
		public int getThrees() {
			
		if (dieVal.val1 == 3) {
			
			totalThrees = totalThrees + 3;
		}
		
		if (dieVal.val2 == 3) {
			
			totalThrees = totalThrees + 3;
		}

		if (dieVal.val3 == 3) {
			
			totalThrees = totalThrees + 3;
		}
		
		if (dieVal.val4 == 3) {
			
			totalThrees = totalThrees + 3;
		}
		
		if (dieVal.val5 == 3) {
			
			totalThrees = totalThrees + 3;
		}
		
		return (totalThrees);
		}
		
	/**
	 * Reset threes.
	 *
	 * @return the int
	 */
	public int resetThrees() {
			
			totalThrees = 0;
			
			return (totalThrees);
		}
		
		/**
		 * Gets the fours.
		 *
		 * @return the fours
		 */
		public int getFours() {

		if (dieVal.val1 == 4) {
			
			totalFours = totalFours + 4;
		}
		
		if (dieVal.val2 == 4) {
			
			totalFours = totalFours + 4;
		}

		if (dieVal.val3 == 4) {
			
			totalFours = totalFours + 4;
		}
		
		if (dieVal.val4 == 4) {
			
			totalFours = totalFours + 4;
		}
		
		if (dieVal.val5 == 4) {
			
			totalFours = totalFours + 4;
		}
		
		return (totalFours);
		}
		

	/**
	 * Reset fours.
	 *
	 * @return the int
	 */
	public int resetFours() {
			
			totalFours = 0;
			
			return (totalFours);
		}
		
		/**
		 * Gets the fives.
		 *
		 * @return the fives
		 */
		public int getFives() {

		if (dieVal.val1 == 5) {
			
			totalFives = totalFives + 5;
		}
		
		if (dieVal.val2 == 5) {
			
			totalFives = totalFives + 5;
		}

		if (dieVal.val3 == 5) {
			
			totalFives = totalFives + 5;
		}
		
		if (dieVal.val4 == 5) {
			
			totalFives = totalFives + 5;
		}
		
		if (dieVal.val5 == 5) {
			
			totalFives = totalFives + 5;
		}
		
		return (totalFives);
		}
		

	/**
	 * Reset fives.
	 *
	 * @return the int
	 */
	public int resetFives() {
			
			totalFives = 0;
			
			return (totalFives);
		}
		
		
		/**
		 * Gets the sixes.
		 *
		 * @return the sixes
		 */
		public int getSixes() {

		if (dieVal.val1 == 6) {
			
			totalSixes = totalSixes + 6;
		}
		
		if (dieVal.val2 == 6) {
			
			totalSixes = totalSixes + 6;
		}

		if (dieVal.val3 == 6) {
			
			totalSixes = totalSixes + 6;
		}
		
		if (dieVal.val4 == 6) {
			
			totalSixes = totalSixes + 6;
		}
		
		if (dieVal.val5 == 6) {
			
			totalSixes = totalSixes + 6;
		}
		
		return (totalSixes);
		}
		
	/**
	 * Reset sixes.
	 *
	 * @return the int
	 */
	public int resetSixes() {
			
			totalSixes = 0;
			
			return (totalSixes);
		}
		
		/**
		 * Gets the bonus.
		 *
		 * @return the bonus
		 */
		public int getBonus() {
			
			
			
			totalBonus = totalOnes + totalTwos 
					+ totalThrees + totalFours
					+ totalFives + totalSixes;
			
			if (totalBonus > 62) {
				totalBonus = 35;
			} else { 
				totalBonus = 0;
			}
			
			
			
			return (totalBonus);
		}
		
	/**
	 * Gets the top total.
	 *
	 * @return the top total
	 */
	public int getTopTotal() {
			
			topTotal = totalOnes + totalTwos 
					+ totalThrees + totalFours 
					+ totalFives + totalSixes;
			
			
			return (topTotal);
		}
		
	/**
	 * Gets the three of kind.
	 *
	 * @return the three of kind
	 */
	public int getThreeOfKind() {
		
		
		threeOfKind = dieVal.val1 + dieVal.val2 
				+ dieVal.val3 + dieVal.val4 + dieVal.val5;
		return threeOfKind;
	}

	
	/**
	 * Reset three of kind.
	 *
	 * @return the int
	 */
	public int resetThreeOfKind() {
		threeOfKind = 0;
		return threeOfKind;
	}
	
	/**
	 * Gets the four of kind.
	 *
	 * @return the four of kind
	 */
	public int getFourOfKind() {
		fourOfKind =  dieVal.val1 
				+ dieVal.val2 + dieVal.val3 
				+
				dieVal.val4 + dieVal.val5;
		return fourOfKind;
	}
	
	/**
	 * Reset four of kind.
	 *
	 * @return the int
	 */
	public int resetFourOfKind() {
		fourOfKind = 0;
		return fourOfKind;
	}
	
	/**
	 * Gets the yahtzee.
	 *
	 * @return the yahtzee
	 */
	public int getYahtzee() {
		yahtzee = 50;
		return yahtzee;
	}

	/**
	 * Reset yahtzee.
	 *
	 * @return the int
	 */
	public int resetYahtzee() {
		yahtzee = 0;
		return yahtzee;
	}
	
	/**
	 * Gets the chance.
	 *
	 * @return the chance
	 */
	public int getChance() {
		chance = dieVal.val1 + dieVal.val2
				+ dieVal.val3 + dieVal.val4 + dieVal.val5;
		return chance;
	}
	
	/**
	 * Reset chance.
	 *
	 * @return the int
	 */
	public int resetChance() {
		chance = 0;
		return chance;
	}
	
	/**
	 * Gets the bottom.
	 *
	 * @return the bottom
	 */
	public int getBottom() {
		
		lowerTotal = threeOfKind + fourOfKind + bottomVal.getBoat() 
		+ 
		bottomVal.getSmStraight() + bottomVal.getLgStraight() 
		+ 
		getYahtzee() + chance;
		
		return lowerTotal;
	}
	
	/**
	 * Gets the grand total.
	 *
	 * @return the grand total
	 */
	public int getGrandTotal() {
		
		grandTotal = topTotal + lowerTotal;
		
		return grandTotal;
	}
	

	
	
	
}
