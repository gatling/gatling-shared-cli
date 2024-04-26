/*
 * Copyright 2011-2024 GatlingCorp (https://gatling.io)
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

import edu.umd.cs.findbugs.annotations.NonNull;

public final class CliOption {
  public final String longName;
  public final String shortName;
  public final String text;
  public final String valueName;

  public CliOption(
      @NonNull String longName, @NonNull String shortName, @NonNull String text, String valueName) {
    this.longName = requireNonNull(longName);
    this.shortName = requireNonNull(shortName);
    this.text = requireNonNull(text);
    this.valueName = valueName;
  }

  public String longOption() {
    return "--" + longName;
  }

  public String shortOption() {
    return "-" + shortName;
  }
}
