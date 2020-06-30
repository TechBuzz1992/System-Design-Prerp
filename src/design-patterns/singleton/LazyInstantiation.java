package singleton;

//Lazy instantiation using double locking mechanism.
class LazySingleton{
    private static LazySingleton instance;
    private LazySingleton(){
        System.out.println("LazySingleton instance initialized");
    }
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized(LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                    System.out.println("Instance initialized in getInstance method");
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("Show method was called");
    }
}
public class LazyInstantiation{
    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();

        obj1.show();
        obj2.show();
        
    }
} 