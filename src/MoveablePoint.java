import java.util.Arrays;
public class MoveablePoint extends Point{

    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() + " speed x: " + getxSpeed() + ", speed y: " + getySpeed();
    }
    public MoveablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint a = new MoveablePoint(5,6,7,8);
        System.out.println(a.move());
        System.out.println(Arrays.toString(a.getSpeed()));
        System.out.println(a.toString());
    }
}

