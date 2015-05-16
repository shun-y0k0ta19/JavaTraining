package ex20_08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EntryTable {

    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("specify name of file");
        List<Long> table = new ArrayList<>();
        RandomAccessFile file;
        try {
            file = new RandomAccessFile(new File(args[0]), "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try {
           
            String line;
            boolean first = true;
            while ((line = file.readLine()) != null) {
                if (line.startsWith("%%")) {
                    first = true;
                    continue;                    
                }
                if (first)
                    table.add(file.getFilePointer() - line.length() - 1);
                first = false;
            }
            
     
            for (Long l : table)
                System.out.println("Entry Position: " + l);
            
      
            int target = (int) (Math.random() * 1000) % table.size();
            
        
            file.seek(table.get(target));
            while ((line = file.readLine()) != null) {
                if (line.startsWith("%%"))
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}