package org.foo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ATest {

    @Test
    public void test_equals() {
         A a = new A();
         assertNotEquals(a, new A());
    }

    @Test
    public void test_foo() throws Exception {
        var myList = new A().foo(Collections.emptyList());
        assertIterableEquals(myList, new ArrayList<>());
    }
}
