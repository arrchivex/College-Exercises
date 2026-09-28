package switch_statement;

public class Switch_Statement {

    
    public static void main(String[] args) {
        
        
        int Season = 3;
        
        if (Season == 1)
            System.out.println("Winter");
        if (Season == 2)
            System.out.println("Spring");
        if (Season == 3)
            System.out.println("Summer");
        if (Season == 4)
            System.out.println("Fall");
        
        // print season name based on season value using switch
        
        switch(Season){
            case 1: System.out.println("Winter"); break;
            case 2: System.out.println("Spring"); break;
            case 3: System.out.println("Summer"); break;
            case 4: System.out.println("Fall"); break;
            
        }
        
        // Days of the week exercise
        
        int Day = 9;
        
        switch (Day){
            case 1: System.out.println("Sunday"); 
                break;
                
            case 2: System.out.println("Monday"); 
                break;
                
            case 3: System.out.println("Tuesday"); 
                break;
                
            case 4: System.out.println("Wednesday");
                break;
                
            case 5: System.out.println("Thursday");
                break;
                
            case 6: System.out.println("Friday");
                break;
                
            case 7: System.out.println("Saturday");
                break;
            default: System.out.println("Wrong Day Number!!!");
            
    // Grade calculator using Switch statement
            
            char Grade ='A';
            
            switch (Grade){
                
                case 'A': System.out.println("Excellent");
                    break;
                case 'B': System.out.println("Very Good");
                    break;
                case 'C': System.out.println("Good");
                    break;
                case 'D': System.out.println("Bad");
                    break;
                default: System.out.println("Wrong Grade");
                    break;
                
            }
            
            
        }
        
        
    }
    
}
