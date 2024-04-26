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
  public final String fullName;
  public final String abbreviatedName;
  public final String text;
  public final String valueName;

  public CliOption(
      @NonNull String fullName,
      @NonNull String abbreviatedName,
      @NonNull String text,
      String valueName) {
    this.fullName = requireNonNull(fullName);
    this.abbreviatedName = requireNonNull(abbreviatedName);
    this.text = requireNonNull(text);
    this.valueName = valueName;
  }

  public String fullOption() {
    return "--" + fullName;
  }

  public String abbreviatedOption() {
    return "-" + abbreviatedName;
  }
}
