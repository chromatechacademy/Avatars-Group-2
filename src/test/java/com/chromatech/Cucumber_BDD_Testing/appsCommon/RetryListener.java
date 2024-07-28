package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        Class<? extends IRetryAnalyzer> retryAnalyzerClass = annotation.getRetryAnalyzerClass();
        if (retryAnalyzerClass == null) {
            annotation.setRetryAnalyzer(RetryAnalyzer.class);
        }
    }
}
