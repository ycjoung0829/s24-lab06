package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean getOccupied(int position) {
        return this.occupied[position];
    }

    public int getSize() {
        return this.occupied.length;
    }
}
