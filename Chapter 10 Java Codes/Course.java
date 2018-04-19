public class Course
{
   private String courseName;
   private String[] students = new String[4];
   private int numberOfStudents;
     
   public Course(String courseName)       // constructor
   {
      this.courseName = courseName;
   } 
   
   public String[] getStudents()          // method
   {
      return students;
   }
   
   public int getNumberOfStudents()       // method
   {
      return numberOfStudents;
   }
   
     
   public void addStudent(String student) // method
   {
      students[numberOfStudents] = student;
      numberOfStudents ++;
   }
   
   public void DropSStudent(String student)// method
   {
      students[numberOfStudents] = student;
      numberOfStudents --;
   }   
}