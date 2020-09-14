package nl.bioinf.java_demos.deploy;

public class CliApp {
    public static void main(String[] args) {
        CommandLineOptionsProcessor commandLineOptionsProcessor = new CommandLineOptionsProcessor();
        commandLineOptionsProcessor.processCommandLine(args);
    }
}
