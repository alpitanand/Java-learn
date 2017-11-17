import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Alpit on 29-07-2017.
 */
public class lowes {
    public static void main(String args[])throws IOException{
        int count =0;
        int count2=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int test_case = Integer.parseInt(obj.readLine());
        for(int i=0;i<test_case;i++){
            String s= obj.readLine();
            String m[]=s.split(" ");
            int num_of_chair = Integer.parseInt(m[0]);
            int sitting_on = Integer.parseInt(m[1]);
            int sitting_on1=sitting_on;
            int to_reach = Integer.parseInt(m[2]);
            String s2=obj.readLine();
            String m2[]=s2.split(" ");
            for(int f=1;f<=num_of_chair;f++){
                hashMap.put(f,Integer.parseInt(m2[f-1]));
            }
            while (count<=num_of_chair+1){
                int y=hashMap.get(sitting_on);

                sitting_on+=y;
                count++;
                if(sitting_on>num_of_chair){
                    sitting_on=sitting_on-num_of_chair;

                }
                if(sitting_on==to_reach){
                    break;
                }
                if(count==num_of_chair+1){
                    count=-1;
                    break;
                }

            }

            while (count2<=num_of_chair+1){
                int y= hashMap.get(sitting_on1);

                sitting_on1-=y;
                count2++;
                if(sitting_on1<=0){
                    sitting_on1=num_of_chair+sitting_on1;

                }
                if(sitting_on1==to_reach){
                    break;
                }
                if(count2==num_of_chair+1){
                    count2=-1;
                    break;
                }

            }

          if(count2==-1&&count==-1){
                System.out.println(count);
          }
            else if(count2==-1&&count>-1){
              System.out.print(count);
          }
          else if(count==-1&&count2>-1){
                System.out.println(count2);
          }
else if(count2<count){
              System.out.println(count2);
          }
          else {
    System.out.println(count);
          }

        }


    }


}
