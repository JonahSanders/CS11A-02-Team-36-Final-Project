import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class DisplayClass{

	public static void display(String[] input) 
	{
		Image img = null;
		try {
			img = ImageIO.read(new File("Tim Hickey.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<String> story = new ArrayList<String>();
		JFrame frame = new JFrame();
		frame.setSize(450, 450 + img.getHeight(frame));
		frame.setVisible(true);
		Graphics g = frame.getGraphics();
		int len = 0;
		String sum = "";
		for(int i = 0; i<input.length;i++)
		{
			String s = input[i];
			sum += s + " ";
			len += 1 + s.length();
			if(len>65)
			{
				story.add(sum);
				sum = "";
				len = 0;
			}
		}
		story.add(sum);

		while(frame.isVisible())
		{
			for(int i = 0; i<story.size(); i++)
			{
				g.drawString(story.get(i).toString(),10, 40 + 20*i + img.getHeight(frame));
			}
			g.drawImage(img, (450 - img.getWidth(frame))/2, 20, Color.RED, frame);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
