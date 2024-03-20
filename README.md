<a name="br1"></a> 

**Hayvanat Bahçesi **<br>**Projesi**
<br>
19\.04.2024

****

**Proje Tanımı**
<br><br>
*500'e 500'lük bir alanda yaşayan 30 koyun (15 erkek,15 dişi), 10 inek (5 erkek,5 dişi), 10 tavuk,10*

*kurt (5 dişi,5 erkek) 10 horoz, 8 aslan (4 erkek, 4 dişi) ve 1 avcı bulunmaktadır.*

*Hayvanlardan;*

*koyun 2 birim, kurt 3 birim, inek 2 birim, tavuk 1 birim, horoz 1 birim, aslan 4 birim, avcı 1 birim*

*rastgele belirlenecek şekilde hareket eder ancak belirlenen alanın dışına çıkamaz.*

*Kurt kendisine 4 birim yakınındaki koyun, tavuk, horozu avlayabilir. Aslan kendisine 5 birim*

*yakınlıktaki inek ve koyunu avlayabilir. Avcı da kendisine 8 birim yakınlıktaki hayvanlardan*

*herhangi birisini avlayabilir. Aynı cins farklı cinsiyetteki hayvanlar birbirine 3 birim yaklaştığında*

*cinsiyeti rastgele belirlenecek ve aynı cins bir hayvan meydana gelecektir. 1000 birim hareket*

*sonunda hayvanların sayısının bulunduğu bir console application yazılması beklenmektedir.*

****

**Kullanılan Teknolojiler**

<br><br>**1. Java Programlama Dili:**

<br>Projeyi Java programlama dili ile geliştirildi. Nesne yönelimli programlama için güçlü bir dil ve geniş bir topluluğa sahip olması yanı sıra platform bağımsız olması ayrıca geniş kütüphane desteği sunması projeyi geliştirmeyi kolaylaştırdı.

<br><br>**2. ArrayList ve List Arayüzü:**

<br>Hayvanların listesini yönetmek için ArrayList ve List arayüzlerini kullanıldı. Bu veri yapıları, dinamik boyutlandırma ve geniş işlevsellik sunar. Liste arayüzü, çok çeşitli işlevleri gerçekleştirmek için esneklik sağlar.

<br><br>**3. Random Sınıfı:**

<br>Rastgele pozisyonlar ve diğer rastgele işlemler için Random sınıfı kullanıldı. Bu sınıf, rastgele sayılar ve öğeler oluşturmak için kullanışlıdır. Projenin rastgele davranışlarını simüle etmek için gereklidir.

**4. Diğer Yardımcı Sınıﬂar ve Arayüzler:**

Projede kullanılan diğer yardımcı sınıflar ve arayüzler, hayvan nesnelerini oluşturmak ve işlemek için kullanıldı. Bu sınıflar, projenin daha iyi organize edilmesini ve bakımını kolaylaştırır.

****

**Yapılan Çalışma**

<br>Proje için nesne üretimini tek bir sınıf üzerinden yürütmek ve genişletilebilirliği sağlamak amacıyla Factory Design Pattern uygulandı. 

<br><br>**IAnimal:**

<br>IAnimal adlı sınıf, 11 farklı hayvan sınıfı için ortak fonksiyonların imzasını tutar.

**AnimalFactory:**

<br>AnimalFactory adlı sınıf, IAnimal arayüzü türünden 4 parametreye sahip getShape adlı bir fonksiyona sahiptir.
Bu fonksiyon girilen parametrelerle hangi hayvan sınıfının üretileceğine içindeki karar yapıları ile karar verir. Sonrasında yeni nesneyi oluşturarak döndürür.


<br><br>**Zoo:**<br>

<br>Zoo sınıfı içinde Zoo, addAnimals, addNewBorn, simulate fonksiyonları bulunur. Zoo, 2 parametreli kurucu fonksiyonudur. Girilen 2 parametreli ile Hayvanat bahçesinin 2 boyutlu alanını oluşturur.

<br>addAnimals adlı fonksiyon, 3 parametre alarak simülasyonun başlangıcında oluşturulması gereken hayvanların türünü, sayısını ve cinsiyetini aktarır. İçerisinde bulunan Random sınıfından türetilen yapı ile for döngüsü içerisinde IAnimal arayüzüne dayalı olarak tanımlanan animal  değişkeni girilen parametreler sonucu oluşturulan hayvan nesnesini tutarak Zoo sınıfı içinde statik tanımlanmış olan animalList adlı listeye ekler. Böylece oluşturulan nesnelerin verisi tutulur.

<br>addNewBorn adlı fonksiyon, hayvanların birbiriyle etkileşiminde ortaya çıkan yeni oluşturulan nesnelerin verisini Zoo sınıfı içerisinde statik tanımlanmış olan newBornList içerisine ekler.



<br>simulate adlı fonksiyon, while döngüsü ile simülasyona tanımlanmış toplam izin verilen birim hareketlerinin kontrolünü yaparak simülasyonu devam ettirir. Bu döngünün içinde for döngüsü ile animalList içindeki nesneleri tek tek dönerek her bir hayvan sınıfında tanımlı olan makeInteraction ve move fonksiyonlarını çalıştırır. Böylece her bir hayvan rastgele hareket ederek  konumlarına göre birbirleriyle etkileşime girebilmeleri sağlanır. Bu etkileşimler sonucu ortaya çıkan yeni nesneler newBornList listesine eklenir. Silinecek nesneler silinmeden önce deleteList listesine eklenir. Bunun sebebi mevcut döngü içerisinde animalList içeriğinin güncellenmesi de alınan hatalardır. Bu yaklaşımla makeInteraction fonksiyonu içerisinde  farklı listelere ekleyerek for döngüsü dışındaki while döngüsünün içerisinde animalList içeriği güncellenir. Böylece ‘for’ döngüsü her aşamada içeriği güncellenerek devam eder.

<br>newBornList ve deleteList adlı listeler ile animalList adlı listenin içeriğini güncellemeden önce istenmeyen durumlar ve bug’lardan kaçınmak için kontrol mekanizmaları ile karar verilir.




<br><br>**Diğer Hayvan Sınıﬂarı:**

<br>11 farklı hayvan sınıfı IAnimal arayüzünü uyguladıkladıları için arayüzden 8 fonksiyon alırlar.

<br>Bunlar; move, makeInteraction, getMobilityRange, getName, getX, getY, getSpecies, getGender, getMobilityRange.
Bu fonksiyonlar dışında;  randomGender, getInteractionRange, setInteractionRange, setName, setX, setY, setSpecies, setGender, setMobilityRange ve her sınıfın kendi kurucu fonksiyonları bulunur.

<br>Getter ve setter fonksiyonlarını sınıf içindeki değişkenler private oldukları için diğer sınıflar tarafından değerlerini almak ya da yeni atamalar yapmak için kullanılır.

<br>Her hayvan sınıfında bulunan kurucu fonksiyonlar parametreleriyle aktarılan cinsiyet ve konum bilgilerini yerel değişkenlere aktarılır. Bununla birlikte kendi sınıfı içinde bulunan statik tanımlı count değişkenini her çağrıldıklarında arttırılır. Her nesnenin isminin yanına eklenerek konsola yazıldığında farkların daha rahat ayırt edilmesi sağlanır.

<br>makeInteration adlı fonksiyon IAnimal türünden bir listeyi parametre olarak alır. Döngü(for) içinde her bir elemanını dönerek kontrollerle etkileşime girdiği hayvan belirlenir. Eğer bu hayvan kurt, aslan ya da insan(avcı) ise avlanır veya konumu ve türü kendisiyle aynı olacak şekilde farklı bir hayvan türetilir. Eğer inek, koyun, tavuk, horoz ise konumu ve türü aynı olacak şekilde farklı bir hayvan türetilir.

<br>Her hayvana tanımlı interactionRange değişkeninin değerine göre kontrollerde Math.sqrt ve Math.pow kullanılarak nesne türetme olayı kontrol edilir. Hayvan etkileşimi ile birlikte nesne türetilen durumlarda etkileşime girilen hayvan sınıfın içinde tanımlı ex listesinde tutulur. Böylece fonksiyon her çağrıldığında kontrollerle sürekli aynı hayvanlar arasındaki türetme ilişkisinin aşırı tekrarı önlenir. Bununla birlikte kendileriyle aynı konumda türetilen zıt cinsler arasındaki etkileşimler önlenir.

<br>Türetme etkileşimi tek taraflı yapıldı. Böyle olmasının sebebi mevcut yapı itibariyle kontrollerin gereksiz uzamasını önleyip daha az kontrolle aynı sonuçlar elde etmektir. Rooster sınıfında makeInteraction fonksiyonu bütün etkileşimler Chicken sınıfında halledildiği için işlevsiz kalır.


<br>Her bir döngüde hayvanlar ya nesne türetir ya da nesne silerler. 2 durumdan biri gerçekleştiğinde döngüden çıkılır. Böylece tek döngüde birden fazla oluşacak etkileşimler önlenir. Önlenmediği durumlarda  bir hayvanın tek döngü içinde birden fazla nesne türetme veya silme durumu ortaya çıkar. Bu durum simülasyonun fiziksel dünyaya uyumluluk açısından iyi bir durum olmadığı gerekçesiyle önlenir. Nesne türetilir ise App sınıfında oluşturulan statik tanımlanmış Zoo sınıfından türetilmiş zoo nesnesi kullanılarak addNewBorn fonksiyonu girilen parametrelerle çalışır ve sonrasında döngü sonlanır.

<br>randomGender fonksiyonu, nesne türetilen durumlarda kullanılarak rastgele cinsiyet seçilmesini sağlanır. 

<br>randomNumber fonksiyonu, sadece Chicken sınıfında bulunur. 0 ya da 1 değerini rastgele olarak döndürür. Türetilecek nesnenin cinsiyet atamasında kullanılır.

<br><br><br>**App:**<br><br>

App sınıfı simülasyonun başlatıldığı programı çalıştıran sınıftır. Zoo sınıfından türetilen nesneyi statik olarak tutan zoo ile simülasyona başlanılacak hayvanları sırasıyla zoo.addAnimals fonksiyonu ile oluşturur. Sonrasında zoo.simulate ile hareketleri ve etkileşimleri başlatılır.



