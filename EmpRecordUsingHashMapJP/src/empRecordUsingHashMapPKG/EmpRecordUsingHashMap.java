package empRecordUsingHashMapPKG;           // declared package

import java.util.*; // Importing Utility

//Using this program we insert objects with empCode and empName in HashMap using HashMap and then using getvalue method we print empName

public class EmpRecordUsingHashMap{     // declared and defined a class

   public static void main(String []args)     // main method
   {
      
      HashMap<Integer,String> hashMap = new HashMap<Integer,String>();     // created an object of generic HashMap class with emp code and emp name
      
      // inserting obect into HashMap with empcode and empname
      hashMap.put(1,"Amit Patil");      
      hashMap.put(2,"Anusha Gowda");
      hashMap.put(3,"Anurag Kashyap");
      hashMap.put(4,"Ashish Sharma");
      hashMap.put(5,"Ajit M K");
      hashMap.put(6,"Divya Jain");
      hashMap.put(7,"Shweta Hiremath");
      hashMap.put(8,"Sujit M K");
      hashMap.put(9,"Veda Kamate");
      
      System.out.println();       // printing a blank line
      System.out.println("Employee Names are : ");  // printing an info
      System.out.println();       // printing a blank line
      
      for(Map.Entry me: hashMap.entrySet())     // using for each loop and getting a entry set
      {
          System.out.println(me.getValue());   // printing emp names using getValue method
      }
   }   
}
