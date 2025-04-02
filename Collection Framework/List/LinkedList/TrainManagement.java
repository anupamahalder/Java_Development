import java.util.LinkedList;

class Train {
    private LinkedList<String> coaches;

    public Train() {
        this.coaches = new LinkedList<>();
    }

    // Add coach at the end
    public void addCoach(String coachName) {
        coaches.addLast(coachName);
        System.out.println(coachName + " coach added to the train.");
    }

    // Remove a specific coach
    public void removeCoach(String coachName) {
        if (coaches.remove(coachName)) {
            System.out.println(coachName + " coach removed from the train.");
        } else {
            System.out.println(coachName + " coach not found.");
        }
    }

    // Add coach at the front (e.g., an engine)
    public void addEngine(String engineName) {
        coaches.addFirst(engineName);
        System.out.println(engineName + " engine added to the front.");
    }

    // Remove the last coach
    public void removeLastCoach() {
        if (!coaches.isEmpty()) {
            String removedCoach = coaches.removeLast();
            System.out.println(removedCoach + " coach removed from the train.");
        } else {
            System.out.println("No coaches left to remove.");
        }
    }

    // Display train coaches
    public void displayTrain() {
        System.out.println("Current Train Coaches: " + coaches);
    }
}

public class TrainManagement {

    public static void main(String[] args) {
        Train train = new Train();

        // Adding coaches dynamically
        train.addEngine("Electric Engine");
        train.addCoach("First Class");
        train.addCoach("Second Class");
        train.addCoach("Sleeper");
        train.addCoach("AC Coach");

        train.displayTrain();

        // Removing a coach in the middle
        train.removeCoach("Second Class");

        // Removing last coach
        train.removeLastCoach();

        train.displayTrain();
    }
}

/* 
OUTPUT:
-------
Electric Engine engine added to the front.
First Class coach added to the train.
Second Class coach added to the train.
Sleeper coach added to the train.
AC Coach coach added to the train.
Current Train Coaches: [Electric Engine, First Class, Second Class, Sleeper, AC Coach]
Second Class coach removed from the train.
AC Coach coach removed from the train.
Current Train Coaches: [Electric Engine, First Class, Sleeper]
*/
