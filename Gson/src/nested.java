import com.google.gson.Gson;

/**
 * Created by Alpit on 14-05-2017.
 */
public class nested {
    String name;
    String age;
    String ph;
    int roll;

    Girlfriend girlfriend;

    public nested(String name, String age, String ph, int roll, Girlfriend girlfriend) {
        this.name = name;
        this.age = age;
        this.ph = ph;
        this.roll = roll;
        this.girlfriend = girlfriend;
    }
}

class Girlfriend{
    String street;
    String houseNumber;
    String city;
    String country;

    public Girlfriend(String street, String country, String city, String houseNumber) {
        this.street = street;
        this.country = country;
        this.city = city;
        this.houseNumber = houseNumber;
    }
}

class hmm{
    public static void main(String args[])
    {
        Girlfriend girlfriend=new Girlfriend("Main Street",
                "42A",
                "Magdeburg",
                "Germany");
nested nested= new nested("alpit","21","9905049823",150,girlfriend);
        Gson gson= new Gson();
        String convert=gson.toJson(nested);
        System.out.println(convert);
    }
}
