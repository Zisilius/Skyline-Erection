import java.awt.*;
import java.util.Random;

public class Building
{
    private int _x, _y, _width, _height;
    private Random rand = new Random(System.currentTimeMillis()/1000);

    public Building(int x, int y, int width, int height)
    {
        _x = x;
        _y = y;
        _width = width;
        _height = height;
    }

    public void draw(Graphics page)
    {
        page.setColor(Color.black);
        page.fillRect( _x, _y, _width, _height);

        page.setColor(Color.yellow);
        int a = _x + 4, b = _y + 8;

        while (true) {
            
            if ( a < ((_x + _width) - 50)) 
                a += 8;
            else if (b < (_y + _height - 26)) {
                b += 12;
                a = _x + 4;
            }
            else
                break;

            if (rand.nextInt(10000000) % 3 == 0) 
                page.fillRect( a, b, 4, 8);
        }
    }
    
    public int getWidth()
    {
        return _width;
    }

    public int getHeight()
    {
        return _height;
    }

}
