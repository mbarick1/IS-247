public class Exercise02_08{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    
    System.out.print(" Enter the time zone offset ");
    long timeZoneOffSet = input.nextInt();
    
    // to obtain total milliseconds after midnight
    long totalMilliseconds = System.currentTimeMillis();
    // to obtain total seconds after midnight
    long totalSeconds = totalMilliseconds/1000;
      //to compute current seconds in the minute in the hour
    long currentSecond = totalSeconds % 60;
    // to obtain the total minute
    long totalMinutes = totalSeconds/60;
    // to compute the current minute in the hour
    long currentMinute = totalMinutes %60;
    // to obtain the total hour
    long totalHours = totalMinutes/60;
    // to compute the current hour 
    long currentHour = (totalHours + timeZoneOffSet) % 24;
    
    // to display result
    System.out.println(" current time is " + currentHour +  ":" + currentMinute 
                       + ":" + currentSecond);
    
    
    
    
    
   }
}