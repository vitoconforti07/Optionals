import java.util.Optional;

public class Main {

//    https://www.youtube.com/watch?v=1xCxoOuDZuU&list=WL&index=305&t=4s&ab_channel=Amigoscode

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("ok");

        boolean emptyFlag = stringOptional.isEmpty();
        boolean presentFlag = stringOptional.isPresent();

        System.out.println("Optionals Learing");
        System.out.println(emptyFlag);
        System.out.println(presentFlag);

        String stringa_vuota = stringOptional.orElse("Stringa vuota");

        System.out.println(stringa_vuota);


//        questo che abbiamo scritto con l'ausialio dell'Optionals si può scrivere senza
        if (stringOptional != null) System.out.println(stringa_vuota);
        else System.out.println("Stringa vuota");

        /*
        come si può notare in questa secondo caso scriviamo più codice,
        nel primo con una sola riga otteniamo lo stesso risultato
        */

        String stringa_vuota1 = stringOptional.map(s -> s.toUpperCase()).orElse("Stringa vuota".toUpperCase());


        System.out.println(stringa_vuota1);
        String stringOrElseGet = "";
        String stringa_vuota2 = stringOptional.map(s -> s.toUpperCase()).orElseGet(() -> {
//            stringOrElseGet = "ok strringa";
            return "Stringa vuota";
        });


        System.out.println(stringa_vuota2);
        System.out.println(stringOrElseGet);
    }


}


