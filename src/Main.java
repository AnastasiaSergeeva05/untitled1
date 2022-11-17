import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Main {


    public static void main(String[] args) {

        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1, "Привет");
        keyValue.put(2, "Пока");
        keyValue.put(3, "Как дела?");

        System.out.println(keyValue.size());
       // Цикл While

        Iterator iter = keyValue.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry qurentMe = (Map.Entry) iter.next();
            System.out.println("Ключ это " + qurentMe.getKey() +
                    " Значение это " + qurentMe.getValue());
        }
        //Цикл For
        for (Map.Entry qurentMe2 : keyValue.entrySet()) {
            System.out.println("Ключ это: " + qurentMe2.getKey() +
                    " Значение это: " + qurentMe2.getValue());

        }
    }
}