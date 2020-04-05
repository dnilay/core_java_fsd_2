package comm.example;

import java.util.UUID;

public class ToDoApp {

	public static void main(String[] args) {
		
		
		Task myTask=new Task();
		ToDo todo1=new ToDo();
		ToDo todo2=new ToDo();
		todo1.createToDo(UUID.randomUUID().toString(), "Designing");
		todo2.createToDo(UUID.randomUUID().toString(), "compile");
		myTask.createTask(todo1,UUID.randomUUID().toString());
		myTask.createTask(todo2, UUID.randomUUID().toString());
		myTask.displayToDos();
		

	}

}
