package but.gmon3;

import java.util.EmptyStackException;

/**
 * Une pile basique composé d'Item.
 */
public interface SimpleStack {

    /**
     * Tests if this stack is empty.
     * @return True si stack empty, sinon false.
     */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     * @return La taille du stack.
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item Un item que l'on push.
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     * @return Renvoie le dernier item ajouté à la stack.
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     * @throws EmptyStackException if this stack is empty.
     * @return Enlève le dernier item de la stack.
     */
    Item pop() throws EmptyStackException;
}
