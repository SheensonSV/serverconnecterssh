package main;

import com.jcraft.jsch.JSchException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, JSchException {
        String baseFileAddress = "params.yml";
        if (args.length != 0) {
            baseFileAddress = args[0];
        }
        ChannelExpluatate.ConnectEXEC(SSHConnector.sshconnector(YamlParser.yamlParser(baseFileAddress)));

    }
}
