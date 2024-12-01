import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelProg {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both
        
        ImageIcon image = new ImageIcon("boy.png");
        Border border = BorderFactory.createLineBorder(Color.blue,3);


        JLabelProg label = new JLabelProg(); // create a label
        label.setText("Bro, how are you ?"); // set text lebel
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabelProg.CENTER); //set text to left, right or center of IMAGEICON
        label.setVerticalTextPosition(JLabelProg.TOP); // set text top center or bottom of IMAGEICON
        label.setForeground(Color.BLUE); // set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(-5); // set gap of text to image
        label.setBackground(Color.BLACK); // set background colour
        label.setOpaque(true); // display the background colou
        label.setBorder(border);
        label.setVerticalAlignment(JLabelProg.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabelProg.CENTER); // set horizontal position of icon+text within label
        //label.setBounds(100,100,450,450); // set x and y positions within frame as well as dimensions 


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // add all components before using pack method mean frame.add(label); this one is before the pack method
    }
}
