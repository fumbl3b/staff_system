public class Employee {
  int id;
  String name;
  int age;
  String email;

  public Employee(int id, String name, int age, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int newId) {
    id = newId;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int newAge) {
    age = newAge;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String newEmail) {
    email = newEmail;
  }
}