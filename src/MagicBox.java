/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	MediaPalace mp = new MediaPalace();
	JFrame frame = new JFrame("The Magic Box contains many secrets...");
	
	
	
	/// We are going to hide secrets within the magic box. 
	  //When the user clicks on a secret place, stuff will happen.
	  
	//1. Make the frame respond to mouse clicks.
	





	  
	 // 2. When the mouse is clicked, use the Media Palace (read the code in the default package) to play sounds, show images or speak.
	
	
	
	 // 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 

	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());
	
		
		
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		frame.setLayout(new FlowLayout());
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX()>55 && e.getX()<85 && 
		   e.getY()>55 && e.getY()<82) {
			System.out.println("jkl");
			frame.add(mp.loadImageFromWithinProject("hyacinths.jpeg"));
			frame.pack();
		}
		
		System.out.println(e.getX());
		System.out.println(e.getY());
		
		if(e.getX()>185 && e.getX()<205 &&
		   e.getY()>500 && e.getY()<525) {
			
			frame.add(mp.loadImageFromWithinProject("helios.jpeg"));
			frame.pack();
		}
		if(e.getX()>340 && e.getX()<360 &&
		   e.getY()>620 && e.getY()<640) {
			frame.add(mp.loadImageFromWithinProject("cliff.jpeg"));
			frame.pack();
		}
		if(e.getX()>335 && e.getX()<355 &&
		   e.getY()>140 && e.getY()<155) {
			
		
		frame.add(mp.loadImageFromWithinProject("butterfly.jpeg"));
		frame.pack();
		}
		
		if(e.getX()>527 && e.getX()<553 &&
		   e.getY()>365 && e.getY()<380	) {
			
			frame.add(mp.loadImageFromWithinProject("lightbulbs.jpg"));
			frame.pack();
		}
		
		
	}
	
	
		
		// TODO Auto-generated method stub
	//196 512
	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


