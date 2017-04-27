/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lekimloitcu
 */
import java.awt.*;
import java.awt.event.*;
public class EX6  extends Frame implements EX6Listener {
     private TextField tfInput;  
   private TextArea taDisplay; 
   public KeyEventDemo() {
      setLayout(new FlowLayout()); 
 
      add(new Label("Enter Text: "));
      tfInput = new TextField(10);
      add(tfInput);
      taDisplay = new TextArea(5, 40); 
      add(taDisplay);
 
      tfInput.addKeyListener(this);
        
      setTitle("KeyEvent Demo"); 
      setSize(400, 200);         
      setVisible(true);          
   }
 
  
   public static void main(String[] args) {
      new KeyEventDemo();  
   }
 
   
   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
 
   
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
}
    
}
