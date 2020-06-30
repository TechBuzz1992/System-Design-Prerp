package singleton;

//Early instantiation using implementation with static field.
class EarlySingleton{
    private static EarlySingleton instance  = new EarlySingleton();
    private EarlySingleton(){
        System.out.println("EarlySingleton instance is initialized");
    } 
    public static EarlySingleton getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("Show method called");
    }
}
public class EarlyInstantiation {
    public static void main(String[] args) {
        EarlySingleton obj1 = EarlySingleton.getInstance();
        EarlySingleton obj2 = EarlySingleton.getInstance();

        obj1.show();
        obj2.show();

    }

}