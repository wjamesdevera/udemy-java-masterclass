package com.opencsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CSVReader {
    private String filePath;
    private FileReader fileRead;
    private String[][] table;

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }

//    public String[][] getTable() {
//        String line = "";
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(filePath));
//            while ((line = reader.readLine()) != null) {
//                String[] cols = line.split(",");
//
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    private FileReader readFile() {
        try {
            return new FileReader(filePath);
        } catch (Exception e) {
            return null;
        }
    }


}
