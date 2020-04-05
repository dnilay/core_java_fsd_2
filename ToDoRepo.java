package comm.example.demo.repo;

import java.util.List;

import comm.example.demo.model.ToDo;

public interface ToDoRepo {
	
	public void createToDo(ToDo todo);
	public List<ToDo> getAllToDo();

}
