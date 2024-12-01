import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame(){
        
        this.setTitle("JFrame title"); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false); 
        this.setSize(480,480); 
        this.setVisible(true); 

        ImageIcon image = new ImageIcon("channels4_profile.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); 
        this.getContentPane().setBackground(Color.BLACK); 
        
        
    }
}
