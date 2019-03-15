package mvcexample;

import mvcexample.Student;
import mvcexample.StudentController;
import mvcexample.StudentView;

/**
 *
 * @author Giovanni
 */
public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the function
      Student model  = retriveStudentFromFunction();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Marcus");

      controller.updateView();
   }

   private static Student retriveStudentFromFunction(){
      Student student = new Student();
      student.setName("Andres");
      student.setRollNo("25");
      return student;
   }
}
