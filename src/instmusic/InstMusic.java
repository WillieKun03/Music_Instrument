package instmusic;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
//import org.jfugue.realtime.RealtimePlayer;
//import org.jfugue.theory.Note;

public class InstMusic extends JFrame implements KeyListener{
    JLabel jl1=new JLabel("");
    JLabel jl2=new JLabel("");
    Player pl=new Player();
    public InstMusic(){
        add(jl1,BorderLayout.NORTH);
        add(jl2,BorderLayout.SOUTH);
        addKeyListener(this);
    }
    
    public static void main(String[]args){
        InstMusic i= new InstMusic();
        i.setDefaultCloseOperation(EXIT_ON_CLOSE);
        i.setSize(500,150);
        i.setVisible(true);
        
    }
    public void keyTyped(KeyEvent ke) {    
    
    }

    
    public void keyPressed(KeyEvent ke) {
        jl1.setText("Simulación en curso");
        //jl2.setText(""+ke.getKeyCode());
        if (ke.getKeyCode() == KeyEvent.VK_C) {
            pl.play("C");
        }
        if (ke.getKeyCode() == KeyEvent.VK_D) {
            pl.play("D");
        }
        if (ke.getKeyCode() == KeyEvent.VK_E) {
            pl.play("E");
        }
        if (ke.getKeyCode() == KeyEvent.VK_F) {
            pl.play("F");
        }
        if (ke.getKeyCode() == KeyEvent.VK_G) {
            pl.play("G");
        }
        if (ke.getKeyCode() == KeyEvent.VK_A) {
            pl.play("A");
        }
        if (ke.getKeyCode() == KeyEvent.VK_B) {
            pl.play("B");
        }
    }

    public void keyReleased(KeyEvent ke) {
        
    }
    
}
