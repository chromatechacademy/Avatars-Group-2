package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < MAX_RETRY_COUNT) {
            System.out.println("Retrying " + iTestResult.getName() + " again and the count is " + (retryCount + 1));
            retryCount++;
            return true;
        }
        return false;
    }
}