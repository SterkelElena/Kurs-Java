package practice.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    // fields
    private StringBuilder str;
    private int size;
    private int currPosition;
    // конструктор

    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
       // this.currPosition = 0;
    }


    @Override
    public boolean hasNext() {
        return currPosition < size; // логическое выражение, true - значит ещё есть элементы множества
    }

    // этот метод должен вернуть элемент множества
    @Override
    public Character next() {
        Character curCharacter =str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }
    public void  remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
