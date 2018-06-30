package mx.qbits.sample;

import org.apache.log4j.Logger;

public class Prueba {
    private static final String RUTA = "/Users/garellano/Desktop/ok.png";
    private static final Logger logger = Logger.getLogger(Prueba.class);
    
    public static void main(String...argv) {
        QRCode.createQR("Texto en el QR", RUTA);
        logger.info("Done !!!!");
    }
    public int fact(int n) {
        return (n<2)?1:n*fact(n-1);
    }
}
