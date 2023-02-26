import java.util.*;
import java.awt.*;
// import java.awt.event.WindowEvent;
// import java.awt.event.WindowListener;
// import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.xml.validation.ValidatorHandler;



public class PanelSkeleton {
    Label label;
    //Frame frame;
    
    public void PanelCheck() {
        
        JFrame frame = new JFrame("BASIC GUI");
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new Label("Current IP:");
        label.setBounds(40, 20, 75, 30 );

        TextField ipField = new TextField();
        ipField.setText("IP address would be displayed here!");
        ipField.setBounds(140, 20, 550, 30 );

        TextField msgField = new TextField();  //can we add progress bar
        msgField.setText("!Relevant Message would be displayed!"); // instead of a message field
        msgField.setBounds(40, 500, 500, 30);

        Button fileBrowserButton = new Button("FileBrowser");
        fileBrowserButton.setBounds(550, 500, 100, 30 );
        //fileBrowserButton.addActionListener(this);

        Button SendReceiveButton = new Button("Send/Receive");
        SendReceiveButton.setBounds(675, 500, 100, 30);
        //SendReceiveButton.addActionListener(this);

        frame.add(label);
        frame.add(ipField);
        frame.add(msgField);
        frame.add(fileBrowserButton);
        frame.add(SendReceiveButton);
        //frame.addWindowListener(this);

    }
    public static void main(String[] args){
        PanelSkeleton temp = new PanelSkeleton();
        temp.PanelCheck();
    
        System.out.println("Hope this Works");
    
    
    }    
}



    //Frame frame = new Frame().addWindowListener(new WindowAdapter(){
    //     @Override
    //     public void windowClosing(WindowEvent e) {
    //         //super.windowClosing(e);
    //         Frame frame = (Frame)e.getSource();
    //         frame.dispose();
    //     }

    //     @Override
    //     public void windowResized(WindowEvent e) {

            
    //     }
    // });


    




    // public static void main(String[] args){
    //     JFrame frame = new JFrame("BANTER");
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     frame.setSize(800, 600);

    //     JPanel myPanel = new JPanel();

    //     JButton myButton1 = new JButton("Click Me");
    //     JButton myButton2 = new JButton("Hello World!");

    //     myPanel.add(myButton1);
    //     myPanel.add(myButton2);   

    //     frame.add(myPanel);
    //     frame.setVisible(true);
    // }