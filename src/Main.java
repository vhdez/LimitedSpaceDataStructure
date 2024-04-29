import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        MyCoolDataStructure myData = new MyCoolDataStructure();


        PutterGetter1 putget1 = new PutterGetter1(myData);
        Thread thread1 = new Thread(putget1);
        thread1.start();

        PutterGetter2 putget2 = new PutterGetter2(myData);
        Thread thread2 = new Thread(putget2);
        thread2.start();


/*
        for (int i = 500; i < 605;i = i + 1) {
            myData.put(i);
        }
        for (int i = 500; i < 605;i = i + 1) {
            Object data = myData.get();
            System.out.println(data);
        }

        for (int i = 800; i < 905;i = i + 1) {
            myData.put(i);
        }
        for (int i = 800; i < 905;i = i + 1) {
            Object data = myData.get();
            System.out.println(data);
        }
*/

    }
}