package org.cryptoapi.bench.impropersslsocketfactory;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class ImproperSocketManualHostABICase1 {
    public static void main(String [] args) throws IOException {
        String hostname = "my.host.name";
        int soc = 443;
        go(hostname,soc);

    }

    private static void go(String hostname, int soc) throws IOException {
        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) ssf.createSocket(hostname,soc);
    }
}
