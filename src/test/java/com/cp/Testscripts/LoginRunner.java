package com.cp.Testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/resources/FeatureFiles",
    glue = "com.cp.Steps"
)
public class LoginRunner extends AbstractTestNGCucumberTests {

}


