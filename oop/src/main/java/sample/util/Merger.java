package sample.util;

import java.util.List;

/**
 * Created by Gun on 2015-12-09.
 */
public class Merger<T> {
    private Converter<T> converter;

    public Merger() {
        converter = new Converter<>();
    }

    public T mergeData(List list) {
        String string = "";
        for (int i = 0; i < list.size(); i++) {
            string += list.get(i);
        }
        return converter.convertToT(string);
    }
}
