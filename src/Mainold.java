/*
import java.util.Stack;




import java.util.HashMap;
import java.util.Map;

*/
/**
 * @author 1ommy
 * @version 08.10.2023
 *//*


public class Main {
 */
/*  public static void main(String[] args) {
         LinkedList<Integer> integerLinkedList = new LinkedList<>();
         integerLinkedList.add(1);
         integerLinkedList.add(2);
         integerLinkedList.add(3);
         integerLinkedList.add(4);
         integerLinkedList.add(5);
         System.out.println();
         System.out.println();
         System.out.println();
         integerLinkedList.add(10, 3);
         integerLinkedList.printList();

         integerLinkedList.remove(1);
         System.out.println();
         System.out.println();
         System.out.println();
         integerLinkedList.printList();
     }*//*


    public static void main(String[] args) {
        */
/*Stack<Character> characters = new Stack<>();

        String expr = "{[(([()]))]}";

        for (char currentBracket : expr.toCharArray()) {
            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                characters.push(currentBracket);
            }

            if (currentBracket == '}') {
                if (characters.pop() != '{') {
                    System.out.println("выражение некоррректно");
                    return;
                }
            }
            if (currentBracket == ']') {
                if (characters.pop() != '[') {
                    System.out.println("выражение некоррректно");
                    return;
                }
            }
            if (currentBracket == ')') {
                if (characters.pop() != '(') {
                    System.out.println("выражение некоррректно");
                    return;
                }
            }

        }
        System.out.println("все ок");*//*


*/
/*        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(5);
        set.add(15);

        for (Integer element : set) {
            System.out.println(element);
        }*//*


       */
/* Map<String, Integer> map = new HashMap<>();
        map.put("faculty", 5);
        map.put("number_group", 10);
        map.put("age", 17);

        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*//*



    }
}
*/
/*

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String filialProcess(String filial) {
        if (filial.equals("М")) {
            return "MAI";
        }
        if (filial.equals("Т")) {
            return "Таганка";
        }
        return null;
    }

    public static String educationFormProcess(String educationForm) {
        if (educationForm.equals("О")) {
            return "FULL_TIME";
        }
        if (educationForm.equals("В")) {
            return "AFTERNOON";
        }
        if (educationForm.equals("З")) {
            return "CORRESPONDENCE";
        }
        if (educationForm.equals("ОЗ")) {
            return "PART_TIME";
        }
        return null;
    }

    public static String degreeProcess(String degree) {
        if (degree.equals("Б") || degree.equals("Бк")) {
            return "UNDERGRADUATE";
        }
        if (degree.equals("С") || degree.equals("Сг")) {
            return "SPACIALITY";
        }
        if (degree.equals("М") || degree.equals("Мп")) {
            return "MAGISTRACY";
        }
        return null;
    }

    public static Map<String, Object> academicGroupProcess(String groupTitle) {
        String regex = "([а-яА-Я]+)(.{1,3})([ОЗВ]{1,2})-([0-9])(\\d{2})([БМСкгп]{1,2})-([0-9]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(groupTitle);

        if (matcher.find()) {
            Map<String, Object> group = new HashMap<>();
            group.put("filial", filialProcess(matcher.group(1)));
            String group1 = matcher.group(2);
            int facultyNumber = 0;

            if (group1.equals("1") || group1.equals("2") || group1.equals("3") || group1.equals("4") || group1.equals("5") ||
                    group1.equals("6") || group1.equals("7") || group1.equals("8") || group1.equals("9") || group1.equals("10") || group1.equals("11") || group1.equals("12")) {
                facultyNumber = Integer.parseInt(group1);
            } else if (group1.equals("И")) {
                facultyNumber = 10;
            } else if (group1.equals("С")) {
                facultyNumber = 13;
            } else {
                facultyNumber = 0;
            }

            group.put("facultyNumber", facultyNumber);
            group.put("educationForm", educationFormProcess(matcher.group(3)));
            group.put("courseNumber", Integer.parseInt(matcher.group(4)));
            group.put("groupNumber", Integer.parseInt(matcher.group(5)));
            group.put("degree", degreeProcess(matcher.group(6)));
            group.put("yearOfAdmission", 2000 + Integer.parseInt(matcher.group(7)));
            return group;
        }
        return null;
    }

    public static void main(String[] args) {
        String groupTitle = "М2В-501Б-19";
        Map<String, Object> group = academicGroupProcess(groupTitle);
        System.out.println(group);
    }
}**/

