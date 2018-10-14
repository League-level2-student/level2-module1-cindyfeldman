import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	long enemyTimer =0;
	int enemySpawnTime ;

RocketShip rocket ;
ArrayList<Projectile> list = new ArrayList<Projectile>();
ArrayList<Aliens> alien = new ArrayList<Aliens>();
public ObjectManager(RocketShip rocket) {
	this.rocket = rocket;
	
}
void update() {
	for (int i = 0; i < list.size(); i++) {
		Projectile one = list.get(i);
		one.update();
	}
	for(int i = 0; i < alien.size(); i++) {
		Aliens dos = alien.get(i);
		dos.update();}
	rocket.update();
	
}
void draw(Graphics g) {
	for (int i = 0; i < list.size(); i++) {
		Projectile o = list.get(i);
		o.draw(g);
		}
	rocket.draw(g);
	for(int i = 0; i < alien.size(); i++) {
		Aliens uno = alien.get(i);
		uno.draw(g);
	}
	
}
void addProjectile(Projectile a) {
	list.add(a);
}
void addAlien(Aliens ali) {
	alien.add(ali);
}
public void manageEnemies(){
    if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
            addAlien(new Aliens(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
    }
}
void purgeObjects() {
	
}


}
