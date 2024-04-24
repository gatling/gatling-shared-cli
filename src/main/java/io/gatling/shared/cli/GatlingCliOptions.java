package io.gatling.shared.cli;

public final class GatlingCliOptions {

  public static final CliOption NoReports = new CliOption("no-reports", "nr", "Runs simulation but does not generate reports", null);
  public static final CliOption ReportsOnly =
      new CliOption("reports-only", "ro", "Generates the reports for the simulation in <directoryName>", "<directoryName>");
  public static final CliOption ResultsFolder = new CliOption(
    "results-folder",
        "rf",
        "Uses <directoryPath> as the absolute path of the directory where results are stored",
    "<directoryPath>"
  );
  public static final CliOption Simulation = new CliOption("simulation", "s", "Runs <className> simulation", "<className>");
  public static final CliOption RunDescription =
      new CliOption("run-description", "rd", "A short <description> of the run to include in the report", "<description>");
  public static final CliOption Launcher = new CliOption("launcher", "l", "The program that launched Gatling", "");
  public static final CliOption BuildToolVersion = new CliOption("build-tool-version", "btv", "The version of the build tool used to launch Gatling", "");

  private GatlingCliOptions() {
  }
}
