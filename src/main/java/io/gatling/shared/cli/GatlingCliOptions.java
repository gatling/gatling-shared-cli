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

/** The options of the Gatling command line ({@code io.gatling.app.Gatling}). */
public final class GatlingCliOptions {

  /** Runs the simulation without generating the HTML reports. */
  public static final CliOption NoReports =
      new CliOption("no-reports", "nr", "Runs simulation but does not generate reports", null);

  /**
   * Doesn't run a simulation, only generates the reports from the run stored in the given directory
   * name, inside the results folder.
   */
  public static final CliOption ReportsOnly =
      new CliOption(
          "reports-only",
          "ro",
          "Generates the reports for the simulation in <directoryName>",
          "<directoryName>");

  /** The absolute path of the directory where run results are stored. */
  public static final CliOption ResultsFolder =
      new CliOption(
          "results-folder",
          "rf",
          "Uses <directoryPath> as the absolute path of the directory where results are stored",
          "<directoryPath>");

  /** The fully qualified class name of the simulation to run. */
  public static final CliOption Simulation =
      new CliOption("simulation", "s", "Runs <className> simulation", "<className>");

  /**
   * A short description of the run, displayed in the report.
   *
   * <p>Launchers should pass the description Base64 encoded (UTF-8), so that it survives command
   * line quoting. Gatling decodes the value, and uses it as is if it isn't valid Base64.
   */
  public static final CliOption RunDescription =
      new CliOption(
          "run-description",
          "rd",
          "A short <description> of the run to include in the report",
          "<description>");

  /**
   * The program that launched Gatling, such as {@code maven}, {@code gradle} or {@code sbt}. Set by
   * launchers for usage analytics, hidden from the usage text.
   */
  public static final CliOption Launcher =
      new CliOption("launcher", "l", "The program that launched Gatling", "<launcher>", true);

  /**
   * The version of the build tool that launched Gatling. Set by launchers for usage analytics,
   * hidden from the usage text.
   */
  public static final CliOption BuildToolVersion =
      new CliOption(
          "build-tool-version",
          "btv",
          "The version of the build tool used to launch Gatling",
          "<version>",
          true);

  private GatlingCliOptions() {}
}
