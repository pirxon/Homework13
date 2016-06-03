package ua.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	/**
	 * Домашнее задание - при помощи методов removeAll и retainAll получить 2 
	 * непересекающихся множества. Т.е. если одно множество было {"str1", "str2", 
	 * "str3", "str4"} а второе {"str6", "str2", "str5", "str4"} то результатом 
	 * наших операций должны стать следующие множества {"str1", "str3"} и  {"str5", 
	 * "str6"}
		Дополнительно (по желанию)
		1) Посмотреть и разобратся с классами AbstractList и AbstractSequentialList
		2) Выбрать один из этих классов и создать класс наследник (от AbstractList 
		и AbstractSequentialList) - нашу собственную коллекцию. 
		3) Звлезть в код ArrayList и LinkedList и разобратся с их методами на основе 
		javaDoc.
	
		removeAll(Collection col) — удаляет все элементы, которые есть в коллекции col
		retainAll(Collection col) — удаляет все элементы, не принадлежащие col
	 * @param args
	 */
	public static void main(String[] args) {

	Set<String> set1 = new HashSet<>();
        set1.add("str1");
        set1.add("str2");
        set1.add("str3");
        set1.add("str4");
      
        Set<String> set2 = new HashSet<>();
        set2.add("str6");
        set2.add("str2");
        set2.add("str5");
        set2.add("str4");

    	Set<String> set3 = new HashSet<>();        
        set3.addAll(set1);
        set3.retainAll(set2);
        set1.removeAll(set3);
        set2.removeAll(set3);
        
        System.out.println(set1);
        System.out.println(set2);
	}

}
