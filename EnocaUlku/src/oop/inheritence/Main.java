package oop.inheritence;

public class Main {
	public static void main(String[] args) {
		Customer customer=new Customer();
		Employee employee=new Employee();
		employee.name="Engin";
		customer.id=1;
		
		CustomerManager customerManager =new CustomerManager();
		customerManager.add();
		
		Administrator administrator=new Administrator();
		administrator.add(new CustomerManager());
		//anneyi verip çocuklarından istediğimizi yollayabiliriz referans tiptir.anne alt sınıfların referansını tutabilir
	}
}
/* 
Kalıtım, programlama ortamında da gerçek hayattaki tanımına benzer bir işi gerçekleştirir. 
Bir sınıfın başka bir sınıftan kalıtım yapması demek, 
kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını kendisine alması demektir. 
Kalıtımı yapan sınıfa alt sınıf, kendisinden kalıtım yapılan sınıfa ata sınıf dersek, 
ata sınıfta tanımlı olan herşeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.

 */
