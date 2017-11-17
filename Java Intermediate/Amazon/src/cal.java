import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args)throws IOException {
        //code

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        for(int i=0;i<a;i++){
            TreeMap<String,Integer> treeMap= new TreeMap<>();
            double op=0;
            String s=obj.readLine();
            int b=Integer.parseInt(obj.readLine());
            String k[]=s.split("");
            TreeMap<String,Integer> hashmap=new TreeMap<>();
            for(int j=0;j<s.length();j++) {
                if (hashmap.containsKey(k[j])) {
                    hashmap.put(k[j], hashmap.get(k[j]) + 1);
                } else {
                    hashmap.put(k[j], 1);
                }
            }
            for(Map.Entry<String,Integer> entry:hashmap.entrySet()){
                int j=entry.getValue();
                if(j>b){
                    hashmap.put(entry.getKey(),entry.getValue()-b);
                }
                else if(b==0){
                    break;
                }
                else {
                    b=b-j;
                hashmap.remove(entry.getKey());
                }
            }



            for(Integer x:hashmap.values()){
                op=op+Math.pow(x,2);

            }

            System.out.println((int)op);

        }

    }
}
