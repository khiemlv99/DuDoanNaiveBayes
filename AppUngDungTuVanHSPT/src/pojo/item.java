/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author ADMIN
 */
public class item {
    private String HOVATEN,NHOMNGUOI,KHOIHOCYEUTHICH,HOCLUC,KINHTE,NGANHCHON;
    private int TUOI,STT;

    public String getHOVATEN() {
        return HOVATEN;
    }

    public void setHOVATEN(String HOVATEN) {
        this.HOVATEN = HOVATEN;
    }

    public String getNHOMNGUOI() {
        return NHOMNGUOI;
    }

    public void setNHOMNGUOI(String NHOMNGUOI) {
        this.NHOMNGUOI = NHOMNGUOI;
    }

    public String getKHOIHOCYEUTHICH() {
        return KHOIHOCYEUTHICH;
    }

    public void setKHOIHOCYEUTHICH(String KHOIHOCYEUTHICH) {
        this.KHOIHOCYEUTHICH = KHOIHOCYEUTHICH;
    }

    public String getHOCLUC() {
        return HOCLUC;
    }

    public void setHOCLUC(String HOCLUC) {
        this.HOCLUC = HOCLUC;
    }

    public String getKINHTE() {
        return KINHTE;
    }

    public void setKINHTE(String KINHTE) {
        this.KINHTE = KINHTE;
    }

    public String getNGANHCHON() {
        return NGANHCHON;
    }

    public void setNGANHCHON(String NGANHCHON) {
        this.NGANHCHON = NGANHCHON;
    }

    public int getTUOI() {
        return TUOI;
    }

    public void setTUOI(int TUOI) {
        this.TUOI = TUOI;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public item() {
    }

    
    
    public item(int STT,String HOVATEN, int TUOI, String NHOMNGUOI, String KHOIHOCYEUTHICH, String HOCLUC, String KINHTE, String NGANHCHON) {
        this.HOVATEN = HOVATEN;
        this.NHOMNGUOI = NHOMNGUOI;
        this.KHOIHOCYEUTHICH = KHOIHOCYEUTHICH;
        this.HOCLUC = HOCLUC;
        this.KINHTE = KINHTE;
        this.NGANHCHON = NGANHCHON;
        this.TUOI = TUOI;
        this.STT = STT;
    }

    
    public Object[] toArrayAll(){
        return new Object[]{STT,HOVATEN,TUOI,NHOMNGUOI,KHOIHOCYEUTHICH,HOCLUC,KINHTE,NGANHCHON};
    }
}
