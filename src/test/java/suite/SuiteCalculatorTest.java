package suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import suite.test1.test2.ExampleAssertTest;
import suite.test1.CalculatorTest;

@Suite
@SelectClasses({ExampleAssertTest.class, CalculatorTest.class})
public class SuiteCalculatorTest {
}