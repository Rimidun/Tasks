import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorFrame extends JFrame {


    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    Color color() throws Exception {
        Random random = new Random();
        //Thread.sleep(3000);
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public void showOnRandomPlace() throws Exception {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(color());
        repaint();
    }


    public static void main(String[] args) throws Exception {
        ColorFrame colorFrame = new ColorFrame();

        while (true) {

            colorFrame.showOnRandomPlace();
            Thread.sleep(1000);
        }


    }


}
