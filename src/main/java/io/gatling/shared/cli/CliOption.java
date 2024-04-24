package io.gatling.shared.cli;

import edu.umd.cs.findbugs.annotations.NonNull;

import static java.util.Objects.requireNonNull;

public final class CliOption {
  public final String full;
  public final String abbr;
  public final String text;
  public final String valueName;

  public CliOption(@NonNull String full, @NonNull String abbr, @NonNull String text, String valueName) {
    this.full = requireNonNull(full);
    this.abbr = requireNonNull(abbr);
    this.text = requireNonNull(text);
    this.valueName = valueName;
  }
}
