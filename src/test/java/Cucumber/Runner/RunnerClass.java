package Cucumber.Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/FeatureFiles" },
        glue = { "Cucumber.Stepdefinition" },
        plugin = {"pretty:src\\Reports\\PrettyReport\\STDOUT","html:target/cucumber-reports"},
        monochrome = true

)
public class RunnerClass {
}
