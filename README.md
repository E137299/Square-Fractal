# Square-Fractal

**Objective:**  
The goal of this assignment is to create a program that draws a recursive square fractal using Java Swing. Fractals are excellent for practicing recursion as they involve repeating patterns that grow smaller with each iteration.

![Square Fractal](SquareFractal.PNG)
---

### **Instructions:**

1. **Starter Code and Setup:**  
   Begin by creating a `JFrame` window with a resolution of `1024x768`. Use the provided `drawSquare` method as the starting point. This method will draw a single rectangle in the center of the screen.

   **Starter Code:**
   ```java
   import javax.swing.*;
   import java.awt.*;

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
   ```

2. **80-Point Version:**  
   Modify the `drawSquare` method to recursively draw **four rectangles** (one at each corner of the initial rectangle). Each rectangle must:
   - Be half the width and height of the previous rectangle.
   - Call itself recursively until the rectangle size is **less than or equal to 1 pixel** in width or height.
   - Use the `delay` method to observe the fractal drawing process.

   **Hints:**  
   - For each rectangle, calculate the new dimensions and position based on the corner it is drawn.
   - Use `depth` as a control parameter to stop recursion.

3. **100-Point Version:**  
   Modify the recursion so that **only three rectangles** are drawn at each corner, except for the initial rectangle, which draws all four. This adds complexity as you must ensure no rectangles overlap incorrectly.

   **Hints:**  
   - Carefully decide which three corners to draw rectangles for after the first rectangle.
   - You may need to add logic or flags to track which corners are being drawn.

4. **110-Point Version:**  
   Add **color** to the fractal. Use colors to differentiate between recursion levels. Each recursive call should use a slightly different color (e.g., based on `depth`).

   **Hints:**  
   - Use the `Color` class to define colors based on recursion depth.
   - Example: `g.setColor(new Color(depth * 20 % 255, 100, 255 - depth * 20 % 255));`.

---

### **Expected Output Examples:**

#### **80-Point Version Output:**
- The fractal fills the screen with rectangles drawn at four corners of each rectangle, recursively, until the size of the rectangle is 1 pixel.

#### **100-Point Version Output:**
- The fractal fills the screen but draws rectangles at **only three corners** for every rectangle except the first one. The resulting pattern is more intricate.

#### **110-Point Version Output:**
- The fractal is colorful, with each recursion depth adding a distinct color to the rectangles.

---

### **Evaluation Rubric:**
| **Criteria**               | **Points** |
|----------------------------|------------|
| Draws rectangles recursively at four corners (80-point version) | 30         |
| Stops recursion at the correct size (base case)                | 20         |
| Adjusts to screen resolution parameters                        | 10         |
| Implements three-corner rectangle drawing (100-point version)  | 20         |
| Adds color to fractals based on recursion depth (110-point version) | 20         |

---

