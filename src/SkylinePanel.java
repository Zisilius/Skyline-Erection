import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
    private Building[] build = new Building[5];
    
    public SkylinePanel()
    {
        build[0] = new Building( 40, 200, 160, 400);
        build[1] = new Building( 220, 290, 90, 310);
        build[2] = new Building( 330, 400, 200, 200);
        build[3] = new Building( 560, 60, 120, 540);
        build[4] = new Building( 700, 250, 60, 350);

        setPreferredSize(new Dimension( 800, 600));
        setBackground(Color.red);
    }

    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        for (int i = 0; i < build.length; i++)
            build[i].draw(page);
        page.drawString("Erected by Alexey Golubev", 200, 50);
    }
}         
