import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        String saludo = String.format("Hola %s, encantado de verte!", name);
        return saludo;
    }
    
    public String dateAnnouncement() {
        Date fecha= new Date();
        return "Actualemente es: " + fecha;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1){
            String Respuesta = "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
            return Respuesta; 
        }
        else{
            if(conversation.indexOf("Alfred") != -1){
                String Respuesta = "A su servicio. Como desee, naturalmente";
                return Respuesta;
            }
            else{
                String Respuesta = "Bien. Y con eso, me retiraré";
                return Respuesta;

            }           
        }
    }

    // BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
 /*   public String guestGreeting (String name, String epoca) {
            String estacion1 = "mañana";
            String estacion2 = "tarde";
            String estacion3= "noche";
            if(epoca == estacion1){
                String respuesta=String.format("Buenos Dias %s, encantado de verte!", name);
                return respuesta; 
            }
            if (epoca == estacion2){
                String respuesta=String.format("Buenas tardes %s, encantado de verte!", name);
                return respuesta; 
            }
            if (epoca == estacion3){
                String respuesta=String.format("Buenas Noches %s, encantado de verte!", name);
                return respuesta; 
            }   
    }
*/

    //="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}
