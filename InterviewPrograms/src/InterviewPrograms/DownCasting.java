package InterviewPrograms;

interface Owner {

	void tenantDetails();
}

abstract class Details implements Owner {
	
	public void tenantDetails() {
		System.out.println("Tenant Details");
	}

	abstract void tenantFriendDetails();
}

class TenantFriendDetails extends Details {

	void tenantFriendDetails() {
		System.out.println("Tenant friend Details");

	}

}

public class DownCasting {

	public static void main(String[] args) {
		Owner o=new TenantFriendDetails();
		o.tenantDetails();
		Details d=(Details)o;
		d.tenantFriendDetails();
		o.tenantDetails();

	}

}
