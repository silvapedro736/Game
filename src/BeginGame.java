import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pedrosilva on 1/14/16.
 */
public class BeginGame {

    public static Game g = new Game();
    public static Boolean[] check;
    public static String sname;

    public static void main(String args){

        BeginGame bg = new BeginGame();
        bg.Begingame();

    }

    public void Begingame(){

        JFrame BeginGame = new JFrame("Saving Dave");
        
        BeginGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BeginGame.setLayout(null);

        //------------------------------------------------------------------------

        JLabel lTitle = new JLabel();
        JLabel lName = new JLabel();
        JLabel lDifficulty =  new JLabel();

        JTextField tfName = new JTextField();

        JRadioButton rbEasy = new JRadioButton();
        JRadioButton rbNormal = new JRadioButton();
        JRadioButton rbHard = new JRadioButton();
        JRadioButton rbGodLike = new JRadioButton();

        JButton bPlay = new JButton();

        //------------------------------------------------------------------------

        ButtonGroup diff = new ButtonGroup();

        diff.add(rbEasy);
        diff.add(rbNormal);
        diff.add(rbHard);
        diff.add(rbGodLike);

        //------------------------------------------------------------------------

        bPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean easy = rbEasy.isSelected();
                boolean normal = rbNormal.isSelected();
                boolean hard = rbHard.isSelected();
                boolean GodLike = rbGodLike.isSelected();

                check = new Boolean[]{easy, normal, hard, GodLike};
                sname = new String(tfName.getText());

                String args = new String();
                g.main(args);

                String name = new String(tfName.getText());

                BeginGame.dispose();

            }
        });


        //------------------------------------------------------------------------

        lTitle.setText("Saving Dave");
        lName.setText("Enter Your Name: ");
        lDifficulty.setText("Difficulty: ");

        rbEasy.setText("Easy");
        rbNormal.setText("Normal");
        rbHard.setText("Hard");
        rbGodLike.setText("God Like");

        bPlay.setText("Play");

        //------------------------------------------------------------------------

        lTitle.setFont(new Font("Serif", Font.PLAIN, 30));
        lName.setFont(new Font("Serif", Font.PLAIN, 17));
        lDifficulty.setFont(new Font("Serif", Font.PLAIN, 17));

        tfName.setFont(new Font("Serif", Font.PLAIN, 17));

        rbEasy.setFont(new Font("Serif", Font.PLAIN, 17));
        rbNormal.setFont(new Font("Serif", Font.PLAIN, 17));
        rbHard.setFont(new Font("Serif", Font.PLAIN, 17));
        rbGodLike.setFont(new Font("Serif", Font.PLAIN, 17));

        bPlay.setFont(new Font("Serif", Font.PLAIN, 25));

        //------------------------------------------------------------------------

        lTitle.setBounds(175, 50, 200, 30);
        lName.setBounds(110, 100, 200, 30);
        lDifficulty.setBounds(110, 130, 200, 30);

        tfName.setBounds(240, 100, 130, 30);

        rbEasy.setBounds(180, 130, 70, 30);
        rbNormal.setBounds(250, 130, 100, 30);
        rbHard.setBounds(180, 160, 70, 30);
        rbGodLike.setBounds(250, 160, 100, 30);

        bPlay.setBounds(185, 195, 120, 40);

        //------------------------------------------------------------------------

        BeginGame.add(lTitle);
        BeginGame.add(lName);
        BeginGame.add(lDifficulty);

        BeginGame.add(tfName);

        BeginGame.add(rbEasy);
        BeginGame.add(rbNormal);
        BeginGame.add(rbHard);
        BeginGame.add(rbGodLike);

        BeginGame.add(bPlay);

        //------------------------------------------------------------------------

        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension ( 500, 320 );

        BeginGame.setBounds(ss.width / 2 - frameSize.width / 2,
                ss.height / 2 - frameSize.height / 2,
                frameSize.width, frameSize.height);

        BeginGame.setResizable(false);
        BeginGame.setMinimumSize(new Dimension(500, 320));
        BeginGame.setVisible(true);
        BeginGame.pack();

    }

    public Boolean[] returnbool(){

        return(BeginGame.check);

    }
    public String resturnname(){

        return(BeginGame.sname);

    }

}
