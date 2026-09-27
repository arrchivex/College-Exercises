package datatype2;

public class DataType2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Define Variable types, short, int, lomg
        
        short A = 13;
        int   B = 13;
        long  c = 13;
        
        // Define float and double
        
        float D = 2413.20022005f;
        double E = 2413.20022005;
        
        // Define Character Data Type
        
        char myChar = 'E';
        
        // Math Library Function
        System.out.println( Math.abs(A));
        System.out.println( Math.round(3.4));
        System.out.println( Math.max(A, E));
        System.out.println( Math.pow(E, E));
        
        // Computing the Area of a Circle and printing on the screen
            float R;
            R = (float) 3.14;
            System.out.println(Math.PI * Math.pow(R, 2));
            
         // Define Boolean and Apply && and ||
         
         boolean a = true;
         boolean b = false;
         
         System.out.println(a && b);
         System.out.println(a || b);
         System.out.println(!a);
         
         System.out.println ((!a || b) && (b && !a));
              
        
    }
    
}
