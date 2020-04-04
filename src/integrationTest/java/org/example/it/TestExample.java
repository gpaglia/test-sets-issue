package org.example.it;

import org.apache.commons.lang3.tuple.Pair;
import org.example.testlib.TestLibrary;
import org.junit.Test;

public class TestExample {

  @Test
  public void test() {
    Pair<String, String> pair = TestLibrary.aNewPair();
  }
}
