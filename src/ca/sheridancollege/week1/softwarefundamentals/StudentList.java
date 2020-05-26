
package ca.sheridancollege.week1.softwarefundamentals;



public class StudentList {
    
    public static void main(String[] args) {
        
        //1. Create an array of 5 students.
        Student [] sList= new Student[5];
        
        //2. Add student names 
        for (int i=0;i<sList.length;i++)
        {
            sList[i]=new Student();
            sList[i].setName("Student" +(i+1));
        }
        
        //3. Print the student names
        for (int i=0;i<sList.length;i++)
        {
            System.out.println("Student name is: " + sList[i].getName());
          
        }
        
    }
    
}
