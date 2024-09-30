package Context;

// Extrinsic State (Context)
public class CharacterContext {
    private int x, y;
    private String font;
    private int size;

    public CharacterContext(int x, int y, String font, int size) {
        this.x = x;
        this.y = y;
        this.font = font;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }
}
