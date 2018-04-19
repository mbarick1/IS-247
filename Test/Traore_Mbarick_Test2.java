/*
Be sure to meet this specification exactly, if you have questions please ask.  Your solution will be graded on both the output as well as
your use of clean and efficient coding techniques.  Be sure to include proper error/exception handling.

You should submit a Java file named %LastName%_%FirstName%_Test2.java containing your solution.

Exercise Detail:
Rewrite Listing 21.9 (REVEL section 21.6) to read text from a Web page. The URL for the Web page should be passed as a command-line
argument.

    * Words are delimited by whitespace, punctuation marks (,;.:?), quotation marks (’”), and parentheses.
    * Count words in case-insensitive fashion (e.g., consider Good and good to be the same word).
    * Words must start with a letter.

Display the output to the screen (not written to a text file) in alphabetical order of words with each word preceded by its occurrence
count. See Test2_Exercise_Sample_Output.pdf posted on Blackboard for an example of the expected output when reading data from 
http://www.cs.armstrong.edu/liang/Lincoln.txt
*/

import java.util.*;
import java.io.*;

public class Traore_Mbarick_Test2
{
   public static void main(String[] args)
   {  
      boolean continueInput = true;
      do
      {
         try
         {
             java.net.URL url = new java.net.URL(args[0]);
             Scanner input = new Scanner(url.openStream());
             Map<String,Integer> map = new TreeMap<>();
             while(input.hasNext())
             {
                  String s = input.next();
                  String[] words = s.split("[\\s+\\p{P}]");;
                  for (int i = 0; i < words.length; i++) 
                  {
                      String key = words[i].toLowerCase();
                      if (key.length() > 0) 
                      {
                           if (!map.containsKey(key)) 
                           {
                              map.put(key, 1);
                           }
                           else 
                           {
                              int value = map.get(key);
                              value++;
                              map.put(key, value);
                           }
                       }
                   }
               }
          System.out.println("\nAlphabetical list of words and their usage counts:\n");      
          map.forEach((v, k) -> System.out.println(k + "\t" + v));
          continueInput = false;
          }
          catch (java.net.MalformedURLException ex) 
          {
              System.out.print("Invalid URL.Please try again: ");
              args[0] = new Scanner(System.in).nextLine();
          }
          catch(RuntimeException ex )
          {
              System.out.print(" You did not enter a URL at the command-line ");
              System.exit(1);
          }
          catch (IOException ex) 
          {
              System.out.print("IO Errors. Please Try again : ");
              args[0] = new Scanner(System.in).nextLine();  
          } 
      }while(continueInput);                  
   }   
}