




void messengerGroup() {
  
     
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
  
  int messengerColor = #C8EEF9;
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
  fill(#ffffff);
  noStroke();
  rect(0,botbarY,width,height-botbarY);
  
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
