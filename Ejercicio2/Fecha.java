public class Fecha {
    // PrograOrientObject
    // atributos
    private int dia;
    private int mes;
    private int año;

    // set y get
    public void setDia(int dia)  {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {// Import crear su propio Java! exception
            throw new FechaException("Día erróneo");
        }
    }

    public void setMes(int mes) throws FechaException {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new FechaException("Mes erróneo.");
        }
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    // constructor
    // debemos lanzar aqui tambien la exception por las 2 variables que la utilizan
    public Fecha(int dia, int mes, int año) throws FechaException {
        this.setDia(dia);// ¿?
        this.setMes(mes);
        this.setAño(año);
    }

    // ctr Sobrecargado
    public Fecha() throws FechaException {
        this(1, 1, 2000);
    }

    // Metodos
    public String fechaFormateada(boolean numerico) {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        if (numerico) {
            return dia + "/" +mes+ "/" + año;// ¿?por las posiciones de un ARRAY START 0 por eso -1
        } else {
            return dia + " de " +  meses[mes - 1]+" de " + año;
        }
    }

    public static int diferenciaFechas(Fecha f1, Fecha f2) {
        return Math.abs(f1.año - f2.año);//Math.abs!!!
    }
}
