package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=("src\\test\\resources\\filename.features"),glue=("org.stepdef"))
public class TestRunner {


}
