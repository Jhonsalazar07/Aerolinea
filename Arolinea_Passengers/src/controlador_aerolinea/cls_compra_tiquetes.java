package controlador;

import java.util.Date;

public class cls_compra_tiquetes {

    private Date fechaDt;
    private int id_clienteInt;
    private int cantidadInt;
    private String tipo_claseStr;
    private Float subtotalFlt;
    private Float ivaFlt;
    private Float descuento_memebresiaFlt;
    private Float totalFlt;


    public cls_compra_tiquetes(Date fechaDt, int id_clienteInt, int cantidadInt, String tipo_claseStr,
            Float subtotalFlt, Float ivaFlt, Float descuento_memebresiaFlt, Float totalFlt) {
        this.fechaDt = fechaDt;
        this.id_clienteInt = id_clienteInt;
        this.cantidadInt = cantidadInt;
        this.tipo_claseStr = tipo_claseStr;
        this.subtotalFlt = subtotalFlt;
        this.ivaFlt = ivaFlt;
        this.descuento_memebresiaFlt = descuento_memebresiaFlt;
        this.totalFlt = totalFlt;
    }


    public Date getFechaDt() {
        return fechaDt;
    }


    public int getId_clienteInt() {
        return id_clienteInt;
    }


    public int getCantidadInt() {
        return cantidadInt;
    }


    public String getTipo_claseStr() {
        return tipo_claseStr;
    }


    public Float getSubtotalFlt() {
        return subtotalFlt;
    }


    public Float getIvaFlt() {
        return ivaFlt;
    }


    public Float getDescuento_memebresiaFlt() {
        return descuento_memebresiaFlt;
    }


    public Float getTotalFlt() {
        return totalFlt;
    }


    public void setFechaDt(Date fechaDt) {
        this.fechaDt = fechaDt;
    }


    public void setId_clienteInt(int id_clienteInt) {
        this.id_clienteInt = id_clienteInt;
    }


    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }


    public void setTipo_claseStr(String tipo_claseStr) {
        this.tipo_claseStr = tipo_claseStr;
    }


    public void setSubtotalFlt(Float subtotalFlt) {
        this.subtotalFlt = subtotalFlt;
    }


    public void setIvaFlt(Float ivaFlt) {
        this.ivaFlt = ivaFlt;
    }


    public void setDescuento_memebresiaFlt(Float descuento_memebresiaFlt) {
        this.descuento_memebresiaFlt = descuento_memebresiaFlt;
    }


    public void setTotalFlt(Float totalFlt) {
        this.totalFlt = totalFlt;
    }

    

    
    
}
