package comm.example.demo.service;

import java.util.List;

import comm.example.demo.model.ToDo;

public interface ToDoService {
	
	public void createToDo(ToDo todo);
	public List<ToDo> getAllToDo();

}
