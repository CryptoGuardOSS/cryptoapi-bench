package org.cryptoapi.bench.impropersslsocketfactory;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class ImproperSocketManualHostABICase2 {
    public static final String DEFAULT_HOST_NAME = "my.host.name";
    private static char[] HOST_NAME;
    private static char[] hostName;

    public static void main(String [] args) throws IOException {
        int soc = 443;
        go2();
        go3();
        go(soc);

    }
    private static void go2(){
        HOST_NAME = DEFAULT_HOST_NAME.toCharArray();
    }
    private static void go3(){
        hostName = HOST_NAME;
    }

    private static void go(int soc) throws IOException {
        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) ssf.createSocket(hostName.toString(),soc);
    }
}
