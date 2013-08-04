package io.minh.module1;

import org.testng.annotations.Test;

/**
 *
 * @author mnguyen
 */
public class AutomobileTest {

    @Test(groups = "unit")
    public void test() {
        new Automobile() {
            @Override
            public void drive() {
            }
        }.coveredByUnitTest();
    }
}
