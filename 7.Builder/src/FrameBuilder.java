import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class FrameBuilder implements Builder, ActionListener{
    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);

    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    @Override
    public void makeItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < items.length; i++) {
            JButton button = new JButton(items[i]);
            button.addActionListener(this);
            innerBox.add(button);
        }
        box.add(innerBox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public JFrame getResult(){
        return frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed : " + e.getActionCommand());
    }

}
