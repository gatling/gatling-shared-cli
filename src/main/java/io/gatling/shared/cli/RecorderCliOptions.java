package io.gatling.shared.cli;

public final class RecorderCliOptions {

  public static final CliOption SimulationsFolder = new CliOption(
      "simulations-folder",
      "sf",
      "Uses <directoryPath> as the absolute path of the directory where simulations are stored",
      "<directoryPath>");
  public static final CliOption ResourcesFolder =
      new CliOption("resources-folder", "rf", "Uses <folderName> as the folder where generated resources will be stored", "<folderName>");
  public static final CliOption Package = new CliOption("package", "pkg", "Sets the package of the generated class", "<package>");
  public static final CliOption ClassName = new CliOption("classname", "cn", "Sets the name of the generated class", "<classname>");
  public static final CliOption Format = new CliOption("format", "fmt", "Sets the format of the generated code", "<format>");

  private RecorderCliOptions() {
  }
}
