import java.util.ArrayList;
import java.util.List;

public class Department implements NEUComponent {
    private String name;
    private List<NEUComponent> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(NEUComponent component) {
        members.add(component);
    }

    public void remove(NEUComponent component) {
        members.remove(component);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (NEUComponent member : members) {
            total += member.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (NEUComponent member : members) {
            total += member.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (NEUComponent member : members) {
            member.displayDetails();
        }
    }
}
