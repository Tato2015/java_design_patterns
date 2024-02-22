package prototype.deep.creation_tasks;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Task task1 = new Task("Playing football","Playing football with brothers", LocalDate.now() , LocalDate.now());
		Task task2 = new Task("Playing Dota","Playing dota with friends ",LocalDate.now() , LocalDate.now());
		Task task3 = task1.clone();
		task3.setName("Other Name");
		
		
		TaskList taskList = new TaskList();
		taskList.addTask(task1);
		taskList.addTask(task2);
		taskList.addTask(task3);
		
		
		TaskList taskList2 = taskList.clone();
		Task task4 = new Task("Reading a book", "Reading a romantic book",LocalDate.now(), LocalDate.now());
		taskList2.getTasks().get(2).setDetail("Changing detail");
		taskList2.addTask(task4);
		
		System.out.println("*** TaskList 1 *** ");
		taskList.getTasks().stream().forEach(System.out::println);
		System.out.println("\n*** TaskList 2 *** ");
		taskList2.getTasks().stream().forEach(System.out::println);
		
		System.out.println( "\nThey have the same value : " + taskList.equals(taskList2) );
		System.out.println( "\nThey point the same memory space : " + ( taskList == taskList2 ) );
		

	}

}
