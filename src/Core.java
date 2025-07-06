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
               }
          }
     }

     public void ShowTasks() {
          for(Task task : tasks) {
               System.out.println(task);
          }
     }



}
