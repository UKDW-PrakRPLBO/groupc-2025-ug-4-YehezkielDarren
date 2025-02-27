package org.example;

public class VGA extends Colokan{
    public VGA(int hrga, double promBwdth, String mrk) {
        super(hrga, promBwdth, mrk);
    }

    @Override
    public double getRealBandwidth() {
        double ratio= (double) super.getHarga() /30000;
        return (ratio>1)? ( ratio * super.getPromisedBandwidth()) : super.getPromisedBandwidth();
    }
}
