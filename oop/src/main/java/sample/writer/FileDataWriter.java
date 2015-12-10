package sample.writer;


import framework.DataWriter;
import sample.util.Converter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gun on 2015-12-08.
 */
public class FileDataWriter<T> implements DataWriter<T> {

    private BufferedWriter bufferedWriter = null;
    private Converter<T> converter;

    public FileDataWriter(String fileName) throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        converter = new Converter();
    }

    public void writeData(T data) throws IOException {

        String string = converter.convertToString(data);
        bufferedWriter.write(string);
        bufferedWriter.newLine();

    }

}
