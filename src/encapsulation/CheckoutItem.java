package encapsulation;


// Class that holds a reference to an item
// and the number of that item that the user
// wants to purchase
public class CheckoutItem {
  private Item item;
  private int quantity;

  public CheckoutItem(Item item) {
    this.item = item;

    // start with one item
    this.quantity = 1;
  }

  // we can add just one item at a time
  private void addItem() {
    this.quantity++;
  }

  private void removeItem() {
    if (this.quantity > 0) {
      this.quantity--;
    }
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int getQuantity() {
    return this.quantity;
  }
}
