package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RightValueValidator {
    private RightValueValidator(){}

    public static void validateServerParams(Server server) {
        int firstAllowedPort = 0;
        int lastAllowedPort = 9999;

        String maybeIP = server.getHost();
        Pattern patternIP = Pattern.compile("(([0-9]{1,3}\\.){3})[0-9]{1,3}");
        Matcher matcher = patternIP.matcher(maybeIP);
        if (!matcher.matches()) {
            throw new RuntimeException("Ip address of server to connect is not valid");
        }

        if (server.getPort() < firstAllowedPort && server.getPort() > lastAllowedPort) {
            throw new RuntimeException("Port is not valid");
        }
    }
}
