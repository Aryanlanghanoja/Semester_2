import java.awt.event.*;
import javax.swing.*;

public class HelloWorld extends JFrame
{
    JButton btn ;
    JLabel label;
    JPanel Panel;

    public HelloWorld()
    {
        btn = new JButton();
        label = new JLabel();
        Panel = new JPanel();
        btn.setText("Click Me");
        setTitle("Hello From Swing");
        Panel = new JPanel();
        btn.setToolTipText("Click The Button.");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Panel.add(btn);
        Panel.add(label);
        add(Panel);

        btn.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent ae)
            {
                btnMouseClicked(ae);
            }
        });

    }

    private void btnMouseClicked(java.awt.event.MouseEvent ae)
    {
        label.setText("Hello World!");
    }
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelloWorld();
            }
        });
    }
}