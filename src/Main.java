public class Main {
    public static void main(String[] args) {
        MyCoolDataStructure myData = new MyCoolDataStructure();

        PutterGetter1 tester1 = new PutterGetter1(myData);
        PutterGetter2 tester2 = new PutterGetter2(myData);

        Thread testing1 = new Thread(tester1);
        Thread testing2 = new Thread(tester2);

        testing1.start();
        testing2.start();
    }
}