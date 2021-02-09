




void messenger0 () {
  
  
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
  int mesBlue = #C8EEF9;
  
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
  fill(#ffffff);
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
      captureTime=millis();
   }
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= rectY+dividSpace+scrollM) &&(mouseY <= (rectY+dividSpace+rectHeight+scrollM))&&(currentTimeMess>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = true;
      page8 = false;
      page9 = false;
      page10 = false; 
      captureTime=millis();
   }
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= ((rectY+dividSpace*2)+scrollM))&&(mouseY <= (rectY+dividSpace*2)+rectHeight+scrollM)&&(currentTimeMess>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = false;
      page8 = true;
      page9 = false;
      page10 = false; 
      captureTime=millis();
   } 
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >=((rectY+dividSpace*3))+scrollM)&&(mouseY <=((rectY+dividSpace*3)+rectHeight+scrollM))&&(currentTimeMess>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = false;
      page8 = false;
      page9 = true;
      page10 = false; 
      captureTime=millis();
   } 
    if  ((mousePressed==true)&&(mouseX >= third)&&(mouseX <= third+rectWidth)&&(mouseY >= ((boxHeightY1+(dividSpace*4))+scrollM))&&(mouseY <= (rectY+dividSpace*4)+rectHeight+scrollM)&&(currentTimeMess>millisLock2)){
      page4 = false;
      page6 = false; 
      page7 = false;
      page8 = false;
      page9 = false;
      page10 = true; 
      captureTime=millis();
   }

  }}
  
  noStroke();
  fill(mesBlue);
  rect(0,homeBar,width,height-homeBar);
  
   topbar();
   
 //Homebutton
 homebutton();  
   
}
