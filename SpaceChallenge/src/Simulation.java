import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<Item> itemsList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] table = scanner.nextLine().split("=");
            itemsList.add(new Item(table[0], Integer.parseInt(table[1])));
        }
        return itemsList;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> items) {
        ArrayList<U1> u1RocketsList = new ArrayList<>();
        u1RocketsList.add(new U1());
        int j = 0;
        for (int i = 0; i < items.size(); i++) {
            if (u1RocketsList.get(j).canCarry(items.get(i)) == true) {
                u1RocketsList.get(j).carry(items.get(i));
            } else {
                u1RocketsList.add(new U1());
                j++;
                u1RocketsList.get(j).carry(items.get(i));
            }
        }
        return u1RocketsList;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> items) {
        ArrayList<U2> u2RocketsList = new ArrayList<>();
        u2RocketsList.add(new U2());
        int j = 0;
        for (int i = 0; i < items.size(); i++) {
            if (u2RocketsList.get(j).canCarry(items.get(i)) == true) {
                u2RocketsList.get(j).carry(items.get(i));
            } else {
                u2RocketsList.add(new U2());
                j++;
                u2RocketsList.get(j).carry(items.get(i));
            }
        }
        return u2RocketsList;
    }

    public int runSimulationU1(ArrayList<U1> u1RocketList) {
        int u1Budget = 0;
        int i = 0;
        while (i < u1RocketList.size()) {
            if (u1RocketList.get(i).launch() == true && u1RocketList.get(i).land() == true) {
                u1Budget += u1RocketList.get(i).rocketCost;
                i++;
            } else {
                u1Budget += u1RocketList.get(i).rocketCost;
            }
        }
        return u1Budget;
    }

    public int runSimulationU2(ArrayList<U2> u2RocketList) {
        int u2Budget = 0;
        int i = 0;
        while (i < u2RocketList.size()) {
            if (u2RocketList.get(i).launch() == true && u2RocketList.get(i).land() == true) {
                u2Budget += u2RocketList.get(i).ROCKET_COST;
                i++;
            } else {
                u2Budget += u2RocketList.get(i).ROCKET_COST;
            }
        }
        return u2Budget;
    }
}
