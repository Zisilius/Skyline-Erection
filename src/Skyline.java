import javax.swing.*;

public class Skyline
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Skyline project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SkylinePanel());
        frame.pack();
        frame.setVisible(true);
    }
}
