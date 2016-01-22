import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pedrosilva on 1/14/16.
 */
public class MainPage {

    public JFrame MainFrame = new JFrame("Saving Dave");

    public static void main(String[] args){

        MainPage m = new MainPage();
        m.MainPage();

    }



    public void MainPage(){

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //------------------------------------------------------------------------

        JLabel lTitle = new JLabel();
        JLabel lLabel = new JLabel();

        JButton bBegin = new JButton();

        //------------------------------------------------------------------------

        lTitle.setText("Saving Dave");
        lLabel.setText("click anywhere to begin");

        //bBegin.setText("Begin");

        //------------------------------------------------------------------------

        bBegin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String args = new String();
                BeginGame.main(args);

                MainFrame.dispose();

            }
        });

        //------------------------------------------------------------------------

        lTitle.setFont(new Font("Serif", Font.PLAIN, 30));
        lLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        //bBegin.setFont(new Font("Serif", Font.PLAIN, 25));

        //------------------------------------------------------------------------

        lTitle.setBounds(175, 50, 200, 30);
        lLabel.setBounds(155, 100, 200, 30);

        bBegin.setBounds(190, 100, 100, 30);

        //------------------------------------------------------------------------

        MainFrame.add(lTitle);
        MainFrame.add(lLabel);

        MainFrame.add(bBegin);

        //------------------------------------------------------------------------

        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension ( 500, 200 );

        MainFrame.setBounds(ss.width / 2 - frameSize.width / 2,
                ss.height / 2 - frameSize.height / 2,
                frameSize.width, frameSize.height);

        MainFrame.setResizable(false);
        MainFrame.setMinimumSize(new Dimension(500, 200));
        MainFrame.setVisible(true);
        MainFrame.setLayout(null);
        MainFrame.pack();

    }

}
