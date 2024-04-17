import java.util.ArrayList;

class TestSchoolRecords {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Alice", "123 Main St", "555-1234", "alice@example.com", "sophomore"));
        persons.add(new Student("Bob", "456 Elm St", "555-5678", "bob@example.com", "junior"));
        persons.add(new Faculty("Prof. Smith", "789 Oak Ave", "555-9876", "smith@example.com",
                "Computer Science", 6000, "2022-01-15", "9-11 AM", "senior"));
        persons.add(new Faculty("Prof. Johnson", "321 Maple Dr", "555-4321", "johnson@example.com",
                "Mathematics", 5500, "2021-08-20", "1-3 PM", "junior"));
        persons.add(new Staff("Jane", "555 Cedar Ln", "555-2468", "jane@example.com",
                "Administration", 4500, "2023-03-10", "Administrative Assistant"));
        persons.add(new Staff("Mike", "777 Pine Rd", "555-1357", "mike@example.com",
                "Facilities", 4800, "2020-12-05", "Maintenance Supervisor"));

        // Print details of each person
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    // Function to filter persons who are subclasses of Employee
    public static ArrayList<Employee> filterEmployees(ArrayList<Person> persons) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add((Employee) person);
            }
        }
        return employees;
    }
}





