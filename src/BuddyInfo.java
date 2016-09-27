
public class BuddyInfo {
	String name,address;
	int phoneNumber;
	public BuddyInfo(){
		BuddyInfo newBuddy = new BuddyInfo();
		newBuddy.setName("Bob");
		newBuddy.setAddress("619 hello ave.");
		newBuddy.setPhoneNumber(5555);
	}
	public BuddyInfo(String name, String address, int number){
		this.name = name;
		phoneNumber = number;
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public static void main(String[] args){
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Bob");
		buddy.setAddress("619 hello ave.");
		buddy.setPhoneNumber(1234);
		System.out.println("Hello world!");
	}
}
