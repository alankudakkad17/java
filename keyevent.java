package program1;
import java.awt.*;
import java.awt.event.*;
public class keylab  extends Frame implements KeyListener {
Label label;
TextArea textArea;
keylab(){
label=new Label();
label.setBounds (20,50, 100, 20);
textArea=new TextArea();
textArea.setBounds (20,80, 300, 300);
textArea.addKeyListener(this);

add(label);
add(textArea);
setSize(400, 400);
setLayout(null);
setVisible(true);

addWindowListener(new WindowAdapter() {
public void windowClosing (WindowEvent e) {
System.exit(0);
}
});
}
public void keyPressed (KeyEvent e) {
label.setText("Key Pressed");
}
public void keyReleased (KeyEvent e) {
label.setText("Key Released");
}
public void keyTyped (KeyEvent e) {
label.setText("Key Typed");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new keylab();
}

}
