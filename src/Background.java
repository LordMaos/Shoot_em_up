
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Background {
	private Image background;
	int posX;
	int posY;
	int tile;
	String area = "space";
	int level = 0;
	
     /*Charger les images en fonction des  niveaux*/
	
	public Background(int x,int y,int level, int tileNumber) throws SlickException  {
		setBackground(new Image("assets/backgrounds/level"+level+"/"+tileNumber+".jpg"));
		posY = y;
		posX = x;
		tile = tileNumber;
	}
	
	public void update(){
		posX -= 1;
		if(posX < -3200)
		{
			//posX=0;
		}

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return getPosY();
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Image getBackground() {
		return background;
	}

	public void setBackground(Image background) {
		this.background = background;
	}
}