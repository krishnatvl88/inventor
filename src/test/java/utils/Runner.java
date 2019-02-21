package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

import java.util.Map;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "utils", "steps"},
        tags = { "~@ignore"},
        plugin = {"pretty"})

public class Runner {
    public static Map<String, String> config;
    public static Scenario scenario;
}
