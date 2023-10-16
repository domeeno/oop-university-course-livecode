package inheritance.documents;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book extends Document {

  private String title;
  private ArrayList<String> references;

  public Book(ArrayList<String> authors, LocalDate date, String title, ArrayList<String> references) {
    super(authors, date);
    this.title = title;
    this.references = references;
  }

  public String getTitle() {
    return title;
  }


  public void addReference(String name){
    this.references.add(name);
  };

  public void setTitle(String title) {
    this.title = title;
  }

  public ArrayList<String> getReferences() {
    return references;
  }

  public void setReferences(ArrayList<String> references) {
    this.references = references;
  }
}



