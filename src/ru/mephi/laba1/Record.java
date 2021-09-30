package ru.mephi.laba1;

public class Record{
    private Object key;
    private Object value;

    public Record(Object key, Object value){
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setKey(Object key) {
        this.key = key;
    }
}