// Answer key is located in the bottom of the txt file.

import java.io.*;
import java.util.*;

public class Traore_Mbarick_Final  
{
   public static void main(String[] args)throws IOException
   {
      try
      {
         //Reading text file 
         File file = new File("Traore_Mbarick_Questions.txt");  
         Scanner input = new Scanner(file);
       
         //Assigning each question and their 4 possible answers to a variable 
         String q = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine(); 
         String r = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String s = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String t = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String u = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String v = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String w = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String x = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String y = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         String z = input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine()+"\n"+input.nextLine();
         input.close();
         
         // Putting each question and their 4 possible answers into an String array 
         String[] questions = {q, r, s, t, u, v, w, x, y, z};
     
         int times = 0; // Counting number of questions asked up to 5
         int correctCount = 0; //Counting correct answers 
         int incorrectCount = 0; //Counting incorrect answers     
         
         //Asking questions up to 5 times
         do
         {
            //Picking a random question in the array and prompt the user for answer / increment number of questions asked
            String randomPickedQuestion = questions[new Random().nextInt(questions.length)];
            print(randomPickedQuestion);
            times++;
            
            //Answering questions       
            System.out.print("\nAnswer Here:");
            String answer = new Scanner(System.in).nextLine();
            
            //Grading answwers / answer key is located in the bottom of the txt file    
            if( randomPickedQuestion == questions[0]){
               if(answer.equalsIgnoreCase("D")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was D.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[1] ){
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
               } 
            } 
            else if(randomPickedQuestion == questions[2]){
               if(answer.equalsIgnoreCase("B")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was B.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[3]){
               if(answer.equalsIgnoreCase("B")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was B.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[4]){
               if(answer.equalsIgnoreCase("D")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was D.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[5]){
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[6]){
               if(answer.equalsIgnoreCase("C")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was C.\n");
                  incorrectCount++;
               }         
            }
            else if(randomPickedQuestion == questions[7]){
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
               }         
            }
            else if( randomPickedQuestion == questions[8]){
               if(answer.equalsIgnoreCase("B")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was B.\n");
                     incorrectCount++;
               }         
            }
            else{
               if(answer.equalsIgnoreCase("A")){
                  print("\nCongratulation. That is correct.\n");
                  correctCount++;
               }
               else{
                  print("\nSorry. That is incorrect. Correct answer was A.\n");
                  incorrectCount++;
                }         
             }
          //Setting limit of questions asked to 5   
          }while(times < 5);    
          
          //Providing summary of their results and scores
          print("Thank you for taking the quiz. Your correct answer is " + correctCount + 
                ", incorrect is " + incorrectCount + " and score is " + getScore(correctCount) + ".");    
      }  
      //Catching Exception in case there is a problem importing file
      catch(IOException ex){
         System.out.println("Error reading file");
      }
   }
   //1st Method / for printing       
   public static void print(String s){
      System.out.println(s);
   } 
   //2nd Method / for getting score
   public static String getScore(int s){
      if(s == 5){
         return "100%";
      }
      else if(s == 4){
         return "80%";
      }
      else if(s == 3){
         return "60%";
      }
      else if(s == 2){
         return "40%";
      }
      else if(s == 1){
         return "20%";
      }
      else{
         return "0%";
      }
   }  
} 