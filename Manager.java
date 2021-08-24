import java.util.ArrayList;

public class Manager extends Employee {
  ArrayList<Person> interviews;
  
  public Manager(int id, String name, int age, String email) {
    super(id, name, age, email);
    this.interviews = new ArrayList<Person>();
  }

  public void addInterview(Person person) {
    interviews.add(person);
  }

  public void removeInterview(Person person) {
    interviews.remove(person);
  }

  public void printInterviews() {
    System.out.println("Manager interviews: ");
    for(Person a: interviews) {
      System.out.println("Interviewing id: " + a.id + " -> " + a.resume);
    }
  }
}
