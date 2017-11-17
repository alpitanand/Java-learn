import java.io.IOException;

class bot


{
    public int i;

    bot(int b){
        i=b;
        System.out.println("From constructor "+i);
    }

}
class bot1 extends bot {

    bot1(int k) {

        super(k);
        System.out.println("From constructor 2 "+i);
    }

    public void func()
    {
        System.out.println("From func "+i*i);
    }
}

class call2{

    public static void main(String args[])throws IOException
    {
        bot1 b= new bot1(100);
        b.func();
    }
}