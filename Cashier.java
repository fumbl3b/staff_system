import java.util.HashMap;

public class Cashier extends Employee {

  HashMap<String,Integer> records;

  public Cashier(int id, String name, int age, String email) {
    super(id, name, age, email);
    this.records = new HashMap<String,Integer>();
  }

  public HashMap<String,Integer> getRecords() {
    return records;
  }

  public void addRecord(String date, int total) {
    records.put(date, total);
  }

  public void printRecords() {
    for(String key: records.keySet()) {
      System.out.println(this.getName() + " sold $" + records.get(key) + " on " + key);
    }
  }
}
