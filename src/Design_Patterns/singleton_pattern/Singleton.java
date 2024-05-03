package Design_Patterns.singleton_pattern;

public class Singleton {
    static Singleton s;

    private Singleton() {
        System.out.println("Instance created");
    }

//    Eager approach - Issue is, instance of class Singleton might consume large amount of memory, thus it is better to implement Lazy instantiation
//    s = new Singleton();
//    public static Singleton getInstance() {
//        return s;
//    }

//    Lazy instantiation
//    public static Singleton getInstance() {
//        if (s == null) {
//            s = new Singleton();
//        }
//        return s;
//    }

//    Using synchronized method in order to prevent multiple threads creating individual instances
//    public static synchronized Singleton getInstance() {
//        if (s == null) {
//            s = new Singleton();
//        }
//        return s;
//    }

//    Double-Checked Locking - to prevent declaring the whole method as synchronised in order to improve time complexity
    public static Singleton getInstance() {
        if (s == null) {
            synchronized (Singleton.class) {
                if (s == null) {
                    s = new Singleton();
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
    }

}
