import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Backup9 extends PApplet {

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
int colorHomeButton = 0xff0aece9; //color
int HomeScreenWidthLocation = 2; //x location
int HomeScreenHeightLocation = 11; //y location

//color related variables
int black = 0;
int white = 255;
int trance = 200;
int red = 0xffff0000;
int lightGrey = 100;
int darkerLightGrey = 150;
int colorGrey = 0xffe8eaed;
int colorWhite = 0xffffffff;
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







public void setup(){

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
public void draw(){

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





public void arbnu(){

  
//#############################scroll Funktion##################################//
  
   scrollA=scrollYArb*sSpeed;
  if(!scrollLock){
  if(scrollA<=-559){
   scrollYArb=scrollYArb+4;
  }

   if(scrollA>=1){
   scrollYArb=scrollYArb-4;
   }}
   
//##############################################################################//
  
  
  
  
  
  
  
//-----------------setup -----------------


//int backgroundColor=#FF7400;
int sizeX=594;
int sizeY=841;
int sort=0xff14100c;
int gray= 140;
int orange2=0xffff6a49;




// -------------- Phone Bar ---------------
// int topBarX = 0;
int topBarH = sizeY/24;
int topBarY =0;


//----------Top Bar Med Over tekst -----------

  int topArbBarX = 0;
  int topArbBarY = topBarY+topBarH;
  int topArbBarW = sizeX;
  int topArbBarH = 150; 

  int topArbBarYSlut= topArbBarY+topArbBarH;

    
    
//------ Faceholes ----------
float faceRectStroke=0.4f;
int faceRectTopSpace=5;
int faceRectSpace=15;
int faceRectX = 10;
int faceRectY1= topArbBarYSlut+faceRectTopSpace*2+scrollA;
int faceRectW=180;
int faceRectH=180;


//------- text rect 1 --------
float textBlockStroke=0.8f;
int textBlock1X = (faceRectX+faceRectW+faceRectSpace);
int textBlockY1 = (topArbBarY+topArbBarH+faceRectTopSpace*10/15+scrollA);
int textBlockW = sizeX-textBlock1X-faceRectSpace;
int textBlockDistLine=30;
int textBlockH = 200;
int textBlockCorner = 20;
int textBlockSpace =20;

///------- text rect 2 --------
int faceRectY2= faceRectY1+textBlockH+textBlockSpace;
int textBlockY2 = textBlockY1+textBlockH+textBlockSpace;


//------- text rect 3 --------
int faceRectY3= faceRectY2+textBlockH+textBlockSpace;
int textBlockY3 = textBlockY2+textBlockH+textBlockSpace;


//------- text rect 4 --------
 int faceRectY4= faceRectY3+textBlockH+textBlockSpace;
 int textBlockY4 = textBlockY3+textBlockH+textBlockSpace;


//------- text rect 5 --------
 int faceRectY5= faceRectY4+textBlockH+textBlockSpace;
 int textBlockY5 = textBlockY4+textBlockH+textBlockSpace;


//------- text rect 6 --------




//-------------- Home Button Rect ---------------

  int homeX=0;
  int homeY=sizeY-sizeY/26;

  
  
  
  
  
//------------------ Text -----------------------

String aauUddOver = "Aalborg Universitet - læs her";
String aauUdd = "En bachlor i Medialogi åbner op for mange kandidat uddannelser så som Medialogi, Lightning Design, Sound and Music Computing og Service System Design" ;
String ituUddOver = "IT-Universitet - læs her";
String ituUdd = "En bachlor i medialogi giver adgang til kandidater på ITU kandidater som Datalogi, Spil, Softwaredesign osv.";
String developerOver= "Software Udvikler";
String developer = "Som Software udvikler vil du håndtere vedligeholdelsen af software og designe, skabe, og teste nyt software.";
String gameOver = "Spil Programmør";
String game = "Vil du være med til at skabe et spil der kan revolutionere industrien, eller måske skabe nye mechanics ingen har set før. ";
String projektOver = "Projekt Leder";
String projekt = "vil du have ansvar over et projekt og føre dit hold helt i mål, med medialogi uddannelsen er du godt klædt på til at forstå de mange fagsprog og til at hjælpe dit hold til at forstå hinanden";

int textX = 10;
int textY = 5;
int textStr = 15;
int textOverStr=20;
  
  
 
  
  
  
//returns the user to the lockscreen if x amount of time passes  
returnTimer();
  
  
  
//------------ Kodning afdelling -----------------------------------------
  
 back.resize(sizeX*2,sizeY);
 image(back,0,0);
  
//----------------------- job post 1 -------------------
  
  
  

 
  devel.resize(faceRectW,faceRectH);
  image(devel,faceRectX,faceRectY1);
  stroke(sort);
  strokeWeight(textBlockStroke);
  fill(255,255,255,150);
  rect(textBlock1X, textBlockY1, textBlockW, textBlockH,textBlockCorner);
  fill(sort);
  textSize(textOverStr);
  text(developerOver,textBlock1X+textX, textBlockY1+textY,textBlockW-textX,textBlockH-textY*2);
  textSize(textStr);
  text(developer,textBlock1X+textX, textBlockY1+textY+textBlockDistLine,textBlockW-textX,textBlockH-textY*2+textBlockDistLine);
  stroke(gray);
  strokeWeight(faceRectStroke);
  line(textBlock1X,textBlockY1+textBlockDistLine, textBlock1X+textBlockW,textBlockY1+textBlockDistLine);
  
  
  
  

//----------------------- job post 2 -------------------
  

  gamedev.resize(faceRectW,faceRectH);
  image(gamedev,faceRectX,faceRectY2);
  stroke(sort);
  strokeWeight(textBlockStroke);
  fill(255,255,255,150);
  rect(textBlock1X, textBlockY2, textBlockW, textBlockH,textBlockCorner);
  fill(sort);
  textSize(textOverStr);
  text(gameOver,textBlock1X+textX, textBlockY2+textY,textBlockW-textX,textBlockH-textY*2);
  textSize(textStr);
  text(game,textBlock1X+textX, textBlockY2+textY+textBlockDistLine,textBlockW-textX,textBlockH-textY*2+textBlockDistLine);
  stroke(gray);
  strokeWeight(faceRectStroke);
  line(textBlock1X,textBlockY2+textBlockDistLine, textBlock1X+textBlockW,textBlockY2+textBlockDistLine);
  
  
  
  
  
//------------------------ job post 3 --------------------------

  projektled.resize(faceRectW,faceRectH);
  image(projektled,faceRectX,faceRectY3);
  stroke(sort);
  strokeWeight(textBlockStroke);
  fill(255,255,255,150);
  rect(textBlock1X, textBlockY3, textBlockW, textBlockH,textBlockCorner);
  fill(sort);
  textSize(textOverStr);
  text(projektOver,textBlock1X+textX, textBlockY3+textY,textBlockW-textX,textBlockH-textY*2);
  textSize(textStr);
  text(projekt,textBlock1X+textX, textBlockY3+textY+textBlockDistLine,textBlockW-textX,textBlockH-textY*2+textBlockDistLine);

  
  stroke(gray);
  strokeWeight(faceRectStroke);
  line(textBlock1X,textBlockY3+textBlockDistLine, textBlock1X+textBlockW,textBlockY3+textBlockDistLine);


//------------------------ job post 4 --------------------------

  aaulogo.resize(faceRectW,faceRectH);
  image(aaulogo,faceRectX,faceRectY4);
  stroke(sort);
  strokeWeight(textBlockStroke);
  fill(255,255,255,150);
  rect(textBlock1X, textBlockY4, textBlockW, textBlockH,textBlockCorner);
  fill(sort);
  textSize(textOverStr);
  text(aauUddOver,textBlock1X+textX, textBlockY4+textY,textBlockW-textX,textBlockH-textY*2);
  textSize(textStr);
  text(aauUdd,textBlock1X+textX, textBlockY4+textY+textBlockDistLine,textBlockW-textX,textBlockH-textY*2+textBlockDistLine);

  
  stroke(gray);
  strokeWeight(faceRectStroke);
  line(textBlock1X,textBlockY4+textBlockDistLine, textBlock1X+textBlockW,textBlockY4+textBlockDistLine);


//------------------------ job post 5 --------------------------

  itu.resize(faceRectW,faceRectH);
  image(itu,faceRectX,faceRectY5);
  stroke(sort);
  strokeWeight(textBlockStroke);
  fill(255,255,255,150);
  rect(textBlock1X, textBlockY5, textBlockW, textBlockH,textBlockCorner);
  fill(sort);
  textSize(textOverStr);
  text(ituUddOver,textBlock1X+textX, textBlockY5+textY,textBlockW-textX,textBlockH-textY*2);
  textSize(textStr);
  text(ituUdd,textBlock1X+textX, textBlockY5+textY+textBlockDistLine,textBlockW-textX,textBlockH-textY*2+textBlockDistLine);

  
  stroke(gray);
  strokeWeight(faceRectStroke);
  line(textBlock1X,textBlockY5+textBlockDistLine, textBlock1X+textBlockW,textBlockY5+textBlockDistLine);



//---------------------------home knap box ---------------------------------


noStroke();
fill(orange2);
rect(homeX,homeY,sizeX,sizeY-homeY);
botBar.resize(sizeX,sizeY-homeY);
image(botBar,homeX,homeY);



  banner.resize(topArbBarW,topArbBarH);
  image(banner,topArbBarX,topArbBarY);

  botBar.resize(width,topBarH);
  image(botBar,0,0);
  
  topbar();
  
  
  homebutton();  


}





public void facebook() {
  
  
//#############################scroll Funktion##################################//


  scrollF=scrollYFace*sSpeed;
  if(!scrollLock){
  if(scrollF<=-819){
   scrollYFace=scrollYFace+4;
  }


     if(scrollF>=19){
   scrollYFace=scrollYFace-4;
   }}

//#############################################################################//  
  
  
  
  
  //---VARIABLES FOR TOP---//
  //blue banner variables
  int rectX = 0;
  int rectY = 30;
  int rectH = height/7-30;
  int rect2Y = height-height/26;
  int rect2H = height/26;
  int RectCurv = 10;

  //ellipse icons
  int ellipseY = rectY+(rectH/2);
  int ellipseW = width/12;
  int ellipseCen = width/8;

  //small gray rectangle
  int grayrectX = 0;
  int grayrectY = 180;
  int grayrectH = 5;
  
  //color variables 
   int facebookBlue = 0xff4267B2;
   int gray = 0xffC6C6C6;
   int graywhite = 240;
   int white = 255;
   int postColor = 250;


  //---VARIABLES FOR POST1---///


  //The black rectangle
  int BlackRectY = grayrectY+grayrectH+10;
  int BlackRectX = width/12;
  int BlackRectW = width-BlackRectX*2;
  int BlackRectH = height/3-30;
  int BlackRectCur = 10;

  //for text 'Aalborg'
  int AalborgX = BlackRectX+100;
  int AalborgY = BlackRectY+65;
  int profileSize = 16;

  //time signature "1.t"
  int text1tY = BlackRectY+90;
  int text1X = BlackRectX+100;
  int timeSize = 12;

  //profile picture ellipse
  int PellipseX = BlackRectX+60;
  int PellipseY = BlackRectY+60;
  int pictureW = ellipseW-10;

  //rectangle for textbox 
  int textAalborgX = BlackRectX+20;
  int textAalborgY = BlackRectY+110;
  int textAalborgW = width-(BlackRectX*2)-20;
  int textAalborgH = BlackRectH-50;

  //theline over "synes godt om"
  int lineX = BlackRectX+15;
  int lineY = BlackRectY+BlackRectH-60;
  int lineX2 = width-(width/12)-15;
  int lineY2 = BlackRectY+BlackRectH-30;

  //"synes godt om" textbox
  int synesgodtomX = BlackRectX+40;
  int synesgodtomY = lineY+8;
  int synesgodtomW = (width-BlackRectX*2)/5;
  int synesgodtomH = lineY2-lineY;

  //profile picture
  int Pic5W = pictureW+50;
  int Pic5H = pictureW+100;
  int Pic5Y = PellipseY+10;

  //like icon
  int likeY = lineY-20;
  int likeW = 25;



  String AAUKBH = "Aalborg Universitet KBH";
  String Posttext1 = "Husk at melde dig til Åbent hus på AAU KBH d. 5.februar 2021 og hør om Medialogi uddannelsen, hvor du lærer at skabe interaktivt brugerdesign";



  ///---VARIABLES FOR POST2----///



  int BlackRect2Y = BlackRectY+BlackRectH+20;
  int BlackRect2X = width/12;
  int BlackRect2W = width-BlackRectX*2;
  int BlackRect2H = height/3;
  int BlackRect2Cur = 10;


  //time signature "3.t"
  int text2Y = BlackRect2Y+90;
  int text2X = BlackRect2X+100;


  //profile name
  int MEDX = BlackRect2X+100;
  int MEDY = BlackRect2Y+65;

  //profile picture ellipse
  int Pellipse2X = BlackRect2X+60;
  int Pellipse2Y = BlackRect2Y+60;

  //textbox for post2
  int TextMEDX = BlackRect2X+20;
  int TextMEDY = BlackRect2Y+110;
  int TextMEDW = width-(BlackRectX*2)-20;
  int TextMEDH = BlackRect2H-40;

  //text for post
  String Posttext2 = "Tag en 3-årig bachelor på Medialogi og lær at programmere og designe interaktive oplevelser. Arbejd bl.a med Virtuel Reality, film, animation og lyd- og lysteknik. Du lærer det hele fra bunden og har ikke brug for nogen tidligere erfaring. Ansøg til juli 2021";


  //line over "synes godt om"
  int line2X = BlackRect2X+15;
  int line2Y = BlackRect2Y+BlackRect2H-60;
  int line2X2 = width-(width/12)-15;
  int line2Y2 = BlackRect2Y+BlackRect2H-30;

  //synes godt om textbox
  int synesgodtom2X = BlackRect2X+40;
  int synesgodtom2Y = line2Y+8;
  int synesgodtom2W = (width-BlackRect2X*2)/5;
  int synesgodtom2H = line2Y2-line2Y;

  //profile picture
  int pic7W = pictureW+25;
  int pic7H = pictureW;
  
  //like icon
  int like2Y = line2Y-20;
  int like2W = 25;


  ////-----VARIABLES FOR POST 3-----/////

    int BlackRect3Y = BlackRect2Y+BlackRect2H+20;
    int BlackRect3X = width/12;
    int BlackRect3W = width-BlackRect2X*2;
    int BlackRect3H = height/3+180;
    int BlackRect3Cur = 10;


    //time signature "3.t"
    int text3Y = BlackRect3Y+90;
    int text3X = BlackRect3X+100;

    //profile name
    int StudentX = BlackRect3X+100;
    int StudentY = BlackRect3Y+65;

    //profile picture ellipse
    int Pellipse3X = BlackRect3X+60;
    int Pellipse3Y = BlackRect3Y+60;

    //textbox for post3
    int TextStudentX = BlackRect3X+20;
    int TextStudentY = BlackRect3Y+110;
    int TextStudentW = width-(BlackRectX*2)-20;
    int TextStudentH = BlackRect3H-200;

    //text for post 2
     String Posttext3 = "Haha! Kun et år siden. Dengang vi startede på Medialogi og ikke anede noget som helst om programmering";


    //line over "synes godt om"
    int line3X = BlackRect3X+15;
    int line3Y = BlackRect3Y+BlackRect3H-45;
    int line3X2 = width-(width/12)-15;
    int line3Y2 = BlackRect3Y+BlackRect3H-30;

    //synes godt om textbox
    int synesgodtom3X = BlackRect3X+40;
    int synesgodtom3Y = line3Y+8;
    int synesgodtom3W = (width-BlackRect3X*2)/5;
    int synesgodtom3H = line3Y2-line3Y;

  //profile picture
    int img8W = pictureW+20;
    int img8H = pictureW+5;
  
  
  //big group picture
    int img9Y = TextStudentY+150;


   //like icon
   int like3Y = line3Y-20;
   int like3W = 25;


  ///----VARIABLES FOR POST 4-----////
    int BlackRect4Y = BlackRect3Y+BlackRect3H+20;
    int BlackRect4X = width/12;
    int BlackRect4W = width-BlackRect3X*2;
    int BlackRect4H = height/3;
    int BlackRect4Cur = 10;
    
    //time signature "3.t"
    int text4Y = BlackRect4Y+90;
    int text4X = BlackRect4X+100;
    
    //profile name
    int ITuniX = BlackRect4X+100;
    int ITuniY = BlackRect4Y+65;
    
    //profile picture ellipse
    int Pellipse4X = BlackRect4X+60;
    int Pellipse4Y = BlackRect4Y+60;
    
    //textbox for post3
    int TextITuniX = BlackRect4X+20;
    int TextITuniY = BlackRect4Y+110;
    int TextITuniW = width-(BlackRectX*2)-20;
    int TextITuniH = BlackRect4H-200;
    
    //text for post 2
     String Posttext4 = "Med en bachelor i Medialogi har du adgang til en af vores spændende kandidater indenfor softwareudvikling og game-design. ";
     
    //line over "synes godt om"
    int line4X = BlackRect4X+15;
    int line4Y = BlackRect4Y+BlackRect4H-45;
    int line4X2 = width-(width/12)-15;
    int line4Y2 = BlackRect4Y+BlackRect4H-30;
    
    //synes godt om textbox
    int synesgodtom4X = BlackRect4X+40;
    int synesgodtom4Y = line4Y+8;
    int synesgodtom4W = (width-BlackRect4X*2)/5;
    int synesgodtom4H = line4Y2-line4Y;
    
    //profile picture
    int img10W = pictureW+20;
    int img10H = pictureW+5;

    //like icon
    int like4Y = line4Y-20;
    int like4W = 25;
    
    //numOfLikes3
    int numOfLikes4X = synesgodtom4X+30;
    int numOfLikes4Y = line4Y-25;








 
 
//returns the user to the lockscreen if x amount of time passes  
returnTimer();


 background(graywhite);
  //SMALL GRAY RECTANGLE
  fill(gray);
  noStroke();
  rect(grayrectX, grayrectY, width, grayrectH);
  
  ///---POST 1---///


  //THE BLACK RECTANGLE
  fill(postColor);
  stroke(30);
  rect(BlackRectX, BlackRectY+scrollF, BlackRectW, BlackRectH, BlackRectCur);


  //PROFILE PICTURE ELLIPSE
  imageMode(CENTER);
  image(img5, PellipseX, Pic5Y+scrollF, Pic5W, Pic5H);

  //NAME AND TIME SINCE POST
  fill(0);
  textSize(profileSize);
  text(AAUKBH, AalborgX, AalborgY+scrollF);
  textSize(timeSize);
  text("1t.", text1X, text1tY+scrollF);

  //TEXT FOR POST "AALBORG UNIVERSITET"
  fill(0);
  text(Posttext1, textAalborgX, textAalborgY+scrollF, textAalborgW, textAalborgH);
  

  //SMALL LINE ABOVE "MELD DIG TIL"
  line(lineX, lineY+scrollF, lineX2, lineY+scrollF);
  //line(lineX,lineY2+scrollF,lineX2,lineY2+scrollF);


  //"Meld dig til" TEXTBOX

  fill(0);
  stroke(0);
  textSize(timeSize);
  textAlign(LEFT);
  text("Meld dig til", synesgodtomX, synesgodtomY+scrollF, synesgodtomW, synesgodtomH);
  
 // textbox for number of likes
  text(""+numOfLikes,synesgodtomX+30,lineY-25+scrollF,25,25);



  //---BUTTON FUNCTION FOR "MELD DIG TIL!"---//
  
  if(!scrollLock){
    
  if (mousePressed) {
    
    if (mouseX>=synesgodtomX && mouseX<=synesgodtomX+synesgodtomW 
    && mouseY>=synesgodtomY+scrollF && mouseY<=(synesgodtomY+synesgodtomH)+scrollF) {
      like1=true; 
    }}
  

}
  
  if(like1){
  fill(facebookBlue);
      text("Meld dig til", synesgodtomX, synesgodtomY+scrollF, synesgodtomW, synesgodtomH);
       //picture for 'like' icon
      image(img6, synesgodtomX, likeY+scrollF, likeW, likeW);
      numOfLikes = 5;
    }
      
  /////----------POST 2---------/////

  //The black rectangle//
  fill(postColor);
  rect(BlackRect2X, BlackRect2Y+scrollF, BlackRect2W, BlackRect2H, BlackRect2Cur);

  //PROFILE PICTURE ELLIPSE
  imageMode(CENTER);
  image(img7, Pellipse2X, Pellipse2Y+scrollF, pic7W, pic7H);


  //NAME AND TIME SINCE POST
  fill(0);
  textSize(profileSize);
  text("Medialogi AAU CPH", MEDX, MEDY+scrollF);
  textSize(timeSize);
  text("3t.", text2X, text2Y+scrollF);

  //TEXT FOR POST - MEDIALOGI
  fill(0);
  stroke(2);
  text(Posttext2, TextMEDX, TextMEDY+scrollF, TextMEDW, TextMEDH);

  //Line over "synes godt om"
  line(line2X, line2Y+scrollF, line2X2, line2Y+scrollF);


  //textbox for "synes godt om"
  fill(0);
  stroke(0);
  textSize(timeSize);
  textAlign(LEFT);
  text("Tjek det ud", synesgodtom2X, synesgodtom2Y+scrollF, synesgodtom2W, synesgodtom2H);
  
   // textbox for number of likes
  text(""+numOfLikes2,synesgodtom2X+30,line2Y-25+scrollF,25,25);



  //---BUTTON FUNCTION FOR "TJEK DET UD!"---//
  if(!scrollLock){    
    if (mousePressed) {    
    if (mouseX>=synesgodtom2X &&
    mouseX<=synesgodtom2X+synesgodtom2W
    && mouseY>=synesgodtom2Y+scrollF &&
    mouseY<=(synesgodtom2Y+synesgodtom2H)+scrollF) {
     like2=true;
    }}
 }
  
  if(like2){
   fill(facebookBlue);
      text("Tjek det ud", synesgodtom2X, synesgodtom2Y+scrollF, synesgodtom2W, synesgodtom2H);
      //picture for 'like' icon
      image(img6, synesgodtom2X, like2Y+scrollF, like2W, like2W);
      numOfLikes2 = 24;
}








  ///---CODE FOR POST 3----////


  //The black rectangle//
  fill(postColor);
  rect(BlackRect3X, BlackRect3Y+scrollF, BlackRect3W, BlackRect3H, BlackRect3Cur);

  //Profile name//
  fill(0);
  textSize(profileSize);
  text("Lukas Nysted", StudentX, StudentY+scrollF);

  //time since post//
  textSize(timeSize);
  text("4t.", text3X, text3Y+scrollF);


  //PROFILE PICTURE ELLIPSE
  image(img8, Pellipse3X, Pellipse3Y+scrollF, img8W, img8H);


  //TEXT FOR POST - STUDENT
  fill(0);
  stroke(2);
  text(Posttext3, TextStudentX, TextStudentY+scrollF, TextStudentW, TextStudentH);
  imageMode(CENTER);
  image(img9, BlackRect3X+(BlackRect3W/2), img9Y+scrollF, BlackRect3W, BlackRect3H/2);

   // textbox for number of likes
  text(""+numOfLikes3,synesgodtom3X+30,line3Y-25+scrollF,25,25);

  //Line over "synes godt om"
  line(line3X, line3Y+scrollF, line3X2, line3Y+scrollF);


  //textbox for "synes godt om"
  fill(0);
  stroke(0);
  textSize(timeSize);
  textAlign(LEFT);
  text("Synes godt om", synesgodtom3X, synesgodtom3Y+scrollF, synesgodtom3W, synesgodtom3H);


  //---BUTTON FUNCTION FOR "SYNES GODT OM"---//
    if(!scrollLock){
  if (mousePressed) {

    if (mouseX>=synesgodtom3X && mouseX<=synesgodtom3X+synesgodtom3W && mouseY>=synesgodtom3Y+scrollF && mouseY<=(synesgodtom3Y+synesgodtom3H)+scrollF) {
      like3=true;
  }}
  }
  
  if(like3){
  fill(facebookBlue);
     text("Synes godt om", synesgodtom3X, synesgodtom3Y+scrollF, synesgodtom3W, synesgodtom3H);
        //picture for 'like' icon
      image(img6, synesgodtom3X, like3Y+scrollF, like3W, like3W);
      numOfLikes3=30;
  }
  
  
 
  //----CODE FOR POST 4----//

  
  //The black rectangle//
  fill(postColor);
  rect(BlackRect4X, BlackRect4Y+scrollF, BlackRect4W, BlackRect4H, BlackRect4Cur);
  //Profile name//
  fill(black);
  textSize(profileSize);
  text("IT-universitetet", ITuniX, ITuniY+scrollF);
  //time since post//
  textSize(timeSize);
  text("5t.", text4X, text4Y+scrollF);

  //PROFILE PICTURE ELLIPSE
  image(img10, Pellipse4X, Pellipse4Y+scrollF, img10W, img10H);

  //TEXT FOR POST - STUDENT
  fill(black);
  stroke(2);
  text(Posttext4, TextITuniX, TextITuniY+scrollF, TextITuniW, TextITuniH);
   // textbox for number of likes
  text(""+numOfLikes4,numOfLikes4X,numOfLikes4Y+scrollF,like4W,like4W);
  //Line over "synes godt om"
  line(line4X, line4Y+scrollF, line4X2, line4Y+scrollF);

  //textbox for "synes godt om"
  fill(black);
  stroke(black);
  textSize(timeSize);
  textAlign(LEFT);
  text("Synes godt om", synesgodtom4X, synesgodtom4Y+scrollF, synesgodtom4W, synesgodtom4H);

  //---BUTTON FUNCTION FOR "SYNES GODT OM"---//
  
   if(!scrollLock){
  if (mousePressed) {
    if (mouseX>=synesgodtom4X && mouseX<=synesgodtom4X+synesgodtom4W && mouseY>=synesgodtom4Y+scrollF && mouseY<=(synesgodtom4Y+synesgodtom4H)+scrollF) {
      like4=true;
  }}
  }
  if(like4){
    fill(facebookBlue);
    text("Synes godt om", synesgodtom4X, synesgodtom4Y+scrollF, synesgodtom4W, synesgodtom4H);
     //picture for 'like' icon
    image(img6, synesgodtom4X, like4Y+scrollF, like4W, like4W);
     numOfLikes4=18;
  }
 

  
  // BLUE BANNER AT THE TOP
  fill(facebookBlue);
  rect(rectX, rectY, width, rectH, RectCurv);
  fill(white);

  
  //ELLIPSE ICONS
  image(img, ellipseCen, ellipseY, ellipseW, ellipseW);

  ellipse(ellipseCen*3, ellipseY, ellipseW, ellipseW);
  image(img2, ellipseCen*3, ellipseY, ellipseW, ellipseW);

  //ellipse(ellipseCen*5,ellipseY,ellipseW,ellipseW);
  image(img3, ellipseCen*5, ellipseY, ellipseW, ellipseW);

  //ellipse(ellipseCen*7,ellipseY,ellipseW,ellipseW);
  image(img4, ellipseCen*7, ellipseY, ellipseW, ellipseW);
  
  
  //--BLUE BANNER AT THE BOTTOM

  fill(facebookBlue);
  rect(rectX, rect2Y, width, rect2H);
  
  
  //----------------------hvid top bar -----------------------------------------------------
  rectMode(CORNER);
  fill (0xffFFFFFF);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  
   

  
  
  //topbar
  topbar();


 //Homebutton
 homebutton();  

   
}





public void homePage() {

  page1 = false;
          page2 = true;
          page3 = false;
          page4 = false;
          page5 = false;
          page6 = false;
          page7 = false;
          page8 = false;
          page9 = false;
          page10 = false;
          page11 = false;
//Icon related variables
int iconOneX = width/5;
int iconOneY = height/5;

int iconTwoX = (width/5)*2;
int iconTwoY = (height/5)*2;

int iconThreeX = (width/5)*3;
int iconThreeY = (height/5)*3;

float iconFourX = (width/5)*4.2f;
float iconFourY = (height/5)*2.2f;

//int iconSizeXY = 120;

int instaLockX1 = (width/5) - 60;
int instaLockX2 = (width/5) + 60;
int instaLockY1 = height/5 - 60;
int instaLockY2 = height/5 + 60;

int mesLockX1 = ((width/5)*2) - 60;
int mesLockX2 = ((width/5)*2) + 60;
int mesLockY1 = ((height/5)*2) - 60;
int mesLockY2 = ((height/5)*2) + 60;

int faceLockX1 = ((width/5)*3) - 60;
int faceLockX2 = ((width/5)*3) + 60;
int faceLockY1 = ((height/5)*3) -60;
int faceLockY2 = ((height/5)*3) + 60;

float arbnuLockX1 = ((width/5)*4.2f) - 60;
float arbnuLockX2 = ((width/5)*4.2f) + 60;
float arbnuLockY1 = ((height/5)*2.2f) - 60;
float arbnuLockY2 = ((height/5)*2.2f) + 60;

//The part of the timer that shows the current time
//int currentTime = millis() - captureTime; 

//if x amount of time passes the user is returned to the lock screen 
returnTimer();
  image(startScreen,0,0,width,height);
   fill(0);

 topbar(); 
 
  homebutton();
 
 

  //icons
  rectMode(CENTER);
  fill(0xff2c7875);
  
  //image(instaIcon,iconOneX,iconOneY+iconSizeXY+iconSizeXY);
   noStroke();
    instaLogo.resize(iconSizeXY,iconSizeXY);
   image(instaLogo,iconOneX-iconSizeXY/2, iconOneY-iconSizeXY/2);
   messLogo.resize(iconSizeXY,iconSizeXY);
   image(messLogo,iconTwoX-iconSizeXY/2, iconTwoY-iconSizeXY/2);  
   fill(0xff4267B2);
    rect(iconThreeX, iconThreeY, iconSizeXY,iconSizeXY,10);
   faceLogo.resize(iconSizeXY,iconSizeXY);
   image(faceLogo,iconThreeX-iconSizeXY/2, iconThreeY-iconSizeXY/2);  
   fill(0xffec8f0a);
   rect(iconFourX, iconFourY, iconSizeXY,iconSizeXY,10);
   fill(0xffec8e01);
   arbnuLogo.resize(iconSizeXY,iconSizeXY);
   image(arbnuLogo,iconFourX-iconSizeXY/2, iconFourY-iconSizeXY/2);

  rectMode(CORNER);

  if(!scrollLock){
  if (mousePressed) { //instagram button
   if(mouseX > instaLockX1 && mouseX < instaLockX2 && mouseY > instaLockY1 && mouseY < instaLockY2 ){
     captureTime = millis();
     page2 = false;
     page5 = true; 
  }                  //messenger button
   else if(mouseX > mesLockX1 && mouseX < mesLockX2 && mouseY > mesLockY1 && mouseY < mesLockY2 ){
     captureTime = millis();
     page2 = false; 
     page4 = true;
  }                  //facebook button
   else if(mouseX > faceLockX1 && mouseX < faceLockX2 && mouseY > faceLockY1 && mouseY < faceLockY2 ){
     captureTime = millis();
     page2 = false;
     page3 = true; 
     
  }                  //arbejdnu
   else if(mouseX > arbnuLockX1 && mouseX < arbnuLockX2 && mouseY > arbnuLockY1 && mouseY < arbnuLockY2 ){
     page2 = false;
     page11 = true;
      
 }}
   

  }
}





public void homebutton() {
  

int strokeWeightSmall = 0;
int strokeWeightMedium = 1;
int strokeWeightLarge = 2;
  
int leftLineX1 = (width/HomeScreenWidthLocation) - 20;
int leftLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int leftLineX2 = (width/HomeScreenWidthLocation) - 20;
int leftLiney2 = height - (height/HomeScreenHeightLocation) + 20;

int rightLineX1 = (width/HomeScreenWidthLocation) + 20;
int rightLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int rightLineX2 = (width/HomeScreenWidthLocation) + 20;
int rightLiney2 = height - (height/HomeScreenHeightLocation) + 20;

int bottomLineX1 = (width/HomeScreenWidthLocation) + 20;
int bottomLiney1 = height - (height/HomeScreenHeightLocation) + 20;
int bottomLineX2 = (width/HomeScreenWidthLocation) - 20;
int bottomLiney2 = height - (height/HomeScreenHeightLocation) + 20;

int rightRoofLineX1 = (width/HomeScreenWidthLocation) + 20;
int rightRoofLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int rightRoofLineX2 = (width/HomeScreenWidthLocation);
int rightRoofLiney2 = height - (height/HomeScreenHeightLocation) - 25;

int leftRoofLineX1 = (width/HomeScreenWidthLocation) - 20;
int leftRoofLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int leftRoofLineX2 = (width/HomeScreenWidthLocation);
int leftRoofLiney2 = height - (height/HomeScreenHeightLocation) - 25;

//Homebutton
 stroke(strokeWeightSmall);
 strokeWeight(strokeWeightLarge);
 //left line
 line(leftLineX1,leftLiney1,leftLineX2,leftLiney2);
 //right line
 line(rightLineX1,rightLiney1,rightLineX2,rightLiney2);
 //bottom line
 line(bottomLineX1,bottomLiney1,bottomLineX2,bottomLiney2);
 //right roof
 line(rightRoofLineX1,rightRoofLiney1,rightRoofLineX2,rightRoofLiney2);
 //left roof
 line(leftRoofLineX1,leftRoofLiney1,leftRoofLineX2,leftRoofLiney2);
 fill(trancparancy,trancparancy);
 ellipse(width/HomeScreenWidthLocation, height - (height/HomeScreenHeightLocation), homeDiameterXY,homeDiameterXY);
 fill(invisibleEllipse,invisibleEllipse,invisibleEllipse,invisibleEllipse);
 strokeWeight(strokeWeightMedium);
  if(!scrollLock){
  if (mousePressed) {
   if(mouseX > (width/HomeScreenWidthLocation)-homeRadiusXY && mouseX < (width/HomeScreenWidthLocation)+homeRadiusXY
   && mouseY > (height - (height/HomeScreenHeightLocation)) - homeRadiusXY && mouseY < (height - (height/HomeScreenHeightLocation)) + homeRadiusXY){
     if(mouseButton==LEFT){
     captureTime = millis();
          page1 = false;
          page2 = true;
          page3 = false;
          page4 = false;
          page5 = false;
          page6 = false;
          page7 = false;
          page8 = false;
          page9 = false;
          page10 = false;
          page11 = false;
     
 }}}}
}





public void instagram () {
  
  
//#############################scrollI Funktion##################################//
  
   scrollI=scrollYInsta*sSpeed;
   if(!scrollLock){
   if(scrollI<=1){
   scrollYInsta=scrollYInsta+4;
   }

    if(scrollI>=-3469){
    scrollYInsta=scrollYInsta-4;
   }
 }
 
//##############################################################################//
  
  
  
  
  
  background (255);
  
  
  
  //--------The y - coordinates of every post--------//
  
  
  int Space = 700;
  int AddPost = 0;
  int AddPost1 = AddPost+Space;
  int AddPost2 = AddPost1+Space;
  int AddPost3 = AddPost2+Space;
  int AddPost4 = AddPost3+Space;
  int AddPost5 = AddPost4+Space;
  
  
  //-------Bar Section-------//
  
  
  //The Lower Top Bar 
  int barLTopX = 0;
  int barLTopY = 130;
  int barLTopW = 593;
  int barLTopH = 90;
  fill (255);
  rect (barLTopX, barLTopY+AddPost+scrollI, barLTopW, barLTopH);
  
  //The Bottom Bar
  int barBottomX = 0;
  int barBottomY = 655;
  int barBottomW = 593;
  int barBottomH = 120;
  fill (255);
  rect (barBottomX, barBottomY+AddPost+scrollI, barBottomW, barBottomH);
  
//returns the user to the lockscreen if x amount of time passes    
returnTimer();
  
  
  
  
  //-------Lower Top Bar - Customization-------//
  
  
  //Profile Picture Outer Outline
  int profileX = 45;
  int profileY = 175;
  int profileW = 80;
  int profileH = 80;
  fill (255);
  ellipse (profileX, profileY+AddPost+scrollI, profileW, profileH);
  
  //Profile Picture Outline
  int InnerprofileW = profileW-15;
  int InnerprofileH = profileH-15;
  ellipse (profileX,profileY+AddPost+scrollI,InnerprofileW,InnerprofileH);
  
  //Profile AAU
  image (AalborgLogo,AalborgLogoX,AalborgLogoY+AddPost+scrollI);
  
  //Profile Picture Text
  String ProfileText = "aaucph";
  int ProfileTextX = 100;
  int ProfileTextY = 170;
  int ProfileTextColor = 0;
  fill (ProfileTextColor);
  textSize (20);
  text (ProfileText, ProfileTextX,ProfileTextY+AddPost+scrollI);
  
  String ProfileLocation = "Sydhavn";
  fill (ProfileTextColor);
  textSize (14);
  text (ProfileLocation,ProfileTextX,ProfileTextY+AddPost+20+scrollI);
  
  //Dots at the right side
  int dotX = 575;
  int dotY = 160;
  int dotW = 7;
  int dotH = 7;
  
  int dotColor = 0;
  
  fill (dotColor);
  ellipse (dotX,dotY+AddPost+scrollI,dotW,dotH);
  ellipse (dotX,dotY+AddPost+20+scrollI,dotW,dotH);
  ellipse (dotX,dotY+AddPost+40+scrollI,dotW,dotH);
  
  
  //-------Middle Image - Customization-------//
  
  //Image 1
  image (Image1,barLTopX,barLTopY+barLTopH+AddPost+scrollI);
  
  //Like Counter
  String Like = "20 people like this";
  int LikeX = 20;
  int LikeY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (Like, LikeX, LikeY+AddPost+scrollI);
  
  //Image Text 1
  String ImageText1 = "aaucph Smukt vejr, smuk udsigt. En ny dag på AAUCPH starter!";
  int ImageTextX = 20;
  int ImageTextY = 765;
  fill (ProfileTextColor);
  textSize (16);
  text (ImageText1, ImageTextX, ImageTextY+AddPost+scrollI);
  
  //-------The Bottom Bar - Customization-------//
  
  
  //Variables
  int BottomIconX = 15;
  int BottomIconY = 670;
  
  //"Heart"
  image (Heart,BottomIconX,BottomIconY+AddPost+scrollI);
  
  //"Message"
  image (Chat,BottomIconX+60,BottomIconY+AddPost+scrollI);
  
  //"Share"
  image (BottomPaperplane,BottomIconX+120,BottomIconY+AddPost+scrollI);
  
  
  //-------New Post 1-------//
  
  
  int new1Post1 = barLTopY + AddPost1;
  int new1Post2 = barBottomY + AddPost1;
  int new1Post3 = profileY + AddPost1;
  int new1Post4 = AalborgLogoY + AddPost1;
  int new1Post5 = ProfileTextY + AddPost1;
  int new1Post6 = dotY + AddPost1;
  int new1Post7 = BottomIconY + AddPost1;
  int new1Post9 = ImageTextY + AddPost1; 
  
  fill (255);
  rect(barLTopX,new1Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new1Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new1Post3+scrollI,profileW,profileH);
  ellipse (profileX,new1Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new1Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new1Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new1Post5+20+scrollI);
  ellipse(dotX,new1Post6+scrollI,dotW,dotH);
  ellipse (dotX,new1Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new1Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new1Post7+scrollI);
  image (Chat,BottomIconX+60,new1Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new1Post7+scrollI);
  
  //Kaffepletten Image
  image(Kaffepletten,barLTopX,barLTopY+barLTopH+AddPost1+scrollI);
  
  //Kaffepletten Likes
  String LikeKaffepletten = "35 people like this";
  int LikeKaffeplettenX = 20;
  int LikeKaffeplettenY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeKaffepletten, LikeKaffeplettenX, LikeKaffeplettenY+AddPost1+scrollI);
  
  //Kaffepletten Text
  String Kaffepletten = "aaucph Så er det kaffetid! Kom ned og nyd en kop kaffe hos Kaffepletten";
  fill (ProfileTextColor);
  textSize (16);
  text (Kaffepletten, ImageTextX, new1Post9+scrollI);
  
  
  //----New Post 2----//
  
  
  int new2Post1 = barLTopY + AddPost2;
  int new2Post2 = barBottomY + AddPost2;
  int new2Post3 = profileY + AddPost2;
  int new2Post4 = AalborgLogoY + AddPost2;
  int new2Post5 = ProfileTextY + AddPost2;
  int new2Post6 = dotY + AddPost2;
  int new2Post7 = BottomIconY + AddPost2;
  int new2Post9 = ImageTextY + AddPost2; 
  
  fill (255);
  rect(barLTopX,new2Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new2Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new2Post3+scrollI,profileW,profileH);
  ellipse (profileX,new2Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new2Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new2Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new2Post5+20+scrollI);
  ellipse(dotX,new2Post6+scrollI,dotW,dotH);
  ellipse (dotX,new2Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new2Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new2Post7+scrollI);
  image (Chat,BottomIconX+60,new2Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new2Post7+scrollI);
    
  //Slusen Image  
  image(Slusen,barLTopX,barLTopY+barLTopH+AddPost2+scrollI);
  
  //Slusen Likes
  String LikeSlusen = "41 people like this";
  int LikeSlusenX = 20;
  int LikeSlusenY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeSlusen, LikeSlusenX, LikeSlusenY+AddPost2+scrollI);
  
  //Slusen Text
  String Slusen = "aaucph Slusen er lige i øjeblikket lukket men vi glæder os til den dag vi kan åbne op igen";
  fill (ProfileTextColor);
  textSize (16);
  text (Slusen, ImageTextX, new2Post9+scrollI);
  
  
  //----New Post 3----//
  
  
  int new3Post1 = barLTopY + AddPost3;
  int new3Post2 = barBottomY + AddPost3;
  int new3Post3 = profileY + AddPost3;
  int new3Post4 = AalborgLogoY + AddPost3;
  int new3Post5 = ProfileTextY + AddPost3;
  int new3Post6 = dotY + AddPost3;
  int new3Post7 = BottomIconY + AddPost3;

  int new3Post9 = ImageTextY + AddPost3; 
  
  fill (255);
  rect(barLTopX,new3Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new3Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new3Post3+scrollI,profileW,profileH);
  ellipse (profileX,new3Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new3Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new3Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new3Post5+20+scrollI);
  ellipse(dotX,new3Post6+scrollI,dotW,dotH);
  ellipse (dotX,new3Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new3Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new3Post7+scrollI);
  image (Chat,BottomIconX+60,new3Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new3Post7+scrollI);
  
  //Bro Image
  image(Bro,barLTopX,barLTopY+barLTopH+AddPost3+scrollI);
  
  //Bro Likes 
  String LikeBro = "13 people like this";
  int LikeBroX = 20;
  int LikeBroY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeBro, LikeBroX, LikeBroY+AddPost3+scrollI);
  
  //Bro Text
  String Bro = "aaucph #studieliv";
  fill (ProfileTextColor);
  textSize (16);
  text (Bro, ImageTextX, new3Post9+scrollI);
  
  
  //----New Post 4----//
  
  
  int new4Post1 = barLTopY + AddPost4;
  int new4Post2 = barBottomY + AddPost4;
  int new4Post3 = profileY + AddPost4;
  int new4Post4 = AalborgLogoY + AddPost4;
  int new4Post5 = ProfileTextY + AddPost4;
  int new4Post6 = dotY + AddPost4;
  int new4Post7 = BottomIconY + AddPost4;

  int new4Post9 = ImageTextY + AddPost4; 
  
  fill (255);
  rect(barLTopX,new4Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new4Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new4Post3+scrollI,profileW,profileH);
  ellipse (profileX,new4Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new4Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new4Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new4Post5+20+scrollI);
  ellipse(dotX,new4Post6+scrollI,dotW,dotH);
  ellipse (dotX,new4Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new4Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new4Post7+scrollI);
  image (Chat,BottomIconX+60,new4Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new4Post7+scrollI);
  
  //Vandtorvet Image
  image(Vandtorvet,barLTopX,barLTopY+barLTopH+AddPost4+scrollI);
  
  //Vandtorvet Likes
  String LikeVandtorvet = "17 people like this";
  int LikeVandtorvetX = 20;
  int LikeVandtorvetY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeVandtorvet, LikeVandtorvetX, LikeVandtorvetY+AddPost4+scrollI);
  
  //Vandtorvet Text
  String Vandtorvet = "aaucph Vandtorvet set oppefra";
  fill (ProfileTextColor);
  textSize (16);
  text (Vandtorvet, ImageTextX, new4Post9+scrollI);
  
  
  //----New Post 4----//
  
  
  int new5Post1 = barLTopY + AddPost5;
  int new5Post2 = barBottomY + AddPost5;
  int new5Post3 = profileY + AddPost5;
  int new5Post4 = AalborgLogoY + AddPost5;
  int new5Post5 = ProfileTextY + AddPost5;
  int new5Post6 = dotY + AddPost5;
  int new5Post7 = BottomIconY + AddPost5;

  int new5Post9 = ImageTextY + AddPost5; 
  
  fill (255);
  rect(barLTopX,new5Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new5Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new5Post3+scrollI,profileW,profileH);
  ellipse (profileX,new5Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new5Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new5Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new5Post5+20+scrollI);
  ellipse(dotX,new5Post6+scrollI,dotW,dotH);
  ellipse (dotX,new5Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new5Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new5Post7+scrollI);
  image (Chat,BottomIconX+60,new5Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new5Post7+scrollI);
  
  //Smile8 Image
  image(Smile8,barLTopX,barLTopY+barLTopH+AddPost5+scrollI);
  
  //Smile8 Likes
  String LikeSmile8 = "33 people like this";
  int LikeSmile8X = 20;
  int LikeSmile8Y = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeSmile8, LikeSmile8X, LikeSmile8Y+AddPost5+scrollI);
  
  //Smile8 Text
  String Smile8 = "aaucph #Smilelab Kom og eksperimenter!";
  fill (ProfileTextColor);
  textSize (16);
  text (Smile8, ImageTextX, new5Post9+scrollI);
  
  
  //-------Fixated Bars-------//
  
  
  
  
 //----------------------hvid top bar -----------------------------------------------------
  rectMode(CORNER);
  fill (0xffFFFFFF);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  
   
  
  //Insert Top Bar here!
  topbar();
  
  //The Top Bar 
  int barTopX = 0;
  int barTopY = 40;
  int barTopW = 593;
  int barTopH = 90;
  fill (255);
  rect (barTopX, barTopY, barTopW, barTopH);
  
  //The Lower Bottom Bar
  int barLBottomY = height-height/26;
  int barLBottomH = 65;
  fill (255);
  rect(barBottomX,barLBottomY,barBottomW,barLBottomH);
  
  
  //-------Top Bar - Customization-------//
  
  
  //Camera Logo - Box
  int cameraX = 15;
  int cameraY = 55;
  int cameraW = 60;
  int cameraH = 60;
  int cameraCorner = 8;
  fill (255);
  rect (cameraX, cameraY, cameraW, cameraH,cameraCorner);
  
  //Camera Logo - Lens
  int lensX = 45; 
  int lensY = 85;
  int lensW = 30;
  int lensH = 30;
  ellipse (lensX, lensY, lensW, lensH);
  
  //Instagram Logo
  image (InstagramText,190,60);
  
  //Paperplane Icon
  image (TopPaperplane,TopPaperplaneX,TopPaperplaneY);
  

  
  
  
  homebutton();  


}





public void startPage() {


//#############################scroll Funktion##################################//


  scrollL=scrollYLock*fancyScroll;
  
  if(scrollL<=-190){
          page1 = false;
          page2 = true;
          page3 = false;
          page4 = false;
          page5 = false;
          page6 = false;
          page7 = false;
          page8 = false;
          page9 = false;
          page10 = false;
          page11 = false;
          captureTime = millis();
        }
  if(scrollL<=-140){
      if(!scrollLock){
          page1 = false;
          page2 = true;
          page3 = false;
          page4 = false;
          page5 = false;
          page6 = false;
          page7 = false;
          page8 = false;
          page9 = false;
          page10 = false;
          page11 = false;
          captureTime = millis();

  }}
  if(!scrollLock){
  if(scrollL<=0){
    scrollYLock=scrollYLock+4;
  }
     if(scrollL>=19){
   scrollYLock=scrollYLock-4;
   }}
  
//#############################################################################//  





  
//local variables only needed here in this void

String textAau="AAU";
int  AAUStr=80; 


// NEW SHIT --------------------------------------------------------------------
 int homeButX = width/2;
 int homeButY = height - (height/11)+scrollL;
 int homeButDiam = 80;



//timer related variables 
int currentTimeForFakeClock = millis() - captureTimeForFakeClock;
int currentTimeForNotification = millis() - captureTimeForNotification;


int clockAnimationStart = 8000;
int clockAnimationEnd = 16000;
int notificationAnimationStart = 3000;
int notificationAnimationMiddle = 6000;
int notificationAnimationEnd = 10000;


//notification related variables
int notificationBoxX = width/2; 
int notificationBoxY = 350; 
int notificationBoxWidth = (width) - (width/25); 
int notificationBoxHeight = 90; 
int notificationBoxCorners = 30;
int redEllipselocationX = (width) - (width/22);
int redEllipselocationY = 385;
int redEllipseDiaXY = 50;

int notificationBoxX2 = width/2;
int notificationBoxY2 = notificationBoxY+100; 
int notificationBoxWidth2 = (width) - (width/25);
int notificationBoxHeight2 = 90;
int notificationBoxCorners2 = 30;
int redEllipselocationX2 = (width) - (width/22);
int redEllipselocationY2 = redEllipselocationY+100;
int redEllipseDiaXY2 = 50;

//text related variables
int textSizeMega = 100;
int textWidthMega = width/2;
int textHeightMega = height/3;
int textSizeMedium = 35;
int textSizeSmall = 25;
float facebookHeadlineX = (width) - (width/1.1f);
int facebookHeadlineY = notificationBoxY-5;
float facebookSubtextX = (width) - (width/1.1f);
int facebookSubtextY = notificationBoxY+25;
int redEllipseTextX = (width) - (width/22);
int redEllipseTextY = notificationBoxY+45;


float MessengerHeadlineX = (width) - (width/1.1f);
int MessengerHeadlineY = notificationBoxY2-5;
float MessengerSubtextX = (width) - (width/1.1f);
int MessengerSubtextY = notificationBoxY2+25;
int redEllipseTextX2 = (width) - (width/22);
int redEllipseTextY2 = notificationBoxY2+45;




//Homebutton related variables
//int stokeWeightLight = 1;
int imageLocationX = 0;
int imageLocationY = 0;

  
    image(lockScreen,imageLocationX,imageLocationY,width,height);
     topbarlock();
     strokeWeight(1+circkleAnim2);
     stroke(255,whiteBling);
     fill(255,whiteBling);
     ellipse(homeButX,homeButY,homeButDiam+circkleAnim,homeButDiam+circkleAnim);
     strokeWeight(1);
     fill(white,whiteBling);
     ellipse(homeButX,homeButY,homeButDiam,homeButDiam);
     textSize(AAUStr);
     fill(white,200);
     textAlign(CENTER);
     text(textAau,width/2,height/5);


  //"fake" clock
  //this is the same principle as with the homebutton, but this also displays text
 if(currentTimeForFakeClock < clockAnimationStart) {
   fill(white);
   textAlign(CENTER);
   textSize(textSizeMega);
   text("25:59",textWidthMega, textHeightMega);
   textAlign(LEFT);
 }
 else if(currentTimeForFakeClock > clockAnimationStart && currentTimeForFakeClock < clockAnimationEnd) {
   fill(white);
   textAlign(CENTER);
   textSize(textSizeMega);
   text("25:60",textWidthMega, textHeightMega);
   textAlign(LEFT);
 }
 else if(currentTimeForFakeClock > clockAnimationEnd) {
   captureTimeForFakeClock = millis();
   fill(white);
   textAlign(CENTER);
   textSize(textSizeMega);
   text("25:59",textWidthMega, textHeightMega);
   textAlign(LEFT);
 }
   

 //notification  
 //this is the same principle as with the homebutton, but this also displays text
 if(currentTimeForNotification > notificationAnimationStart && currentTimeForNotification < notificationAnimationMiddle) {
   //first notification
   //Notification box
   fill(white,trance);
   rectMode(CENTER);
   rect(notificationBoxX,notificationBoxY,notificationBoxWidth,notificationBoxHeight,notificationBoxCorners);
   rectMode(CORNER);
   //Notification text
   fill(black);
   textSize(textSizeMedium);
   text("Facebook",facebookHeadlineX, facebookHeadlineY);
   textSize(textSizeSmall);
   text("3 Nye Posts i Dit Feed!",facebookSubtextX, facebookSubtextY );
   //Notification ellipse and number
   fill(red);
   ellipse(redEllipselocationX,redEllipselocationY,redEllipseDiaXY,redEllipseDiaXY);
   fill(white);
   textAlign(CENTER);
   text("3",redEllipseTextX, redEllipseTextY );
   textAlign(LEFT);
 }
  else if(currentTimeForNotification > notificationAnimationMiddle && currentTimeForNotification < notificationAnimationEnd) {
   //second notification
   //Notification box
   fill(white,trance);
   rectMode(CENTER);
   rect(notificationBoxX2,notificationBoxY2,notificationBoxWidth2,notificationBoxHeight2,notificationBoxCorners2);
   rectMode(CORNER);
   //Notification text
   fill(black);
   textSize(textSizeMedium);
   text("Messenger",MessengerHeadlineX, MessengerHeadlineY );
   textSize(textSizeSmall);
   text("4 Nye Chat Beskeder på Messenger!",MessengerSubtextX, MessengerSubtextY );
   //Notification ellipse and number
   fill(red);
   ellipse(redEllipselocationX2,redEllipselocationY2,redEllipseDiaXY2,redEllipseDiaXY2);
   fill(white);
   textAlign(CENTER);
   text("4",redEllipseTextX2, redEllipseTextY2 );
   textAlign(LEFT); 
   
    
   //first notification
   //Notification box
   fill(white,trance);
   rectMode(CENTER);
   rect(notificationBoxX,notificationBoxY,notificationBoxWidth,notificationBoxHeight,notificationBoxCorners);
   rectMode(CORNER);
   //Notification text
   fill(black);
   textSize(textSizeMedium);
   text("Facebook",facebookHeadlineX, facebookHeadlineY);
   textSize(textSizeSmall);
   text("3 Nye Posts i Dit Feed!",facebookSubtextX, facebookSubtextY );
   //Notification ellipse and number
   fill(red);
   ellipse(redEllipselocationX,redEllipselocationY,redEllipseDiaXY,redEllipseDiaXY);
   fill(white);
   textAlign(CENTER);
   text("3",redEllipseTextX, redEllipseTextY );
   textAlign(LEFT);
 }
 else if(currentTimeForNotification > notificationAnimationEnd) {
   captureTimeForNotification = millis();
 }
    
 // --------------- ANIMATION ----------------


    if(!scrollLock){
    if (i < 255) {     
    whiteBling=omvendt*2+whiteBling;
    i = i+7/3;
    }
    
    if (i >= 254) {
    omvendt=omvendt*-1;
    i=0;
   
    }

    if (iCir < 255) {     
    circkleAnim=omvendt2*2+circkleAnim;
    circkleAnim2=5/10*circkleAnim2;
    iCir = iCir+7/3;
    }
    
    if (iCir >= 254) {
    omvendt2=omvendt2*-1;
    circkleAnim2=1;
    iCir=0;}
   
  //  }}
  //  if(iAnim<5){
    
 //   }
 //   if(iAnim>=5){
    
  //  }
    
}}





public void messenger0 () {
  
  
//#############################scrollM Funktion#################################//


  scrollM=scrollYMess*sSpeed;
  if(!scrollLock){
 if(scrollM<=-79){
   scrollYMess=scrollYMess+4;
  }

   if(scrollM>=1){
   scrollYMess=scrollYMess-4;
  }
  }
//#############################################################################//  
  
  
  
  
  
  
  
  
  
  
  
  
  
  int zeroX = 0;
  
  int topMbarX = 40;
  int topTxSize = 50;
  int backgroundColor = 255;
  int black = 0;
  int mesBlue = 0xffC8EEF9;
  
  //chat icons
  int circleDiameter=100;
  int circleStartY=200;
  int dividSpace=140;
  int firstSixth=width/6;
;  
  //text box
  int rectY=160;
  int third=width/3;
  int rectHeight= 75;
  int rectWidth= 300;
  int corners = 15; 
  int boxColor= 240;
  int boxHeightY1= 150;
  int txSize = 20;
  
  //text
  String text = "   Messenger";
  String text1 = " Group Chat";
  String text2 = " Nick"; 
  String text3 = " Ida";
  String text4 = " Kasper";
  String text5 = " Maya";
  
  int homeBar=height-height/26;
  
  
  //The part of the timer that shows the current time
  int currentTime = millis() - captureTime; 
  
  //returns the user to the lockscreen if x amount of time passes  
  returnTimer();
  
  background(backgroundColor);


 
    
 
  
  //chat icons pictures
  imageMode(CENTER);
  image(Group,firstSixth, circleStartY+scrollM, circleDiameter, circleDiameter);
  image(secPic,firstSixth, circleStartY + dividSpace+scrollM, circleDiameter, circleDiameter);
  image(thirdPic,firstSixth, circleStartY + (dividSpace*2)+scrollM, circleDiameter, circleDiameter);
  image(fourPic,firstSixth, circleStartY + (dividSpace*3)+scrollM, circleDiameter, circleDiameter);
  image(fifthPic,firstSixth, circleStartY + (dividSpace*4)+scrollM, circleDiameter, circleDiameter);
  
 //text box   
  fill(boxColor);
  rect(third,(rectY+scrollM),rectWidth,rectHeight,corners);
  textSize(txSize);
  fill(black);
  textAlign(LEFT);
  text(text1,third,(rectY+scrollM),rectWidth,rectHeight);
 
  fill(boxColor);
  rect(third,((rectY+dividSpace)+scrollM),rectWidth,rectHeight,corners);
  textSize(txSize);
  fill(black);
  text(text2,third,((rectY+dividSpace)+scrollM),rectWidth,rectHeight);
  
  fill(boxColor);
  rect(third,((rectY+(dividSpace*2))+scrollM),rectWidth,rectHeight,corners);
  textSize(txSize);
  fill(black);
  text(text3,third,((rectY+(dividSpace*2))+scrollM),rectWidth,rectHeight);
    
  fill(boxColor);
  rect(third,((rectY+(dividSpace*3))+scrollM),rectWidth,rectHeight,corners);
  textSize(txSize);
  fill(black);
  text(text4,third,((rectY+(dividSpace*3))+scrollM),rectWidth,rectHeight);

  fill(boxColor);
  rect(third,((rectY+(dividSpace*4))+scrollM),rectWidth,rectHeight,corners);
  textSize(txSize);
  fill(black);
  text(text5,third,((rectY+(dividSpace*4))+scrollM),rectWidth,rectHeight);
  
  //Top bar
  fill(0xffffffff);
  noStroke();
  rect(0,0,width,topMbarX);
  
  
  
  //top messenger bar
  fill(mesBlue);
  noStroke();
  rect(zeroX,topMbarX,width,height/12);
  textSize(topTxSize);
  fill(black);
  textAlign(LEFT);
  text(text,zeroX,topMbarX,width,height/12);




  //hit box
if(mouseButton==LEFT){
  if (!scrollLock){
  if ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= (rectY+scrollM))&&(mouseY <= rectY+rectHeight+scrollM)){
      page4 = false;
      page6 = true;
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = false;
      captureTime = millis();
   }
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= rectY+dividSpace+scrollM) &&(mouseY <= (rectY+dividSpace+rectHeight+scrollM))&&(currentTime>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = true;
      page8 = false;
      page9 = false;
      page10 = false; 
      captureTime = millis();
   }
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= ((rectY+dividSpace*2)+scrollM))&&(mouseY <= (rectY+dividSpace*2)+rectHeight+scrollM)&&(currentTime>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = false;
      page8 = true;
      page9 = false;
      page10 = false; 
      captureTime = millis();
   } 
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >=((rectY+dividSpace*3))+scrollM)&&(mouseY <=((rectY+dividSpace*3)+rectHeight+scrollM))&&(currentTime>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = false;
      page8 = false;
      page9 = true;
      page10 = false; 
      captureTime = millis();
   } 
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= ((boxHeightY1+(dividSpace*4))+scrollM))&&(mouseY <= (rectY+dividSpace*4)+rectHeight+scrollM)&&(currentTime>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = true; 
      captureTime = millis();
   }

  }}
  
  noStroke();
  fill(mesBlue);
  rect(0,homeBar,width,height-homeBar);
  
   topbar();
   
 //Homebutton
 homebutton();  
   
}





public void messenger2() {
  
  
//############################# scrollM2 Funktion##################################//


  scrollM2=scrollYMess2*sSpeed;
  
 if(!scrollLock){
  if(scrollM2<=-161){
   scrollYMess2=scrollYMess2+4;
  }

   if(scrollM2>=1){
   scrollYMess2=scrollYMess2-4;
  }
  }
//#############################################################################//  
  
  
  
  
  
  
  
  
  
  
  
  
  int bottomBarY = height-height/10;
  int zero = 0;
  int replyX = 50;
  
  int messengerColor = 0xffC8EEF9;
  int backgroundColor = 255;
  int strokeColors = 0;
  
  
  //top messenger bar
  int topbarX = 0;
  int topbarY = 40;
  int topbarW = width;
  int topbarH = height/10;
  int textSizeTop = 30; 
  String MessageTop = "Nick";
  
  //backbutton pil
  int backButton=0xff2E3031;
  int triangleX1 = 25;
  int triangleY1 = 75;
  int triangleX2 = 58;
  int triangleY2 = 54;
  int triangleX3 = 58;
  int triangleY3 = 96;
  int hitBoxX2 = 57;
  int hitBoxY2 = 45;
  int rectX = 50;
  int rectY = 71;
  int rectW = 31;
  int rectH = 7;  
  
  //dot dot dot
  int dotSize = 7;
  int dotY = height-height/10+50;
  int dotX = 500;
  
  //messages
  int messYouX = width/3;
  int messOtherX = 50;
  float messW = width/1.7f;
  int boxColor = 240;
  int corners = 15;
  int space2 = 30;
  int space3 = 30*2;
  int space4 = 30*3;
  int space5 = 30*4;
  int space6 = 30*5;
  int space7 = 30*6;
  int space8 = 30*7;
  int space9 = 30*8;
  
  int textSize = 18; 
  String Message1 = "Jeg missede toget! Selvfølgelig kommer jeg forsent i dag";
  String Message2 = "Dude, det gør ikke noget, skal nok opdatere dig på hvad du missede :)";
  String Message3 = "Skal du med til festen på fredag?";
  String Message4 = "Ja selvfølgelig, det bliver så hyggeligt! Selvom der ikke må være alkohol til stede";
  String Message5 = "Bare rolig, jeg skal nok smadre dig i brætspil anyway xD";
  String Message6 = "Kom bare an du ;)";
  String Message7 = "Hvordan gik fremlæggelsen?";
  String Message8 = "Skide godt!";
  String Message9 = "Det er dejligt at høre! Godt klaret!";
  
  
  int messageY = height/6; //startY
  int message1H = 60; // first
  int message2H = 60; //second
  int message3H = 30; //third and so on 
  int message4H = 90; 
  int message5H = 60;
  int message6H = 30;
  int message7H = 30;
  int message8H = 60;
  int message9H = 60;
  
  
  //pictures
  int chatHeadX = 40;
  int chatHeadW = 35;
  int chatHeadH = 35;

  
//returns the user to the lockscreen if x amount of time passes  
  returnTimer();
  
  background (backgroundColor);
   
  //messages on screen
  noStroke();
  
    //first
    fill(boxColor);
  rect(messOtherX,(messageY)+ scrollM2,messW,message1H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message1,messOtherX,(messageY)+ scrollM2,messW,message1H);
  image(secPic,messOtherX-chatHeadX,(messageY)+ scrollM2,chatHeadW,chatHeadH);
  
    //second
    fill(boxColor);
  rect(messYouX,((messageY+message1H)+space2)+ scrollM2,messW,message2H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message2,messYouX,((messageY+message1H)+space2)+ scrollM2,messW,message2H);
 
    //third
    fill(boxColor);
  rect(messOtherX,(messageY+(message2H+message1H)+(space3))+ scrollM2,messW,message3H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message3,messOtherX,(messageY+(message2H+message1H)+(space3))+ scrollM2,messW,message3H);
  image(secPic,messOtherX-chatHeadX,(messageY+(message2H+message1H)+(space3))+ scrollM2,chatHeadW,chatHeadH);
  
    //fourth
    fill(boxColor);
  rect(messYouX,(messageY+(message3H+message2H+message1H)+(space4))+ scrollM2,messW,message4H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message4,messYouX,messageY+(message3H+message2H+message1H)+(space4)+ scrollM2,messW,message4H);
 
     //fifth
    fill(boxColor);
  rect(messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+ scrollM2,messW,message5H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message5,messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+ scrollM2,messW,message5H);
  image(secPic,messOtherX-chatHeadX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+ scrollM2,chatHeadW,chatHeadH);
  
    //sixth
    fill(boxColor);
  rect(messYouX,(messageY+(message5H+message4H+message3H+message2H+message1H)+(space6))+ scrollM2,messW,message6H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message6,messYouX,messageY+(message5H+message4H+message3H+message2H+message1H)+(space6)+ scrollM2,messW,message6H);

    //seventh
    fill(boxColor);
  rect(messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+ scrollM2,messW,message7H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message7,messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+ scrollM2,messW,message7H);
  image(secPic,messOtherX-chatHeadX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+ scrollM2,chatHeadW,chatHeadH);
  
    //eighth
    fill(boxColor);
  rect(messYouX,(messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8))+ scrollM2,messW,message8H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message8,messYouX,messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8)+ scrollM2,messW,message8H);
  
    //ninth
    fill(boxColor);
  rect(messOtherX,(messageY+(message8H+message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space9))+ scrollM2,messW,message9H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message9,messOtherX,messageY+(message8H+message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space9)+ scrollM2,messW,message9H);
  image(secPic,messOtherX-chatHeadX,(messageY+(message8H+message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space9))+ scrollM2,chatHeadW,chatHeadH);
 
 

  //Top bar
  fill(0xffffffff);
  noStroke();
  rect(0,0,width,topbarY);
  
  
  //top messenger bar
  fill(messengerColor);
  noStroke();
  rect(topbarX,topbarY,topbarW,topbarH);
  
  textSize(textSizeTop);
  fill(strokeColors);
  textAlign(CENTER, CENTER);
  text(MessageTop,topbarX,topbarY,topbarW,topbarH);
  
  //bottom messenger bar
  fill(messengerColor);
  rect(zero,bottomBarY,width,height/10);
 
  //reply box 
  fill(backgroundColor);
  rect(replyX,bottomBarY+20,width/2,height/20, corners);
  textSize(32);
  
  fill(strokeColors);
  textAlign(LEFT);
  text(" Aa",replyX,bottomBarY+25,width/2,height/20);
  
  //Like text
  fill(strokeColors);
  textAlign(RIGHT,CENTER);
  text("Like",width/2,bottomBarY,width/4,height/10);
  
  //dot dot dot
  circle(dotX,dotY,dotSize);
  circle(dotX+15,dotY,dotSize);
  circle(dotX+30,dotY,dotSize);
  
  topbar();
  
  // backbutton
  fill(backButton);
  triangle(triangleX1,triangleY1,triangleX2,triangleY2,triangleX3,triangleY3);
  rect(rectX,rectY,rectW,rectH);
  
   if ((mousePressed==true)&&(mouseX >= triangleX1)&&(mouseX <= triangleX1+hitBoxX2)&&(mouseY >= (triangleY2+ scrollM2))&&(mouseY <= triangleY2+hitBoxY2)){
      page4 = true;
      page6 = false;
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = false;
      captureTime = millis();
 }

 
 //Homebutton
 homebutton();    
   
}





public void messenger3() {
  
    
//#############################scrollM3 Funktion##################################//


  scrollM3=scrollYMess3*sSpeed;
if(!scrollLock){
  if(scrollM3<=-127){
   scrollYMess3=scrollYMess3+4;
  }

   if(scrollM3>=1){
   scrollYMess3=scrollYMess3-4;
  }
  }
//#############################################################################//  
  
  
  
  
  int bottomBarY = height-height/10;
  int zero = 0;
  int replyX = 50;
  
  int messengerColor = 0xffC8EEF9;
  int backgroundColor = 255;
  int strokeColors = 0;
  
  
  //top messenger bar
  int topbarX = 0;
  int topbarY = 40;
  int topbarW = width;
  int topbarH = height/10;
  int textSizeTop = 30; 
  String MessageTop = "Ida";
  
  //backbutton pil
  int backButton=0xff2E3031;
  int triangleX1 = 25;
  int triangleY1 = 75;
  int triangleX2 = 58;
  int triangleY2 = 54;
  int triangleX3 = 58;
  int triangleY3 = 96;
  int hitBoxX2 = 57;
  int hitBoxY2 = 45;
  int rectX = 50;
  int rectY = 71;
  int rectW = 31;
  int rectH = 7;  
  
  //dot dot dot
  int dotSize = 7;
  int dotY = height-height/10+50;
  int dotX = 500;
  
  
  //messages
  int messYouX = width/3;
  int messOtherX = 50;
  float messW = width/1.7f;
  int boxColor = 240;
  int corners = 15;
  int space2 = 30;
  int space3 = 30*2;
  int space4 = 30*3;
  int space5 = 30*4;
  int space6 = 30*5;
  int space7 = 30*6;
  int space8 = 30*7;
  int space9 = 30*8;
  
  int textSize = 18; 
  String Message1 = "Fik du programmeret din knappe færdig?";
  String Message2 = "Ja, men det tog noget tid";
  String Message3 = "Super, hvordan fik du random til at fungere?";
  String Message4 = "Jeg satte det ind i et for loop. Sender det lige...";
  String Message5 = "for (int i = 0; i < 100; i++) {float r = random(-50, 50); println(r);}";
  String Message6 = "Ahh okay, det giver mening, tak!";
  String Message7 = "Så lidt, har du lavet skitserne til Audio- visuel sketching?";
  String Message8 = "Ikke helt endnu, har ikke haft tid til det. Jeg må blive bedre til at styrre min tid ;´)";
  String Message9 = "Fair nok, har det på samme måde :)";
  
  int messageY = height/6; //startY
  int message1H = 60; // first
  int message2H = 30; //second
  int message3H = 60; //third and so on 
  int message4H = 60; 
  int message5H = 60;
  int message6H = 30;
  int message7H = 60;
  int message8H = 60;
  int message9H = 30;
  
  
  //pictures
  int chatHeadX = 40;
  int chatHeadW = 35;
  int chatHeadH = 35;

  int botbarY= height/10+bottomBarY;


//returns the user to the lockscreen if x amount of time passes  
  returnTimer();
 
  
  
  background (backgroundColor);
   
  //messages on screen
  noStroke();
  
    //first
    fill(boxColor);
  rect(messOtherX,(messageY)+scrollM3,messW,message1H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message1,messOtherX,(messageY)+scrollM3,messW,message1H);
  image(thirdPic,messOtherX-chatHeadX,(messageY)+scrollM3,chatHeadW,chatHeadH);
  
    //second
    fill(boxColor);
  rect(messYouX,((messageY+message1H)+space2)+scrollM3,messW,message2H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message2,messYouX,((messageY+message1H)+space2)+scrollM3,messW,message2H);
 
    //third
    fill(boxColor);
  rect(messOtherX,(messageY+(message2H+message1H)+(space3))+scrollM3,messW,message3H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message3,messOtherX,(messageY+(message2H+message1H)+(space3))+scrollM3,messW,message3H);
  image(thirdPic,messOtherX-chatHeadX,(messageY+(message2H+message1H)+(space3))+scrollM3,chatHeadW,chatHeadH);
  
    //fourth
    fill(boxColor);
  rect(messYouX,(messageY+(message3H+message2H+message1H)+(space4))+scrollM3,messW,message4H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message4,messYouX,messageY+(message3H+message2H+message1H)+(space4)+scrollM3,messW,message4H);
 
     //fifth
    fill(boxColor);
  rect(messYouX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM3,messW,message5H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message5,messYouX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM3,messW,message5H);
  
    //sixth
    fill(boxColor);
  rect(messOtherX,(messageY+(message5H+message4H+message3H+message2H+message1H)+(space6))+scrollM3,messW,message6H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message6,messOtherX,messageY+(message5H+message4H+message3H+message2H+message1H)+(space6)+scrollM3,messW,message6H);
  image(thirdPic,messOtherX-chatHeadX,(messageY+(message5H+message4H+message3H+message2H+message1H)+(space5))+scrollM3,chatHeadW,chatHeadH);

    //seventh
    fill(boxColor);
  rect(messYouX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM3,messW,message7H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message7,messYouX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM3,messW,message7H);
  
    //eighth
    fill(boxColor);
  rect(messOtherX,(messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8))+scrollM3,messW,message8H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message8,messOtherX,messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8)+scrollM3,messW,message8H);
  image(thirdPic,messOtherX-chatHeadX,(messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM3,chatHeadW,chatHeadH);
  
    //ninth
    fill(boxColor);
  rect(messYouX,(messageY+(message8H+message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space9))+scrollM3,messW,message9H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message9,messYouX,messageY+(message8H+message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space9)+scrollM3,messW,message9H);
  
  
  //Bottom bar
  fill(0xffffffff);
  noStroke();
  rect(0,botbarY,width,height-botbarY);
  
  //Top bar
  fill(0xffffffff);
  noStroke();
  rect(0,0,width,topbarY);
  
  
 

  //top messenger bar
  fill(messengerColor);
  noStroke();
  rect(topbarX,topbarY,topbarW,topbarH);
  
  textSize(textSizeTop);
  fill(strokeColors);
  textAlign(CENTER, CENTER);
  text(MessageTop,topbarX,topbarY,topbarW,topbarH);
  
  //bottom messenger bar
  fill(messengerColor);
  rect(zero,bottomBarY,width,height/10);
 
  //reply box 
  fill(backgroundColor);
  rect(replyX,bottomBarY+20,width/2,height/20, corners);
  textSize(32);
  
  fill(strokeColors);
  textAlign(LEFT);
  text(" Aa",replyX,bottomBarY+25,width/2,height/20);
  
  //Like text
  fill(strokeColors);
  textAlign(RIGHT,CENTER);
  text("Like",width/2,bottomBarY,width/4,height/10);
  
  //dot dot dot
  circle(dotX,dotY,dotSize);
  circle(dotX+15,dotY,dotSize);
  circle(dotX+30,dotY,dotSize);
  
  topbar();
  
  // backbutton
  fill(backButton);
  triangle(triangleX1,triangleY1,triangleX2,triangleY2,triangleX3,triangleY3);
  rect(rectX,rectY,rectW,rectH);
  
   if ((mousePressed==true)&&(mouseX >= triangleX1)&&(mouseX <= triangleX1+hitBoxX2)&&(mouseY >= (triangleY2+scrollM3))&&(mouseY <= triangleY2+hitBoxY2)){
      page4 = true;
      page6 = false;
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = false;
      captureTime = millis();
 }
  
  
 //Homebutton
 homebutton();    
  
  
}





public void messenger4() {
 
  
//#############################scrollM4 Funktion##################################//

  scrollM4=scrollYMess4*sSpeed;
if(!scrollLock){
  if(scrollM4<=-73){
   scrollYMess4=scrollYMess4+4;
  }

   if(scrollM4>=1){
   scrollYMess4=scrollYMess4-4;
  }
  }


//#############################################################################//  

  
  
  
  int bottomBarY = height-height/10;
  int zero = 0;
  int replyX = 50;
  
  int messengerColor = 0xffC8EEF9;
  int backgroundColor = 255;
  int strokeColors = 0;
  
  
  //top messenger bar
  int topbarX = 0;
  int topbarY = 40;
  int topbarW = width;
  int topbarH = height/10;
  int textSizeTop = 30; 
  String MessageTop = "Kasper";
  
  //backbutton pil
  int backButton=0xff2E3031;
  int triangleX1 = 25;
  int triangleY1 = 75;
  int triangleX2 = 58;
  int triangleY2 = 54;
  int triangleX3 = 58;
  int triangleY3 = 96;
  int hitBoxX2 = 57;
  int hitBoxY2 = 45;
  int rectX = 50;
  int rectY = 71;
  int rectW = 31;
  int rectH = 7;  
  
  //dot dot dot
  int dotSize = 7;
  int dotY = height-height/10+50;
  int dotX = 500;
  
  //messages
  int messYouX = width/3;
  int messOtherX = 50;
  float messW = width/1.7f;
  int boxColor = 240;
  int corners = 15;
  int space2 = 30;
  int space3 = 30*2;
  int space4 = 30*3;
  int space5 = 30*4;
  int space6 = 30*5;
  int space7 = 30*6;
  int space8 = 30*7;
  
  int textSize = 18; 
  String Message1 = "Hey, jeg har skrevet en del noter til en artikel jeg synes var god, skal jeg bare smide dem ind i vores dokument?";
  String Message2 = "Det kunne være vi skulle lave en form for litteraturliste afsnit i dokumentet eller lave et separat dokument bare for at holde orden på det hele";
  String Message3 = "Det tror jeg er en god idé";
  String Message4 = "Hey, er jeg muted på teams?";
  String Message5 = "Jep, det er du";
  String Message6 = "Super tak. Var bange for at larme xD";
  String Message7 = "Har det på samme måde XD";
  String Message8 = "Du er også muted Btw ;)";
  
  
  int messageY = height/6; //startY
  int message1H = height/10; // first
  int message2H = height/7; //second
  int message3H = height/25; //third and so on 
  int message4H = 30; 
  int message5H = height/25;
  int message6H = height/25;
  int message7H = height/12;
  int message8H = 30;
  
  
  //pictures
  int chatHeadX = 40;
  int chatHeadW = 35;
  int chatHeadH = 35;

  int botbarY= height/10+bottomBarY;
  
 
//returns the user to the lockscreen if x amount of time passes  
  returnTimer();
  
  
  
  background (backgroundColor);
   
  //messages on screen
  noStroke();
  
    //first
    fill(boxColor);
  rect(messOtherX,(messageY)+scrollM4,messW,message1H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message1,messOtherX,(messageY)+scrollM4,messW,message1H);
  image(fourPic,messOtherX-chatHeadX,(messageY)+scrollM4,chatHeadW,chatHeadH);
  
    //second
    fill(boxColor);
  rect(messYouX,((messageY+message1H)+space2)+scrollM4,messW,message2H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message2,messYouX,((messageY+message1H)+space2)+scrollM4,messW,message2H);
 
    //third
    fill(boxColor);
  rect(messOtherX,(messageY+(message2H+message1H)+(space3))+scrollM4,messW,message3H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message3,messOtherX,(messageY+(message2H+message1H)+(space3))+scrollM4,messW,message3H);
  image(fourPic,messOtherX-chatHeadX,(messageY+(message2H+message1H)+(space3))+scrollM4,chatHeadW,chatHeadH);
  
    //fourth
    fill(boxColor);
  rect(messYouX,(messageY+(message3H+message2H+message1H)+(space4))+scrollM4,messW,message4H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message4,messYouX,messageY+(message3H+message2H+message1H)+(space4)+scrollM4,messW,message4H);
 
     //fifth
    fill(boxColor);
  rect(messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM4,messW,message5H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message5,messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM4,messW,message5H);
  image(fourPic,messOtherX-chatHeadX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM4,chatHeadW,chatHeadH);
  
    //sixth
    fill(boxColor);
  rect(messYouX,(messageY+(message5H+message4H+message3H+message2H+message1H)+(space6))+scrollM4,messW,message6H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message6,messYouX,messageY+(message5H+message4H+message3H+message2H+message1H)+(space6)+scrollM4,messW,message6H);

    //seventh
    fill(boxColor);
  rect(messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM4,messW,message7H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message7,messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM4,messW,message7H);
  image(fourPic,messOtherX-chatHeadX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM4,chatHeadW,chatHeadH);
  
    //eighth
    fill(boxColor);
  rect(messYouX,(messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8))+scrollM4,messW,message8H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message8,messYouX,messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8)+scrollM4,messW,message8H);


  
  //Bottom bar
  fill(0xffffffff);
  noStroke();
  rect(0,botbarY,width,height-botbarY);
  
  //Top bar
  fill(0xffffffff);
  noStroke();
  rect(0,0,width,topbarY);
  
  
  
  //top messenger bar
  fill(messengerColor);
  noStroke();
  rect(topbarX,topbarY,topbarW,topbarH);
  
  textSize(textSizeTop);
  fill(strokeColors);
  textAlign(CENTER, CENTER);
  text(MessageTop,topbarX,topbarY,topbarW,topbarH);
  
  //bottom messenger bar
  fill(messengerColor);
  rect(zero,bottomBarY,width,height/10);
 
  //reply box 
  fill(backgroundColor);
  rect(replyX,bottomBarY+20,width/2,height/20, corners);
  textSize(32);
  
  fill(strokeColors);
  textAlign(LEFT);
  text(" Aa",replyX,bottomBarY+25,width/2,height/20);
  
  //Like text
  fill(strokeColors);
  textAlign(RIGHT,CENTER);
  text("Like",width/2,bottomBarY,width/4,height/10);
  
  //dot dot dot
  circle(dotX,dotY,dotSize);
  circle(dotX+15,dotY,dotSize);
  circle(dotX+30,dotY,dotSize);
  
  topbar();
  
  // backbutton
  fill(backButton);
  triangle(triangleX1,triangleY1,triangleX2,triangleY2,triangleX3,triangleY3);
  rect(rectX,rectY,rectW,rectH);
  
  
   if ((mousePressed==true)&&(mouseX >= triangleX1)&&(mouseX <= triangleX1+hitBoxX2)&&(mouseY >= (triangleY2+scrollM4))&&(mouseY <= triangleY2+hitBoxY2)){
      page4 = true;
      page6 = false;
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = false;
      captureTime = millis();
 }

  
homebutton();  


}





public void messenger5() {
  
  
//#############################scrollM5 Funktion##################################//

  scrollM5=scrollYMess5*sSpeed;
if(!scrollLock){
  if(scrollM5<=-63){
   scrollYMess5=scrollYMess5+4;
  }

   if(scrollM5>=1){
   scrollYMess5=scrollYMess5-4;
  }
  }
  
  
//#############################################################################//    
  
  

  

  
  
  int bottomBarY = height-height/10;
  int zero = 0;
  int replyX = 50;
  
  int messengerColor = 0xffC8EEF9;
  int backgroundColor = 255;
  int strokeColors = 0;
  
  
  //top messenger bar
  int topbarX = 0;
  int topbarY = 40;
  int topbarW = width;
  int topbarH = height/10;
  int textSizeTop = 30; 
  String MessageTop = "Maya";
  
  //backbutton pil
  int backButton=0xff2E3031;
  int triangleX1 = 25;
  int triangleY1 = 75;
  int triangleX2 = 58;
  int triangleY2 = 54;
  int triangleX3 = 58;
  int triangleY3 = 96;
  int hitBoxX2 = 57;
  int hitBoxY2 = 45;
  int rectX = 50;
  int rectY = 71;
  int rectW = 31;
  int rectH = 7;  
  
  //dot dot dot
  int dotSize = 7;
  int dotY = height-height/10+50;
  int dotX = 500;
  
  //messages
  int messYouX = width/3;
  int messOtherX = 50;
  float messW = width/1.7f;
  int boxColor = 240;
  int corners = 15;
  int space2 = 30;
  int space3 = 30*2;
  int space4 = 30*3;
  int space5 = 30*4;
  int space6 = 30*5;
  int space7 = 30*6;
  int space8 = 30*7;
  
  int textSize = 18; 
  String Message1 = "Jeg kommer ikke til programmering i dag, kan en af jer måske skrive nogle noter til forelæsningen for mig?";
  String Message2 = "Hvis jeg skriver noter, skal du nok få dem :D";
  String Message3 = "Tak!";
  String Message4 = "Hvordan var det igen man brugte fontMode(CENTER)?";
  String Message5 = "fontMode(CENTER,CENTER,x,y tror jeg";
  String Message6 = "Jeg har forresten lavet et system der kan skifte side ret godt som kan bruges til vores projekt opgave.";
  String Message7 = "Godt gået!";
  String Message8 = "Mange tak :)";
  
  
  int messageY = height/6; //startY
  int message1H = 90; // first
  int message2H = 60; //second
  int message3H = 30; //third and so on 
  int message4H = 60; 
  int message5H = 30;
  int message6H = 90;
  int message7H = 30;
  int message8H = 30;
  
  
  //pictures
  int chatHeadX = 40;
  int chatHeadW = 35;
  int chatHeadH = 35;
  
  
  
   int botbarY= height/10+bottomBarY;

  
//returns the user to the lockscreen if x amount of time passes  
  returnTimer();
  
  
  background (backgroundColor);
   
  //messages on screen
  noStroke();
  
    //first
    fill(boxColor);
  rect(messOtherX,(messageY)+scrollM5,messW,message1H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message1,messOtherX,(messageY)+scrollM5,messW,message1H);
  image(fifthPic,messOtherX-chatHeadX,(messageY)+scrollM5,chatHeadW,chatHeadH);
  
    //second
    fill(boxColor);
  rect(messYouX,((messageY+message1H)+space2)+scrollM5,messW,message2H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message2,messYouX,((messageY+message1H)+space2)+scrollM5,messW,message2H);
 
    //third
    fill(boxColor);
  rect(messOtherX,(messageY+(message2H+message1H)+(space3))+scrollM5,messW,message3H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message3,messOtherX,(messageY+(message2H+message1H)+(space3))+scrollM5,messW,message3H);
  image(fifthPic,messOtherX-chatHeadX,(messageY+(message2H+message1H)+(space3))+scrollM5,chatHeadW,chatHeadH);
  
    //fourth
    fill(boxColor);
  rect(messYouX,(messageY+(message3H+message2H+message1H)+(space4))+scrollM5,messW,message4H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message4,messYouX,messageY+(message3H+message2H+message1H)+(space4)+scrollM5,messW,message4H);
 
     //fifth
    fill(boxColor);
  rect(messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM5,messW,message5H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message5,messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM5,messW,message5H);
  image(fifthPic,messOtherX-chatHeadX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollM5,chatHeadW,chatHeadH);
  
    //sixth
    fill(boxColor);
  rect(messYouX,(messageY+(message5H+message4H+message3H+message2H+message1H)+(space6))+scrollM5,messW,message6H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message6,messYouX,messageY+(message5H+message4H+message3H+message2H+message1H)+(space6)+scrollM5,messW,message6H);

    //seventh
    fill(boxColor);
  rect(messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM5,messW,message7H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message7,messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM5,messW,message7H);
  image(fifthPic,messOtherX-chatHeadX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollM5,chatHeadW,chatHeadH);
  
    //eighth
    fill(boxColor);
  rect(messYouX,(messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8))+scrollM5,messW,message8H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message8,messYouX,messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8)+scrollM5,messW,message8H);



  //Bottom bar
  fill(0xffffffff);
  noStroke();
  rect(0,botbarY,width,height-botbarY);
  
  //Top bar
  fill(0xffffffff);
  noStroke();
  rect(0,0,width,topbarY);
  
  

  
  //top messenger bar
  fill(messengerColor);
  noStroke();
  rect(topbarX,topbarY,topbarW,topbarH);
  
  textSize(textSizeTop);
  fill(strokeColors);
  textAlign(CENTER, CENTER);
  text(MessageTop,topbarX,topbarY,topbarW,topbarH);
  
  //bottom messenger bar
  fill(messengerColor);
  rect(zero,bottomBarY,width,height/10);
 
  //reply box 
  fill(backgroundColor);
  rect(replyX,bottomBarY+20,width/2,height/20, corners);
  textSize(32);
  
  fill(strokeColors);
  textAlign(LEFT);
  text(" Aa",replyX,bottomBarY+25,width/2,height/20);
  
  //Like text
  fill(strokeColors);
  textAlign(RIGHT,CENTER);
  text("Like",width/2,bottomBarY,width/4,height/10);
  
  //dot dot dot
  circle(dotX,dotY,dotSize);
  circle(dotX+15,dotY,dotSize);
  circle(dotX+30,dotY,dotSize);
  
  topbar();
  
  // backbutton
  fill(backButton);
  triangle(triangleX1,triangleY1,triangleX2,triangleY2,triangleX3,triangleY3);
  rect(rectX,rectY,rectW,rectH);
  
  
  

  
   if ((mousePressed==true)&&(mouseX >= triangleX1)&&(mouseX <= triangleX1+hitBoxX2)&&(mouseY >= (triangleY2+scrollM5))&&(mouseY <= triangleY2+hitBoxY2)){
      page4 = true;
      page6 = false;
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = false;
      captureTime = millis();
 }

 
//Homebutton
homebutton();  
  
}





public void messengerGroup() {
  
     
//#############################scrollMG Funktion##################################//


  scrollMG=scrollYMessG*sSpeed;
   if(!scrollLock){
  if(scrollMG<=-217){
   scrollYMessG=scrollYMessG+4;
  }

   if(scrollMG>=1){
   scrollYMessG=scrollYMessG-4;
  }
   }
//#############################################################################//  


  
  
  
  
  int bottomBarY = height-height/10;
  int zero = 0;
  int replyX = 50;
  
  int messengerColor = 0xffC8EEF9;
  int backgroundColor = 255;
  int strokeColors = 0;
  
  
  //top messenger bar
  int topbarX = 0;
  int topbarY = 40;
  int topbarW = width;
  int topbarH = height/10;
  int textSizeTop = 30; 
  String MessageTop = "Gruppe Chat";
  
  
  //backbutton pil
  int backButton=0xff2E3031;
  int triangleX1 = 25;
  int triangleY1 = 75;
  int triangleX2 = 58;
  int triangleY2 = 54;
  int triangleX3 = 58;
  int triangleY3 = 96;
  int hitBoxX2 = 57;
  int hitBoxY2 = 45;
  int rectX = 50;
  int rectY = 71;
  int rectW = 31;
  int rectH = 7;  
  
  //dot dot dot
  int dotSize = 7;
  int dotY = height-height/10+50;
  int dotX = 500;
  
  //messages
  int messYouX = width/3;
  int messOtherX = 50;
  float messW = width/1.7f;
  int boxColor = 240;
  int corners = 15; 
  int space2 = 30;
  int space3 = 30*2;
  int space4 = 30*3;
  int space5 = 30*4;
  int space6 = 30*5;
  int space7 = 30*6;
  int space8 = 30*7;
  
  int textSize = 18; 
  String Message1 = "Aloha, Håber i har haft et par gode intro dage, jeg glæder mig til vi skal arbejde sammen på projektet!";
  String Message2 = "Det bliver hårdt men jeg glæder mig til samarbejdet";
  String Message3 = "Vi skal bare i gang, jeg tænker vi eventuelt kunne mødes efter skole, og lige mødes og tale, ikke om projektet, men mere omkring os selv, forventnings afstemme med hinanden osv?";
  String Message4 = "Lad os skrives ved i morgen efter tutor kursus med computer info osv. Det bare mere så ingen forhåbentligt når at gå hjem";
  String Message5 = "God ide!";
  String Message6 = "Ved i hvor lokalet er? Eller hvilket nummer det har?";
  String Message7 = "Bygning D første sal, Medialogi grupperum";
  String Message8 = "Mange Tak!";
  
  
  int messageY = height/6; //startY
  int message1H = 90; // first
  int message2H = 60; //second
  int message3H = 180; //third and so on 
  int message4H = 60; 
  int message5H = 30;
  int message6H = 60;
  int message7H = 60;
  int message8H = 30;
  
  
  //pictures
  int chatHeadX = 40;
  int chatHeadW = 35;
  int chatHeadH = 35;

  int botbarY= height/10+bottomBarY;

   
//returns the user to the lockscreen if x amount of time passes  
  returnTimer();
  
  background (backgroundColor);
   
  //messages on screen
  imageMode(CORNER);
  noStroke();
  
    //first
    fill(boxColor);
  rect(messOtherX,(messageY)+scrollMG,messW,message1H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message1,messOtherX,(messageY)+scrollMG,messW,message1H);
  image(Group,messOtherX-chatHeadX,(messageY)+scrollMG,chatHeadW,chatHeadH);
  
    //second
    fill(boxColor);
  rect(messYouX,((messageY+message1H)+space2)+scrollMG,messW,message2H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message2,messYouX,((messageY+message1H)+space2)+scrollMG,messW,message2H);
 
    //third
    fill(boxColor);
  rect(messOtherX,(messageY+(message2H+message1H)+(space3))+scrollMG,messW,message3H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message3,messOtherX,(messageY+(message2H+message1H)+(space3))+scrollMG,messW,message3H);
  image(Group,messOtherX-chatHeadX,(messageY+(message2H+message1H)+(space3))+scrollMG,chatHeadW,chatHeadH);
  
    //fourth
    fill(boxColor);
  rect(messYouX,(messageY+(message3H+message2H+message1H)+(space4))+scrollMG,messW,message4H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message4,messYouX,messageY+(message3H+message2H+message1H)+(space4)+scrollMG,messW,message4H);
 
     //fifth
    fill(boxColor);
  rect(messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollMG,messW,message5H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message5,messOtherX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollMG,messW,message5H);
  image(Group,messOtherX-chatHeadX,(messageY+(message4H+message3H+message2H+message1H)+(space5))+scrollMG,chatHeadW,chatHeadH);
  
    //sixth
    fill(boxColor);
  rect(messYouX,(messageY+(message5H+message4H+message3H+message2H+message1H)+(space6))+scrollMG,messW,message6H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message6,messYouX,messageY+(message5H+message4H+message3H+message2H+message1H)+(space6)+scrollMG,messW,message6H);

    //seventh
    fill(boxColor);
  rect(messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollMG,messW,message7H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message7,messOtherX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollMG,messW,message7H);
  image(Group,messOtherX-chatHeadX,(messageY+(message6H+message5H+message4H+message3H+message2H+message1H)+(space7))+scrollMG,chatHeadW,chatHeadH);
  
    //eighth
    fill(boxColor);
  rect(messYouX,(messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8))+scrollMG,messW,message8H,corners);
  textSize(textSize);
  fill(strokeColors);
  textAlign(LEFT);
  text(Message8,messYouX,messageY+(message7H+message6H+message5H+message4H+message3H+message2H+message1H)+(space8)+scrollMG,messW,message8H);
   
  
  //Bottom bar
  fill(0xffffffff);
  noStroke();
  rect(0,botbarY,width,height-botbarY);
  
  //Top bar
  fill(0xffffffff);
  noStroke();
  rect(0,0,width,topbarY);
    
  
  //top messenger bar
  fill(messengerColor);
  noStroke();
  rect(topbarX,topbarY,topbarW,topbarH);
  
  textSize(textSizeTop);
  fill(strokeColors);
  textAlign(CENTER, CENTER);
  text(MessageTop,topbarX,topbarY,topbarW,topbarH);
  
  //bottom messenger bar
  fill(messengerColor);
  rect(zero,bottomBarY,width,height/10);
 
  //reply box 
  fill(backgroundColor);
  rect(replyX,bottomBarY+20,width/2,height/20, corners);
  textSize(32);
  
  fill(strokeColors);
  textAlign(LEFT);
  text(" Aa",replyX,bottomBarY+25,width/2,height/20);
  
  //Like text
  fill(strokeColors);
  textAlign(RIGHT,CENTER);
  text("Like",width/2,bottomBarY,width/4,height/10);
  
  //dot dot dot
  circle(dotX,dotY,dotSize);
  circle(dotX+15,dotY,dotSize);
  circle(dotX+30,dotY,dotSize);
  
  topbar();
  
  // backbutton
  fill(backButton);
  triangle(triangleX1,triangleY1,triangleX2,triangleY2,triangleX3,triangleY3);
  rect(rectX,rectY,rectW,rectH);
  
   if ((mousePressed==true)&&(mouseX >= triangleX1)&&(mouseX <= triangleX1+hitBoxX2)&&(mouseY >= (triangleY2+scrollMG))&&(mouseY <= triangleY2+hitBoxY2)){
      page4 = true;
      page6 = false;
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = false;
      captureTime = millis();
 }
 
   
//Homebutton
homebutton();  
     

}
public void mouseReleased(){
scrollLock=false;
  }

public void mousePressed(){
if(mouseButton==LEFT){
mouseYLock=mouseY;
}

}







  public void mouseDragged(){  
  
  if (mousePressed){
   if(page1 == true){
      if(mouseX>=255 && mouseX<=338 && mouseYLock>=727 && mouseYLock<=810){
      if(scrollL>=-300 && scrollL<=19){    
      scrollYLock=scrollYLock+mouseY-pmouseY;
     scrollLock=true;
     circkleAnim=0;
     whiteBling=300;
     i=0;
     iCir=0;
  }}}
    if(page2 == true){
      scrollLock=true;
    }
    
    if(page3 == true){
      scrollLock=true;
      if(scrollF>=-846 && scrollF<=20){
    
    scrollYFace=scrollYFace+mouseY-pmouseY;
  }}
  
   if(page4 == true){
   scrollLock=true;
  if(scrollM>=-120 && scrollM<=10){
  scrollYMess=scrollYMess+mouseY-pmouseY;
  }}
  
  if(page5 == true){
    scrollLock=true;
  if(scrollI>=-3600 && scrollI<=60){
  scrollYInsta=scrollYInsta+mouseY-pmouseY;
  }}
  
   if(page6 == true) { 
     scrollLock=true;
     if(scrollMG>=-290-homeDiameterXY && scrollMG<=50){
   scrollYMessG=scrollYMessG+mouseY-pmouseY;
   }}
   
   if(page7 == true) { 
     scrollLock=true;
     if(scrollM2>=-234-homeDiameterXY && scrollM2<=50){
   scrollYMess2=scrollYMess2+mouseY-pmouseY;
   }}
   
   if(page8 == true) { 
     scrollLock=true;
     if(scrollM3>=-200-homeDiameterXY && scrollM3<=50){
   scrollYMess3=scrollYMess3+mouseY-pmouseY;
   }}
   
   if(page9 == true) { 
     scrollLock=true;
     if(scrollM4>=-150-homeDiameterXY && scrollM4<=50){
   scrollYMess4=scrollYMess4+mouseY-pmouseY;
   }}
   
   if(page10 == true) { 
     scrollLock=true;
     if(scrollM5>=-100-homeDiameterXY && scrollM5<=50){
   scrollYMess5=scrollYMess5+mouseY-pmouseY;
   }}
 
   if(page11 == true){
     scrollLock=true;
     if(scrollA>=-600 && scrollA<=60){
    scrollYArb=scrollYArb+mouseY-pmouseY;
  }}

  
  
  
scrollY=scrollY+mouseY-pmouseY;
}}





public void returnTimer() {
  
  
//The part of the timer that shows the current time
int currentTime = millis() - captureTime; 
 //timer that states that if more than x milliseconds pass, it will return us to the "lockScreen"
if(currentTime > millisLock5){
  page1 = true;
  page2 = false;
  page3 = false;
  page4 = false;
  page5 = false;
  page6 = false;
  page7 = false;
  page8 = false;
  page9 = false;
  page10 = false;
  page11 = false;
 
  captureTime = millis();
  captureTimeForFakeClock = millis();
  captureTimeForNotification = millis();
  captureTimeForAnimation = millis();
 }  
}





public void topbar() {

  //background (backgroundColor);
  rectMode(CORNER);
  fill (255,255,255,0);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  stroke(1);
  
  //Med
  textSize(textTopSize);
  fill(0);
  textAlign(CORNER);
  text("Med",medX,Y,medW,medH);
  
  //reception
  rect(medX+medW,repY,repW,repH);
  rect(medX+medW+rSpace,repY,repW,repH2);
  rect(medX+medW+rSpace+rSpace,repY,repW,repH3);
  
  //wi-fi
  imageMode(CORNER);
  noStroke();
  image(imgWIFI,wifiX,wifiY,wifiW,wifiH);
  stroke(1);
  
  
  //101
  textSize(textTopSize);
  fill(0);
  textAlign(CORNER);
  text("101%",X101,Y,W101,H101);
  
  //battery
  imageMode(CORNER);
  noStroke();
  image(imgBattery,X101+W101,yStart,batW,batH);
  stroke(1);
   
  
  
}





public void topbarlock() {

  //background (backgroundColor);
  rectMode(CORNER);
  fill (255,255,255,0);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  stroke(1);
  
  //Med
  textSize(textTopSize);
  fill(0);
  textAlign(CORNER);
  text("Med",medX,Y,medW,medH);
  
  //reception
  rect(medX+medW,repY,repW,repH);
  rect(medX+medW+rSpace,repY,repW,repH2);
  rect(medX+medW+rSpace+rSpace,repY,repW,repH3);
  
  //wi-fi
  imageMode(CORNER);
  noStroke();
  image(imgWIFI,wifiX,wifiY,wifiW,wifiH);
  stroke(1);
  
  //lock  
  noStroke();
  imageMode(CENTER);
  //for some reason the lockX variable does not work, so value is manually put in here
  image(imgLock,width/2,lockY,lockW,lockH);
  stroke(1);
  
  //101
  textSize(textTopSize);
  fill(0);
  textAlign(CORNER);
  text("101%",X101,Y,W101,H101);
  
  //battery
  imageMode(CORNER);
  noStroke();
  image(imgBattery,X101+W101,yStart,batW,batH);
  stroke(1);
   
  
  
}
  public void settings() { 
size(594,841); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Backup9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
