package jFrameWindow;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class JFrameWindow extends JFrame {
  private static String title = "JFrameWindow";
  private int windowSizeX = 640;
  private int windowSizeY = 480;

  // Constructor
  public JFrameWindow() {
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
    this.setVisible(true);
  }

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    JFrameWindow main = new JFrameWindow();
  }

}
