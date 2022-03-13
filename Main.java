/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/

public class Main {

		  public static void main(String[] args) {
			  //creates an object of the outerclass
			  OuterClass myOuter = new OuterClass();
			  
			  //creates an object of the innerclass
		    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		   
		    //Prints out name and year
		    System.out.println(myOuter.getName() +" "+ myInner.year);
		  }


}
