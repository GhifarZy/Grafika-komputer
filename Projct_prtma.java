import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BasicStroke;

class Kanvas extends Canvas {
	
public void paint(Graphics g) {
	
	Font tr = new Font("Arial", Font.BOLD, 25);
	Font gr = new Font("Arial", Font.BOLD, 50);
	Font tk = new Font("Arial", Font.BOLD, 30);
	Font pp = new Font("Arial", Font.BOLD, 30);
	Font aa = new Font("Arial", Font.BOLD, 70);
	
	g.setColor(Color.WHITE);	
	g.fillRect(80,30,300,100);
	g.setColor(Color.RED);
	g.fillRect(80,111,300,100);
	g.setColor(Color.WHITE) ;
	g.fillOval(100, 60, 100, 100);
	g.setColor(Color.RED) ;
	g.fillArc(100, 60, 100, 100, 0,180);
	
	
	
	g.setColor(Color.WHITE) ;
	g.fillOval(560, 20, 240,240);
	g.setColor(Color.BLACK) ;
	g.fillOval(565, 25, 230,230);
	g.setColor(Color.WHITE) ;
	g.fillOval(601, 59, 160,160);
	g.setColor(Color.BLUE) ;
	g.fillArc(605, 65, 150, 150, 90 ,90);
	g.setColor(Color.BLUE) ;
	g.fillArc(605, 65, 150, 150, 270, 90);
	g.setFont(tr);
	g.setColor(Color.WHITE);
	g.drawString("M",670,51);
	g.setFont(tr);
	g.setColor(Color.WHITE);
	g.drawString("W",730,73);
	g.setFont(tr);
	g.setColor(Color.WHITE);
	g.drawString("B",610,74);
	
	
	
	g.setColor(Color.WHITE) ;
	g.fillArc(950, 20, 350,350, 45 ,90);
	g.setColor(Color.BLACK) ;
	g.fillArc(971, 41, 310,310, 45 ,90);
	g.setColor(Color.WHITE) ;
	g.fillArc(992, 62, 270,270, 45 ,90);
	g.setColor(Color.BLACK) ;
	g.fillArc(1013, 83, 230,230, 45 ,90);
	g.setColor(Color.WHITE) ;
	g.fillArc(1034, 104, 190,190, 45 ,90);
	g.setColor(Color.BLACK) ;
	g.fillArc(1055, 125, 150,150, 45 ,90);
	g.setColor(Color.WHITE) ;
	g.fillOval(1105, 150, 50,50);
	
	
	
	g.setColor(Color.decode("#191970"));	
	g.fillArc(87, 358, 150, 150, 90 ,90);
	g.fillArc(94, 364, 150, 150, 270, 90);
	g.fillArc(88, 364, 150, 150, 180, 90);
	g.setFont(gr);
	g.setColor(Color.RED);
	g.drawString("GRAMEDIA",260,420);
	g.setFont(tk);
	g.setColor(Color.decode("#191970"));
	g.drawString("TOKO BUKU",350,450);
	int y[] = { 85 ,165,85};
    int x[] = {115,115,35};
    int jumlah = x.length;
    for(int i=0; i<x.length; i++) {
    x[i] += 130;
    y[i] += 272; }
    g.setColor(Color.red);
    g.fillPolygon(x, y, jumlah);
       
       
       
    g.setColor(Color.WHITE);	
   	g.fillRect(580,350,80,200);
   	g.setColor(Color.decode("#006400"));	
 	g.fillRect(650,350,250,200);
 	g.setColor(Color.white);
 	g.fillOval(700,365, 150, 150);
  	g.setColor(Color.decode("#006400"));
 	g.fillOval(720,350, 150, 150);
 	int a[] = {125,134,154,135,150,125,100,115,94,114};
    int b[] = {105,125,125,135,157,140,157,135,125,125};
    int hasil = a.length;
    for(int i=0; i<a.length; i++) {
    a[i] += 680;
    b[i] += 295; }
    g.setColor(Color.WHITE);
    g.fillPolygon(a, b, hasil);
    
    
    
 
    g.setColor(Color.RED);
	g.fillOval(957,350, 150, 150);
	g.setColor(Color.decode("#191970"));
	g.fillArc(957, 350, 150, 150, 80 ,120);
	g.setColor(Color.YELLOW);
	g.fillArc(957, 350, 150, 150, 320 ,120);
	g.setColor(Color.BLACK);
	g.fillOval(983,375, 100, 100);
	g.setFont(gr);
	g.setColor(Color.RED);
	g.drawString("POLITEKNIK",991,440);
	g.setFont(aa);
	g.setColor(Color.RED);
	g.drawString("ACEH",1097,500);



	}

}

	public class Projct_prtma extends JFrame {
	Kanvas gambar = new Kanvas();

	Projct_prtma() {
	super("Bendera greenland");
	setLocation(50,100);
	setSize(1350, 700);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	komponenVisual();
	}

void komponenVisual() {
	 getContentPane().setLayout(new BorderLayout());
     getContentPane().add(gambar,BorderLayout.CENTER);
     getContentPane().setBackground(Color.black);
     setVisible(true);
}


	public static void main(String args[]) {
		Projct_prtma gb = new Projct_prtma();
	}

}