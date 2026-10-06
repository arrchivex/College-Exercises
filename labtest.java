package labteste1;

public class LabTestE1 {

    public static void main(String[] args) {
        
        
    }
        // Question 01
        int Score = 89;
        
        if (Score > 80)
        {
        Score = Score + 5;
        System.out.println("Score:" + Score);
        }
        else if (Score < 50){
            Score = Score - 3;
            System.out.println("Score: " + Score);
        }
        if (Score %2 == 0)
        Score = Score + 3;
        System.out.println("Score: " + Score);
        
        // Question 02
        
        boolean hasID = true;
        boolean hasReservation = true;
        boolean isVIP = true;
        
        
        if (hasID && hasReservation){
            System.out.println("Entry Confirmed");
        
        if(isVIP)
            System.out.println("VIP Entry");
        }
        else
            System.out.print("Entry Denied");
        
        
        
