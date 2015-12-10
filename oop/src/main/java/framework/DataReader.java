package framework;

import java.io.IOException;

/**
 * Created by Gun on 2015-12-08.
 */
public interface DataReader<T> {
    T readData() throws IOException;
    boolean hasNext();
}
