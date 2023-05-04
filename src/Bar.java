
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Image;

public class Bar {
	private Image barOutlinePoly;
	public int bars = 5;
	
	
	/*Charger les barres de vie*/
	
	public Bar(int x,int y) throws SlickException  {
		
		setBarOutlinePoly(new Image("assets/bar"+bars+".png"));
	}
	
	public void update(){
		//barOutlinePoly.reinit();
	}

	public Image getBarOutlinePoly() {
		return barOutlinePoly;
	}

	public void setBarOutlinePoly(Image barOutlinePoly) {
		this.barOutlinePoly = barOutlinePoly;
	}
}
