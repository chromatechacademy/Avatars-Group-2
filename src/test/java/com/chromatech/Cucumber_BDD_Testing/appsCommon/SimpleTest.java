package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    private int count = 0;

    @Test(retryAnalyzer = com.chromatech.Cucumber_BDD_Testing.appsCommon.RetryAnalyzer.class)
    public void testRetry() {
        count++;
        System.out.println("Executing testRetry, attempt: " + count);
        Assert.assertTrue(count == 3, "Test should pass on third attempt");
    }
}
