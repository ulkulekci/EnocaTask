package oop.inheritence;

public class Main {
	public static void main(String[] args) {
		Customer customer=new Customer();
		Employee employee=new Employee();
		employee.name="Ülkü";
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
*********************************
overriding:Bazı durumlarda üst sınıf tarafında kalıtımla alt sınıflara miras bırakılan metodlar alt 
sınıfın ihtiyacını tam olarak karşılayamazlar. Bu durumda bu metodun alt sınıfta onun kendi ihtiyacına 
uygun olarak tekrardan yazılması gerekir. Burada önemli olan metod imazsının aynen korunmasıdır. 
Bu noktada alt sınıftan yaratılan obje artık üst sınıfın metodunu değil kendi metodunu kullanabilecektir. 
İşte bu olaya üst sınıfın metodunu ezme yani method overriding denir.
*************************************
overloading:aynı sınıf yada üst sınıfta yer alan bir metodun ismini korumak şartıyla 
imzasının değiştirilerek farklı şekilde implemente edilmesidir.

 */
