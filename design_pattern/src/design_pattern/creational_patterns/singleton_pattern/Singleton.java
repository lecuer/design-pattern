package design_pattern.creational_patterns.singleton_pattern;
/*一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
    只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
    如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
    如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
*/
public class Singleton {

    private static Singleton instance;
    private Singleton (){}

    /*懒汉式，线程不安全
        这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized*/
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /*懒汉式，线程安全
        这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
        优点：第一次调用才初始化，避免内存浪费。
        缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。*/
//    private static Singleton instance;
//    private Singleton (){}
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /*这种方式比较常用，但容易产生垃圾对象。
        优点：没有加锁，执行效率会提高。
        缺点：类加载时就初始化，浪费内存。*/
//    private static Singleton instance = new Singleton();
//    private Singleton (){}
//    public static Singleton getInstance() {
//        return instance;
//    }

    /*双检锁/双重校验锁（DCL，即 double-checked locking）
        JDK 版本：JDK1.5 起
        是否 Lazy 初始化：是
        是否多线程安全：是
        实现难度：较复杂
        描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
        getInstance() 的性能对应用程序很关键。*/
//    private volatile static Singleton singleton;
//    private Singleton (){}
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    /*登记式/静态内部类
        是否 Lazy 初始化：是
        是否多线程安全：是
        描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，
        应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。*/
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    private Singleton (){}
//    public static final Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }

    /*枚举是否
        Lazy 初始化：否
        是否多线程安全：是
        这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。*/
//    INSTANCE;
//    public void whateverMethod() {
//    }


}




