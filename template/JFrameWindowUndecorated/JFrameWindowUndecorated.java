package JFrameWindowUndecorated;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class JFrameWindowUndecorated extends JFrame {
  private static String title = "JFrameWindowUndecorated";
  private int windowSizeX = 640;
  private int windowSizeY = 480;

  // Constructor
  public JFrameWindowUndecorated() {
    // Set title
    super(title);

    // To close window
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    // Initialize window
    this.setSize(windowSizeX, windowSizeY);
    this.setResizable(false);
    this.setUndecorated(true);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    @SuppressWarnings("unused")
    JFrameWindowUndecorated main = new JFrameWindowUndecorated();
  }

}
