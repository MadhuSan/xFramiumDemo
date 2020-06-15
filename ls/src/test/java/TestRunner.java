package test.java;

import org.testng.annotations.Test;
import org.xframium.driver.TestDriver;

public class TestRunner {
  @Test
  public void f() {
	  TestDriver.main(new String[] {"../ls/src/com/ul/ls/resources/driverConfigTXT.txt"});
  }
}
