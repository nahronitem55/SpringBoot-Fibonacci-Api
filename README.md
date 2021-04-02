# SpringBoot-Fibonacci-Api

Api
Fİbonacci Sayı İterasyon Api

Amaç
Bu kitaplık, https://github.com/nahronitem55/SpringBoot-Fibonacci-UI repomda bulunan UI dan gelen, Textbox a girilen sayı kadar fibannaci sayılarının iterasyonu hesaplayan ve gelen isteği geri post eden uygulamadır.
Sadece 8090 portunda gelen ip lere izin verir.
Default http://localhost:8090/api/fibonacci?number=
url ile çalışır.

Tavsiye edilen kullanım
2 yöntemle çalıştırılabilir
1-	https://github.com/nahronitem55/SpringBoot-Fibonacci-UI projesini çalıştır.(8080 portu) Daha sonra https://github.com/nahronitem55/SpringBoot-Fibonacci-Api çalıştırılır.(Default:8090 portu)
2-	Proje içindeki dockerize.bat dosyasını powershell veya cmd kullanarak çalıştırmak için şunu yapın:
./ dockerize.bat

Test
FiboRestApplicationTests dosyasında örnek Junit testler mevcuttur
