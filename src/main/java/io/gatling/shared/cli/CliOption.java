/*
 * Copyright 2011-2026 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gatling.shared.cli;

import static java.util.Objects.requireNonNull;

import org.jspecify.annotations.Nullable;

/** A command line option, with a long form ({@code --name}) and a short form ({@code -n}). */
public final class CliOption {
  /** The long name, without the leading {@code --}. */
  public final String longName;

  /** The short name, without the leading {@code -}. */
  public final String shortName;

  /** The description displayed in the usage text. */
  public final String text;

  /**
   * The placeholder for the option's value displayed in the usage text, such as {@code
   * <className>}, or {@code null} if the option is a flag that doesn't take a value.
   */
  public final @Nullable String valueName;

  /**
   * Whether the option should be excluded from the usage text. Hidden options are still parsed;
   * they're meant to be set by launchers, not by users.
   */
  public final boolean hidden;

  private final String longOption;
  private final String shortOption;

  /**
   * Creates a visible option.
   *
   * @param longName the long name, without the leading {@code --}
   * @param shortName the short name, without the leading {@code -}
   * @param text the description displayed in the usage text
   * @param valueName the value placeholder, or {@code null} for a flag
   */
  public CliOption(String longName, String shortName, String text, @Nullable String valueName) {
    this(longName, shortName, text, valueName, false);
  }

  /**
   * Creates an option.
   *
   * @param longName the long name, without the leading {@code --}
   * @param shortName the short name, without the leading {@code -}
   * @param text the description displayed in the usage text
   * @param valueName the value placeholder, or {@code null} for a flag
   * @param hidden whether the option should be excluded from the usage text
   */
  public CliOption(
      String longName, String shortName, String text, @Nullable String valueName, boolean hidden) {
    this.longName = requireNonNull(longName);
    this.shortName = requireNonNull(shortName);
    this.text = requireNonNull(text);
    this.valueName = valueName;
    this.hidden = hidden;
    this.longOption = "--" + longName;
    this.shortOption = "-" + shortName;
  }

  /**
   * Returns the long form of this option.
   *
   * @return the long name prefixed with {@code --}, e.g. {@code --simulation}
   */
  public String longOption() {
    return longOption;
  }

  /**
   * Returns the short form of this option.
   *
   * @return the short name prefixed with {@code -}, e.g. {@code -s}
   */
  public String shortOption() {
    return shortOption;
  }

  @Override
  public String toString() {
    return "CliOption{"
        + "longName='"
        + longName
        + "', shortName='"
        + shortName
        + "', valueName="
        + (valueName == null ? "null" : "'" + valueName + "'")
        + ", hidden="
        + hidden
        + "}";
  }
}
