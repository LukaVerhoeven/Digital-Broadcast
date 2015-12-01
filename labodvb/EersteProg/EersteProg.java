/**
*@author Luka Verhoeven
*
*/

public class EersteProg {
	/**
	*Dit is de Main methode
	*mkdir dvblabo
	*mdir dvblabo
	*cd dvblabo
	*path %path%; "c:\Program files\java\jdk\bin"
	*copy con addpath.bat
	*notepad oefening1.java
	*javac EersteProg.java
	*java EersteProg kaka
	*@param arg[] dit zijn de parameter die je meegeft achter de commandline
	*
	*/


	public static void main(String arg[]){

//int a		32bit
//byte b 	8bit
//long l	64bit
//l = 4152652651626222L; moet een L achter
//short s	16bit

// float f;	32bit
// double d;	64bit
// kommagetal is altijd een double, f = 3.1524( is een double) ==> geeft een error
//a=0xff =255
//boolean kan alleen op true of flase staan , niet 0 of 1

char a;		//unicode 16bit
a='A';
a++; 		//a word "B"


	System.out.println("Dit is mijn eerste Java programma "+ arg[0]);


	drukaf(10);
  Optellen(5,2);
	System.out.println(~10);

	}

	private static void Optellen(int a , int b){


        System.out.println(a+b);

}

	private static void drukaf(int m){

	int a;
	for(a=0;a<=m;a++){
	System.out.println(a);
}
}

}
