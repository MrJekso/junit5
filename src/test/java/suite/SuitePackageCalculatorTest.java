package suite;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("suite.test1")
@IncludePackages("suite.test1.test2")   //Подключить определенный тест
// @ExcludePackage("suite.test1.test2")   Исключить определенный тест
// @IncludeTags("calc")                           Запуск тестов с определенным тегом
// @ExcludeTags("calc")                           Исключение тестов с определенным тегом
// @IncludeClassNamePatterns("*AssertTest.*")     Запуск тестов с отбором имени по регулярному выражению
// @ExcludeClassNamePatterns("*AssertTest.*")     Исключение тестов с отбором имени по регулярному выражению
public class SuitePackageCalculatorTest {
}
