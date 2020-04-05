package comm.example;

import java.time.LocalDate;

public class ToDo {

	private String todoID;
	private String todoName;
	//blank final variable
	//class variable
	private static final LocalDate todoDate;

	
	
	public String getTodoID() {
		return todoID;
	}

	public void setTodoID(String todoID) {
		this.todoID = todoID;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public static LocalDate getTododate() {
		return todoDate;
	}

	static
	{
		todoDate=LocalDate.now();
	}
	
	public void createToDo(String todoID,String todoName)
	{
		this.todoID=todoID;
		this.todoName=todoName;
	}
	
	public String getToDo()
	{
		return "ToDo Date: "+getTododate()+" ToDo Name: "+getTodoName()+" ToDo ID: "+getTodoID();
	}
	
}
