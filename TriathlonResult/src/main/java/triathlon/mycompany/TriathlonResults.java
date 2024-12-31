/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triathlon.mycompany;

/**
 *
 * @author muhamed
 */
import java.util.ArrayList;
import java.util.Comparator;

public class TriathlonResults {
    private ArrayList<Participant> participants = new ArrayList<>();

    
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    // This finds and display fastest and second fastest participants
    public void findFastest() {
        participants.sort(Comparator.comparingInt(Participant::calculateTotalTime));
        System.out.println("Fastest: " + participants.get(0).getName() +
                " with Time: " + participants.get(0).calculateTotalTime() + " minutes.");
        System.out.println("Second Fastest: " + participants.get(1).getName() +
                " with Time: " + participants.get(1).calculateTotalTime() + " minutes.");
    }

    // Displaying all participants sorted by time
    public void displaySortedResults() {
        participants.sort(Comparator.comparingInt(Participant::calculateTotalTime));
        System.out.println("Sorted Results:");
        for (Participant participant : participants) {
            participant.displayDetails();
        }
    }

    // MainApp
    public static void main(String[] args) {
        
        TriathlonResults results = new TriathlonResults();

       
        results.addParticipant(new Participant("Alice", 1, 25, 40, 20));
        results.addParticipant(new Participant("Bob", 2, 20, 35, 25));
        results.addParticipant(new EliteParticipant("Charlie", 3, 30, 50, 30, "Health Corp"));
        results.addParticipant(new BeginnerParticipant("Diana", 4, 28, 42, 18));

        
        results.findFastest();

        
        results.displaySortedResults();
    }
}

