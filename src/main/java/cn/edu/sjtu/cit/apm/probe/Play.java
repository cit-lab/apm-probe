package cn.edu.sjtu.cit.apm.probe;

/**
 * Created by at15 on 15-8-24.
 */
public class Play {
    public static void main(String[] args) throws Exception {
        UDPClient client = new UDPClient("localhost", 9876);
        client.send("aaaa");
        client.send("APM_REGISTER");
        client.registerProc();
    }
}