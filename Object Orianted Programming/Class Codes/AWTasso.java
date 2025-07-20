// importing Java AWT class using Association
import java.awt.*;
// class AWTExample2 directly creates instance of Frame class
class AWTasso {
// initializing using constructor
AWTasso() {
// creating a Frame
Frame f = new Frame();
// creating a Label
Label l = new Label("ID:");
// creating a Button
Button b = new Button("Submit");
b.getColorModel();
// creating a TextField
TextField t = new TextField();
// setting position of above components in the frame
l.setBounds(20, 80, 80, 30);
t.setBounds(20, 100, 80, 30);
b.setBounds(100, 100, 80, 30);
// adding components into frame
f.add(b);
f.add(l);
f.add(t);
// frame size 300 width and 300 height
f.setSize(400, 300);
// setting the title of frame
f.setTitle("info");
// no layout
f.setLayout(null);
// setting visibility of frame
f.setVisible(true);
}
// main method
public static void main(String args[]) {
// creating instance of Frame class
AWTasso awt_asso = new AWTasso();
}
}
