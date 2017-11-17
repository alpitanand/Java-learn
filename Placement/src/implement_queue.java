import java.io.IOException;
import java.util.Queue;

/**
 * Created by Alpit on 06-09-2017.
 */
  interface implement_queue{
      void A();
      void B();
}
class kauva implements implement_queue{

    @Override
    public void A() {

    }

    @Override
    public void B() {

    }
}
class Z{
      public static void main(String args[]){
          implement_queue implement_queue= new kauva();
          implement_queue.A();
      }
}
