package sample.util;

import framework.DataConverter;

import java.util.List;

/**
 * Created by Gun on 2015-12-08.
 */
public class Converter<T> implements DataConverter<T> {
    public T convertToT(String string) {
        return (T) string;
    }

    public String convertToString(T data) {
        return (String) data;
    }
}
