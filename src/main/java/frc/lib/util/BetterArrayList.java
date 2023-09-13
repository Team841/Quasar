package frc.lib.util;

import java.util.ArrayList;

public class BetterArrayList<E> extends ArrayList<E> {

    /**
     * Gets the union of this ArrayList and another ArrayList.
     */
    public BetterArrayList<E> union(BetterArrayList<E> other) {
        BetterArrayList<E> unionArray = other;
        
        for (E element : this) {
            if (!unionArray.contains(element)) {
                unionArray.add(element);
            }
        }

        return unionArray;
    }
}
