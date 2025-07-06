package main;
import model.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;




public class Core {

     private int numberOfTasks = 0;
     List<Task> tasks = new ArrayList<Task>();
     Scanner scanner = new Scanner(System.in);

     public int GetNumberOfTasks() {
          return this.numberOfTasks;
     }

     public String GetCommand() {
          System.out.print("Enter command: ");
          String command = scanner.nextLine();
          return command.toLowerCase();
     }

     public void run() {
          while(true){
               String command = GetCommand();
               if(command.equals("exit")){
                    break;
               } else if(command.contains("show")){
                    ShowTasks();
               } else if(command.contains("add")){
                    AddTask();
               } else if(command.contains("remove")){
                    Task toBeRemoved = GetTask();
                    if(toBeRemoved != null) {
                         RemoveTask(toBeRemoved);
                    }
               } else if(command.equals("change status")){
                    Task toBeChanged = GetTask();
                    if(toBeChanged != null) {
                         ChangeStatus(toBeChanged);
                    }
               }
               if(!command.contains("show")){
                    ShowTasks();
               }
          }
     }

     public Task GetTask() {
          System.out.print("Enter task name: ");
          String taskName = scanner.nextLine();
          for(Task task : tasks){
               if(task.GetName().equals(taskName)){
                    return task;
               }
          }
          return null;
     }

     public void RemoveTask(Task toBeRemoved) {
          tasks.remove(toBeRemoved);
     }

     public void ChangeStatus(Task task) {
          task.ChangeStatus();
     }

     public void ShowTasks() {
          for(Task task : tasks) {
               System.out.println(task);
          }
     }

     public void AddTask() {
          String name;
          String description;
          int priority;
          System.out.print("Enter name: ");
          name = scanner.nextLine();
          System.out.print("Enter description: ");
          description = scanner.nextLine();
          System.out.print("Enter priority, enter 0 for last: ");
          priority = scanner.nextInt();
          Task task = new Task(name, description, priority);
          tasks.add(task);
     }



}
