package framework;

import java.io.IOException;

/**
 * Created by Gun on 2015-12-08.
 */
public interface DataWriter<T> {
    void writeData(T data) throws IOException;
}
