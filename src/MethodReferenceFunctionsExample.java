import java.util.function.Function;

public class MethodReferenceFunctionsExample {
    public static void main(String[] args) {
        // lambda
        Function<String,String> functionExample=s -> s.toUpperCase();
        // method references.
        Function<String,String> functionExampleMethodRef= String::toUpperCase;

        System.out.println(functionExampleMethodRef.apply("java"));

    }
}
