package pattern2.singleton.pattern;

/**
 * 懒汉式
 * @author YangJian
 * @date 2023/11/13 16:24
 * @description
 */
public class Singleton002 {

    // 私有化构造器
    private Singleton002() {
    }
    //此实例也必须静态化
    private static Singleton002 instance;
    // 提供一个静态的公有方法，返回实例
    public static Singleton002 getInstance() {
        if (instance == null) {
            instance = new Singleton002();
        }
        return instance;
    }
}
