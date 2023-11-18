# Java Sepet Tutarı Hesaplama
### Uygulmanın Amacı
Kullanıcılar sepete eklemiş oldukları ürünlerin, sepet tutarını hesaplayabilmektedir. Aynı zamanda sepetten ürün de çıkarabilmektedirler.
### Uygulamanın Yapılışı
    1- Product isimli bir sınıf oluşturuyoruz. Ürünlerin id,name,price değerlerini tutacak. Aynı zamanda Product isimli bir yapıcı 
    blok barındıracaktır
    2- ProductManager isimli bir sınıf oluşturuyoruz. products adında bir arrraylist değeri tutacak(sepetimiz bu olacak).
        Ürün eklemek için Add() , Ürün silmek için Delete(), Sepet tutarı hesaplatmak için Hesapla() fonksiyonları barındıracaktır.
    3-main fonksiyonu içinde:
        a-productmanager nesnesi oluştur.
        b-eklenecek product nesnesi oluştur.
        c-productManager.Add(product) ile ürün sepete eklenir
        d-productManager.Delete(product) ile ürün sepetten silinir
        e-productManager.Hesapla() ile sepet tutarı hesaplanır
### Uygulama Çıktısı
![banner](https://github.com/yusufitmis/JavaProjects/blob/main/SepetTutari/Readme.png)
### Uml Diagramı
![uml](https://github.com/yusufitmis/JavaProjects/blob/main/SepetTutari/UmlClassDiagram.png)

Kullandığım ide : İntellijIDEA

