package nl.bioinf.java_demos.deploy;

import org.apache.commons.cli.*;

import java.time.LocalDateTime;

public class CommandLineOptionsProcessor {

    private Options options;

    public CommandLineOptionsProcessor() {
        init();
    }

    final void init() {
        // create Options object
        options = new Options();
        // add t option
        options.addOption("t", false, "display current time");
    }

    void processCommandLine(String[] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse( options, args);
            if (cmd.hasOption('t')) {
                LocalDateTime now = LocalDateTime.now();
                System.out.println(now.toLocalDate());
                System.out.println(now.toLocalTime());
            } else {
                System.out.println("don't know anything but the time...");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
