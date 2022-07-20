package org.hillel.homeworks.lesson8.MyTreeMap;

import java.util.*;

public class MyTreeMap<K, V> implements Map<K, V> {

    private Entry<K, V> root;
    private int size;
    private Set<K> keySet = null;

    public MyTreeMap() {
        root = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
        root = null;
    }

    @Override
    public boolean containsKey(Object key) {
        return getEntry((K) key) != null;
    }

    @Override
    public V get(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        Entry<K, V> entry = root, parent = null, newNode;
        int result = 0;
        while (entry != null) {
            parent = entry;
            result = ((Comparable<K>) entry.getKey()).compareTo(key);
            if (result == 0) {// Обновить
                entry.setValue(value);
                return value;
            } else if (result > 0) {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }

        newNode = new Entry<K, V>(key, value, parent);
        if (parent == null) {
            root = newNode;
        } else if (result > 0) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
        size++;
        return value;
    }

    public Entry<K, V> getEntry(K key) {
        Entry<K, V> entry = root, returnEntry;
        int result = 0;
        while (entry != null) {
            result = ((Comparable<K>) entry.getKey()).compareTo(key);
            if (result == 0) {
                return entry;
            } else if (result > 0) {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }
        return null;
    }

    private static class Entry<K, V> implements Map.Entry<K, V> {
        public K key;
        private V value;
        private Entry<K, V> left, right, parent;

        public Entry(K key, V value, Entry<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            return this.value = value;
        }

        public Entry<K, V> getLeft() {
            return left;
        }

        public void setLeft(Entry<K, V> left) {
            this.left = left;
        }

        public Entry<K, V> getRight() {
            return right;
        }

        public void setRight(Entry<K, V> right) {
            this.right = right;
        }

        public Entry<K, V> getParent() {
            return parent;
        }

        public void setParent(Entry<K, V> parent) {
            this.parent = parent;
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }
}

