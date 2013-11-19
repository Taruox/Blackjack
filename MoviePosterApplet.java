import java.awt.*;
import java.applet.*;

//import java.awt.event.*;
//import javax.swing.*;

public class MoviePosterApplet extends Applet {

	private MoviePoster poster;

	public void init() {
		poster = new MoviePoster("Blackjack");
		//NumberPanel np = new NumberPanel();
		//this.add(np);

		//NumberPanel npl = new NumberPanel();
		//this.add(npl);
	}

	public void paint(Graphics g) {
		poster.draw(g, new Rectangle(50, 50, 200, 300));
	}

}