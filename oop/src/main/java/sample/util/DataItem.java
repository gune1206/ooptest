package sample.util;

/**
 * Created by Gun on 2015-12-08.
 */
public class DataItem <T> {
    private final T data;
    private final int sequence;

    public DataItem(T data,int sequence){
        this.data=data;
        this.sequence= sequence;
    }

    public Class<?> getType(){
        return data.getClass();
    }

    public T getData(){
        return data;
    }

    public int getSequence(){
        return sequence;
    }
}
