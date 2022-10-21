package homework.HW6;

public class Block {
    // Good Luck!
    private int width;
    private int length;
    private int height;

    Block(int[] parameters) {
        width = parameters[0];
        length = parameters[1];
        height = parameters[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width*length*height;
    }

    public int getSurfaceArea() {
        return width*length*6;
    }
}
