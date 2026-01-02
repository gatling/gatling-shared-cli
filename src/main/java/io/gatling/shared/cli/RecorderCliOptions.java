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

public final class RecorderCliOptions {

  public static final CliOption SimulationsFolder =
      new CliOption(
          "simulations-folder",
          "sf",
          "Uses <directoryPath> as the absolute path of the directory where simulations are stored",
          "<directoryPath>");
  public static final CliOption ResourcesFolder =
      new CliOption(
          "resources-folder",
          "rf",
          "Uses <folderName> as the folder where generated resources will be stored",
          "<folderName>");
  public static final CliOption Package =
      new CliOption("package", "pkg", "Sets the package of the generated class", "<package>");
  public static final CliOption ClassName =
      new CliOption("classname", "cn", "Sets the name of the generated class", "<classname>");
  public static final CliOption Format =
      new CliOption("format", "fmt", "Sets the format of the generated code", "<format>");

  private RecorderCliOptions() {}
}
