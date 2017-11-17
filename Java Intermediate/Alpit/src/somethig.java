import java.io.IOException;

/**
 * Created by Alpit on 24-05-2017.
 */
public class somethig {
    public static void main(String args[])throws IOException
    {
        dog g= new dog("bark");
        dog m;
        g.barking();
g.setName("goofy");
        System.out.println(dog.name);
    }
}
class dog
{
static String name;
    public dog(String s) {
        System.out.println("heck ya");

    }
    public void barking()
    {
        System.out.println("boo boo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       dog.name = name;
    }
}
