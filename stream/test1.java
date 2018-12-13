import java.util.*;
import java.util.stream.*;

class StreamBuilders {
     public static void main(String[] args){
         List<Integer> list = new ArrayList<>();
         for(int i=0;i<10;i++){
           list.add(i);
         }

         Stream<Integer> stream = list.parallelStream();
         List<Integer> evenList = stream.filter(s->s%2==0).collect(Collectors.toList());
         System.out.println(evenList);
     }
}
