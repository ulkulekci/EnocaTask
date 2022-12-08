package question2;

public class Api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*2-Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X 
platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim 
halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız
****************************************************************************************
API (Application Programming Interface)
En basitleştirilmiş tanımıyla API; Bir kod bölümünün başka bir kod bölümüyle iletişime geçmesidir. 
API'ın en genel tanımı bu olmakla birlikte genel olarak ve bu çalışmamız çerçevesinde web üzerinden 
çoğunlukla HTTP protokolüne göre çalışan API'lar ifade edilir.
***********************
Postman bir API platformudur. API geliştirmek , test etmek ve/veya hazır bir API kullanımı için gerekli 
isteklerde bulunabileceğimiz bir uygulamadır. 
Insomnia REST Client, HTTPie gibi alternatifleri de bulunmasına karşın en çok kullanılan API aracıdır.
***********************************
İstemci isteği gönderen, sunucu da ilgili cevabı veren durumundadır. Birbirlerinin sorumluluk alanlarına girmezler. 
Birbirlerinden bağımsız programlama dilleri ve teknolojiler kullanabilirler.
REST mimarisinin prensiplerinden ilki istemci - sunucu çalışma modelidir. 
Biz bir istekte bulunuruz ve sunucu isteğimize karşılık olan durumu (state) bize bir sunum (presentation) olarak gönderir. 
HTTP protokolü burada bu sunum transferi için kurulan iletişimin kurallarını belirler. 
REST mimarisine uygun API'ların neredeyse tamamında HTTP protokolü kullanılır.
kaynak:https://app.patika.dev/courses/rest-api/rest-api-nedir

HTTP Durum Kodları (Status Codes)
Sunucu tarafından ilgili isteğin sonucunu belirten, 3 rakamdan oluşan sayısal ifadelerdir.

Informational responses (Bidirimsel cevaplar) (100–199)

100 Continue
102 Processing
Successful responses (Başarılı cevaplar) (200–299)

200 OK
201 Created
204 No Content
Redirections (Yönlendirme cevapları) (300–399)

300 Multiple Choice
301 Moved Permanently
304 Not Modified
Client errors (İstemci Hataları) (400–499)

400 Bad Request
401 Unauthorized
403 Forbidden
404 Not Found
405 Method Not Allowed
Server errors (Sunucu Hataları) (500–599)

500 Internal Server Error
503 Service Unavailable





*/