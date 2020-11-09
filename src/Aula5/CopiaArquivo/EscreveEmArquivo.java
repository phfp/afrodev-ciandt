package Aula5.CopiaArquivo;

import java.io.*;

public class EscreveEmArquivo {

    static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

    public void Escrever() {

        final String dataFile = "invoicedata";

        DataOutputStream out;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

            for (int i = 0; i < prices.length; i++) {
                try {
                    out.writeDouble(prices[i]);
                    out.writeInt(units[i]);
                    out.writeUTF(descs[i]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }

}
