package ru.mephi.laba1;

class MyMap {

    MyList records = new MyList(); // creating new list for records


    public void put(Object key, Object value) {
        int index = findIndexOfKey(key);
        if(index == -1) {
            Record rec = new Record(key, value);
            records.add(rec);
        }
        else {
            ((Record) records.get(index)).setValue(value);
        }
    }

    public int findIndexOfKey(Object key) {
        for (int index = 0; index < records.size(); index++) {
            if (((Record) records.get(index)).getKey() == key) { // trying to get key from the list by turning type Object into type Record
                return index;
            }
        }
        return -1; // in case there is no such a key in records
    }

    public Object get(Object key) {
        int index = findIndexOfKey(key);
        if (index != -1) {
            return ((Record) records.get(index)).getValue();
        } else return null;
    }

    public Object get(Object key, Object byDefault) {
        if (get(key) == null) {
            int index = findIndexOfKey(key);
            if (index != -1) {
                ((Record) records.get(index)).setValue(key);
                return byDefault;
            } else {
                put(key, byDefault);
                return byDefault;
            }
        }
        return get(key);
    }

    public Object remove(Object key) {
        int index = findIndexOfKey(key);
        if (index == -1) {
            return null;
        }
        Object removedObject = ((Record) records.get(index)).getValue();
        records.remove(index);
        return removedObject;
    }

    public boolean keyContains(Object key) {
        return findIndexOfKey(key) != -1;
    }

    public MyList getKeys() {
        MyList listOfKeys = new MyList();
        for (int i = 0; i < records.size(); i++) {
            listOfKeys.add(((Record) records.get(i)).getKey());
        }
        return listOfKeys;
    }

    public MyList getValues() {
        MyList listOfValues = new MyList();
        for (int i = 0; i < records.size(); i++) {
            listOfValues.add(((Record) records.get(i)).getValue());
        }
        return listOfValues;
    }

    public MyList getEntries() {
        return records;
    }

    public int size() {
        return records.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static void main(String[] args) {
//        MyMap map = new MyMap();
//        System.out.println(map.isEmpty());
//        map.put(1, "a");
//        System.out.println(map.findIndexOfKey(1));
//        map.put(2, "b");
//        map.put(3, "c");
//        map.put(4, "d");
//        System.out.println(map.get(1));
//        System.out.println(map.get(3));
//        System.out.println(map.get(5, "e"));
//        System.out.println(map.size());
//        System.out.println(map.remove(1));
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.keyContains(5));
//        map.put(5, "a");
//        System.out.println(map.get(5));
    }

}