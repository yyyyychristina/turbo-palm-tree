package myTaxPackage;

public class TestTax {

	public static void main(String[] args) {
		/**Write a tax program that uses the Tax class to print the 2001 and 2002 tax tables
		 * for taxableIncome from $50,000 to $60,000 with intervals of $1,000 FOR ALL FOUR STATUS
		 * i.e. 50,000, 51,000, 52000, ..., 59,000, 60000*/
		
		Tax tax1 = new Tax();
		tax1.setFilingStatus(Tax.SINGLE_FILER);
		tax1.setBrackets(tax1.taxin2001);
		tax1.setRates(tax1.ratesin2001);
		tax1.setTaxableIncome(50000);
		
		/**print Tax for single filer in 2001
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Single Filer in 2001");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
		tax1.setFilingStatus(Tax.MARRIED_jOINTLY_OR_QUALIFYING_WIDOWER);
		
		/**print Tax for Married Jointly or Qualifying Widower in 2001
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Married Jointly or Qualifying Widower in 2001");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
		tax1.setFilingStatus(Tax.MARRIED_SEPARATELY);
		
		/**print Tax for Married Separately in 2001
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Married Separately in 2001");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}	
		System.out.println();
		
		tax1.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
		
		/**print Tax for Head of Household in 2001
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Head of Household in 2001");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
		/**Set tax1's brackets and rates to year of 2002*/
		tax1.setBrackets(tax1.taxin2002);
		tax1.setRates(tax1.ratesin2002);
		
		tax1.setFilingStatus(Tax.SINGLE_FILER);
		
		/**print Tax for Single Filer in 2002
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Single Filer in 2002");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
		tax1.setFilingStatus(Tax.MARRIED_jOINTLY_OR_QUALIFYING_WIDOWER);
		
		/**print Tax for Married Jointly or Qualifying Widower in 2002
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Married Jointly or Qualifying Widower in 2002");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
		tax1.setFilingStatus(Tax.MARRIED_SEPARATELY);
		
		/**print Tax for Married Separately in 2002
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Married Separately in 2002");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
		tax1.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
		
		/**print Tax for Head of Household in 2002
		 * for taxable Income from $50,000 to $60,000 (inclusive) with interval of $1000*/
		System.out.println("Tax for Head of Household in 2002");
		for (int i = 0; i <= 10; i++) {	//from 50000 to 60000 is inclusive, so <=
			tax1.setTaxableIncome(50000 + i * 1000); //i = 0, 50000; i = 1, 51000; i = 2, 52000; i = 3, 53000;
			System.out.println("For $" + (50000 + i * 1000) + " taxable Income:" + tax1.getTax());
		}
		System.out.println();
		
	}

}
