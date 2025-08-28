package Tarefa2;

public class ex2 {
    public static void main(String[] args) {
        classe teste = new classe();
        teste.p2 = 12;
    }    
}

class classe {
    private int p1;
    public int p2;
    int p3;
    protected int p4;
    public int getP1() {
        return p1;
    }
    public void setP1(int p1) {
        this.p1 = p1;
    }
    public int getP2() {
        return p2;
    }
    public void setP2(int p2) {
        this.p2 = p2;
    }
    public int getP3() {
        return p3;
    }
    public void setP3(int p3) {
        this.p3 = p3;
    }
    public int getP4() {
        return p4;
    }
    public void setP4(int p4) {
        this.p4 = p4;
    }
}
