package org.example.testlib;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class TestLibrary {

  public static Pair<String, String> aNewPair() {
    return new ImmutablePair<>("alpha", "beta");
  }
}
