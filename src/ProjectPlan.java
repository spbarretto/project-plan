import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Project;
import models.Task;

public class ProjectPlan {

	public static void main(String[] args) {
		//Variable declaration
		List<Project> projects = new ArrayList<Project>();
		
		int inputProjectMenu, inputProjectId, inputTask;
		
		Menu.displayInterface();
		
		do {
			inputProjectMenu = Menu.displayProjectPlanMenu();
			
			switch(inputProjectMenu) {
				//Add project to list
				case(1):					
					Project project = new Project();
					projects.add(project);
				
					break;
				//View all projects
				case(2):
					System.out.println("Projects");
				
					if(projects.size() != 0) {
						
						do {
							//List all existing projects
							System.out.println("id | Project Name");
							for(Project p : projects) {
								System.out.println(p.getId() + "  | " + p.getProjectName());
							}
							
							//Project menu
							inputProjectId = Menu.displayProjectMenu();
							
							//try {
							if(inputProjectId > 0 && projects.get(inputProjectId - 1) != null) {
								System.out.println("******************************************");
								System.out.println("PROJECT " + projects.get(inputProjectId - 1).getProjectName());
								
								do {	
									inputTask = Menu.displayTaskMenu();
									
									
									switch(inputTask) {
										case 1:
											if(projects.get(inputProjectId - 1).getTaskList() != null) {
												for(Task task : projects.get(inputProjectId - 1).getTaskList()) {
													System.out.println(task.getId() + "  | " + task.getTaskName());
												}
											} else {
												System.out.println("No task available.");
											}
											break;
										case 2:
											Task task = new Task();
											projects.get(inputProjectId - 1).addProjectTask(task);
									}
								} while (inputTask != 0);
								
								
							} else {
								System.out.println("Project does not exist.");
							}
						
						} while (inputProjectId != 0);
					} else {
						System.out.println("No existing project");
					}
					
					break;
				case(0):
					System.out.println("Exit.");
					break;
				default:
					System.out.println("Please enter a valid input.");
			} 	
		} while(inputProjectMenu != 0);
	}
}
