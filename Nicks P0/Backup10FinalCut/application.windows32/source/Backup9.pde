// Welcome to our project :)
// Created by:
// Kasper      Lockscreen scroll in not only button
// Maya        Locksceen pill blink op ad ?
// Lukas       Andet start billed
// Ida
// Nick       Please Enjoy Your Stay !            Ændret i reset timer, lavet top bar med alpha impliment en bar på sider der manglede, 
//################################Scroll###################################//
  int scrollY=6; //start værdi der skaber scroll for alt.
  int sSpeed=2; //scroll speed så det går hurtigere.
  int scroll = 0;
  int scrollF = 0;
  int scrollYFace;
  int scrollA = 0;
  int scrollYArb;
  int scrollI=0;
  int scrollYInsta;
  int scrollM=0;
  int scrollYMess;
  int scrollMG=0;
  int scrollYMessG;
  int scrollYMess2;
  int scrollM2=0;
  int scrollYMess3;
  int scrollM3=0;
  int scrollYMess4;
  int scrollM4=0;
  int scrollYMess5;
  int scrollM5=0;
  int scrollL=0;
  int scrollYLock;
  int fancyScroll = 12/10;
  boolean scrollLock=false;
//########################################################################//

//Pages
boolean page1 = true; //lockscreen
boolean page2 = false; //homepage
boolean page3 = false; //facebook

boolean page4 = false; //messenger
boolean page6 = false; //group chat
boolean page7 = false; //second chat
boolean page8 = false; //third chat
boolean page9 = false; //fourth chat
boolean page10 = false; //fifth chat

boolean page5 = false; //instagram

boolean page11 = false; //arbejdnu  



//all variables you need for the homebutton 
int homeDiameterXY = 80; //Diameter 
int homeRadiusXY = 40; //Radius
int colorHomeButton = #0aece9; //color
int HomeScreenWidthLocation = 2; //x location
int HomeScreenHeightLocation = 11; //y location

//color related variables
int black = 0;
int white = 255;
int trance = 200;
int red = #ff0000;
int lightGrey = 100;
int darkerLightGrey = 150;
int colorGrey = #e8eaed;
int colorWhite = #ffffff;
int invisibleEllipse = 0;
int ellipseColorHome = 255;
int trancparancy=150;

PImage imgTest;


//homepage
  PImage lockScreen;
  PImage startScreen;
  PImage aauoveralt;
  PImage instaIcon;
  int iconSizeXY = 120;

//facebook 
  PImage img;
  PImage img2;
  PImage img3;
  PImage img4;
  PImage img5;
  PImage img6;
  PImage img7;
  PImage img8;
  PImage img9;
  PImage img10;
  
  
  //Number of Likes
  int numOfLikes = 4;
  int numOfLikes2 = 23;
  int numOfLikes3 = 29;
  int numOfLikes4 = 17;
  
  //booleans variables for button functions
  boolean like1 = false;
  boolean like2 = false;
  boolean like3 = false;
  boolean like4 = false;
  
//messenger
  PImage Group;
  PImage secPic;
  PImage thirdPic;
  PImage fourPic;
  PImage fifthPic; 


//instagram
//Images 
PImage InstagramText;

PImage TopPaperplane;
int TopPaperplaneX = 515;
int TopPaperplaneY = 60;
int TopPaperplaneW = 60;
int TopPaperplaneH = 60;

PImage AalborgLogo;
int AalborgLogoX = 12;
int AalborgLogoY = 142;
int AalborgLogoW = 65;
int AalborgLogoH = 65;

PImage Image1;
int ImageW = 594; 
int ImageH = 435;

PImage Heart;
PImage Chat;
PImage BottomPaperplane;
int BottomIconW = 50;
int BottomIconH = 50;

PImage Kaffepletten;
PImage Slusen;
PImage Bro;
PImage Vandtorvet;
PImage Smile8;






//topbar related variables

int yStart = 0;
int xStart = 0;
int topbarH = 40;
int backgroundColor = 255;
int Y = 5;

//Topbar images
PImage imgBattery;
PImage imgLock;
PImage imgWIFI;

  
//Med
int textTopSize = 25;
int medX = 10;
int medY = 5;
int medW = 55;
int medH = 40;
//reception
int rSpace = 9;
int repY = 28;
int repW = 3;
int repH = -10;
int repH2 = -16;
int repH3 = -21;
//wifi
int wifiX = 95;
int wifiY = 5;
int wifiW = 36;
int wifiH = 25;
//lock
int lockX = width/2;
int lockY = 20;
int lockW = 40;
int lockH = 40;
//101
int X101 = 481;
int W101 = 67;
int H101 = 36;
//battery
int batW = 46;
int batH = 40;





//timer related variables 
int captureTime = millis();
int captureTimeForFakeClock = millis();
int captureTimeForNotification = millis();
int captureTimeForAnimation = millis();
int millisLock5 = 5000;
int millisLock2 = 2000;


//arbejdNu
  PImage aaulogo;
  PImage itu;
  PImage banner;
  PImage back;
  PImage botBar;
  PImage gamedev;
  PImage projektled;
  PImage devel;
  
   
//______________________________________________________________________________________________________________________________


int whiteBling = 300;
int i = 0;
int omvendt=-1;
int circkleAnim=0;
int iCir=0;
int omvendt2=1;
int circkleAnim2=2/10;
PImage faceLogo;
PImage instaLogo;
PImage messLogo;
PImage arbnuLogo;
int mouseYLock=0;







void setup(){
size(594,841);
//homepageblurredtrain.png
lockScreen=loadImage("blurredtrain.png");
lockScreen.resize(width,height);
startScreen=loadImage("lockScreenTrain.JPG");
startScreen.resize(width,height);


instaIcon=loadImage ("instagramIcon.png");
instaIcon.resize (iconSizeXY,iconSizeXY);

//topbar
imgTest=loadImage ("testimg1.jpg");
imgWIFI=loadImage("wi-fi.png");
imgLock=loadImage("Lock.png");
imgBattery=loadImage("Battery.png");

//Facebook
img=loadImage("facebook logo_pixel2.png");
img2=loadImage("facebook_home_logo.png");
img3=loadImage("messenger_icon.png");
img4=loadImage("facebook_group_icon.png");
img5=loadImage("AAU_logo_2.png");
img6=loadImage("facebook_like_icon.png");
img7=loadImage("medialogi_profile_pic.png");
img8=loadImage("facebook_profile_pic.png");
img9=loadImage("medialogy_student.png");
img10=loadImage("img10.png");

//Messenger
Group=loadImage("Group.png");
secPic=loadImage("Nick.png");
thirdPic=loadImage("Ida.png");
fourPic=loadImage("Kasper.png");
fifthPic=loadImage("Maya.png");

//instagram
InstagramText=loadImage ("Instagram Logo.png");
TopPaperplane=loadImage ("Paperplane Icon.png");
TopPaperplane.resize (TopPaperplaneW, TopPaperplaneH);
AalborgLogo=loadImage ("Aalborg Logo.png");
AalborgLogo.resize (AalborgLogoW,AalborgLogoH);
Image1=loadImage ("Image1.JPG");
Image1.resize (ImageW, ImageH);
Heart=loadImage ("Heart Icon.png");
Heart.resize (BottomIconW,BottomIconH);
Chat=loadImage ("Chat Icon.png");
Chat.resize (BottomIconW,BottomIconH);
BottomPaperplane=loadImage ("Paperplane Icon.png");
BottomPaperplane.resize (BottomIconW, BottomIconH);
Kaffepletten=loadImage ("Kaffepletten.JPG");
Kaffepletten.resize (ImageW, ImageH);
Slusen=loadImage ("Slusen.JPG");
Slusen.resize (ImageW, ImageH);
Bro=loadImage ("Bro.JPG");
Bro.resize(ImageW,ImageH);
Vandtorvet=loadImage ("Vandtorvet.JPG");
Vandtorvet.resize(ImageW,ImageH);
Smile8=loadImage("Smile8.jpg");
Smile8.resize(ImageW,ImageH);




//ArbejdNU
aaulogo = loadImage("aau.png");
itu = loadImage("itu.png");
banner = loadImage("jojoMAH.png");
back = loadImage("yayaya.png");
botBar = loadImage("background2.jpg");
gamedev = loadImage("spilDev.png");
projektled = loadImage("projektlederfin.png");
devel = loadImage("programering.png");



faceLogo = loadImage("facebookapplogo.png");
instaLogo = loadImage("instagramapplogo.png");
messLogo = loadImage("messengerapplogo.png");
arbnuLogo = loadImage("man-1459246_1280.png");

aauoveralt = loadImage("AAUlogo2012png.png");




}

//Here draw determines which page to use
void draw(){

 if(page1 == true) { 
   scrollYFace=0;
   scrollYArb=0;
   scrollYInsta= 0;
   scrollYMess= 0;
   scrollYMess2=0;
   scrollYMess3=0;
   scrollYMess4=0;
   scrollYMess5=0;
   startPage();
 }
 else if(page2 == true) { 
   scrollYFace=0;
   scrollYArb=0;
   scrollYInsta= 0;
   scrollYMess= 0;
   scrollYMess2=0;
   scrollYMess3=0;
   scrollYMess4=0;
   scrollYMess5=0;
   scrollYLock=0;
   homePage();
  
 }
 else if(page3 == true) { 
   facebook();
 }
 else if(page4 == true) { 
   messenger0();
   scrollMG=0;
   scrollM2=0;
   scrollM3=0;
   scrollM4=0;
   scrollM5=0;
 }
  else if(page5 == true) { 
   instagram();
  }
 else if(page6 == true) { 
   messengerGroup();
 } 
 else if(page7 == true) { 
   messenger2();
 }
 else if(page8 == true) { 
   messenger3();
 }
 else if(page9 == true) { 
   messenger4();
   }
 else if(page10 == true) { 
   messenger5();
 }
 else if(page11 == true) { 
   arbnu();
 }
  println(mouseYLock); 
}
