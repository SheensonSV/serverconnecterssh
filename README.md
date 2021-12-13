# serverconnecterssh
Specific Connecter through ssh too server.

@Author: Sheenson Sergei.

Main part of this programm is designed for start from jar with arg "params.yml"
Params.yml is contains specific parameters for connection to server:
host: ip address
port: 22 (or someoneelse)
login: root (or not)
password: ""
dstServer: "" - for some string data
backupLocation: "" - for some string data

if data is correct it produced stable connection due to server (host). 
And than it does some command to execute.
You can write some command to execute on connected server in class ChannelExpluatate where is static method ConnectEXEC.
Variable commandToPing may cointains command that you need to execute on server.

Connection is made throught JSch lib. 
Parsing of yml is made through YamlSnake

This programm was created due to solve some spicies problems in enterprise network.

-----
FreeToUse if it help somebody to clear its problems.