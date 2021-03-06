package io.minh.module1;

/**
 *
 * @author mnguyen
 */
public abstract class Automobile {

    public void coveredByUnitTest() {
        System.out.println("coveredByUnitTest1");
        System.out.println("coveredByUnitTest2");
    }

    public void coveredByIntegrationTest() {
        System.out.println("coveredByIntegrationTest1");
        System.out.println("coveredByIntegrationTest2");
        System.out.println("coveredByIntegrationTest3");
    }

    public void notCovered() {
        System.out.println("notCovered");
    }
    
    public abstract void drive();
}
