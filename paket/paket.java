package paket;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

 public class paket extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics2D Örneği");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new paket());
        frame.setLocationRelativeTo(null); // Pencereyi ekranın ortasına konumlandırır
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Graphics2D nesnesini oluştur
        Graphics2D g2d = (Graphics2D) g;
        
        // Kenar yumuşatma (anti-aliasing) ekle
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Gradiyan renk geçişi oluştur
        GradientPaint gradiyant = new GradientPaint(
            70, 70,    // Başlangıç noktası (x,y)
            Color.BLUE,  // Başlangıç rengi
            300, 300,    // Bitiş noktası (x,y)
            Color.RED    // Bitiş rengi
        );
        
        // Gradiyanı ayarla
        g2d.setPaint(gradiyant);
        
        // Yuvarlak köşeli dikdörtgen çiz
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(
            50, 50,     // x, y koordinatları
            300, 300,   // genişlik, yükseklik
            25, 25      // köşe yuvarlaklığı (x,y)
        );
        
        g2d.fill(roundedRectangle);
        
        // Metin ekle
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("Merhaba Graphics2D!", 80, 200);
    }
}