

package starter;

import acm.graphics.GRectangle;

public class enemy extends GRectangle{
	public static final int ENEMY_WIDTH = 45;
	public static final int ENEMY_HEIGHT = 45;
	
	protected enemyType eType;
	//protected space start;				We are inheriting GRectangle now.
	double speed;
	boolean alive;
	
	space spaceToReturn;
	
	//true if an enemy is currently moving
	boolean moving;
	
//Getters
	public boolean getAlive() {
		return alive;
	}
		
//Setters
	public void setAlive(Boolean alive) {
		this.alive=alive;
	}
		
//Constructors
	enemy(){
		//start = new space(0, 0);
		speed = 0;
	}
	
	enemy(int x, int y, enemyType type) {
		this.setLocation(x, y);
		eType=type;
	}
	
	//TODO: Finish this method. It needs to use Bullet to fire at Fighter.
	public void shoot() {
		
	}
	
	//We are now inheriting GRectangle, so there is no need for these.
	
	/*public void move(space s1, space s2) {
		int difX=s1.getX()-s2.getX();
		int difY=s1.getY()-s2.getY();
		
		start.setX(start.getX()+difX);
		start.setY(start.getY()+difY);
	}*/
	
	/*public space getSpace() {
		return start;
	}*/
	
	/*public void setSpace(int x, int y) {
		start.setX(x);
		start.setY(y);
	}*/
	
	public enemyType getEnemyType() {
		return eType;
	}
	public void setEnemyType(enemyType e) {
		eType = e;
	}
}
