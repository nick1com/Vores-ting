




void messenger4() {
 
  
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
  
  int messengerColor = #C8EEF9;
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
