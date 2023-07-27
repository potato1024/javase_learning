package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio/a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio/b.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();

    }

}
