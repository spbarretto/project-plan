package models;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * class: Project
 * desctiption: A project plan includes the name of the project and list of tasks
 */
public class Project {
	private static int idCounter = 1;
	private int id;						// Project ID	
	private String projectName;			// Name of project
	private List<Task> taskList = new ArrayList<Task>();		// List of tasks in a project plan

	public Project() {
		Scanner projectScan = new Scanner(System.in);
		
		System.out.println("Enter project name: ");
		String name = projectScan.nextLine();
		projectName = name;
		
		id=idCounter++;
	}
	
	public void addProjectTask(Task task) {
		taskList.add(task);
	}
	
	//Setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = idCounter++;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
}
