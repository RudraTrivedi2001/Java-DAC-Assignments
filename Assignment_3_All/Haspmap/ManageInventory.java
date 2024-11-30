package HaspmapAssignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ManageInventory {

	public HashMap<Integer,SimpleInventory> additem() {
	SimpleInventory si1=new SimpleInventory("suzlon energy",20,80);
	SimpleInventory si2=new SimpleInventory("tata",12,2000);
	SimpleInventory si3=new SimpleInventory("yulu ",10,1000);
	SimpleInventory si4=new SimpleInventory("hyundai",1,10000);
	HashMap<Integer,SimpleInventory> hm=new HashMap<>();
	hm.put(1, si1);
	hm.put(2, si2);
	hm.put(3, si3);
	hm.put(4, si4);
	return hm;
	}
	
	public void  display(HashMap<Integer,SimpleInventory> hm) {
		SimpleInventory si;
		for(Map.Entry<Integer,SimpleInventory> m: hm.entrySet()) {
			si=m.getValue();
			System.out.print(m.getKey()+" ");
			si.display();	
		}
	}
	
	public void updatequantity(HashMap<Integer,SimpleInventory> hm) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter key to update");
		int key=s.nextInt();	
		System.out.println("enter quantity ");
		int quantity=s.nextInt();
		
		for(Map.Entry<Integer, SimpleInventory> aa:hm.entrySet()) {
	
			
			if(aa.getKey()==key)
			{
				aa.getValue().quantity=quantity;
			}	
		}
		System.out.println("updated");
		
	}
	
	
	public void removeitem(HashMap<Integer,SimpleInventory> hm) {
		
		System.out.println("enter key to remove object ");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		int j = 0;
		for(Map.Entry<Integer,SimpleInventory> aa:hm.entrySet()) {
			if(aa.getKey()==key) {
				 j=aa.getKey();
			}
		}
		hm.remove(j);
		
		System.out.println("remove element");
	}
	public void search(HashMap<Integer,SimpleInventory> hm) {
		System.out.println("enter key you want to search ");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		for(Map.Entry<Integer,SimpleInventory> aa:hm.entrySet()) {
			SimpleInventory si;
			if(aa.getKey()==key) {
				aa.getValue().display();
			}
			
			
		}
		System.out.println("search complete");
		
	}
	public static void main(String[] args) {
		ManageInventory mi=new ManageInventory();
		System.out.println("---------------item add --------");
		HashMap<Integer,SimpleInventory> hh=mi.additem();
		System.out.println("------display ----------------");
		mi.display(hh);
		System.out.println("---------------------update-------------");
		mi.updatequantity(hh);
		mi.display(hh);
		System.out.println("------remove-----------");
		mi.removeitem(hh);
		mi.display(hh);
		System.out.println("-------search-------");
		mi.search(hh);
		
		
		
	}
	
}
