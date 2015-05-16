package ex16_05;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class ClassContents {
	public static void main(String args[]){
		try{
			Class<?> c = Class.forName(args[0]);
			System.out.println(c);
			printMembers(createAllMembers(c.getFields(), c.getDeclaredFields()));
			printMembers(createAllMembers(c.getConstructors(), c.getDeclaredConstructors()));
			printMembers(createAllMembers(c.getMethods(), c.getDeclaredMethods()));
		} catch(ClassNotFoundException e){
			System.out.println("unknown class: " + args[0]);
		}
	}

	private static Member[] createAllMembers(Member[] mems, Member[] decMems){
		HashSet<Member> allMembersSet = new HashSet<Member>();
		allMembersSet.addAll(Arrays.asList(mems));
		allMembersSet.addAll(Arrays.asList(decMems));
		Member[] allMembersArray = new Member[allMembersSet.size()];
		return allMembersSet.toArray(allMembersArray);
	}
	
	private static void printMembers(Member[] mems){
		for(Member m : mems){
			if(m.getDeclaringClass() == Object.class){
				continue;
			}
			String decl = m.toString();
			System.out.print(" ");
			System.out.println(strip(decl, "java.lang."));
		}
	}
	
	private static String strip(String str, String stripChar){
		String result;
		if (str.contains(stripChar))
			result = str.replaceAll(stripChar , "");
		else
			result = str;
		return result;
	}
}
