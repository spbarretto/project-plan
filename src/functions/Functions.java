package functions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Project;
import models.Task;

public class Functions {
	
	public void listAllProjects(List<Project> projects) {		
		System.out.println("id | Project Name");
		for(Project p : projects) {
			System.out.println(p.getId() + "  | " + p.getProjectName());
		}
	}
	
	public void listAllTasksByProject(List<Task> taskList) {
		int input, inputStartEnd;
		
		if(taskList != null && taskList.size() > 0) {
			DisplayMenu.displayTitle("TASK LIST");
			
			for(Task task : taskList) {
				System.out.println(task.getId() + "  | " + task.getTaskName() + " | " + task.getStartDate() + " | " + task.getEndDate());	
			}
			
			input = DisplayMenu.displayIdMenu();
			if(input > 0 && taskList.get(input - 1) != null) {
				Task task = taskList.get(input - 1);
				
				DisplayMenu.displayTitle("TASK NAME " + task.getTaskName());
				
				inputStartEnd = DisplayMenu.displayStartEndTaskMenu();
				
				switch(inputStartEnd) {
					case(1): 
						if(task.getStartDate() == null) {
							task.startTask();
							
							System.out.println("Task " + task.getTaskName() + " started");
						} else {
							System.out.println("Task already started."); 
						}
								
						break;
					case(2):
						if(task.getStartDate() != null) {
							task.endTask();
							
							System.out.println("Task " + task.getTaskName() + " ended");
						} else {
							System.out.println("Task already ended."); 
						}
						
						break;
					default:
						System.out.println("Invalid input.");
						break;
				}
			}
		} else {
			DisplayMenu.displayTitle("No task available.");
		}
	}
}
