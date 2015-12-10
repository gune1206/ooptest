package sample;

import sample.processor.BatchProcessor;
import sample.reader.FileDataReader;
import sample.util.Sort;
import sample.writer.FileDataWriter;

import java.io.File;
import java.io.IOException;

/**
 * Created by Gun on 2015-12-08.
 */
public class Main {
    public static void main(String[] arg) throws IOException{
        BatchProcessor batchProcessor =new BatchProcessor();
        batchProcessor.processData(new FileDataReader<>(new File("C:\\Users\\Gun\\Documents\\test-master\\test-master\\oop\\input.txt")),new FileDataWriter<>("output.txt"),new Sort());
    }
}
