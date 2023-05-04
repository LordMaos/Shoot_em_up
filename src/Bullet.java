


import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Bullet{
	private Image bulletGraphic;
	int posX;
	int posY;
	int damage;
	float delta;
	
	private Rectangle bulletPoly;

	
	
	

	public Bullet(int x,int y, int type, int bulletDamage) throws SlickException  {
		setBulletGraphic(new Image("assets/bullet"+type+".png"));
		posY = y;
		posX = x;
		damage = bulletDamage;
		setBulletPoly(new Rectangle( posX,
                 posY,
                 10,
                 5));
	}
	/*Gere la vitesse de mes balles*/
	
	public void update(int speed){
		float bulletSpeed = 0;
		bulletSpeed = (speed/26f) * GameplayState.deltaTime;
		posX += bulletSpeed;
		getBulletPoly().setX(posX);
		if(posX > 300)
		{
			//posX=0;
		}
	}

	public Image getBulletGraphic() {
		return bulletGraphic;
	}

	public void setBulletGraphic(Image bulletGraphic) {
		this.bulletGraphic = bulletGraphic;
	}

	public Rectangle getBulletPoly() {
		return bulletPoly;
	}

	public void setBulletPoly(Rectangle bulletPoly) {
		this.bulletPoly = bulletPoly;
	}
	

}

