import java.awt.event.ItemEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPanel;

public class Tugas2 {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JRadioButtonMenuItem");
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Ubah Warna");
        ButtonGroup buttongroup = new ButtonGroup();
        JRadioButtonMenuItem merah = new JRadioButtonMenuItem("Merah");        
        JRadioButtonMenuItem kuning = new JRadioButtonMenuItem("Kuning");
        JRadioButtonMenuItem hijau = new JRadioButtonMenuItem("Hijau");
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 500);
        
        merah.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255,0,0));
            }
        });
        
        kuning.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255,255,0));
            }
        });
        
        hijau.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(0,255,0));
            }
        });
        
        buttongroup.add(merah);
        buttongroup.add(kuning);
        buttongroup.add(hijau);
        menu.add(merah);
        menu.add(kuning);
        menu.add(hijau);
        menubar.add(menu);
        frame.setJMenuBar(menubar);
        frame.add(panel);
        
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);                
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}