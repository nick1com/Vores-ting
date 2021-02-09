




void messenger3() {
  
    
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
  
  int messengerColor = #C8EEF9;
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
