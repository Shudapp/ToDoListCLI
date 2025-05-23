package model;
import main.Core;

import java.util.List;

public class Task {
    private int id = Core.GetNumberOfTasks();
    public String name;
    public String description;
    private static int priority;
    public boolean isCompleted;
    public void ChangeStatus(){
        isCompleted = !isCompleted;
    }
    public void AddName(String NewName){
        name=NewName;
    }
    public void AddDescription(String Description){
        description=Description;
    }
    public static int GetPriority(){
        return priority;
    }

}
