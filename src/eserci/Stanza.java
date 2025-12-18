package eserci;

public class Stanza {
    private float x,y,z;
    public Stanza(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float Superfice(){
        return x*y;
    }
    public float Volume(){
        return x*y*z;
    }



}
