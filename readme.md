# HASTANE RANDEVU SİSTEMİ
## Geliştirici notları;
    Sistemde kullanıcılar auth bilgisi ile giriş yapabilecekler fakat randevu oluşturmak için bu bilgilere ihtiyaç olmayacak şekilde yarattım. 
    İstenirse doktor controller üzerinden doktorun sahip olduğu tüm randevular bulunabiliyor. Böylelikle müsait zamanları takip edilebilir.

## KULLANIM
- Tarayıcınızı açın ve http://localhost:9090 adresine gidin.
- Giriş yapın veya kaydolun.
- Randevu almak istediğiniz doktoru seçin ve uygun bir tarih ve saat seçeneği belirleyin.
- Randevunuzu onaylayın.
- Randevularınızı görüntülemek ve yönetmek için profilinize gidin.


## KULLANILAN TEKNOLOJİLER VE BAĞIMLILIKLAR

- Spring Boot version 3.2.1
- Spring Boot Starter Validation
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- H2 Database version 
- Lombok version 
- vb.

## Bağlantılar ve Kaynaklar

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Hibernate Validator](https://hibernate.org/validator/)
- [H2 Database](https://www.h2database.com/html/main.html)
- [Lombok](https://projectlombok.org/)
- vb.

## Notlar

- Hibernate Validator, doğrulama işlemleri için kullanılmaktadır.
- H2 Database, geliştirme ve test amaçları için kullanılmaktadır.
- Lombok, Java sınıflarındaki tekrarlayan kodu azaltmak için kullanılmaktadır.
