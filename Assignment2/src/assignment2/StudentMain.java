package assignment2;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      //fetch student record based on his roll no from the database
	      Student model  = getStudentDB();

	      //Create a view : to write student details on console
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setStudentName("John");

	      controller.updateView();		
		
	}
	
	private static Student getStudentDB(){
		Student student = new Student();
		student.setName("Robert");
		student.setDepartment("Science");
		return student;
	}	
	
}
