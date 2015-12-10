package sample.processor;

import framework.DataProcessor;
import framework.DataReader;
import framework.DataWriter;
import sample.util.Converter;
import sample.util.Merger;
import sample.util.Sort;
import sample.util.Spliter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gun on 2015-12-08.
 */
public class BatchProcessor<T> implements DataProcessor<T> {
    private Converter<T> converter;
    private Merger<T> merger;
    private Spliter<T> spliter;
    private Sort sort;
    private List list;

    public BatchProcessor() throws IOException {
        converter = new Converter<>();
        merger = new Merger<>();
        spliter = new Spliter<>();
        sort = new Sort();
        list = new ArrayList<>();
    }


    public void processData(DataReader<T> dataReader, DataWriter<T> dataWriter, Sort sort) throws IOException {
        while (dataReader.hasNext()) {
            final T notprocessData = dataReader.readData();
            list = spliter.splitData(notprocessData);
            Collections.sort(list);
            final T processdData =merger.mergeData(list);
            dataWriter.writeData(processdData);
        }
    }
}
