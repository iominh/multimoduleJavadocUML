package io.minh.module2;

import org.testng.annotations.Test;

public class AnimalTestIT {

    @Test(groups = "int")
    public void test() {
        new Animal().coveredByIntegrationTest();
    }
}
