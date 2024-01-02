import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main (String[] args){
        // imperative apporach
        int sumTotal=0;
        for(int i=0;i<=100;i++){
            sumTotal+=i;
        }
        System.out.println("imperative"+sumTotal);

        // Declarative approach
        // multi thread // parallel() used
        int sumTotalDeclarative= IntStream
                .rangeClosed(0,100)
                .parallel()
                .sum();
        System.out.println("sumTotalDeclarative"+sumTotalDeclarative);
    }

}
