package comm.example;

import java.util.ArrayList;

public class Task {

	private String taskId;
	private ArrayList<ToDo> toDos;
	/*
	 * //default conbstructor public Task() {
	 * 
	 * }
	 */

	//
	{

		toDos = new ArrayList<ToDo>();

	}

	public void createTask(ToDo todo, String taskId) {
		this.taskId = taskId;
		toDos.add(todo);
		System.out.println("todo created successfully.");

	}

	public void displayToDos() {

		for(ToDo td: toDos)
		{
			System.out.println(td.getToDo()+"\n");
		}
	
	}

}
