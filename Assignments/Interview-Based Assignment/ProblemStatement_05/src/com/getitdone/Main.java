package com.getitdone;

import com.getitdone.Interface.IInterface;
import com.getitdone.Interface.Person;

/*
 *  Demonstrate the difference between abstract class and interface by writing programs
as well as in keypoints.

 */
/**
 * 
 * @author akshay
 *   Interface:: If we dont know anything about implementation just we have requirement specification then we should go for interface.
  Abstract class: If we are talking about implementation but not completely then we should go for abstract class.

  Interface:: Every method present inside the interface is always public and abstract whether we are declaring or not.
  Abstract :: Every method present inside abstract class need not be public and abstract.

  Interface:: We can't declare interface methods with the modifiers like private,protected,final,static,synchronized,native,strictfp.
  Abstract :: There are not restrictions on abstract class method modifiers.

  Interface:: Every interface variable is always public static final whether we are declaring or not.
  Abstract:: Every abstract class variable need not be public static final.

  Interface:: Every interface variable is always public static final we can't declare with the 
              	      following modifiers like private,protected,transient,volatile.
  Abstract::  No restriction on access modifiers

  Interface:: For every interface variable compulsorily we should perform initialisation at the time of declaration, 
		     otherwise we get compile time error.
  Abstract::  Not required to perform initialisation for abstract class variables at the time of declaration.

  Interface:: Inside interface we can't write static and instance block.
  Abstract :: Inside abstract class we can write static and instance block.

  Interface:: Inside interface we can't write constructor.
  Abstract :: Inside abstract class we can write constructor.
  
  Abstract class object cannot be created.
 *
 */
public class Main {

	public static void main(String[] args) {
	Abstract ab=new AbstractChild();
	ab.printNubers(10);
	ab.printAlphabets();
	System.out.println("=================================");
	System.out.println();
	IInterface in=new Person();
	System.out.println(in.saveName("nitin"));
	System.out.println(in.saveAddress("RCB"));
	System.out.println(in.saveage(24));
	

	}

}
