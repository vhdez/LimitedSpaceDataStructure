public class PutterGetter1 implements Runnable {
    MyCoolDataStructure myData;

    public PutterGetter1(MyCoolDataStructure myData) {
        this.myData = myData;
    }

    public void run() {
        for (int i = 500; i < 600;i = i + 1) {
            myData.put(i);
        }

        for (int i = 500; i < 600;i = i + 1) {
            Object data = myData.get();
            System.out.println(data);
        }

    }
}
