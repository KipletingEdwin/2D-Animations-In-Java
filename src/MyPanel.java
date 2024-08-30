import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("enemy.jpg").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public  void  paint(Graphics g){

        super.paint(g);  //paint background

        Graphics g2D = (Graphics2D) g;

        g2D.drawImage(enemy,x,y,null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();

    }
}
