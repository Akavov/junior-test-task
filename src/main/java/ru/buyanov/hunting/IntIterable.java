package ru.buyanov.hunting;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;


    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {
        int current=0;
        public boolean hasNext() {
            //TODO: You task is implement this method

            return current < backed.length;

        }

        public Integer next() {
            //TODO: You task is implement this method
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return backed[current++];

        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
