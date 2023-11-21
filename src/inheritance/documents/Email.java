package inheritance.documents;

import java.time.LocalDate;
import java.util.ArrayList;

public class Email extends Document {
  private String subject;
  private ArrayList<String> to;

  public Email(ArrayList<String> authors, LocalDate date, String subject, ArrayList<String> to) {
    super(authors, date);
    this.subject = subject;
    this.to = to;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void addTo(String name) {
    this.to.add(name);
  }

  public ArrayList<String> getTo() {
    return to;
  }

  public void setTo(ArrayList<String> to) {
    this.to = to;
  }
}
