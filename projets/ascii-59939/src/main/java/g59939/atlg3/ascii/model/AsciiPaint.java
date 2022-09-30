package g59939.atlg3.ascii.model;

public class AsciiPaint {
    private Drawing drawing;

    public AsciiPaint() {
    }

    public AsciiPaint(int width, int height) {
        this.drawing = new Drawing(width, height);
    }
}
