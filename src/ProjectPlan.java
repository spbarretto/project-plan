import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import functions.DisplayMenu;
import functions.Functions;
import models.Project;
import models.Task;

public class ProjectPlan {

	public static void main(String[] args) {
		//Variable declaration
		Functions functions = new Functions();
		List<Project> projects = new ArrayList<Project>();
		
		int inputProjectMenu, inputProjectId, inputTask;
		
		DisplayMenu.displayInterface();
		
		do {
			inputProjectMenu = DisplayMenu.displayProjectPlanMenu();
			
			switch(inputProjectMenu) {
				//Add project to list
				case(1):	
					//Create new project
					Project project = new Project();
					projects.add(project);
				
					break;
				//View all projects
				case(2):
					DisplayMenu.displayTitle("Projects");
				
					if(projects.size() != 0) {
						
						do {
							//List all existing projects
							functions.listAllProjects(projects);
							
							//Displays project menu and return user choice
							inputProjectId = DisplayMenu.displayIdMenu();
							
							if(inputProjectId > 0 && projects.get(inputProjectId - 1) != null) {
								DisplayMenu.displayTitle("PROJECT " + projects.get(inputProjectId - 1).getProjectName());
								
								do {	
									inputTask = DisplayMenu.displayTaskMenu();
									
									//Displays task menu and return user choice
									switch(inputTask) {
										case 1:
											if(inputProjectId > 0 && projects.get(inputProjectId - 1).getTaskList() != null) {
												functions.listAllTasksByProject(projects.get(inputProjectId - 1).getTaskList());
											}

											break;
										case 2:
											//Create new task to the project
											Task task = new Task();
											projects.get(inputProjectId - 1).addProjectTask(task);
									}
								} while (inputTask != 0);
								
								
							} else {
								System.out.println("Project does not exist.");
							}
						
						} while (inputProjectId != 0);
					} else {
						DisplayMenu.displayTitle("No existing project");
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
