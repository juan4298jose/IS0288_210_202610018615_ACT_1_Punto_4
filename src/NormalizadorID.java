public class NormalizadorID{
    public static void main(String[] args) {
         String idSucio = " user_123 ";
         String idLimpio = idSucio.trim().toUpperCase().substring(0, 8); 

         System.out.println( " ID original: " +idSucio);
         System.out.println("\nID limpio: " +idLimpio);
        
         System.identityHashCode("\nID limpio"  +idLimpio);  
 
         System.out.println("\n Hash ID original: " + System.identityHashCode(idSucio));
         
        System.out.println("\n Hash ID Limpio: " + System.identityHashCode(idLimpio));

        StringBuilder inversor = new StringBuilder(idLimpio);
        inversor.append(idSucio);

        String idInvertido = inversor.reverse().toString();
 
 System.out.println(" ID Invertido:" + idInvertido);


    }
}
