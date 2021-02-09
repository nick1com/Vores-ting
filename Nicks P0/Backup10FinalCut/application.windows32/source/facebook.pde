




void facebook() {
  
  
 //#############################scroll Funktion##################################//

  scrollF=scrollYFace*sSpeed;
  
  if(!scrollLock){
    
    if(scrollF<=-819){
     scrollYFace=scrollYFace+4;
    }


     if(scrollF>=19){
     scrollYFace=scrollYFace-4;
     }
   }

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
   int facebookBlue = #4267B2;
   int gray = #C6C6C6;
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


  scrollF=scrollYFace*sSpeed;

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
  fill (#FFFFFF);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  
   

  
  
  //topbar
  topbar();


 //Homebutton
 homebutton();  

   
}
