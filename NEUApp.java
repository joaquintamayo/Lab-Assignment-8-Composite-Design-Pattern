public class NEUApp {
    public static void main(String[] args) {
        Student s1 = new Student("Joaquin", "24-0001", 35000);
        Student s2 = new Student("Elijah", "23-0002", 37000);
        Student s3 = new Student("John", "22-0003", 34300);

        Teacher t1 = new Teacher("Mrs. Ana", "DSA", 50000);
        Teacher t2 = new Teacher("Dr. Aleman", "Capstone", 70000);

        Department csDept = new Department("Computer Science");
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Information Technology");
        itDept.add(t1);
        itDept.add(s3);

        College CICS = new College("College of Informatics and Computing Studies");
        CICS.add(csDept);
        CICS.add(itDept);

        System.out.println("NEW ERA UNIVERSITY:");
        CICS.displayDetails();

        System.out.println("\nTotal Students in NEU: " + CICS.getNumberOfStudents());
        System.out.println("Total Budget of NEU: " + CICS.getBudget());
    }
}
