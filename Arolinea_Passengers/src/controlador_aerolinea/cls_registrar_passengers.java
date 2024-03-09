package controlador;
public class cls_registrar_passengers{
    private int idInt;
    private String nombreStr;
    private String contactoStr;
    private String emailStr;
    private String correoStr;
    private String sexoStr;
    private String membresiaStr;
    private Float descuentoFlt;


    public cls_registrar_passengers(int idInt, String nombreStr, String contactoStr, String emailStr, String correoStr,
            String sexoStr, String membresiaStr, Float descuentoFlt) {
        this.idInt = idInt;
        this.nombreStr = nombreStr;
        this.contactoStr = contactoStr;
        this.emailStr = emailStr;
        this.correoStr = correoStr;
        this.sexoStr = sexoStr;
        this.membresiaStr = membresiaStr;
        this.descuentoFlt = descuentoFlt;
    }


    public int getIdInt() {
        return idInt;
    }


    public String getNombreStr() {
        return nombreStr;
    }


    public String getContactoStr() {
        return contactoStr;
    }


    public String getEmailStr() {
        return emailStr;
    }


    public String getCorreoStr() {
        return correoStr;
    }


    public String getSexoStr() {
        return sexoStr;
    }


    public String isMembresiaBln() {
        return membresiaStr;
    }


    public Float isDescuento() {
        return descuentoFlt;
    }


    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }


    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }


    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }


    public void setEmailStr(String emailStr) {
        this.emailStr = emailStr;
    }


    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }


    public void setSexoStr(String sexoStr) {
        this.sexoStr = sexoStr;
    }


    public void setMembresiaBln(String membresiaStr) {
        this.membresiaStr = membresiaStr;
    }


    public void setDescuento(Float descuentoFlt) {
        this.descuentoFlt = descuentoFlt;
    }
    
}
