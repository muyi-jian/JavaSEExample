package pattern2.singleton.pattern;

/**
 * 饿汉式
 * @author YangJian
 * @date 2023/11/13 16:20
 */
public class Singleton001 {
    // 私有化构造器
    private Singleton001() {
    }
    // 此实例也必须静态化
    private static Singleton001 instance = new Singleton001();

    // 提供公共的静态方法，返回当前实例
    public static Singleton001 getInstance() {
        return instance;
    }

}
