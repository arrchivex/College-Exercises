package pkgif.statement;


public class IFStatement {

    public static void main(String[] args) {
        
    // Check aNumber is Positive or negative using IF statement
    int number = 6;
    
    if ( number > 0 )
        System.out.println ("This Number is a Positive Number");
   
        System.out.println("This Number is Negative Number");
    
    // Checking if the statement is Even or Odd using if statement
    if ( number %2== 0 )
        System.out.println ("Even");
    if ( number %2== 1)
        System.out.println("Odd");
    
    // Check aNumber is Positive or negative using IF else statement
    
    if ( number > 0 )
        System.out.println ("This Number is a Positive Number");
    else
        System.out.println("This Number is Negative Number");
    
    // Checking if the statement is Even or Odd using IF else statement
    if ( number %2== 0 )
        System.out.println ("Even");
    else
        System.out.println("Odd");
    
    // GPA Calculations
    
    double GPA = 4.0;
    if ( GPA > 3.5)
    System.out.println ("Excellent");
    if (GPA >= 3 && GPA <= 3.5)
    System.out.println ("Good");
    if (GPA < 3)
        System.out.println("Weak");
    
    
    
    
    }
    
}
