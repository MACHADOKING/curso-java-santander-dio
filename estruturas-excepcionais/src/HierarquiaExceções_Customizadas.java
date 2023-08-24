import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaExceções_Customizadas {
    public static void main(String[] args) {
        Number valor;
        try {
            // Number valor = Double.valueOf("a1.75");
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /* public class CepInvalidoException extends Exception {}

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    } */
}