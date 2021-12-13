package main;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHConnector {
    private static JSch jSch = new JSch();

    private SSHConnector(){}
    public static Session sshconnector(Server server) throws JSchException {
        Session session = jSch.getSession(
                    server.getLogin(),
                    server.getHost(),
                    server.getPort()
                );

        session.setPassword(server.getPassword());
        session.setConfig("StrictHostKeyChecking", "no");
        System.out.println("Establishing Connection...");
        session.connect();
        if (session.isConnected())
        {
            System.out.println("Connected to Server " + server.getHost() + ":" + server.getPort());
        }
        return session;
    }
}
