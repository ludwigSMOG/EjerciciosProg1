public class Fecha {

    private int dia;
    private int mes;
    private int anho;

    public void setDia(int dia) {
        if (dia>=1 && dia<=31) {
            this.dia = dia;       
        }else{
            throw new FechaException("Dia erroneo");
        }
    }
    public void setMes(int mes) {
        if (mes>=1 && mes<=12) {
            this.mes = mes;  
        }else{
            throw new FechaException("Mes erroneo");
        }
    }
    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnho() {
        return anho;
    }

    public Fecha(int dia, int mes, int anho) throws FechaException{
        this.setDia(dia);
        this.setMes(mes);
        this.setAnho(anho);
    }
    public Fecha() throws FechaException{
        this(5, 12, 2000);
    }

    public String fechaFormateada(boolean comprobar){
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre"};
        if (comprobar) {
            return dia+"/"+mes+"/"+anho;
        }else{
            return dia + " de " + meses[mes-1] + " de " + anho;
        }
    }

    public static int diferenciaFechas(Fecha f1, Fecha f2){
        return Math.abs(f1.anho-f2.anho);
    }
}
