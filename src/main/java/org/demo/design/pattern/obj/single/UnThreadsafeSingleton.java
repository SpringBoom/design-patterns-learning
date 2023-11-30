package org.demo.design.pattern.obj.single;

/**
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public class UnThreadsafeSingleton {

  private static UnThreadsafeSingleton instance;

  public static UnThreadsafeSingleton getInstance(){
    if (instance == null){
      instance = new UnThreadsafeSingleton();
    }
    return instance;
  }

  private UnThreadsafeSingleton() {
  }
}
