import javax.swing.*;

public class DDay {
    public static void intro() {
        JFrame f= new JFrame();
        
        JLabel label1 = new JLabel("Would you like to see the Allies side or the Nazi side?");
        
        label1.setBounds(50,30,380,10);

        JButton b1 = new JButton("Allies");
        b1.setBounds(50, 100, 180, 40);
        b1.addActionListener(n -> DDay.allies());
        
        
        JButton b2 = new JButton("Nazi");
        b2.setBounds(260, 100, 180, 40);
        b2.addActionListener(n -> DDay.nazi());
        
        
        f.add(b1);
        f.add(b2);
        f.add(label1);

        
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void allies() {
        
    }
    
    public static void nazi() {
        
    }
}
