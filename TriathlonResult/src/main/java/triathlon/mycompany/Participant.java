/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triathlon.mycompany;

/**
 *
 * @author muhamed
 */
public class Participant {
    private final String name;
    private final int id;
    private int swimmingTime;
    private int cyclingTime;
    private int runningTime;

    // Constructor
    public Participant(String name, int id, int swimmingTime, int cyclingTime, int runningTime) {
        this.name = name;
        this.id = id;
        this.swimmingTime = swimmingTime;
        this.cyclingTime = cyclingTime;
        this.runningTime = runningTime;
    }

    
    public String getName() { return name; }
    public int getId() { return id; }
    public int getSwimmingTime() { return swimmingTime; }
    public int getCyclingTime() { return cyclingTime; }
    public int getRunningTime() { return runningTime; }

    public void setSwimmingTime(int swimmingTime) { this.swimmingTime = swimmingTime; }
    public void setCyclingTime(int cyclingTime) { this.cyclingTime = cyclingTime; }
    public void setRunningTime(int runningTime) { this.runningTime = runningTime; }

    
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Total Time: " +
                (swimmingTime + cyclingTime + runningTime) + " minutes.");
    }

    public int calculateTotalTime() {
        return swimmingTime + cyclingTime + runningTime;
    }
}

