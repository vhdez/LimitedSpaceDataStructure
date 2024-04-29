public class PutterGetter1 implements Runnable {
    MyCoolDataStructure myData;

    public PutterGetter1(MyCoolDataStructure myData) {
        this.myData = myData;
    }

    public void run()  {


        try {
            for (int i = 500; i < 600; i = i + 1) {
                boolean success = myData.put(i);
                while (!success) {
                    Thread.sleep(100);
                    success = myData.put(i);
                }
            }

            for (int i = 500; i < 600; i = i + 1) {
                Object data = myData.get();
                while (data == null) {
                    Thread.sleep(100);
                    data = myData.get();
                }
                System.out.println(data);
            }

        } catch (Exception ex) {

        }


    }
}
