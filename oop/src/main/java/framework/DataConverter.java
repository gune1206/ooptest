package framework;

import java.util.List;

/**
 * Created by Gun on 2015-12-08.
 */
public interface DataConverter<T> {
    T convertToT(String string);
    String convertToString(T data);
}
