public class NormalizadorID{
    public static void main(String[] args) {
        String idSucio = " User_123 ";
        String idLimpio = idSucio.trim().toUpperCase().substring(0, 5); 

         //System.identityHashCode("ID original" +idSucio);
         System.identityHashCode("ID limpio"  +idLimpio);

         System.out.println("\nHash ID Original: " + System.identityHashCode(idSucio));
           System.out.println("\nHash ID Original: " +idSucio);

        System.out.println("Hash ID Limpio: "+ System.identityHashCode(idLimpio));

        StringBuilder inversor = new StringBuilder(idLimpio);
        inversor.append(idSucio);

        String idInvertido = inversor.reverse().toString();
 
 System.out.println("Hash ID Invertido: " + idInvertido);


    }
}
