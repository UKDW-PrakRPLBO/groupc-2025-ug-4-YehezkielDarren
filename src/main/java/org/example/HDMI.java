package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merek){
        super(harga,promisedBandwidth,merek);
    }

    @Override
    public double getRealBandwidth() {
        double ratio= (double) getHarga() /50000;
        return  (ratio<1.0)?  ( ratio *  super.getPromisedBandwidth()) :  super.getPromisedBandwidth();
    }
}
