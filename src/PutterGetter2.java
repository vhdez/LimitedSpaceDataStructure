public class PutterGetter2 implements Runnable {
    MyCoolDataStructure myData;

    public PutterGetter2(MyCoolDataStructure myData) {
        this.myData = myData;
    }

    public void run() {

        for (int i = 800; i < 900;i = i + 1) {
            myData.put(i);
        }

        for (int i = 800; i < 900;i = i + 1) {
            Object data = myData.get();
            System.out.println(data);
        }

    }
}
