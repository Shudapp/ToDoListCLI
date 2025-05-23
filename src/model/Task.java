package model;
import main.Core;
public class Task {
    private int id = Core.GetNumberOfTasks();
    public String name;
    public String description;
    private int priority;
    private boolean isCompleted;
    public void ChangeStatus(){
        isCompleted = !isCompleted;
    }
    public void AddName(String NewName){
        name=NewName;
    }
    public void AddDescription(String Description){
        description=Description;
    }
    public void setPriority(int Priority){
        priority=Priority;
    }


}
