package main;

public class Server {
    private String host;
    private int port;
    private String login;
    private String password;
    private String dstServer;
    private String backupLocation;

    public Server(String host, int port, String login, String password, String dstServer, String backupLocation) {
        this.host = host;
        this.port = port;
        this.login = login;
        this.password = password;
        this.dstServer = dstServer;
        this.backupLocation = backupLocation;
        RightValueValidator.validateServerParams(this);
    }

    public Server(){
    }


    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getDstServer() {
        return dstServer;
    }

    public String getBackupLocation() {
        return backupLocation;
    }

    @Override
    public String toString() {
        return "Server{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", dstServer='" + dstServer + '\'' +
                ", backupLocation='" + backupLocation + '\'' +
                '}';
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDstServer(String dstServer) {
        this.dstServer = dstServer;
    }

    public void setBackupLocation(String backupLocation) {
        this.backupLocation = backupLocation;
    }
}
