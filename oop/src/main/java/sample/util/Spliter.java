package sample.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gun on 2015-12-09.
 */
public class Spliter<T> {
    private Converter<T> converter;
    private List list;

    public Spliter(){
        converter = new Converter<>();
        list = new ArrayList<>();
    }


    public List splitData(T data){
        final String string=converter.convertToString(data);
        list.add(string.split(""));

        return list;
    }
}
