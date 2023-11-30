package org.demo.design.pattern.obj.single;

/**
 * 使用 synchronized 实现线程安全的单例
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public class SynchronizedSingleton {

  private static SynchronizedSingleton instance;

  public static synchronized SynchronizedSingleton getInstance(){
    if (instance == null){
      instance = new SynchronizedSingleton();
    }
    return instance;
  }

  private SynchronizedSingleton() {
  }
}
