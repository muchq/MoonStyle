package com.muchq.immutables;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoonStyleTest {
  @Test
  public void itGeneratesClassesFromInterfacesEndingWithIF() {
    Widget w = Widget.builder().setActive(true).setMiddleName("hi").build();
    assertThat(w.getScores()).isEmpty();
  }
}
