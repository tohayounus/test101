
package Asgard;

public class ReservationSystem {
  private  int firstClass= 10;
  private  int econoly = 10;
  private  String seatType;
  private  int seatNo;
    
    public String inputSeatType(String rs){
       seatType=rs;
       return rs;
    }
    
    public void seatAvaiable(int sea){
     seatNo=sea; 
     if(seatType.equalsIgnoreCase("first class")){
        if(firstClass>=seatNo){
           firstClass=firstClass-seatNo;
        }
     }
     else if(seatType.equalsIgnoreCase("economy")){
        if(econoly>=seatNo){
          econoly=econoly-seatNo;
        }
     }
     else
         System.out.println("All seats are booked, Next flight leaves in 2 hours");
    }
    
    public void billCalculation(){
      double bill = 0;
      if(seatType.equalsIgnoreCase("first class")){
       bill = seatNo*1200;
         if(seatNo>3){
          double dis = bill * .10;
          bill = bill - dis;
         }
      }
      else  if(seatType.equalsIgnoreCase("economy")){
        bill = seatNo*800;
      }
         
    } 
}
