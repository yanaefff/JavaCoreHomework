package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    static String[] header = {"Value 1", "Value 2", "Value 3"};
    static int[][] data = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
    public static final String path = "src/resources/result.csv";

    public static void main(String[] args) throws IOException {

    writeData(header, data, path);
    AppData appData = readData(path);

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

    }

    public static void writeData (String[] header, int[][] data, String path) throws IOException {
        try (FileWriter writer = new FileWriter(path)){
            for (String str : header){
                writer.write(str + "; ");
            } System.getProperty("line.separator");
           for (int[] value : data){
               writer.write(System.getProperty("line.separator"));
               for (int valueInside : value){
                   writer.write(valueInside + "; ");
               }
           }
        }
    }

    public static AppData readData (String path) throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            appData.setHeader(line.split("; "));
            while ((line = reader.readLine()) != null) {
                String[] values = line.split("; ");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.parseInt(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }
}
