package inheritance.documents;

import java.time.LocalDate;
import java.util.ArrayList;

public class Document {
  private final ArrayList<String> authors;
  private final LocalDate date;

  public Document(ArrayList<String> authors, LocalDate date) {
    this.authors = authors;
    this.date = date;
  }

  public ArrayList<String> getAuthors() {
    return authors;
  }

  public void addAuthor(String name) {
    this.authors.add(name);
  }


  public LocalDate getDate() {
    return date;
  }
}


