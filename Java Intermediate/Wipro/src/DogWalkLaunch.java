import java.io.IOException;

/**
 * Created by Alpit on 14-06-2017.
 */
public class DogWalkLaunch {
    public static void main(String args[])throws IOException
    {
        Dog d= new Dog();
        d.setDrinkTime(5);
        DogOwner dogOwner= new DogOwner();
        dogOwner.takeWalkForDog(d);

    }
}
