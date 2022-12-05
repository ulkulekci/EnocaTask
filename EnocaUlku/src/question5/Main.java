package question5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* 
5- Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi 
kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server a 
nasıl dosya atarsın, Serverdan nasıl dosya çekersin
*******************************************************************************************************
ilk önce uzaktaki bilgisayara bağlanmak için bu komutları giriyoruz
1-)ssh -l kullanici_adi adres -p port_numarasi
kullanici_adi yerine bağlanacağınız bilgisayarda tanımlı kullanıcı adını giriyoruz.
adres ise bağlanmak istediğimiz bilgisayarın adresi oluyor. 
Örneğin 212.154.1.17 gibi bir IP adresi ya da www.adres.com gibi bir web adresi de olabilir.
Dosya transferi:
scp -P port_numarasi kaynak_dosya kullanici_adi@adres:hedef_dosya
test etme:ping sunucunun adresi paketlerin ne kadar sürede gidip geldiğini görebiliriz.
sadece 5 kere ping atamak için (ping -c 5 sunucu adresi)
wget ile tarayıcıdan dosya indirebiliriz (wget dosya)
******************************
ssh ile bağlantı kurmak için cmd ye geliyoruz ilk önce ssh kuralım bunun için kullanacağım komut
(sudo apt install ssh) sudo parolamı giriyorum daha sonra ssh ı aktif hale getiren komut
(sudo systemctl enable ssh)daha sonra çalışıp çalışmadığını kontrol ediyorum
(sudo systemctl status ssh)şimdi bu linux makinamıza uzaktan bağlanalım 
(ssh kullanıcıadiuzaktakimakinanın@uzaktakimakineninipadresi)bize eminmisin diyor yes diyoruz daha sonra uzaktaki
kullanıcımız için parolamızı giriyoruz.Böylece uzaktaki sunucuya bağlantı kurduk. yani oturum açmış durumdayız.

 */