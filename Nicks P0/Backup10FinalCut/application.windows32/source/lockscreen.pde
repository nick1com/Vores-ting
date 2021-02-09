




void startPage() {


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
    scrollYLock=0;
  }}
     if(scrollL>=19){
   scrollYLock=scrollYLock-4;
   }
  
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
float facebookHeadlineX = (width) - (width/1.1);
int facebookHeadlineY = notificationBoxY-5;
float facebookSubtextX = (width) - (width/1.1);
int facebookSubtextY = notificationBoxY+25;
int redEllipseTextX = (width) - (width/22);
int redEllipseTextY = notificationBoxY+45;


float MessengerHeadlineX = (width) - (width/1.1);
int MessengerHeadlineY = notificationBoxY2-5;
float MessengerSubtextX = (width) - (width/1.1);
int MessengerSubtextY = notificationBoxY2+25;
int redEllipseTextX2 = (width) - (width/22);
int redEllipseTextY2 = notificationBoxY2+45;




//Homebutton related variables
//int stokeWeightLight = 1;
int imageLocationX = 0;
int imageLocationY = 0;
    
    
    
    like1=false;
    like2=false;
    like3=false;
    like4=false;
    
    numOfLikes=4;
    numOfLikes2=23;
    numOfLikes3=29;
    numOfLikes4=17;
    
    
    
  
    image(lockScreen,imageLocationX,imageLocationY,width,height);
     topbarlock();
     strokeWeight(1+circkleAnim2);
     stroke(255,whiteBling);
     fill(255,whiteBling);
     ellipse(homeButX,homeButY,homeButDiam+circkleAnim,homeButDiam+circkleAnim);
     strokeWeight(1);
     fill(white,whiteBling);
     ellipse(homeButX,homeButY+circlehop,homeButDiam,homeButDiam);
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
      iCir=0;
      circlehop=0;
    }
    if(iAnim<126){

      circlehop=circlehop-2;
      iAnim=iAnim+7/3;
     }
     if (iAnim>=126){
     iAnim=0;  
     }  
  }

  }
    
