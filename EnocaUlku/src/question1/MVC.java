package question1;

public class MVC {
  
}
/*1- MVC kavramını açıklar mısınız ? 
  Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor. 
  Object Oriented katmanları nelerdir ?
  *****************************************
  Arayüz için bir tasarım desenidir.
  Model:Veri tabanı sınıfları, iş yapılan katmanı kısacası java kodlarımız bizim için model kısmıdır.
  View:Kullanıcı ile bağlantı kuracağımız arayüz.Ekranda gördüğümüz yer React,Html,js ile yapılan kısım
  Controller:model ile view arasındaki bağlantıyı kurar.
 *************************************** 
  MVC: Model-View-Controller Kullanıcı arayüzünü birbirinden ayırarak farklı amaçlar için kullanılan
   bölümleri ayrı ayrı gruplandırarak karmaşıklığı engellemeyi sağlar. Böylece sorumluluklar ayrılmış olur.
   Kısacası projemizi katmanlıyoruz. Veri tabanı için bir katman, 
   sorgularımız için ayrı bir katman ve son kullanıcıya 
   sunulacak olan ekran için ise ayrı bir katman oluşturmaktır. 
   Model genellikle veri tabanı işlemlerimizi yaptığımız yapıdır. 
   Veri tabanımız üzerinde yapılabilecek sorgularımızı burada belirler ve 
   Controller e atamamızı sağlarız. Bu sayede veri tabanımıza dışarıdan daha kolay 
   erişebilir ve çeşitli metotlarla daha kolay idare edilebilir hale getirir. 
   Controller Model yardımıyla oluşturduğumuz sorguların kullanıcı tarafından alınan 
   veriler ile birleşip uyumlu bir biçimde çalışmasını sağlayan yapıdır. 
   View sonucun gösterildiği bölümdür. 
 
  */