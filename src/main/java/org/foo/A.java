package org.foo;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import java.util.List;

class A {

  public List<String> foo(List<String> items) throws Exception {

    var a = 10;

    var list = new ArrayList<String>(a);
    var bytes = new byte[a];
    for (var counter = 0; counter < a; counter++) {
      list.add("hello" + counter);
      bytes[counter] = (byte) counter;
    }

    for (var value : list) {
      if(value.contains("1") || value.contains("4")) {
        System.out.println(value);
      }
    }


    try (var r = new ByteArrayInputStream(bytes)) {
      var value = r.read();
      while (value != -1) {
        if (value == 1 || value == 4) {
          System.out.println(value);
        }
        value = r.read();
      }
    }

    var myA = new A() {

      String myField;

      @Override
      public List<String> foo(List<String> items) {
        if(items.contains(myField)) {
          items.remove(myField);
        }
        return items;
      }

      String bar() {
        return myField;
      }
    };

    if (myA.bar() == null) {
      myA.myField = "world";
      items = myA.foo(items);
    }

    return items;
  }
}
