package main;

import com.jcraft.jsch.*;

import java.io.IOException;
import java.io.InputStream;

public class ChannelExpluatate {
    public static void ConnectEXEC(Session session) throws JSchException, IOException {
        String commandToPing = "";
        ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
        channelExec.connect();

        channelExec.setCommand(commandToPing);
        channelExec.setInputStream(null);
        channelExec.setErrStream(System.err);

        InputStream in = channelExec.getInputStream();

        channelExec.connect();
        byte[] tmp = new byte[1024];
        while (true)
        {
            while (in.available() > 0)
            {
                int i = in.read(tmp, 0, 1024);
                if (i < 0)
                    break;
                System.out.print(new String(tmp, 0, i));
            }
            if (channelExec.isClosed())
            {
                System.out.println("exit-status: " + channelExec.getExitStatus());
                break;
            }
        }
        channelExec.disconnect();
        session.disconnect();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connection avoided.");

    }

    public static void ConnectSFTP(Session session) throws JSchException {
        ChannelSftp channel = (ChannelSftp) session.openChannel("sftp");
        channel.connect();

        channel.disconnect();
        session.disconnect();
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
        }

        System.out.println("Connection avoided.");
    }
}
