package io.minh.module2;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test(groups = "unit")
    public void test() {
        new Animal().coveredByUnitTest();
    }
}
