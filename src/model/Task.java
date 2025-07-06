package model;
import main.Core;

import java.util.List;


public class Task {

    private int id;
    private String name;
    private String description;
    private int priority;
    private boolean isCompleted = false;
    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }
    public String toString() {
        return this.name + '\n' + this.description + '\n' + this.priority +'\n' + this.isCompleted;
    }
    public int GetId() {
        return id;
    }
    public String GetName() {
        return name;
    }
    public String GetDescription() {
        return this.description;
    }
    public int GetPriority() {
        return this.priority;
    }
    public boolean GetIsCompleted() {
        return this.isCompleted;
    }

    public void SetId(int id){
        this.id=id;
    }

    public void SetName(String name) {
        this.name=name;
    }
    public void SetDescription(String description) {
        this.description = description;
    }

    public void SetPriority(int priority) {
        this.priority = priority;
    }

    public void ChangeStatus(){
        this.isCompleted = !this.isCompleted;
    }

}
