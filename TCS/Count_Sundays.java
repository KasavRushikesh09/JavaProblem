import java.util.*;
public class Main{
    Scanner sc = new Scanner(System.in);
    String start = sc.next();
    int n = sc.nextInt();

    // Day index
    Map<String, Integer>map = new HashMap<>();
    map.put("mon",1);
    map.put("tue",2);
    map.put("wed",3);
    map.put("thu",4);
    map.put("fri",5);
    map.put("sat",6);
    map.put("sun",7);

    int startDay = map.get(start);

    // days until first sunday
    int firstSunday = (7-startDay)%7;
    int count =0;

    if(firstSunday <n){
        count = 1+(n-firstSunday -1)/7;
    }
    System.out.println(count);
}