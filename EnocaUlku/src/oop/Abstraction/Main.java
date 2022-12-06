package oop.Abstraction;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//Referansını tutabilir parametre olarak verilebilir zorunlu operasyonlar ekleyebiliyoruz herkesin ayrı ayrı içini doldurabileceği
		GameCalculator gameCalculator = new WomanGameCalculator();
				
		//Abstract sınıflar new'lenemezler tek başlarına kullanamazlar
		//GameCalculator gameCalculator = new GameCalculator() {
			
			//@Override
			//public void hesapla() {
				// TODO Auto-generated method stub
				
			//}

	}

}
/*
Soyutlama (Abstraction)
Nesne yönelimli programlamada Soyutlama (Abstraction) ilkesi, eğer bir sınıf için nesne üretmek mantıksız geliyorsa 
o sınıf soyutlanabilir.Alt sınıfların ortak özelliklerini ve işlevlerini taşıyan ancak henüz bir nesnesi olmayan bir 
üst sınıf oluşturmak istenirse bir soyut (abstract) üst sınıf oluşturulur.
Soyutlama, bir sınıfa veya metoda temel görevlerin tanımlanması, 
detayların ise tanımlanmaması demektir. Temel olarak bir soruna ait çözüme giderken kullanılacak yöntemlerin, 
ilk etapta daha genel basit ve soyut bir tanımını yapmaktır.
"abstract" Anahtar Kelimesi ve Soyut Sınıf Kavramı (Abstract Class)
Soyutlama kavramı sınıfın içindeki iç işleyişi dışarıdan izole etmek, 
yani gizlemektir. Örneğin: bilgisayarı kullanırken çoğu kullanıcı bilgisayarın iç işleyişinden haberi olmaz. 
Hafızanın işlemciyle haberleşmesi, işlemler arası senkronizasyon, klavyeden girilen değerlerin ekrana yansıması 
,gibi birçok işlemin detayı kullanıcılardan gizlenmiş durumdadır. 
Kullanıcılar sadece bu fonksiyonları veya işlevleri bir arayüz vasıtasıyla çağırıp kullanmaktadır. İç detaylarına müdahale etmemektedir.
 */