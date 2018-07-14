package com.zzq;

class Gizmo{
    public void spin(){}
}

public class FinalAruguments {
    void with(final Gizmo g){
       // g = new Gizmo();//illegal -- g is final

    }
    void without(Gizmo g){
        g =new Gizmo();
        g.spin();
    }
    //void f(final int i){i++;}//can't change
    //you can only read from a final primitive:
    int g(final int i){return i +1;}

    public static void main(String[] args) {
        FinalAruguments bf = new FinalAruguments();
        bf.with(null);
        bf.without(null);
    }
}
