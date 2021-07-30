package b31quiz2;

import java.util.Scanner;
import Asgard.ReservationSystem;

public class B31Quiz2 {
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in); 
       String inputST= input.nextLine();
       
       ReservationSystem rs = new ReservationSystem();
       rs.inputSeatType(inputST);
       
       // input seat
       int seatNo= input.nextInt();
       rs.seatAvaiable(seatNo);
       
       
    }
}
