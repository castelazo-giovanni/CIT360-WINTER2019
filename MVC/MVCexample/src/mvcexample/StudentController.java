<<<<<<< HEAD
package mvcexample;

public class StudentController {
   private Student model;
   private StudentView view;

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name); 
   }

   public String getStudentName(){
      return model.getName(); 
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo); 
   }

   public String getStudentRollNo(){
      return model.getRollNo(); 
   }

   public void updateView(){ 
      view.printStudentDetails(model.getName(), model.getRollNo());
   } 
}
=======
package mvcexample;

public class StudentController {
   private Student model;
   private StudentView view;

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name); 
   }

   public String getStudentName(){
      return model.getName(); 
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo); 
   }

   public String getStudentRollNo(){
      return model.getRollNo(); 
   }

   public void updateView(){ 
      view.printStudentDetails(model.getName(), model.getRollNo());
   } 
}
>>>>>>> faefa4d326a118a0de3825388b17a025f896e37f
