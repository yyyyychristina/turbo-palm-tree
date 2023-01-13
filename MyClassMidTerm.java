package myMidTermPackage;

import java.util.Scanner;


	

	public class MyClassMidTerm {

	    int x = 3;
	    int y = 8;
	    
	    private void DoSomethingMethodtwo(int y)
	    {
	        y = y * 3;
	        System.out.println( y);
	    } // DoSomethingMethodTwo
	    
	    private void DoSomethingMethodOne(int x)
	    {
	        int y = 10;
	        
	        x = x + 14;
	        System.out.println(x);
	        System.out.println(y);
	        
	        DoSomethingMethodtwo(x);
	    } // DoSomethingMethodOne
	    
	    public MyClassMidTerm ()
	    {
	        x = 2;
	        System.out.println(x);
	        System.out.println(y);
	        DoSomethingMethodOne(10);
	    } // MyTestClass method
	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        int x = 5;
	        System.out.println(x);
	        MyClassMidTerm example = new MyClassMidTerm();
	    } // main
	    
	} // MyTestClass
