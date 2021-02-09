




void homePage() {

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

float iconFourX = (width/5)*4.2;
float iconFourY = (height/5)*2.2;

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

float arbnuLockX1 = ((width/5)*4.2) - 60;
float arbnuLockX2 = ((width/5)*4.2) + 60;
float arbnuLockY1 = ((height/5)*2.2) - 60;
float arbnuLockY2 = ((height/5)*2.2) + 60;

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
  fill(#2c7875);
  
  //image(instaIcon,iconOneX,iconOneY+iconSizeXY+iconSizeXY);
   noStroke();
    instaLogo.resize(iconSizeXY,iconSizeXY);
   image(instaLogo,iconOneX-iconSizeXY/2, iconOneY-iconSizeXY/2);
   messLogo.resize(iconSizeXY,iconSizeXY);
   image(messLogo,iconTwoX-iconSizeXY/2, iconTwoY-iconSizeXY/2);  
   fill(#4267B2);
    rect(iconThreeX, iconThreeY, iconSizeXY,iconSizeXY,10);
   faceLogo.resize(iconSizeXY,iconSizeXY);
   image(faceLogo,iconThreeX-iconSizeXY/2, iconThreeY-iconSizeXY/2);  
   fill(#ec8f0a);
   rect(iconFourX, iconFourY, iconSizeXY,iconSizeXY,10);
   fill(#ec8e01);
   arbnuLogo.resize(iconSizeXY,iconSizeXY);
   image(arbnuLogo,iconFourX-iconSizeXY/2, iconFourY-iconSizeXY/2);

  rectMode(CORNER);

  if(!scrollLock){
  if (mousePressed) { //instagram button
   if(mouseX > instaLockX1 && mouseX < instaLockX2 && mouseY > instaLockY1 && mouseY < instaLockY2 ){
     captureTime = millis();
     page2 = false;
     page5 = true; 
     captureTime=millis();
  }                  //messenger button
   else if(mouseX > mesLockX1 && mouseX < mesLockX2 && mouseY > mesLockY1 && mouseY < mesLockY2 ){
     captureTime = millis();
     page2 = false; 
     page4 = true;
     captureTime=millis();
     captureTimeMess= millis();
  }                  //facebook button
   else if(mouseX > faceLockX1 && mouseX < faceLockX2 && mouseY > faceLockY1 && mouseY < faceLockY2 ){
     captureTime = millis();
     page2 = false;
     page3 = true; 
     captureTime=millis();
     
  }                  //arbejdnu
   else if(mouseX > arbnuLockX1 && mouseX < arbnuLockX2 && mouseY > arbnuLockY1 && mouseY < arbnuLockY2 ){
     page2 = false;
     page11 = true;
     captureTime=millis();
      
 }}
   

  }
}
