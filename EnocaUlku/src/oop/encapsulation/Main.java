package oop.encapsulation;

public class Main {

	public static void main(String[] args) {
		Product product =new Product();
		product.name="telefon";
		//product.price=1; private bir değişkeni direk çağıramayız
		product.setPrice(12);
        System.out.println(product.getName()+" :ürün eklendi.");
        System.out.println(product.getPrice()+" :fiyat eklendi.");
        
	}

}
/*
kapsülleme veya sarmalama olarak bilinen encapsulation prensibi class’ın property’lerini korumaya almasıdır. 
Bu korumayı sağlamak için private ve protected access modifier’larını (erişim belirteci) kullanırız. 
Eğer bir property’i tanımlarken private kullanırsak o class dışında hiçbir yerden erişim sağlanamaz. 
Protected kullanırsak da yalnızca subclass’lar ve aynı package’da bulunan classlar tarafından erişilir. 
Encapsulation prensibinin maksadı class’a ait property’lere her classın istediği gibi erişmesini ve değiştirmesini engellemektir. 
Erişim kısıtlanmayacaksa bile erişimi getter/setter methodları gibi yöntemlerle kontrol altına almaktır. 
Zaten encapsulation prensibine gözümüzün en aşina olduğu yer getter/setter methodlarıdır.
Nesne Yönelimli Programlama (Object Oriented Programming) 
 */