<a name="br1"></a> 

**Hayvanat Bahçesi Projesi**
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

<br>Projeyi Java programlama dili ile geliştirdim çünkü hem daha fazla tecrübem olduğu için

hemde Java, nesne yönelimli programlama için güçlü bir dil ve geniş bir topluluğa sahip.

Ayrıca, Java'nın platform bağımsız olması ve geniş kütüphane desteği sunması projeyi

geliştirmeyi kolaylaştırdı.

<br><br>**2. ArrayList ve List Arayüzü:**

<br>Hayvanların listesini yönetmek için ArrayList ve List arayüzlerini kullandım çünkü bu veri

yapıları, dinamik boyutlandırma ve geniş işlevsellik sunar. Liste arayüzü, çok çeşitli işlevleri

gerçekleştirmek için esneklik sağlar.

<br><br>**3. Random Sınıfı:**

<br>Rastgele pozisyonlar ve diğer rastgele işlemler için Random sınıfını kullandım. Bu sınıf,

rastgele sayılar ve öğeler oluşturmak için kullanışlıdır ve projenin rastgele davranışlarını

simüle etmek için gereklidir.

**4. Diğer Yardımcı Sınıﬂar ve Arayüzler:**

Projede kullanılan diğer yardımcı sınıﬂar ve arayüzler, hayvan nesnelerini oluşturmak ve

işlemek için kullanılmıştır. Bu sınıﬂar, projenin daha iyi organize edilmesini ve bakımını

kolaylaştırır.

****

**Yapılan Çalışma**

<br>Proje için nesne üretimini tek bir sınıf üzerinden yürütmek ve genişletilebilirliği

sağlamak için Factory Design Pattern’ı uyguladım.

<br><br>**IAnimal:**

<br>IAnimal sınıfı, 11 farklı hayvan için ortak fonksiyonların imzasını tutmaktadır.

**AnimalFactory:**

<br>AnimalFactory sınıfı, IAnimal arayüzü türünden 4 parametreye sahip “getShape” adlı

bir fonksiyona sahiptir.

Bu fonksiyon girilen parametrelerle hangi hayvan sınıfının üretileceğine içindeki

karar yapıları ile karar verir ve yeni nesneyi oluşturarak döndürür.

<br><br>**Zoo:**<br>

<br>Zoo sınıfı içinde “Zoo”, “addAnimals”,”addNewBorn”,”simulate” fonksiyonları

bulunur. Zoo, 2 parametreli kurucu fonksiyonudur. Girilen 2 parametreli ile

Hayvanat bahçesinin 2 boyutlu alanını oluşturur.<br>

addAnimals, 3 parametre alarak simülasyonun başlangıcında oluşturulması gereken

hayvanların cinsiyetini, sayısını ve cinsiyetini aktarır. İçerisinde bulunan “Random”

sınıfından türetilen yapı ile “for” döngüsü içerisinde IAnimal arayüzüne dayalı olarak

tanımlanan animal değişkeni girilen parametreler sonucu oluşturulan hayvan

nesnesini tutarak Zoo sınıfı içinde statik tanımlanmış olan “animalList” adlı listeye

ekler. Böylece oluşturulan nesnelerin verisi tutulmuş olur.

<br>addNewBorn, hayvanların birbiriyle etkileşiminde ortaya çıkan yeni oluşturulan

nesnelerin verisini “Zoo” sınıfı içerisinde statik tanımlanmış olan “newBornList”

içerisine ekler.<br>



simulate fonksiyonu, “while” döngüsü ile simülasyona tanımlanmış toplam izin

verilen birim hareketlerinin kontrolünü yaparak simülasyonu devam ettirir. Bu

döngünün içinde “for” döngüsü ile “animalList” içindeki nesneleri tek tek dönerek

her bir hayvan sınıfında tanımlı olan “makeInteraction” ve “move” fonksiyonlarını

çalıştırır. Böylece her bir hayvan rastgele hareket etmiş olur. Ve konumlarına göre

birbirleriyle etkileşime girebilirler. Bu etkileşimler sonucu ortaya çıkan yeni nesneler

“newBornList” listesine eklenir. Silinecek nesneler silinmeden önce “deleteList”

listesine eklenir. Bunun sebebi mevcut döngü içerisinde “animalList” içeriğinin

güncellenmesi de alınan hatalardır. Bu yaklaşımla “makeInteraction” fonksiyonu

içerisinde farklı listelere ekleyerek “for” döngüsü dışındaki “while” döngüsünün

içerisinde “animalList” içeriği güncellenir. Böylece “for” döngüsü her aşamada içeriği

güncellenerek devam eder.

<br>“newBornList” ve “deleteList” listeleriyle “animalList” içeriğini güncellemeden

istenmeyen durumlar ve bug’lardan kaçınmak için karar mekanizmalarıyla kontrol

edilir.




<br><br>**Diğer Hayvan Sınıﬂarı:**

<br>11 farklı hayvan sınıfı IAnimal arayüzünden anlaşmalı 8 fonksiyonu tanımlamak

zorundadır.

<br>Bunlar; “move”, “makeInteraction”, “getMobilityRange”, “getName”, “getX”, “getY”,

“getSpecies”, “getGender”, “getMobilityRange”.

<br>Bu fonksiyonlar dışında; “randomGender”, “getInteractionRange”,

“setInteractionRange”, “setName”, “setX”, “setY”, “setSpecies”, “setGender”,

“setMobilityRange” ve her sınıfın kendi kurucu fonksiyonları bulunur.

<br>Getter ve setter fonksiyonlarını sınıf içindeki değişkenler “private” oldukları için

diğer sınıﬂar tarafından değerlerini almak ya da yeni atamalar yapmak için kullanılır.

<br>Her hayvan sınıfında bulunan kurucu fonksiyonlar parametreleriyle aktarılan

cinsiyet ve konum bilgilerini yerel değişkenlere aktarırlar. Ve kendi sınıfı içinde

bulunan statik tanımlı “count” değişkenini her çağrıldıklarında arttırır. Her nesnenin

isminin yanına eklenerek konsola yazıldığında farklarını daha rahat ayırt etmemizi

sağlar.

<br>makeInteration fonksiyonu “IAnimal” türünden bir listeyi parametre olarak alır. “for”

döngüsü içinde her bir elemanını dönerek kontrollerle etkileşime girdiği hayvanı

belirler. Eğer bu hayvan kurt, aslan ya da insan(avcı) ise avlanır ya da konumu ve

türü kendisiyle aynı olacak şekilde farklı bir hayvan türetebilir.

Eğer bu inek, koyun, tavuk, horoz ise konumu ve türü aynı olacak şekilde farklı bir

hayvan türetebilir.

<br>Her hayvana tanımlı “interactionRange” değişkeninin değerine göre kontrollerde

“Math.sqrt” ve “Math.pow” kullanılarak nesne türetme olayı kontrol edilir. Hayvan

etkileşimi ile birlikte nesne türetilen durumlarda etkileşime girilen hayvan sınıfın

içinde tanımlı “ex” listesinde tutulur. Böylece fonksiyon her çağrıldığında

kontrollerle hem sürekli aynı hayvanlar arasındaki türetme ilişkisinin aşırı tekrarı

önlenir hem de kendileriyle aynı konumda türetilen zıt cinsler arasındaki

etkileşimler önlenir.

<br>Türetme etkileşimi tek taraﬂı yapıldı. Böyle olmasının sebebi mevcut yapı itibariyle

kontrollerin gerek uzamasını önlemektir çünkü daha az kontrolle aynı sonuçlar elde

edilmektedir. “Rooster” sınıfında “makeInteraction” fonksiyonu bütün etkileşimler

“Chicken” sınıfında halledildiği için işlevsizdir.

<br>Eğer proje tanımında tavuk ve horoz, kuş türünden kabul edilmelidir denilseydi.

Yapıyı “Abstract Factory Method” olarak uygulardım.

<br>Her bir döngüde hayvanlar ya nesne türetir ya da nesne silerler. 2 durumdan biri

gerçekleştiğinde döngüden çıkılır. Böylece tek döngüde birden fazla oluşacak

etkileşimler önlenir. Önlenmediği durumlarda bir hayvanın tek döngü içinde birden

fazla nesne türetme veya silme durumu ortaya çıkmaktadır. Bu durum

simülasyonun ﬁziksel dünyaya uyumluluk açısından iyi bir durum olmadığı

gerekçesiyle önlendi. Nesne türetilir ise “App” sınıfında oluşturulan statik

tanımlanmış “Zoo” sınıfından türetilmiş “zoo” nesnesi kullanılarak “addNewBorn”

fonksiyonu parametrelere değerler verilerek çalıştırılır ve sonrasında döngü

sonlanır.

<br>randomGender fonksiyonu, nesne türetilen durumlarda kullanılarak rastgele

cinsiyet seçilmesini sağlar.<br>

randomNumber fonksiyonu, sadece “Chicken” sınıfında vardır. 0 ya da 1 değerini

rastgele olarak döndürür. Türetilecek nesnenin cinsiyet atamasında kullanılır.

<br><br><br>**App:**<br><br>

Son olarak “App” sınıfı simülasyonun başlatıldığı programı çalıştıran sınıftır. “Zoo”

sınıfından türetilen nesneyi statik olarak tutan “zoo” ile simülasyona başlanılacak

hayvanları sırasıyla “zoo.addAnimals” fonksiyonu ile oluşturulur. Sonrasında

“zoo.simulate” ile hareketleri ve etkileşimleri başlatırız.



