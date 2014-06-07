//	Lab 2 - Algoritmer och Datastrukturer,  Uppg 2,3,4,5
//	Caroline Kabat & Gustav Svalander,	Grupp nr 24

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		// Test print for an empty ArrayList
		CollectionOps.print(names);
		System.out.println();

		// Test print for a ArrayList containing one element
		names.add("a");
		CollectionOps.print(names);
		System.out.println();

		// Test print for a ArrayList containing more than one elment
		names.add("b");
		names.add("c");
		CollectionOps.print(names);
		System.out.println();

		// Test the return value from reverse
		CollectionOps.print(CollectionOps.reverse(names));
		System.out.println();

		// Test that reverse mutates its argument
		CollectionOps.print(names);
		System.out.println();

		// Write code to test less here   
		System.out.println();
		System.out.println("less: "); 
		IntegerComparator intcomp = new IntegerComparator();
		StringComparator stringcomp = new StringComparator();

		ArrayList<Integer> li1 = new ArrayList<Integer>();
		li1.add(4);
		li1.add(2);
		li1.add(5);
		li1.add(1);
		li1.add(3);
		CollectionOps.print(li1);System.out.println();

		ArrayList<Integer> li2 = new ArrayList<Integer>();
		li2.add(8);
		li2.add(6);
		li2.add(7);
		li2.add(9);
		CollectionOps.print(li2);System.out.println();

		ArrayList<Integer> li3 = new ArrayList<Integer>();
		li3.add(97);
		li3.add(5);
		li3.add(123);
		li3.add(18);
		CollectionOps.print(li3);System.out.println();

		ArrayList<String> johanneberg = new ArrayList<String>();
		johanneberg.add("HC2");
		johanneberg.add("ED");
		johanneberg.add("HC3");
		CollectionOps.print(johanneberg);System.out.println();

		List<String> lindholmen = new  ArrayList<String>();
		lindholmen.add("Saga");
		lindholmen.add("Svea");
		lindholmen.add("Jupiter");
		CollectionOps.print(lindholmen);System.out.println();

		System.out.println( CollectionOps.less(li1,li2,intcomp) );
		System.out.println( CollectionOps.less(li1,li3,intcomp) );
		System.out.println( CollectionOps.less(johanneberg,lindholmen,stringcomp) );

		// Write code to test map here
		Collection<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(-42);
		l1.add(88);
		l1.add(19);
		l1.add(-37);
		l1.add(0);
		l1.add(18);
		Collection<Integer> l2 = CollectionOps.map(new SignFunctor(),l1);
		System.out.println();
		System.out.println("map: ");
		CollectionOps.print(l2);
		

		// Write code to test filter here
		Collection<Integer> l3 = new ArrayList<Integer>();
		l3.add(3);
		l3.add(-42);
		l3.add(88);
		l3.add(19);
		l3.add(-37);
		l3.add(0);
		l3.add(18);
		Collection<Integer> l4 = CollectionOps.filter(new IsEvenFunctor(),l3);
		System.out.println();
		System.out.println();
		System.out.println("filter: ");
		CollectionOps.print(l4);
	}
}