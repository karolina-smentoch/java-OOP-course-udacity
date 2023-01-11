import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File phase1File = new File("phase-1.txt");
        File phase2File = new File("phase-2.txt");
        Simulation simulation = new Simulation();
        ArrayList<Item> loadPhase1 = simulation.loadItems(phase1File);
        ArrayList<Item> loadPhase2 = simulation.loadItems(phase2File);
        ArrayList<U1> fleetU1Phase1 = simulation.loadU1(loadPhase1);
        ArrayList<U2> fleetU2Phase1 = simulation.loadU2(loadPhase1);
        ArrayList<U1> fleetU1Phase2 = simulation.loadU1(loadPhase2);
        ArrayList<U2> fleetU2Phase2 = simulation.loadU2(loadPhase2);
        System.out.println("Simulation for the U1 fleet:");
        int budgetU1Phase1 = simulation.runSimulationU1(fleetU1Phase1);
        int budgetU1Phase2 = simulation.runSimulationU1(fleetU1Phase2);
        System.out.println("Total budget for the U1 fleet is: $" + (budgetU1Phase1 + budgetU1Phase2) / 1000000 + " Million.");
        System.out.println();
        System.out.println("Simulation for the U2 fleet:");
        int budgetU2Phase1 = simulation.runSimulationU2(fleetU2Phase1);
        int budgetU2Phase2 = simulation.runSimulationU2(fleetU2Phase2);
        System.out.println("Total budget for the U2 fleet is: $" + (budgetU2Phase1 + budgetU2Phase2) / 1000000 + " Million.");
    }
}