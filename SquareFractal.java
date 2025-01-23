import java.awt.*;
import javax.swing.*;

public class SquareFractal extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Fractals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.add(new SquareFractal());
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSquare(g, 1024, 768, 6); // Initial depth is 6
    }

    public void drawSquare(Graphics g, int maxX, int maxY, int depth) {
        int midX = maxX / 2;
        int midY = maxY / 2;
        int startWidth = maxX / 4;
        int startHeight = maxY / 4;
        int tlX = midX - (startWidth / 2);
        int tlY = midY - (startHeight / 2);
        g.fillRect(tlX, tlY, startWidth, startHeight);

        // Add recursion logic here
    }

    public void delay(long n) {
        n *= 1000;
        long startDelay = System.nanoTime();
        long endDelay = 0;
        while (endDelay - startDelay < n)
            endDelay = System.nanoTime();
    }
}
