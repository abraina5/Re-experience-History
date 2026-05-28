import javax.swing.*;

public class Creator {
    public static void main(String[] args) {
        //creating instance of JFrame
        JFrame f= new JFrame();

        JLabel label1 = new JLabel ("Welcome!");
        JLabel label2 = new JLabel("Which historical event would you like to reexperience?");
        
        label1.setBounds(210,20,280,10);
        label2.setBounds(50,40,460,40);
        
        JButton b1 = new JButton("D-Day");
        b1.setBounds(50, 100, 180, 40);
        b1.addActionListener(n -> DDay.intro());
        
        
        JButton b2 = new JButton("Battle of Trenton");
        b2.setBounds(260, 100, 180, 40);
        
        
        f.add(b1);
        f.add(b2);
        f.add(label1);
        f.add(label2);


        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
