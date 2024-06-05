Araç Kiralama Projesi

Bu proje, dört ana modülden oluşan bir araç kiralama sistemini kapsamaktadır: Entity, DAO, Business ve View. Bu modüller, projenin farklı katmanlarını temsil eder ve her biri belirli bir görevi yerine getirir.

Modüller:

Entity Modülü

    Veritabanı tablolarını ve bu tablolara ait varlık nesnelerini tanımlar.
    Kullanıcı, marka, model, araç, rezervasyon gibi temel entity nesnelerini içerir.
    Bu nesneler arasındaki ilişkileri belirler.

DAO (Veri Erişim Nesnesi) Modülü

    Veritabanı erişimi ve işlemleri için bir arayüz sağlar.
    Entity modülündeki nesnelerin veritabanına kaydedilmesi, güncellenmesi ve silinmesi süreçlerini yönetir.
    Veritabanından veri alma işlemlerini gerçekleştirir.

Business Modülü

    İş mantığını yönetir ve uygulama içindeki temel işlemleri gerçekleştirir.
    Fiyatlandırma ve araç kiralama hesaplamaları gibi iş mantığı operasyonlarını yönetir.
    Veritabanı işlemleri için DAO modülü ile etkileşime girer.

View Modülü

    Kullanıcı arayüzünü (UI) yönetir ve kullanıcıyla etkileşimi sağlar.
    Araç listesi ve kiralama ekranı gibi kullanıcı bilgilerini gösterir.
    Kullanıcının girdiği bilgileri iş katmanına ileterek işlemleri başlatır.

Projenin Temel İsterleri

    Firmadaki tüm araçların sisteme kaydedilmesi.
    Her araca ait plaka bilgilerinin tutulması.
    Sistem üzerinden belirli kriterlere göre uygun ve müsait araçların listelenmesi.
    Rezervasyon işleminin yapılması.

Kullanıcılar, belirli bir tarih aralığındaki araçların müsaitlik durumlarını kontrol edebilecekler. Örneğin, "Renault Clio" veya "Volkswagen Polo" gibi kriterlere göre arama yapabilecekler ve uygun araçlardan rezervasyon yapabilecekler.
Projenin Amacı

Bu projenin amacı, hem araç takibini yapabilmek hem de müsaitlik durumlarını görebilme ve iş yerini yönetebilme imkanı sağlamaktır.

Araç kiralama projesinin geliştirilmesi, Java katmanlı mimarisi ile yazılım geliştirme, veritabanı işlemleri yapma ve kullanıcı arayüzü oluşturma gibi konularda deneyim sahibi olmanızı sağlayacaktır.
Katmanlı Mimari

Bu modüller, projenin katmanlı mimarisini oluşturarak kodun düzenli, modüler ve bakımı kolay olmasını sağlar. Entity nesnelerini, veritabanı erişimini, iş mantığını ve kullanıcı arayüzünü ayrı ayrı ele almak, geliştirme sürecini daha yönetilebilir hale getirir ve ek işlevler eklemeyi kolaylaştırır.