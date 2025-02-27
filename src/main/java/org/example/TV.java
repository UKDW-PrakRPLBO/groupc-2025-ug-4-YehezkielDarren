package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;
    public TV(int maxReso){
        this.maxResolusi=maxReso;
    }
    public int getResolution(){
        return maxResolusi;
    }
    public void connect(Colokan clkan){
        this.colokan=clkan;
        System.out.println("Berhasil Connect ke - "+colokan.getMerk());
    }
}
