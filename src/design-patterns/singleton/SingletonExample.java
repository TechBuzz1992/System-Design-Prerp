package singleton;

class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Singelton instance initialized");
    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void show(){
        System.out.println("called the show method of the singleton class having hashcode:"+this.hashCode());
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        obj1.show();
        obj2.show();
        
    }
    
}