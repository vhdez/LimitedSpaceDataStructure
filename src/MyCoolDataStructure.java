public class MyCoolDataStructure implements DataStructure {
    Object[] objects = new Object[100];
    // field for next put location
    int nextPut = 0;
    // field for next get location
    int nextGet = 0;
    // field for space left

    // Methods
    public boolean put(Object obj) {
        objects[nextPut] = obj;
        nextPut = nextPut + 1;
        // HOW?  YOU will write this.
        return false;
    }
    public Object get() {
        // HOW?  YOU will write this.
        // how about nextGet??
        // return objects[?????];
        return null;
    }
}
