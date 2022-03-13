import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorFrame extends JFrame {


    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(color());
        repaint();
    }


    public static void main(String[] args) throws Exception {

        while (true) {
            ColorFrame colorFrame = new ColorFrame();
            colorFrame.showOnRandomPlace();
            Thread.sleep(100);
        }


    }


}
