package org.demo.design.pattern.obj.single;

/**
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public class LazyLoadedSingleton {

  private static class LazyHolder{
    private static final LazyLoadedSingleton instance = new LazyLoadedSingleton();
  }

  public static LazyLoadedSingleton getInstance(){
    return LazyHolder.instance;
  }

  private LazyLoadedSingleton() {
  }
}
