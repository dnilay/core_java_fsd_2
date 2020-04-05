package comm.example.demo.model;

public class ToDo {
	
	private String todoID;
	private String todoName;
	public ToDo() {
		
	}
	public ToDo(String todoID, String todoName) {
	
		this.todoID = todoID;
		this.todoName = todoName;
	}
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
	
	public String getToDo()
	{
		return "ToDo ID: "+todoID+" ToDo Name: "+todoName;
	}

}
