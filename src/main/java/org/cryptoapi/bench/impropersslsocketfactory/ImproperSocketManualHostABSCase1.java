package org.cryptoapi.bench.impropersslsocketfactory;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class ImproperSocketManualHostABSCase1 {
    CryptoImproperSocketManualHostname1 crypto;
    public ImproperSocketManualHostABSCase1() {
        String hostname = "my.host.name";
        int soc = 443;
        crypto = new CryptoImproperSocketManualHostname1(hostname, soc);
    }
}

class CryptoImproperSocketManualHostname1 {
    String defHostname;
    int defSoc;

    public CryptoImproperSocketManualHostname1(String hostname, int soc) {
        defHostname = hostname;
        defSoc = soc;
    }

    public void encrypt(String passedHostname,int passedSoc) throws IOException {

        if(passedHostname.isEmpty()) {
            passedHostname = defHostname;
            passedSoc = defSoc;
        }

        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) ssf.createSocket(passedHostname,passedSoc);
    }
}
