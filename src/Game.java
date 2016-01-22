import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by pedrosilva on 1/19/16.
 */

public class Game extends JFrame {

    public static int xp = 0;

    public static int level = 1;

    public static int up = 600;

    public static double health = 100;

    public static int damage = 30;

    public static int round = 0;

    public static double monsterhealth;

    public static double monsterdamage;

    public static BeginGame bg = new BeginGame();

    public static Game g = new Game();

    public static JLabel lMHealth = new JLabel();

    public static JLabel lMDamage = new JLabel();

    public static JButton battack = new JButton();

    public static void main(String args){
        
        g.game();

    }

    //public void paint(Graphics g){

        //g.drawLine(0, 350, 500, 350);
        //g.drawLine(170, 350, 170, 500);

    //}

    public void game(){

        g.runGame();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Saving Dave");


        //------------------------------------------------------------------------

        JLabel lhealth = new JLabel();
        JLabel lDamage = new JLabel();
        JLabel lName = new JLabel();
        JLabel lXP = new JLabel();
        JLabel lLevel = new JLabel();

        //------------------------------------------------------------------------

        lhealth.setText(Health());
        lDamage.setText(Damage());

        String sname = new String(bg.resturnname());
        lName.setText(sname);

        lXP.setText(XP());
        lLevel.setText(Level());

        //------------------------------------------------------------------------

        lhealth.setFont(new Font("Serif", Font.PLAIN, 23));
        lDamage.setFont(new Font("Serif", Font.PLAIN, 23));
        lName.setFont(new Font("Serif", Font.PLAIN, 17));
        lXP.setFont(new Font("Serif", Font.PLAIN, 17));
        lLevel.setFont(new Font("Serif", Font.PLAIN, 17));

        //------------------------------------------------------------------------

        lhealth.setBounds(30, 360, 200, 30);
        lDamage.setBounds(30, 380, 200, 30);
        lName.setBounds(30, 340, 300, 30);
        lXP.setBounds(30, 410, 300, 30);
        lLevel.setBounds(30, 440, 330, 30);

        //------------------------------------------------------------------------

        add(lhealth);
        add(lDamage);
        add(lName);
        add(lXP);
        add(lLevel);

        //------------------------------------------------------------------------

        lMHealth.setFont(new Font("Serif", Font.PLAIN, 15));
        lMHealth.setBounds(30, 30, 200, 30);
        add(lMHealth);

        lMDamage.setFont(new Font("Serif", Font.PLAIN, 15));
        lMDamage.setBounds(30, 60, 200, 30);
        add(lMDamage);

        setLayout(null);
        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension ( 500, 500 );

        setBounds(ss.width / 2 - frameSize.width / 2,
                ss.height / 2 - frameSize.height / 2,
                frameSize.width, frameSize.height);

        setResizable(false);
        setMinimumSize(new Dimension(500, 500));
        setVisible(true);
        pack();

    }

    public String Level(){

        up = level * 2 * 300;

        if (xp >= up) {
            level = level + 1;
            health = health + ((level * 100) * (1/6));
        }

        String leve = new String("Level " + level);

        return leve;

    }

    public String XP(){

        String xpp = new String("XP: " + xp + "/" + up);

        return xpp;

    }

    public String Health(){


        String heal = new String("Health:   " + health);
        return heal;

    }

    public String Damage(){

        String dam = new String("Damage: " + damage);

        return dam;

    }

    public void runGame(){

        while (health > 0){

            battack.setMnemonic(KeyEvent.VK_SPACE);

            boolean fight = true;

            round = round + 1;
            monsterhealth = Math.round(Math.random() * (100 * (level ^ 2) /2));
            lMHealth.setText("Monster Health: " + monsterhealth);


            monsterdamage = Math.round(Math.random() * (100 * (level ^ 2) /4));
            lMDamage.setText("Monter Damage: " + monsterdamage);

            while (fight){

                health = health - monsterdamage;
                monsterhealth = monsterhealth - damage;

                if (health < 0){

                    break;

                }

                if (monsterhealth < 0){

                    break;

                }

                revalidate();

            }

        }

    }

}
