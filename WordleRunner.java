import javax.swing.*;   
import java.io.File;

	
public class WordleRunner{    
	ButtonExample(){    
		JFrame f=new JFrame("Button Example");            
		JButton b=new JButton(new ImageIcon("C:Windows/Users/s642761/Desktop/icon.png"));    
		b.setBounds(100,100,100, 100);    
		f.add(b);    
		f.setSize(800,1200);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
	
	public static void main(String[] args) {    
    	new WordleRunner();    
	}    
}    
