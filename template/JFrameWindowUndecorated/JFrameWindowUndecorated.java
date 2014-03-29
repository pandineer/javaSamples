package JFrameWindowUndecorated;

import javax.swing.JFrame;

public class JFrameWindowUndecorated extends JFrame {
  private static String title = "Cheet Sheet - prototype";
  private int windowSizeX = 640;
  private int windowSizeY = 480;

  // Constructor
  public JFrameWindowUndecorated() {
    // Set title
    super(title);

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
