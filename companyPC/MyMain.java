package companyPC;

public class MyMain {
    public static void main(String[] args) {
       Company c=new Company();
        Producer p=new Producer(c);
        Consumer co=new Consumer(c);

        p.start();
        co.start();
    }
}
