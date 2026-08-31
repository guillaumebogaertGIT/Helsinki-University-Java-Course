import java.util.ArrayList;
public class Package {
 private ArrayList<Gift> gifts;

 public Package() {
    this.gifts = new ArrayList<Gift>();
 }
 public void addGift(Gift gift) {
    this.gifts.add(gift);
 }
 public int totalWeight() {
    int total = 0;
    for ( Gift gift : this.gifts){
        total = total + gift.getWeight();
    }
    return total;
 }
}
