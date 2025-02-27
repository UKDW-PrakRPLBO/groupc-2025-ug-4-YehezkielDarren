package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;
    public TV(int maxReso){
        this.maxResolusi=maxReso;
    }
    public int getResolution(){
        if (colokan.getRealBandwidth()>10 && colokan.getRealBandwidth()<=35){
            if (maxResolusi>=480){
                return 480;
            }else {
                return maxResolusi;
            }
        } else if (colokan.getRealBandwidth()>35 && colokan.getRealBandwidth()<=100) {
            if (maxResolusi>=720){
                return 720;
            }else {
                return maxResolusi;
            }
        } else if (colokan.getRealBandwidth()>100){
            if (maxResolusi>=1080){
                return 1080;
            }else {
                return maxResolusi;
            }
        }
        return 0;
    }
    public void connect(Colokan clkan){
        this.colokan=clkan;
        System.out.println("Berhasil Connect ke - "+colokan.getMerk());
    }
}
