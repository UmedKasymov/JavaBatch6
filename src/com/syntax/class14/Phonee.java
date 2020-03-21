package com.syntax.class14;

public class Phonee {

	class Phone{
		String type,make, model;
		void batteryLife (String text){
			System.out.println(make+ text);
		}
		void camera(String text) {
			System.out.println(make +text);
		}
	}
	public class ClassTask {
		public void main(String[] args) {
			Phone phone=new Phone();
			phone.type="iPhone";
			phone.make="Apple";
			phone.model= "XR";
			System.out.println(phone.make+ " manufactures "+phone.type+phone.model);
			System.out.println();
			phone.batteryLife(" battery life is better than Nokia Smart Phones");
			phone.camera(" camera is better than Nokia Smart Phones");
			System.out.println("=======================================");
			Phone phone1=new Phone();
			phone1.type="Android";
			phone1.make="Samsung";
			phone1.model= "Galaxy 11";
			System.out.println(phone1.make+ " manufactures "+phone1.make+" "+phone1.model);
			System.out.println();
			phone1.batteryLife(" battery life is compititive compare to "+phone.make);
			phone1.camera(" camera is compititive compare to "+phone.make);
			System.out.println("=======================================");
			Phone phone2=new Phone();
			phone2.type="Android";
			phone2.make="Nokia";
			phone2.model= "9 PureView";
			System.out.println(phone2.make+ " manufactures "+phone2.make+" "+phone2.model);
			System.out.println();
			phone2.batteryLife(" battery life is not compititive compare to "+phone.make+" & "+phone1.make);
			phone2.camera(" camera is not compititive compare to "+phone.make+" $ "+phone1.make);
		}
	}
}
