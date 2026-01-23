package Match;

public class Pair implements Comparable<Pair> {
    private final String v;
    private final Integer v_1;
    public Pair (String v1, Integer v2) {
        this.v = v1;
        this.v_1 = v2;
    }
    public String getv(){
        return this.v;
    }
    public Integer getv1(){
        return this.v_1;
    }
    @Override
    public int compareTo(Pair o){
        return Integer.compare(this.getv1(), o.getv1());
    }
}
