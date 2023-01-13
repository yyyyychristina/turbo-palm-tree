package myTaxPackage;

public class Tax {
	
	/**Design a Tax Class contains these instance data fileds:
	 * int filingStatus: One of the four filing status: 
	 * 0 -> single filler; 1 -> married filing jointly or qualified widower; 
	 * 2 -> married filling separately; 3 -> head of household;
	 * use public static constant to represent the status: SINGLE_FILER = 0;
	 * MARRIED_jOINTLY_OR_QUALIFYING_WIDOW(ER) = 1;
	 * MARRIED_SEPARATELY = 2; HEAD_OF_HOUSEHOLD = 3
	 * 
	 * int[][] brackets: store the tax brackets for each filling status
	 * double[] rates: store the tax rates for each brackets
	 * double taxableIncome: store the taxable income
	 * 
	 * provide the setter and getter method for each data field
	 * and the getTax() method to return the tax
	 * provide no-arg constructor and constructor Tax(filing status, brackets, rates, taxableIncome)
	 * */
		
	//four public static constant
	public final static int SINGLE_FILER = 0;
	public final static int MARRIED_jOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public final static int MARRIED_SEPARATELY = 2;
	public final static int HEAD_OF_HOUSEHOLD = 3;
	
	//what class knows: filing status
	int filingStatus;
	
	//int[][] brackets store the tax brackets for each filling status
	int[][] brackets; 
	
	int[][] taxin2001 = {/**In 2001*/
			{27050, 65550, 136750, 297350}, //SINGLE_FILER
			{45200, 109250, 166500, 297350},
			//MARRIED_jOINTLY_OR_QUALIFYING_WIDOW(ER)
			{22600, 54625, 83250, 148675},  //MARRIED_SEPARATELY
			{36250, 93650, 151650, 297350}  //HEAD_OF_HOUSEHOLD
			};
	
	int[][]	taxin2002	= {/**In Year 2002*/
			{6000, 27950, 67700, 141250, 307050},  //SINGLE_FILER
			{12000 , 46700, 112850, 171950, 307050}, 
			//MARRIED_jOINTLY_OR_QUALIFYING_WIDOW(ER)
			{6000, 23350, 56425, 85975, 153525}, //MARRIED_SEPARATELY
			{10000, 37450, 96700, 156600, 307050} //HEAD_OF_HOUSEHOLD
			};

	
	//double[] rates store the tax rates for each brackets
	double[] rates;
	
	double[] ratesin2001 = {/**In Year 2001*/
			0.15, 0.275, 0.305, 0.355, 0.391};
	
	double[] ratesin2002 = {		/**In Year 2002*/
			0.1, 0.15, 0.27, 0.30, 0.35, 0.386};
	
	//double taxableIncome store the taxable income
	double taxableIncome;
	
	/**provide the setter and getter method for each data field: filingStatus,
	 * int[][] brackets, double[] rates, double taxableIncome*/
	 
	//return the filingStatus
	public int getFilingStatus() {
		return filingStatus;
	}
	
	//set a new filingStatus
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	//return the brackets
	public int[][] getBrackets(){
		return brackets;
	}
	
	//set a new bracket
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	
	//return the rates
	public double[] getRates() {
		return rates;
	}
	
	//set a new rates
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	
	//return the taxableIncome
	public double getTaxableIncome() {
		return taxableIncome;
	}
	
	//set a new taxableIncome
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	

	/**provide no-arg constructor and constructor Tax(filing status, brackets, rates, taxableIncome)*/
	public Tax(){		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	/**getTax() method to return the tax*/
	public double getTax() {
		if (filingStatus == SINGLE_FILER)
			if (taxableIncome <= brackets[0][0])   //be careful!
				return brackets[0][0] * rates[0];
		
			else if (taxableIncome <= brackets[0][1])
				return brackets[0][0] * rates[0] + 
				(taxableIncome - brackets[0][0]) * rates[1];
		
			else if (taxableIncome <= brackets[0][2])
				return brackets[0][0] * rates[0] + 
						(brackets[0][1] - brackets[0][0]) * rates[1] + 
						(taxableIncome - brackets[0][1]) * rates[2];
		
			else if (taxableIncome <= brackets[0][3])
				return brackets[0][0] * rates[0] + 
						(brackets[0][1] - brackets[0][0]) * rates[1] + 
						(brackets[0][2] - brackets[0][1]) * rates[2] +
						(taxableIncome - brackets[0][2]) * rates[3];
		
			else if (taxableIncome <= brackets[0][4])
				return brackets[0][0] * rates[0] + 
							(brackets[0][1] - brackets[0][0]) * rates[1] + 
							(brackets[0][2] - brackets[0][1]) * rates[2] +
							(brackets[0][3] - brackets[0][2]) * rates[3] +
							(taxableIncome - brackets[0][3]) * rates[4];
		
			else
				return brackets[0][0] * rates[0] + 
						(brackets[0][1] - brackets[0][0]) * rates[1] + 
						(brackets[0][2] - brackets[0][1]) * rates[2] +
						(brackets[0][3] - brackets[0][2]) * rates[3] +
						(brackets[0][4] - brackets[0][3]) * rates[4] +
						(taxableIncome - brackets[0][4]) * rates[5];
		
		else if (filingStatus == MARRIED_jOINTLY_OR_QUALIFYING_WIDOWER)
			if (taxableIncome <= brackets[1][0])   //be careful!
				return brackets[1][0] * rates[0];
		
			else if (taxableIncome <= brackets[1][1])
				return brackets[1][0] * rates[0] + 
				(taxableIncome - brackets[1][0]) * rates[1];
		
			else if (taxableIncome <= brackets[1][2])
				return brackets[1][0] * rates[0] + 
						(brackets[1][1] - brackets[1][0]) * rates[1] + 
						(taxableIncome - brackets[1][1]) * rates[2];
		
			else if (taxableIncome <= brackets[1][3])
				return brackets[1][0] * rates[0] + 
						(brackets[1][1] - brackets[1][0]) * rates[1] + 
						(brackets[1][2] - brackets[1][1]) * rates[2] +
						(taxableIncome - brackets[1][2]) * rates[3];
		
			else if (taxableIncome <= brackets[1][4])
				return brackets[1][0] * rates[0] + 
							(brackets[1][1] - brackets[1][0]) * rates[1] + 
							(brackets[1][2] - brackets[1][1]) * rates[2] +
							(brackets[1][3] - brackets[1][2]) * rates[3] +
							(taxableIncome - brackets[1][3]) * rates[4];
		
			else
				return brackets[1][0] * rates[0] + 
						(brackets[1][1] - brackets[1][0]) * rates[1] + 
						(brackets[1][2] - brackets[1][1]) * rates[2] +
						(brackets[1][3] - brackets[1][2]) * rates[3] +
						(brackets[1][4] - brackets[1][3]) * rates[4] +
						(taxableIncome - brackets[1][4]) * rates[5];
		
		else if (filingStatus == MARRIED_SEPARATELY)
			if (taxableIncome <= brackets[2][0])   //be careful!
				return brackets[2][0] * rates[0];
		
			else if (taxableIncome <= brackets[2][1])
				return brackets[2][0] * rates[0] + 
				(taxableIncome - brackets[2][0]) * rates[1];
		
			else if (taxableIncome <= brackets[2][2])
				return brackets[2][0] * rates[0] + 
						(brackets[2][1] - brackets[2][0]) * rates[1] + 
						(taxableIncome - brackets[2][1]) * rates[2];
		
			else if (taxableIncome <= brackets[2][3])
				return brackets[2][0] * rates[0] + 
						(brackets[2][1] - brackets[2][0]) * rates[1] + 
						(brackets[2][2] - brackets[2][1]) * rates[2] +
						(taxableIncome - brackets[2][2]) * rates[3];
		
			else if (taxableIncome <= brackets[2][4])
				return brackets[2][0] * rates[0] + 
							(brackets[2][1] - brackets[2][0]) * rates[1] + 
							(brackets[2][2] - brackets[2][1]) * rates[2] +
							(brackets[2][3] - brackets[2][2]) * rates[3] +
							(taxableIncome - brackets[2][3]) * rates[4];
		
			else
				return brackets[2][0] * rates[0] + 
						(brackets[2][1] - brackets[2][0]) * rates[1] + 
						(brackets[2][2] - brackets[2][1]) * rates[2] +
						(brackets[2][3] - brackets[2][2]) * rates[3] +
						(brackets[2][4] - brackets[2][3]) * rates[4] +
						(taxableIncome - brackets[2][4]) * rates[5];
		
		else if (filingStatus == HEAD_OF_HOUSEHOLD)
			if (taxableIncome <= brackets[3][0])   //be careful!
				return brackets[3][0] * rates[0];
		
			else if (taxableIncome <= brackets[3][1])
				return brackets[3][0] * rates[0] + 
				(taxableIncome - brackets[3][0]) * rates[1];
		
			else if (taxableIncome <= brackets[3][2])
				return brackets[3][0] * rates[0] + 
						(brackets[3][1] - brackets[3][0]) * rates[1] + 
						(taxableIncome - brackets[3][1]) * rates[2];
		
			else if (taxableIncome <= brackets[3][3])
				return brackets[3][0] * rates[0] + 
						(brackets[3][1] - brackets[3][0]) * rates[1] + 
						(brackets[3][2] - brackets[3][1]) * rates[2] +
						(taxableIncome - brackets[3][2]) * rates[3];
		
			else if (taxableIncome <= brackets[3][4])
				return brackets[3][0] * rates[0] + 
							(brackets[3][1] - brackets[3][0]) * rates[1] + 
							(brackets[3][2] - brackets[3][1]) * rates[2] +
							(brackets[3][3] - brackets[3][2]) * rates[3] +
							(taxableIncome - brackets[3][3]) * rates[4];
		
			else
				return brackets[3][0] * rates[0] + 
						(brackets[3][1] - brackets[3][0]) * rates[1] + 
						(brackets[3][2] - brackets[3][1]) * rates[2] +
						(brackets[3][3] - brackets[3][2]) * rates[3] +
						(brackets[3][4] - brackets[3][3]) * rates[4] +
						(taxableIncome - brackets[3][4]) * rates[5];
		
		else
			return 0;
	}
	
}
