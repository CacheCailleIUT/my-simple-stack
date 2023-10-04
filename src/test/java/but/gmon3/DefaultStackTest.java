package but.gmon3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitaire de la classe DefaultStack
 */
class DefaultStackTest {

    /**
     * Check si la pile est vide
     */
    @Test
    void isEmpty() {
        // Given an empty stack
        SimpleStack ss = new DefaultStack();
        // Then the stack is empty
        assertTrue(ss.isEmpty());
        // Then the size of the stack is 0
        assertEquals(0, ss.getSize());
    }

    @Test
    void getSize() {
        // Given a stack with 2 items
        SimpleStack ss = new DefaultStack();
        Item item = new DefaultItem();
        Item item2 = new DefaultItem();
        ss.push(item);
        ss.push(item2);
        // When you get the size of the stack
        // Then the size of the stack is 2
        assertEquals(2,ss.getSize());
    }

    @Test
    void push() {
        // Given a stack and 1 item
        SimpleStack ss = new DefaultStack();
        Item item = new DefaultItem();
        // When you push the item in the stack
        ss.push(item);
        // Then the size of the stack is 1 and the stack is not empty
        assertEquals(1, ss.getSize());
        assertFalse(ss.isEmpty());

    }

    @Test
    void peek() {
    }

    @Test
    void pop() {
    }
}