




void messenger2() {
  
  
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
  
  int messengerColor = #C8EEF9;
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
  int backButton=#2E3031;
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
  float messW = width/1.7;
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
  fill(#ffffff);
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
