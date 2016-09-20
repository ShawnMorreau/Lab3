import java.util.*;
public class AddressBook {
	static BuddyInfo newBuddy;
	static ArrayList<BuddyInfo> buddyBook;
	public AddressBook(){
		
	}
	public void addBuddy(BuddyInfo buddy){
		if(buddy != null){
			buddyBook.add(buddy);
		}
	}
	public void removeBuddy(int index){
		if(index >= 0 && index < buddyBook.size()){
			buddyBook.remove(index);
		}
	}
	public static void main(String args[]){
		System.out.println("Address Book");
		newBuddy = new BuddyInfo();
		buddyBook = new ArrayList<BuddyInfo>();
		buddyBook.add(newBuddy);
		buddyBook.remove(0);
	}
}
