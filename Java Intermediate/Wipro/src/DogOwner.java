/**
 * Created by Alpit on 14-06-2017.
 */
public class DogOwner {
    public void takeWalkForDog(Dog d) {
        if (d.getDrinkTime() > 4) {
            d.needsTogo();
            System.out.println("Hurrr");
        }
    }
}
