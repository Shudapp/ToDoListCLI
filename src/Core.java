package main;
import model.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Core {

    private static int NumberOfTasks = 0;
    static List<Task> Tasks = new ArrayList<Task>();
    static Scanner scanner = new Scanner(System.in);

    public static void addTask(){
        System.out.println("Set name: ");
        String name = scanner.nextLine();

        System.out.println("Set description: ");
        String description = scanner.nextLine();

        Task task = new Task();

        task.AddName(name);
        task.AddDescription(description);

        Tasks.add(task);
    }
    public static int GetNumberOfTasks(){

        return Tasks.size();
    }

    public static void ShowTask(Task task){
        System.out.println("Task name: " + task.name);
        System.out.println("Task description: " + task.description);

        String complete;

        if(task.isCompleted){
            complete = "Yes";
        } else {
            complete = "No";
        }

        System.out.println("Is completed: " + complete);
    }
    public static void printTasks(){
        for (Task task : Tasks){
            if(!task.isCompleted){
                ShowTask(task);
            }
        }
    }
    public static void printFinishedTasks(){
        for(Task task : Tasks){
            if(task.isCompleted){
                ShowTask(task);
            }
        }
    }

    public static void ChangePriority(List <Task>Tasks ,int first, int second){
        Task FirstTask=Tasks.get(first);
        Task SecondTask=Tasks.get(second);

        Collections.swap(Tasks,first,second);
    }

    public static void GetCommand(){
        System.out.println("Enter command:");
        String command = scanner.nextLine();
        command = command.toLowerCase();
        if(command.equals("add") || command.equals("add task")){
            addTask();
        } else if(command.equals("show") || command.equals("show tasks")){
            printTasks();
        } else if(command.equals("change") || command.equals("change priority")){
            System.out.println("Enter first: ");
            int first = scanner.nextInt();
            System.out.println("Enter second: ");
            int second = scanner.nextInt();
            scanner.nextLine();
            ChangePriority(Tasks, first-1, second-1);

        } else if (command.equals("number") || command.equals("number of tasks")){
            System.out.println(Core.GetNumberOfTasks());
        }else if(command.equals("exit")){
            return;
        }
    }
}
