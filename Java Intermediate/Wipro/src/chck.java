class chck{
    void printtable(int n) {
        for (int i=1;i<n;i++){
            System.out.println(i*n);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class check1 extends Thread{
    chck c;
    check1(chck c){
        this.c = c;
    }
    public void run(){
        c.printtable(5);
    }
}

class check2 extends Thread{
    chck c;
    check2(chck c){
        this.c = c;
    }
    public void run(){
        c.printtable(100);
    }
}
class test {
    public static void main(String args[]){
        chck chck = new chck();
        check1 check1 = new check1(chck);
        check2  check2 = new check2(chck);
        check1.start();
        check2.start();

    }
}