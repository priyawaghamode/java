import java.applet.Applet;
import java.awt.*;
public class assign6_22 extends Applet
{
  String msg;
  public void init()
  {
     setBackground(Color.cyan);
     setForeground(Color.red);
     msg="Inside init( ) --";
    }
  public void start()
  {
     msg+="Inside start( ) --";
   }
  public void paint(Graphics g)
  {
    msg+="Inside paint( ).";
    g.drawString(msg, 10, 30);
  }
}
/*<applet code="assign6_22.class" width="300" height="300">
</applet code>*/
