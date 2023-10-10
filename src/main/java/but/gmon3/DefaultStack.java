package but.gmon3;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implémentation de SimpleStack.
 */
public class DefaultStack implements SimpleStack {

    /**
     * Liste d'items.
     */
    private final ArrayList<Item> listItem = new ArrayList<>();

    /**
     * Tests if this stack is empty.
     *
     * @return True si stack empty, sinon false.
     */
    @Override
    public boolean isEmpty() {
        return listItem.size() == 0;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return La taille du stack.
     */
    @Override
    public int getSize() {
        return listItem.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item Un item que l'on push.
     */
    @Override
    public void push(final Item item) {
        listItem.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     *
     * @return Renvoie le dernier item ajouté à la stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        return listItem.get(listItem.size()-1);
    }

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     *
     * @return L'objet qui a été enlevé.
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        int index = listItem.size()-1;
        Item item = listItem.get(index);
        listItem.remove(getSize()-1);
        return item;
    }
}
