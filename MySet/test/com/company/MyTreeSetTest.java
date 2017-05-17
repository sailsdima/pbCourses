package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by dima on 17.05.17.
 */
class MyTreeSetTest {

    private MyTreeSet set;

    @BeforeEach
    void setUp(){
        set = new MyTreeSet();
        set.add("6");
        set.add("5");
        set.add("1");
        set.add("8");
        set.add("9");
        set.add("2");
    }

    @Test
    void getSizeTest() {
        assertEquals(6, set.getSize());
    }

    @Test
    void containsTrueTest() {
        assertTrue(set.contains("6"));
    }
    @Test
    void containsFalseTest() {
        assertFalse(set.contains("60"));
    }

    @Test
    void addTest() {
        int oldSize = set.getSize();
        set.add("3");
        assertEquals(oldSize + 1, set.getSize());
        assertTrue(set.contains("3"));
    }

    @Test
    void addExistingElementTest() {
        int oldSize = set.getSize();
        set.add("6");
        assertEquals(oldSize, set.getSize());
        assertTrue(set.contains("6"));
    }

    @Test
    void addSomeElementsTest() {
        int oldSize = set.getSize();
        set.add("3");
        set.add("60");
        set.add("70");
        assertEquals(oldSize + 3, set.getSize());
        assertTrue(set.contains("3") && set.contains("60") && set.contains("70"));
    }

    @Test
    void removeNodeWithTwoChildNotLeftTest() {
        int oldSize = set.getSize();
        set.remove("6");
        set.iterator();
        assertEquals(oldSize - 1, set.getSize());
        assertFalse(set.contains("6"));
    }

    @Test
    void removeNodeWithTwoChildLeftTest() {
        set.add("7");
        int oldSize = set.getSize();
        set.remove("6");
        set.iterator();
        assertEquals(oldSize - 1, set.getSize());
        assertFalse(set.contains("6"));
    }

    @Test
    void removeNodeWithOneChildTest() {
        int oldSize = set.getSize();
        set.remove("1");
        assertEquals(oldSize - 1, set.getSize());
        assertFalse(set.contains("1"));
    }

    @Test
    void removeNodeWithNoChildTest() {
        int oldSize = set.getSize();
        set.remove("2");
        assertEquals(oldSize - 1, set.getSize());
        assertFalse(set.contains("2"));
    }

    @Test
    void removeNotExistingElementTest() {
        int oldSize = set.getSize();
        set.remove("3");
        assertEquals(oldSize, set.getSize());
    }

    @Test
    void removeAllTest() {
        set.removeAll();

        assertEquals(0, set.getSize());
    }

    @Test
    void removeAllWithNoExistingElementsTest() {
        set = new MyTreeSet();
        set.removeAll();
        assertEquals(0, set.getSize());
    }

    @Test
    void getMaxDepth() {
        assertEquals(4, set.getMaxDepth());
    }

    @Test
    void iterator() {
        Iterator<String> iterator = set.iterator();
        List<String> list = new ArrayList<>();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        assertArrayEquals(new String[]{"6", "5", "1", "2", "8", "9"}, list.toArray());
    }

    @Test
    void isNotEmptyTest() {
        assertFalse(set.isEmpty());
    }

    @Test
    void isEmptyTest() {
        set.removeAll();
        assertTrue(set.isEmpty());
    }

}