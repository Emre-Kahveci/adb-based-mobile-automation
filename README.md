<h1 align="center" id="title">ADB BASED MOBILE AUTOMATION</h1>

![adb-based-mobile-automation](https://socialify.git.ci/Emre-Kahveci/adb-based-mobile-automation/image?font=Jost&language=1&name=1&pattern=Circuit%20Board&theme=Dark)
<div align="center">
  
  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
  
</div>

## Metotlar

- **Butonlar**: Home butonu, geri butonu, enter butonu
- **Tıklama metotları**: istenilen x, y koordinatına istenilen bekleme süresi ile click, hold (basılı tutma süresi değişken olarak verilebilir), swipe (x1, y1'den x2, y2'ye kaydırma) metotları
- **Ekran metotları**: parlaklık artırma/düşürme, ekran on/off
- **RGB Kontrol metodu**: ScreenController.getColorAtCoordinate(x, y) metodu ile ekranda istenilen bir noktanın RGBA kodlarını Color değişkeni olarak gönderir. "java.awt.Color" ile oluşturulmuş bir renk ile kontrolü sağlanabilir.

## Gereksinimler

- Android telefon (geliştirici seçeneklerinden usb hata ayıklama açılmalı)
- ADB (android debug bridge)
