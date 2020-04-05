package comm.example.demo;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.sun.xml.internal.bind.v2.TODO;

import comm.example.demo.model.ToDo;
import comm.example.demo.service.ToDoService;
import comm.example.demo.service.ToDoServiceImpl;


public class App 
{
	
	private ToDoService service;
	private static Scanner scanner;
	
	{
		service=new ToDoServiceImpl();
		scanner=new Scanner(System.in);
	}
	
	private ToDo todo;
	
    public static void main( String[] args )
    {
       
    	int choice=0;
    	App app=new App();
    	try {
    		
    		do {
    			
    			System.out.println("1. Create ToDo.");
    			System.out.println("2. Display all ToDo.");
    			System.out.print("Enter your choice");
    			choice=scanner.nextInt();
    			switch (choice) {
				case 1:
					System.out.println("todo name: ");
					ToDo tempToDo=new ToDo(UUID.randomUUID().toString(), scanner.next());
					
					app.service.createToDo(tempToDo);
					break;
				case 2:
					
					try {
						List<ToDo> list=app.service.getAllToDo();
					
						for(ToDo td:list)
						{
							System.out.println(td.getToDo()+"\n");;
						}
						
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					break;

				case 0:
					System.out.println("bye....!");
					System.exit(0);
				
				default:
					System.out.println("invalid choice.. try again..");
					break;
				}
				
			} while (choice!=0);
    		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    
    }
}
