package text.section_18;
import java.util.HashMap;

public class Collection_Test4 {
    public static void main(String[] args) {
        HashMap<Integer, String> humanMap = new HashMap<Integer, String>();

        humanMap.put(1, "Kato");
        humanMap.put(2, "Tanaka");
        humanMap.put(3, "Yamada");

        humanMap.remove(1);

        System.out.println("キーが1の人の値は" + humanMap.get(1));
        System.out.println("キーが2の人の値は" + humanMap.get(2));
        System.out.println("キーが3の人の値は" + humanMap.get(3));
    }
}