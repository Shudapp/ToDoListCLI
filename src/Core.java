package main;
import model.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Core {
    private static int NumberOfTasks = 0;
    private static List<Task> Tasks = new ArrayList<Task>();
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
        System.out.println(task.name);
        System.out.println(task.description);
    }
    public static void printTasks(){
        for (Task task : Tasks){
            ShowTask(task);
        }
    }
    public static void GetCommand(){
        System.out.println("Enter command: ");
        String command = scanner.nextLine();
        command = command.toLowerCase();
        if(command.equals("add") || command.equals("add task")){
            addTask();
        } else if(command.equals("show") || command.equals("show tasks")){
            printTasks();
        }
        if(command.equals("exit")){
            return;
        }
        GetCommand();
    }
}
