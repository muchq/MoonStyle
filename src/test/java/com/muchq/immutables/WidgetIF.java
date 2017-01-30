package com.muchq.immutables;

import org.immutables.value.Value.Immutable;

import java.util.List;
import java.util.Optional;

@Immutable
@MoonStyle
public interface WidgetIF {
  boolean isActive();
  Optional<String> getMiddleName();
  List<Integer> getScores();
}
