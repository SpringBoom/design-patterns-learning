package org.demo.design.pattern.obj.single;

import java.io.Serializable;

/**
 * @author zhifan_jyshi
 * @date 2023/11/29
 */
public class SerializableSingleton implements Serializable {
  private static final long serialVersionUID = -1993556284397943101L;
  private static final SerializableSingleton instance = new SerializableSingleton();

  private SerializableSingleton() {
  }

  private Object readResolve(){
    return instance;
  }

  public static SerializableSingleton getInstance(){
    return instance;
  }

}
