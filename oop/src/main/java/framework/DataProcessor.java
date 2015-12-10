package framework;

import sample.util.Sort;

import java.io.IOException;

/**
 * Created by Gun on 2015-12-08.
 */
public interface DataProcessor<T> {
    void processData(DataReader<T> dataReader, DataWriter<T> dataWriter, Sort sort) throws IOException;
}
