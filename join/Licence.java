package join;

public class Licence {
    public static void main(String[] args) throws InterruptedException {

        Medical medical=new Medical();
        medical.start();

        medical.join();

        TestDrive testDrive=new TestDrive();
        testDrive.start();

        testDrive.join();

        OfficerSign officerSign=new OfficerSign();
        officerSign.start();
    }
}
