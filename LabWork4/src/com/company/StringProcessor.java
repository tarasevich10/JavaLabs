package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {


    public String readInputText() throws IOException {
// TODO: add error handling here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        return br.readLine();
    }

    public String processText(String inputText) {
        Pattern p = Pattern.compile("[\\w.]+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}");
        Matcher m = p.matcher(inputText);
        StringBuilder finalStr = new StringBuilder("");

        while (m.find()) {
            String subStr = inputText.substring(m.start(), m.end());
            int sobakaIndex = subStr.indexOf("@");
            String temp = subStr.substring(sobakaIndex);

            finalStr.append(temp + ", ");
        }

        return finalStr.toString();
    }

    public void showResult(String resultText){
        System.out.println(resultText);
    }
}