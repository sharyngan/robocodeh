
import robocode.*;

public class Kross extends Robot {
    public void run() {
        

        while (true) {
            
            ahead(100);
            turnGunRight(360); 
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
    
        fire(1);
    }

    public void onHitByBullet(HitByBulletEvent e) {

        back(20);
    }

    public void onHitWall(HitWallEvent e) {
        
        turnRight(90);
    }
}

