package org.demo.design.pattern.obj.single;

/**
 * 高性能的线程安全
 *
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public class DoubleCheckSingleton {

  // volatile 保证线程可见性
  private static volatile DoubleCheckSingleton instance;

  public static DoubleCheckSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckSingleton.class) {
        // double check
        // 必须需要，因为第二个线程进入的时候 instance 已经被第一个线程实例化了
        if (instance == null) {
          instance = new DoubleCheckSingleton();
        }
      }
    }
    return instance;
  }

  private DoubleCheckSingleton() {
  }
}
