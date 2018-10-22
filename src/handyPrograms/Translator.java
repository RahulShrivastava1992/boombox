package handyPrograms;

import java.util.ArrayList;

class Translator {
public static int translateToInteger(String str)
			{
				String numeric;
				int Return=0;
				numeric=str;
				switch(numeric)
				{
				case "Zero":
					Return=0;
					break;
				case "One":
				Return=1;
				break;
				case "Two":
				
				Return=2;
				break;
				case "Three":
				Return=3;
				break;
				case "Four":
				Return=4;
				break;
				case "Five":
				Return=5;
				break;
				case "Six":
				Return=6;
				break;
				case "Seven":
				Return=7;
				break;
				case "Eight":
				Return=8;
				break;
				case "Nine":
				Return=9;
				break;
				
				default:
				System.out.println("Input correct value");
				
				
				}
				return Return;
				
			}
			
			public static String translateToAlphabetic(String number)
			{
				
				String Return=null;
				
				switch(number)
				{
				case "0":
					Return="Zero";
					break;
				case "1":
				Return="One";
				break;
				case "2":
				
				Return="Two";
				break;
				case "3":
				Return="Three";
				break;
				case "4":
				Return="Four";
				break;
				case "5":
				Return="Five";
				break;
				case "6":
				Return="Six";
				break;
				case "7":
				Return="Seven";
				break;
				case "8":
				Return="Eight";
				break;
				case "9":
				Return="Nine";
				break;
				
				default:
				System.out.println("Input correct value");
				
				
				}
				return Return;
			}
			
			}
