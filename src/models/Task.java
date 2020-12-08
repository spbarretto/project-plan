package models;


import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * class: Task
 * description: A task has a start date and end date.
 * 				It may be dependent on other task/s.
 */
public class Task {
	private static int idCounter = 1;
	private int id;							// Task id
	private String taskName;					// Name/description of task
	private Date startDate;					// Date task started
	private Date endDate;					// Date task ended
	private List<Task> taskDependencies;	// Dependencies of the task (may be empty/multiple)
	
	public Task() {
		Scanner taskScan = new Scanner(System.in);
		
		//Get task details from user
		System.out.println("Enter task name: ");
		String name = taskScan.nextLine();
		taskName = name;
		
		id=idCounter++;
	}

	//Setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = idCounter++;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void startTask() {
		this.startDate = new Date();
	}
	public Date getEndDate() {
		return endDate;
	}
	public void endTask() {
		this.endDate = new Date();
	}
	public List<Task> getTaskDependencies() {
		return taskDependencies;
	}
	public void setTaskDependencies(List<Task> taskDependencies) {
		this.taskDependencies = taskDependencies;
	}
}
