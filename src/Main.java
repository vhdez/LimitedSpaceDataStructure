public class Main {
    public static void main(String[] args) {
        MyCoolDataStructure myData = new MyCoolDataStructure();
        // MY CODE
        myData.put(297);
        myData.put(343);
        myData.put(234);

        Object data1 = myData.get();
        System.out.println(data1);
        Object data2 = myData.get();
        System.out.println(data2);
        Object data3 = myData.get();
        System.out.println(data3);
    }
}