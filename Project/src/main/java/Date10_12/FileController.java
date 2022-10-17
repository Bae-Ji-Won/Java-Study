package Date10_12;

import Date10_12.pasrser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileController<T> {
    String filename = "C:\\DB file\\seoul_hospital_information.txt";
    Parser<T> parser;
    boolean isRemoveColumnName = true;

    public FileController(Parser<T> parser) {
        this.parser = parser;
    }

    public FileController(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    List<T> readLines() throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        if (isRemoveColumnName) {
            br.readLine();
        }
        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }

}
