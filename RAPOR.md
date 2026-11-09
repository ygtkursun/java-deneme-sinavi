# Rapor

**Ad Soyad:** Yiğit Kurşun
**Numara:** 95

## 1. Problem Analizi
<!-- Problemi kendi cümlelerinizle yazın. -->
Net hesaplama ve başarı değerlendirme sistemimiz var. Sistem bizden doğru ve yanlış sayılarımızı istiyor. Yanlış hesaplama yapmamak için adetlerini kontrol ediyor. Çıktı olarak toplam soru sayısını, doğru, yanlış, boş, net ve başarı durumumuzu hesaplayıp yazıyor.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-"Dogru cevap sayinizi (0-20) girin: " -> 10 (Kaydedilen değişken: number)
-"Yanlis cevap sayinizi (0-20) girin: " -> 5 (Kaydedilen değişken: number2)
**İşlemler:**
-"number ve number2 ilişkisi nasıl?" -> number = 10 ve number2 = 5 (Buna göre) -> 
-Doğru: number / Yanlış: number2 / Boş: (20 - (number + number2)) / Net: number - number2/4.0 / Başarı: [Tabloya ve net ilişkisine göre derecelendirme]

**Çıktılar:**
-Toplam soru: 15
-Dogru: 10
-Yanlis: 5
-Bos: 5
-Net: 8.75
-Basari: Orta

## 3. Matematiksel Formüller

-Çıkarma ve bölme

## 4. Sözde Kod (Pseudocode)

```
1. Sistem bizden sırasıyla doğru ve yanlış sayımızı ister.
2. Değişkenlerin ilişkisine göre boş sayısını, neti ve başarıyı hesaplar.
3. Toplam cevapladığımız soru sayısını, doğru, yanlış, boş sayısını, neti ve başarıyı yazar.
```

## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 6. Başarı Durumu Koşulları
<!-- Koşulları hangi sırayla ve hangi operatörlerle yazdığınızı, nedenini açıklayın. -->
= >= <= + - / && >
-Önce eksik veya fazla hesaplamayı engellemek için toplam soru sayısını kontrol ettim. Çünkü kontrol edebileceğim en genel özellik buydu. Sonra "Basari: "
 dışında tüm çıktıları yazdım, çünkü "Basari: "nin ek olarak hesaplanması gerek. Sonra "Basari: " hesaplamasını if, else if ve else ile kontrol ettim ve sonuca göre onu da yazdırdım. 
 ## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi | Net: 20, Basari: Çok iyi | Doğru |
| 15 | 4 | Net 14, İyi | Net: 14, Basari: Iyi | Doğru |
| 10 | 8 | Net 8, Orta | Net: 8, Basari: Orta | Doğru |
| 5 | 0 | Net 5, Geliştirilmeli | Net: 5, Basari: Gelistirilmeli | Doğru |
| 0 | 20 | Net -5, Geliştirilmeli | Net: -5, Basari: Gelistirilmeli | Doğru |
| 10 | 10 | Net 7,5, Orta | Net: 7.5, Basari: Orta | Doğru |
| 15 | 10 | Geçersiz giriş | Hesaplama yapilamaz! | Doğru |
| 12 | 9 | Geçersiz giriş | Hesaplama yapilamaz! | Doğru |
| -1 | 5 | Geçersiz giriş | Hesaplama yapilamaz! | Doğru |
