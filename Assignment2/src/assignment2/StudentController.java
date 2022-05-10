package assignment2;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		//super();
		this.model = model;
		this.view = view;
	}
	
	public String getStudentId() {
		return model.getId();
	}
	public void setStudentId(String id) {
		model.setId(id);
	}
	public String getStudentName() {
		return model.getName();
	}
	public void setStudentName(String name) {
		model.setName(name);
	}
	public String getStudentDepartment() {
		return model.getDepartment();
	}
	public void setStudentDepartment(String department) {
		model.setDepartment(department);
	}
	public int getStudentMathMark() {
		return model.getMathMark();
	}
	public void setStudentMathMark(int mathMark) {
		model.setMathMark(mathMark);
	}
	public int getStudentScienceMark() {
		return model.getScienceMark();
	}
	public void setStudentScienceMark(int scienceMark) {
		model.setScienceMark(scienceMark);
	}
	public int getStudentEnglishMark() {
		return model.getEnglishMark();
	}
	public void setEnglishMark(int englishMark) {
		model.setEnglishMark(englishMark);
	}
	
	
	public void updateView(){				
		view.showStudent(getStudentId(), getStudentName(), getStudentDepartment(), getStudentMathMark(), getStudentScienceMark(), getStudentEnglishMark());
	}
	
}
