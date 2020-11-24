package prog2gamedev;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ControlledWindow extends JFrame{
    SimpleAnimation p;

    ControlledWindow(final SimpleAnimation p){
        this.p=p;
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(1);
            }
            @Override
            public void windowDeactivated(WindowEvent e){
                p.t.stop();
            }
            @Override
            public void windowActivated(WindowEvent e){
                p.t.start();
            }
        });

        add(p);
        pack();
        setVisible(true);
    }
}

