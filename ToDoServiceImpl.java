package comm.example.demo.service;

import java.util.List;

import comm.example.demo.model.ToDo;
import comm.example.demo.repo.ToDoImpl;
import comm.example.demo.repo.ToDoRepo;

public class ToDoServiceImpl implements ToDoService {
	
	private ToDoRepo repo;
	
	{
		//dynamic method dispatching
		repo=new ToDoImpl();
	}

	public void createToDo(ToDo todo) {
		repo.createToDo(todo);

		
	}

	public List<ToDo> getAllToDo() {
		
		return repo.getAllToDo();
	}

}
