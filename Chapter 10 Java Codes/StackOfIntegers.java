public class StackOfIntegers
{
   private int[] elements;
   private int size;
   
   public static final int DEFAULT_CAPACITY = 16;
   
   public StackOfIntegers()
   {
      this(DEFAULT_CAPACITY);
   }

   public StackOfIntegers(int capacity) 
   {
      elements = new int[capacity];    
   }
   
   public boolean empty()
   {
      return size == 0;
   }
   
   public int getSize()
   {
      return size;
   }
   
   public int peek()
   {
      return elements[size - 1];
   }
   
   public int pop()
   {
      int temp = elements[size - 1]; // we could have simply used elements[--size]
      size --;
      return temp;
   }
   
   public int push(int value)
   {
      if(size >= elements.length)
      {
         int temp[] = new int[elements.length * 2];
         System.arraycopy(elements, 0, temp, 0 , elements.length);
         elements = temp;
      }
   return elements[size++]= value;
   }


   public static void main(String[] args)
   {
      StackOfIntegers stack = new StackOfIntegers();
      for(int i = 0; i < 10 ; i++)
      {
         stack.push(i);
         System.out.print(i + " ");
      }
      
      System.out.println();
      
      while(!stack.empty())
      {
         System.out.print(stack.pop()+ " ");
      }
   }
}  