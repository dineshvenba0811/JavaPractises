import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static  void main (String[] args){
        //

        List<Integer> arrayList= Arrays.asList(1,2,3,3,4,4,4,4,4,555,5,6,5,6,5,6,5);

        List<Integer> resultList=new ArrayList<>();

        for(Integer intlist:arrayList){
                if(!resultList.contains(intlist)){
                    resultList.add(intlist);
                }
        }
        System.out.println(resultList);

        List<Integer> arrayDeclartiveList=arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(arrayDeclartiveList);
    }
}
