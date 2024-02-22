package prototype.deep.creation_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskList implements Cloneable {

	private List<Task> tasks;
	
	public TaskList() {
		this.tasks = new ArrayList<>();
	}
	
	public void addTask( Task task ) {
		this.tasks.add(task);
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public TaskList clone() throws CloneNotSupportedException{
		TaskList taskList = ( TaskList ) super.clone();
		taskList.tasks = new ArrayList<>(this.tasks);
		return taskList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tasks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskList other = (TaskList) obj;
		return Objects.equals(tasks, other.tasks);
	}
	
	
	
}
