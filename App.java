import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Person harry = new Person(1, "harry_resume.docx");
    Person james = new Person(2, "myresume.txt");
    Person eleanor = new Person(3, "Eleanor.rtf");

    Manager evan = new Manager(01, "Evan Sorenson", 45, "evan@business.org");
    evan.addInterview(harry);
    evan.addInterview(james);
    evan.addInterview(eleanor);

    evan.printInterviews();

    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    employeeList.add(new Employee(02, "Kevin", 38, "kevin@business.org"));
    employeeList.add(new Employee(03, "Daryl", 27, "daryl@gmail.com"));

    Cashier miranda = new Cashier(02, "Miranda", 24, "miranda@gmail.com");
    employeeList.add(miranda);

    miranda.addRecord("Tue Aug 24", 400);
    miranda.addRecord("Mon Aug 23", 320);
    miranda.addRecord("Sun Aug 22", 10);

    System.out.println("printing list of " + employeeList.size() + " employees");
    for(Employee e: employeeList) {
      System.out.print("name: " + e.getName());
      System.out.print(" id: " + e.getId());
      System.out.println(" age: " + e.getAge());
      System.out.println("  email: " + e.getEmail());
    }

  }
}