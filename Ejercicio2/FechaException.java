public class FechaException extends IllegalArgumentException{
    //¿? al crear nuestras propias exception tendriamos que crear tendremos que hacer comprobaciones de esta manera o le pasaremos quizas algun mensaje.
    public FechaException(String sms) {
        super(sms);
    }
}
