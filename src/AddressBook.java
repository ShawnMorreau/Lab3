import java.util.*;
public class AddressBook {
	static BuddyInfo newBuddy;
	static ArrayList<BuddyInfo> addressBook;
	public AddressBook(){
		
	}
	public void addBuddy(BuddyInfo buddy){
		if(buddy != null){
			addressBook.add(buddy);
		}
	}
	public void removeBuddy(int index){
		if(index >= 0 && index < addressBook.size()){
			addressBook.remove(index);
		}
	}
	public static void main(String args[]){
		System.out.println("Address Book");
		newBuddy = new BuddyInfo("john","Carleton",123);
		addressBook = new ArrayList<BuddyInfo>();
		addressBook.add(newBuddy);
		addressBook.remove(0);
		addressBook.add(newBuddy);
	}//https://github.com/ShawnMorreau/Lab3.git
}
