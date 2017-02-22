import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.*;

public class test {
    public static void main(String[] args) throws Exception {
        List<String> list = FileUtils.readLines(new File(""));
        Map<String, List<String>> map = new HashMap<>();

        for (String s : list) {
            String[] item= s.split(":");
            map.put(item[0], Arrays.asList(item[1].split(",")));
        }


    }

    void printAssociationLevel(File file, String person) throws Exception{
        List<String> list = FileUtils.readLines(file);
        Map<String, List<String>> map = new HashMap<>();
        int all = 0;
        for (String s : list) {
            String[] item= s.split(":");
            List<String> value = Arrays.asList(item[1].split(","));
            all += value.size();
            map.put(item[0], value);
        }

        List<String> visited = new ArrayList<>();

        // Level 1
        List<String> level1 = map.get(person);
        System.out.println(level1);
        visited.addAll(level1);

        List<String> level2 = new ArrayList<>();
        for (String s : level1) {
                List<String> temp = map.get(s);
                for (String x : temp) {
                    if (!visited.contains(x)) {
                        level2.add(x);
                    }
                }
                visited.addAll(level2);
        }
        System.out.println(level2);

        List<String> level3 = new ArrayList<>();
        for (String s : level3) {
            List<String> temp = map.get(s);
            for (String x : temp) {
                if (!visited.contains(x)) {
                    level3.add(x);
                }
            }
            visited.addAll(level3);
        }
        System.out.println(level3);
    }
}
