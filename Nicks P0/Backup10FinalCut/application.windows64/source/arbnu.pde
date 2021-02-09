




void arbnu(){

  
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
int sort=#14100c;
int gray= 140;
int orange2=#ff6a49;




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
float faceRectStroke=0.4;
int faceRectTopSpace=5;
int faceRectSpace=15;
int faceRectX = 10;
int faceRectY1= topArbBarYSlut+faceRectTopSpace*2+scrollA;
int faceRectW=180;
int faceRectH=180;


//------- text rect 1 --------
float textBlockStroke=0.8;
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
