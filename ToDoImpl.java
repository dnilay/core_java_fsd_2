package comm.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.demo.factory.MyConnectionFactory;
import comm.example.demo.model.ToDo;

public class ToDoImpl implements ToDoRepo {

	private Connection connection;
	private PreparedStatement pStatement;
	private Statement statement;

	public ToDoImpl() {

		connection = MyConnectionFactory.getMyConnection();
	}

	public void createToDo(ToDo todo) {

		try{
		
			pStatement=connection.prepareStatement("insert into todo values(?,?)");
			pStatement.setString(1, todo.getTodoID());
			pStatement.setString(2, todo.getTodoName());
			pStatement.executeUpdate();
			System.out.println("todo created successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public List<ToDo> getAllToDo() {
		ArrayList<ToDo> list=new ArrayList<ToDo>();
		
		try {
			statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from todo");
			
			while(rs.next())
			{
				list.add(new ToDo(rs.getString(1), rs.getString(2)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

}
