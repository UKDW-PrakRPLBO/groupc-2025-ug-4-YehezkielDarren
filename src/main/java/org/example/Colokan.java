package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwidth;
    private int harga;

    public Colokan(int hrga,double promBwdth,String mrk) {
        this.merk = mrk;
        this.promisedBandwidth = promBwdth;
        this.harga = hrga;
    }
    public abstract double getRealBandwidth();
    // getter n setter
    public String getMerk() {
        return this.merk;
    }
    public int getHarga(){
        return this.harga;
    }
    public double getPromisedBandwidth(){
        return this.promisedBandwidth;
    }

    public void setMerek(String mrk){
        this.merk=mrk;
    }
    public void setHarga(int hrga){
        this.harga=hrga;
    }
    public void setPromisedBandwidth(double promBwdth){
        this.promisedBandwidth=promBwdth;
    }

}
