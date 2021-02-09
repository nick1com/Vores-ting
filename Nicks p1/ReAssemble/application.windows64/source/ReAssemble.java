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

public class ReAssemble extends PApplet {

//Call class and name for object
Box instructionFrame;

public void setup() {
  
//size(800,800);
//fullScreen();
  
object_values();
Classes();
variables();
pitcures();
startUp0(); 
startUp(); 
startUp2();
startUp3();
startUp4();

}

public void draw() {

//These switch case statements check which page you are on, 
//depending which value the variable pageCounter is on.   

//Also this should be the only thing in the main draw loop.

switch(pageCounter) {
 
case 0: //frontpage
drawFrontpage();

break;



case 100:
introScene();
break;





case 1: //Shaman Scene
background5();
shamanDetect();
shamanE();
convoOne();
movement();
Character();
break;

case 2: // Loading Screen 1
LoadingScreenOne();
break;





//----------------------Quest_1------------------------//


case 10:
backmove=4;
Scene2();
break;

//----------------------Loading_Screen2------------------------//


case 11:
LoadingScreenTwo();
break;




//----------------------Quest_2------------------------//



case 12:
Scene3();
break;







//----------------------Loading_Screen3------------------------//


case 13:
LoadingScreenThree();
break;





//----------------------Quest_3------------------------//



case 14:
TreesCut = TreesCut1 + TreesCut2;
Scene4();
break;







//----------------------Endings------------------------//



case 40:
image(Forrest2Sky,0,0,width,height);
 ButtonForEndChoiceHome();
 Buy_the_forest.display();
 if(TreesCut < 6) {
 Settle_down_in_the_forest.display();
 }
 if(TreesCut == 0) {
 Refuse_to_buy_the_forest.display();
 }
break;

case 41:
ending();
break;
}
}
//---------------------------------------------------------------------//


public void Scene2() {
    backmove=4;

  
  background2Far();
  scene2Trees();
  background2Clo();
  Main.movementDirection();
  movementB2();
  Choice2();

  if(movement+moveClo>=5600){
    pageCounter = 11;
    convoCounter = 12;
    movement=2;
    moveFar=2;
    moveMid=2;
    moveClo=2;
    backmove=4;

  }
}

//---------------------------------------------------------------------//


public void Scene3() {

  background3Far();
  scene3Trees();
  background3Clo();
  movementB3();
  Main.movementDirection();
  
  if(movement+moveClo>=5600){
    pageCounter = 13;
    convoCounter = 14;
    movement=2;
    moveFar=2;
    moveMid=2;
    moveClo=2;
    backmove=4;
    Choice3();

  }
  
}


//---------------------------------------------------------------------//


public void Scene4() {  

  backgroundFar4();
  Trees4(width);
  background4Clo();
  relic(width/2-10);
  movementB4();
  Main.movementDirection();
  if(use){
 if(movement+moveClo<=1950 && movement+moveClo>=1680){
   pageCounter = 40;
   convoCounter = 40;
 }}
}
//---------------------------------------------------------------------//


public void Choice2() {
  if (use1 || use2 || use3) { 
    TreesCut1=1; RightChoice2=true;
  }
  if (use2 && use3 || use1 && use3 || use1 && use2) { 
    TreesCut1=2; RightChoice2=false;
  }
  if (use1&&use2&&use3) { 
    TreesCut1=3; RightChoice2=false;
  }
}


//---------------------------------------------------------------------//


public void background2Far() {
  for (int i = -1; i <= 10; i++) {    
    image(backgroundFar2, i*width-moveFar, 0);
    image(backgroundMid2, i*width-moveMid, 0);
  }
}


//---------------------------------------------------------------------//


public void background2Clo() {
  for (int i = -1; i <= 10; i++) {    
    image(backgroundClo2, i*width-moveClo, 0);
  }
}


//---------------------------------------------------------------------//


public void movementB2() {
  Main.moveJump();
  Main.moveJump();
  Main.moveMent(0, 1728, 0, 1760); //  minR maxR minL maxL   
  Main.moveMent(1808, 3008, 1888, 3040);         
  Main.moveMent(3152, 4288, 3168, 4336);
  Main.moveMent(4448, 10240, 4480, 10317);
  
  if (use1||personY <=-360) {
    {   
      Main.moveMent(1728, 1837, 1760, 1888);
    }
  }
  if (use2||personY <=-360) {
    Main.moveMent(3008, 3168, 3008, 3168);
  }

  if (use3||personY <=-360) {
    Main.moveMent(4288, 4480, 4336, 4480);
  }

}


//---------------------------------------------------------------------//



public void scene2Trees() {
  tree1();
  tree2();
  tree3();
}


//---------------------------------------------------------------------//


public void tree1() {
  B2T1.display(treeCut, width);
  if (!use1) {
    B2T1.display(treeFull, width);
  }

  cutB2T1(1664, 1760, 1856,1968);
}


//---------------------------------------------------------------------//


public void tree2() {
  B2T2.display(treeCut, (2*width));
  if (!use2) {
    B2T2.display(treeFull, (2*width));
  }

  cutB2T2(2896, 3040, 3168, 3232);
}


//---------------------------------------------------------------------//


public void tree3() {
  B2T3.display(treeCut, (3*width));
  if (!use3) {
    B2T3.display(treeFull, (3*width));
  }

  cutB2T3(4224, 4320, 4432, 4538);
}







 //----------------------------------------------------------------------B2_USE-----------------------------------------------------------------------------------------------------------------//  


public void cutB2T1(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
  int minL=minLTemp;
  int maxL=maxLTemp;
  int minR=minRTemp;
  int maxR=maxRTemp;

  if (use) {
    if (movement+moveClo>=minL && movement+moveClo<= maxL ) {
      use1=true; 
    } else if (movement+moveClo<=maxR && movement+moveClo>=minR) { 
      use1=true; 
    }
  }
}


//---------------------------------------------------------------------//


public void cutB2T2(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
  int minL=minLTemp;
  int maxL=maxLTemp;
  int minR=minRTemp;
  int maxR=maxRTemp;

  if (use) {
    if (movement+moveClo>=minL && movement+moveClo<= maxL ) {
      use2=true; 
    } else if (movement+moveClo<=maxR && movement+moveClo>=minR) { 
      use2=true; 
    }
  }
}


//---------------------------------------------------------------------//


public void cutB2T3(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
  int minL=minLTemp;
  int maxL=maxLTemp;
  int minR=minRTemp;
  int maxR=maxRTemp;

  if (use) {
    if (movement+moveClo>=minL && movement+moveClo<= maxL ) {
      use3=true; 
    } else if (movement+moveClo<=maxR && movement+moveClo>=minR) { 
      use3=true; 
    }
  }
}
public void Choice3() {
  if (use4 || use5 || use6) { 
    TreesCut2=1; 
  }
  if (use4 && use5 || use4 && use6 || use5 && use6) { 
    TreesCut2=2; 
  }
  if (use4&&use5&&use6) { 
    TreesCut2=3; 
  }
}







//---------------------------------------------------------------------//


public void background3Far() {
  if (RightChoice2) {

    for (int i = -1; i <= 10; i++) {    
      image(backgroundFar2, i*width-moveFar, 0);
      image(backgroundMid2, i*width-moveMid, 0);
    }
  }
  if (!RightChoice2) {
    for (int i = -1; i <= 10; i++) {    
      image(backgroundFar3, i*width-moveFar, 0);
      image(backgroundMid3, i*width-moveMid, 0);
    }
  }
}

public void background3Clo() {
  for (int i = -1; i <= 10; i++) {    
    image(backgroundClo3, i*width-moveClo, 0);
  }
}

public void movementB3() { 
  Main.moveJump();
  Main.moveJump();
  Main.moveMent(0, 1728, 0, 1760); //  minR maxR minL maxL   
  Main.moveMent(1808, 3008, 1888, 3040);         
  Main.moveMent(3152, 4288, 3168, 4336);
  Main.moveMent(4448, 10240, 4480, 10317);
  if (use4||personY <=-360) {
    {   
      Main.moveMent(1728, 1837, 1760, 1888);
    }
  }
  if (use5||personY <=-360) {
    Main.moveMent(3008, 3168, 3008, 3168);
  }

  if (use6||personY <=-360) {
    Main.moveMent(4288, 4480, 4336, 4480);
  }}



  //---------------------------------------------------------------------//


  public void scene3Trees() {
    tree4();
    tree5();
    tree6();
  }


  //---------------------------------------------------------------------//


  public void tree4() {
    B2T4.display(treeCut, width);
    if (!use4) {
      B2T4.display(treeFull, width);
    }

    cutB2T4(1664, 1760, 1856,1968);
  }


  //---------------------------------------------------------------------//


  public void tree5() {
    B2T5.display(treeCut, (2*width));
    if (!use5) {
      B2T4.display(treeFull, (2*width));
    }

    cutB2T5(2896, 3040, 3168, 3232);
  }


  //---------------------------------------------------------------------//


  public void tree6() {
    B2T6.display(treeCut, (3*width));
    if (!use6) {
      B2T6.display(treeFull, (3*width));
    }

    cutB2T6(4224, 4320, 4432, 4538);
  }
  
  
  
  
 //----------------------------------------------------------------------B3_USE-----------------------------------------------------------------------------------------------------------------//  

public void cutB2T4(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
  int minL=minLTemp;
  int maxL=maxLTemp;
  int minR=minRTemp;
  int maxR=maxRTemp;

  if (use) {
    if (movement+moveClo>=minL && movement+moveClo<= maxL ) {
      use4=true; 
    } else if (movement+moveClo<=maxR && movement+moveClo>=minR) { 
      use4=true; 
    }
  }
}


//---------------------------------------------------------------------//


public void cutB2T5(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
  int minL=minLTemp;
  int maxL=maxLTemp;
  int minR=minRTemp;
  int maxR=maxRTemp;

  if (use) {
    if (movement+moveClo>=minL && movement+moveClo<= maxL ) {
      use5=true; 
    } else if (movement+moveClo<=maxR && movement+moveClo>=minR) { 
      use5=true; 
    }
  }
}


//---------------------------------------------------------------------//


public void cutB2T6(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
  int minL=minLTemp;
  int maxL=maxLTemp;
  int minR=minRTemp;
  int maxR=maxRTemp;

  if (use) {
    if (movement+moveClo>=minL && movement+moveClo<= maxL ) {
      use6=true;
    } else if (movement+moveClo<=maxR && movement+moveClo>=minR) { 
      use6=true; 
    }
  }
}
  
  
public void backgroundFar4() {
  if (TreesCut >= 6 ) {
    for (int i = -1; i <= 10; i++) {    
      image(backgroundFar4, i*width-moveFar, 0);
      image(backgroundMid4, i*width-moveMid, 0);
    }
  }
  if (TreesCut < 6 && TreesCut>0) {

    for (int i = -1; i <= 10; i++) {    
      image(backgroundFar3, i*width-moveFar, 0);
      image(backgroundMid3, i*width-moveMid, 0);
    }
  }
  if (TreesCut <= 0) {
    for (int i = -1; i <= 10; i++) {    
      image(backgroundFar2, i*width-moveFar, 0);
      image(backgroundMid2, i*width-moveMid, 0);
    }
  }
}


//---------------------------------------------------------------------//


public void background4Clo() {
  if (TreesCut >=6){
  for (int i = -1; i <= 10; i++) {    
    image(backgroundClo4, i*width-moveClo, 0);
  }}
  if(TreesCut < 6){
  for (int i = -1; i <= 10; i++) {    
    image(backgroundClo2, i*width-moveClo, 0);
  }}
  
  
}


//---------------------------------------------------------------------//

public void Trees4(int tempX){
  
int  x=tempX;
if(TreesCut<= 0){
B2T7.display(treeGood,x);
}
if(TreesCut >= 6 ){
//rød
B2T7.display(treeBad,x);
}
if(TreesCut <6 && TreesCut>0){
//orange
B2T7.display(treeOkay,x);
}



}


public void relic(int tempX){
  int x=tempX-moveClo;
  
  image(relic,x,-50);
  
}


public void movementB4() {
  
    Main.moveJump();
    Main.moveJump();
    Main.moveMent(0, 4000, 0, 4020);


  
}
public void ChooseEnding() {

//Baddest ed  
switch(ChoiceValue){

//--------------------------------If 6 Trees Cut you get the bad ending------------------------------------------------//
  
case 6:
if(treeIncrement == 0) {
TreesCutForEndings = 0;
println(ChoiceValue, " ", "Case 6", " ", "treeIncrement", treeIncrement );
treeIncrement = 1;
}
else if (treeIncrement == 1) {
TreesCutForEndings = 1;
println(ChoiceValue, " ", "Case 6", " ", "treeIncrement", treeIncrement );
treeIncrement = 2;
}
else if (treeIncrement == 2) {
TreesCutForEndings = 2;
println(ChoiceValue, " ", "Case 6", " ", "treeIncrement", treeIncrement );
treeIncrement = 3;
}
else if (treeIncrement == 3) {
exit();
}
break;



//--------------------------------If 0 Trees Cut you get the good ending------------------------------------------------//

case 0:
if (treeIncrement == 0) {
TreesCutForEndings = 3;
treeIncrement = 1;
}

else if (treeIncrement == 1) {
TreesCutForEndings = 4;
treeIncrement = 2;
}

else if (treeIncrement == 2) {
TreesCutForEndings = 5;
treeIncrement = 3;
}


else if (treeIncrement == 3) {
exit();
}
break;


//--------------------------------If anything from 5 to 1 Trees Cut you get the medium ending------------------------------------------------//

case 10:
if (treeIncrement == 0) {
TreesCutForEndings = 6;
treeIncrement = 1;
}

else if (treeIncrement == 1) {
TreesCutForEndings = 7;
treeIncrement = 2;
}

else if (treeIncrement == 2) {
exit();
}
break;
}


}
//---------------------------------------------------------------------//


class Characters {
  float jump, jumpSpeed, jumpHeight, gravity;
  float y;
  int x, h, w, imageX;
  boolean groundLevel;



  Characters() {


    x=personX+movement;  
    jump=0;
    jumpSpeed=-24;
    jumpHeight=-150;
    gravity=-0.50f;
    groundLevel=true;
    y=personY;
    h=100;
    w=24;
  }


  //---------------------------------------------------------------------//


  public void moveMent(int minRtemp, int maxRtemp, int minLtemp, int maxLtemp) {
    int minR =minRtemp;
    int minL = minLtemp;
    int maxR = maxRtemp;
    int maxL = maxLtemp;
    moveCounter();
    moveRight(minR, maxR);
    moveLeft(minL, maxL);   
  //  moveJump();
    y=personY;
  }


  //---------------------------------------------------------------------//


  public void   mainChar1(PImage mainPicUse) {
    imageX=-60;
    x=personX+movement; 
    y=personY;
    image(mainPicUse, x+imageX, personY);
  }


  //---------------------------------------------------------------------//


  public void movementDirection() {

    if (moveRight) {
      mainChar1(Guy1GhostNew);
    }
    if (moveLeft) {
      mainChar1(Guy1GhostReverse);
    }
  }






  //---------------------------------------------------------------------//


  public void moveMent2() {
    moveRight(0, width*15);
    moveLeft(0, width*15);   
    //    moveJump(0, width*15);
  }


  //--------------------------------------------------------------int minTemp, int maxTemp-------//


  public void moveRight(int minTemp, int maxTemp) {
    int Min = minTemp;
    int Max = maxTemp;


    if (Right && movement+moveClo>=Min && movement+moveClo<=Max) { 
      moveRight=true;
      moveLeft=false;

      if (movement <= width*4/10) {
        movement+=backmove*4;
      }

      if (movement >=width*4/10) {   
        moveFar+=backmove*2;
        moveMid+=backmove*3;
        moveClo+=backmove*4;
      }
    }
  }


  //---------------------------------------------------------------------//


  public void moveLeft(int minTemp, int maxTemp) {

    int Min = minTemp;
    int Max = maxTemp;
    if (Left && movement+moveClo>Min && movement+moveClo<Max) {   
      moveRight=false;
      moveLeft=true;
      if (movement>= backmove*4 && moveClo<=backmove*4) {
        movement-= backmove*4;
      }

      if (moveClo >= backmove*4) {
        moveFar-=backmove*2;
        moveMid-=backmove*3;
        moveClo-=backmove*4;
      }
    }
  }

  public void moveCounter() {
    if (Right && Left) {
    }
    if (!Right && !Left) {
    }
  }

  //---------------------------------------------------------------------//


  public void moveJump() {

    if (personY>=personYOrig) {

      personY=personYOrig;
      jump=0;
      groundLevel=true;
    }

    if (upJump) {
      if (groundLevel) {
        jump=jumpSpeed;
        groundLevel=false;
      }
    }

    if (!groundLevel) {
      jump-=gravity;
    }

    personY+=jump;
    y=personY;
  }
}
class Tree {
  Tree() {
  }


  public void display(PImage treePicTemp, int treeXtemp) {
    PImage treePic = treePicTemp;
    int treeX=treeXtemp-moveClo;

    image(treePic, treeX, 0);
  }
}

//------------------------------------------------------drawFrontpage-----------------------------------------------------------------//


public void drawFrontpage() {
  image(frontpage_forrest, zero, zero);
  strokeWeight(10);
  
  instructionFrame = new Box (blackColour, palegoldenrod, mainframeX, mainframeY*0.92f, mainframeW, mainframeH);

  image(Controls, controlsW, controlsH);
  
 
  image(Enter, ButtonXpos, zero);
  
  if (mouseX>=StartbuttonX && mouseX<=StartbuttonXW && mouseY>=StartbuttonY && mouseY<StartbuttonYH){
  image(EnterWhite, ButtonXpos, zero);
}
  
  image(Exit, ButtonXpos, zero);
  
  if (mouseX>=ExitbuttonX && mouseX<=ExitbuttonXW && mouseY>=ExitbuttonY && mouseY<ExitbuttonYH) {
  image(ExitWhite, ButtonXpos, zero);

}
}




//------------------------------------------------------Box Class-----------------------------------------------------------------//





// Class made for creating diffrent boxes e.g. rect in this senario.

class Box {
  float x, y, w, h;
  
  String Boxname;
  
  int stroke, fill;
  
  //calls what the box class requires of constructors to create a new box
  Box(int boxstroke, int boxfill, float x, float y, float w, float h) {  
  rectMode(CENTER);
  stroke(boxstroke);
  fill(boxfill);
  rect(x, y, w, h);
 
    
  }
}  
//Detect if player is within area of interaction, and if the e key is pressed.
//

public void shamanE() {
if(movement >= ShamanDetection){
  if (keyPressed) {
    if (key == 'e') {
      convoCounter = 1;
      backmove=0;
}
}
}
}


//Detect if shaman is within area of interaction, and if the e key is pressed.
//dispalys E symbol.

public void shamanDetect() {
 if(movement >= ShamanDetection){
  noStroke();
  fill(255);
  rectMode(CENTER);
  rect(width*0.625f,height*0.62f,height/8,height/8);
  fill(0);
  textSize(width/22);
  text("E",width*0.61f,height*0.65f);
 }

}


//-------------------------------------------------------------------------------------------------------//

//this is a switch case deciding what to display in the first conversation with the shaman.
//it all so gives back the player his movement if the player declines.

public void convoOne() {
  
  
switch(convoCounter) {
case 0:// nothing has happend yet
 backmove=4;
break;


case 1: // start convo
fill(255);
  rect(width*0.68f,height*0.61f,width/2,height/5); 
  fill(0);
   textSize(width/80);
  text("Hello stranger, I hear you are interested in buying our forest...",width*0.47f,height*0.5875f);
  text("I might be able to help you, you just have to prove that you are worthy.",width*0.47f,height*0.6125f);
  text("If you can find your way through … we will sell you the forest and leave.",width*0.47f,height*0.6375f);
  text("What do you say?",width*0.47f,height*0.6625f);
  fill(155);
  rect(width*0.65f,height*0.66f,width/12,height/40);
  rect(width*0.75f,height*0.66f,width/12,height/40);
  fill(0);
  textSize(width/120);
  text("ACCEPT",width*0.63f,height*0.66875f);
  text("DECLINE",width*0.73f,height*0.66875f);

break;

case 2: //you agree 
  background5();
 fill(255);
  rect(width*0.65f,height*0.61f,width/4,height/5); 
  fill(155);
  rect(width*0.65f,height*0.66f,width/12,height/40);
  fill(0);
  textSize(width/80);
  text("Great, see you on the other side.",width*0.55f,height*0.5875f);
  textSize(width/120);
  text("DONE",width*0.635f,height*0.66875f);

break;

case 3://dissagre, boss calling 
background(0);
  fill(255);
  rect(width*0.65f,height*0.61f,width/2,height/5); 
  fill(155);
  rect(width*0.65f,height*0.66f,width/12,height/40);
  fill(0);
  textSize(width/80);
  text("*Boss calling*: Why have you still not secured the forest?!",width*0.47f,height*0.587f); 
  text("Do I need to remind you how important this is for our company!",width*0.47f,height*0.6075f);
  text("GET IT DONE! *hangs up*",width*0.47f,height*0.63f);
  textSize(width/120);
  text("OK",width*0.64f,height*0.66875f);

break;


}


}
public void keyPressed() {

  if (key == 'd' || keyCode == RIGHT) {
    Right=true;
  }
  
  if (key == 'a' || keyCode == LEFT) {
    Left=true;
  }

  if (key == 'w' || keyCode == UP || key == ' ') {
    upJump=true;
  }
  if (key == 'e' ) {  
    use=true;
  }
}


public void keyReleased() {

  if (key == 'd' || keyCode == RIGHT) {
    Right=false;
  }

  if (key == 'a' || keyCode == LEFT) {
    Left=false;
  }

  if (key == 'w' || keyCode == UP || key == ' ') {
    upJump=false;
  }
  if (key == 'e' ) {  
    use=false;
  }
}


public void movement(){
    if(jump>=-2){
    jumpSpeed=0;
    connected=true;
    
    
    }
  
  if(Right){   
    moveFar=moveFar-backmove*2;
    moveMid=moveMid-backmove*3;
    moveClo=moveClo-backmove*4;
    
    moveRight=true;
    moveLeft=false;
    
    
   if(movement <= width * ShamanHouseoffset) {
     movement=movement+backmove*2;
   }}
 
   
  if(Left){   
      moveRight=false;
      moveLeft=true;
    
    if( movement > 2 ) {
      movement=movement-backmove*2;
    
    }}
}



public void mainChar1(PImage mainPicUse,float mainStartX){
   
  image(mainPicUse,mainStartX,personY);
    
  }

public void Character(){

      
  if(moveRight){
  mainChar1(characterMain,personX+movement);

  }
  if(moveLeft){
  mainChar1(characterMainRev,personX+movement);
  }
}
//used to detect clicks
//the switch case in the mouseClicked void decides which click funtions to use.
//This is donme so that you cant accidentally click on thing from an onther scene,
//that you are currently not in.
public void mouseClicked(){
  switch(pageCounter) {
  case 0:
  FrontpageMouseClicked(); //frontpage clicks //go to Over_All_Sceen_Selection_Structure tab to find function
  break;
  
  case 1:
  SceneSelecter(); //frontpage clicks //go to Over_All_Sceen_Selection_Structure tab to find function
  break;
  
  
  case 100:
  SceneSelecter();
  break;
  
  case 11:
  SceneSelecter();
  break;
  
  
  case 13:
  SceneSelecter();
  break;
  
  case 15:
  SceneSelecter();
  break;
  
  
  case 2:
  SceneSelecter();
  break;
  
  case 40:
  Buy_the_forest.Buy_the_forestVOID();
  Settle_down_in_the_forest.Settle_down_in_the_forestVOID();
  Refuse_to_buy_the_forest.Refuse_to_buy_the_forestVOID();
  ChooseEnding();
  break;
  
  case 41:
  ChooseEnding();
  break;
  
  }
 
}
//------------------------------------------FrontpageMouseClicked-------------------------------------------------------------//



public void FrontpageMouseClicked(){
   
    //If the mouse is clicked and the mouse is within the area the program will enter next page.  
    
  if (mouseX>=StartbuttonX && mouseX<=StartbuttonXW && mouseY>=StartbuttonY && mouseY<StartbuttonYH) {
       pageCounter = 100; 
       convoCounter = 100; 
    
}
    
  
  //If the mouse is clicked and the mouse is within the area the program will exit.
  
  if (mouseX>=ExitbuttonX && mouseX<=ExitbuttonXW && mouseY>=ExitbuttonY && mouseY<ExitbuttonYH){
  exit();  
  
  
}
}


//------------------------------------------First_Convo-------------------------------------------------------------//



public void SceneSelecter()  {

switch(convoCounter) { 

//screen before sharman house
case 100: 
pageCounter = 1;
convoCounter = 0;
break;
  
  
//Shaman convo getting you to next loading scene or leaving you in this scene  

case 0: //nothing is displayed in shaman conversation
convoCounter = 0;
break;

case 1: //this is the option to say yes or no to the journey in the shaman scene
if (mouseX>=width*0.5875f && mouseX<=width*0.6625f && mouseY>=height*0.625f && mouseY<=height*0.6875f){
  convoCounter = 2;
}
else if(mouseX>=width*0.710f && mouseX<=width*0.792f && mouseY>=height*0.625f && mouseY<=height*0.6875f){
  convoCounter = 3;
}
break;

case 2: //this is the loadingscreen before quest 1
if (mouseX>=width*0.5875f && mouseX<=width*0.6625f && mouseY>=height*0.6375f && mouseY<=height*0.675f){ //
pageCounter = 2;
convoCounter = 10;
}
break;

case 3: //this is when the player refuses the quest
if (mouseX>=width*0.5875f && mouseX<=width*0.6625f && mouseY>=height*0.6375f && mouseY<=height*0.675f){
convoCounter = 0;
}
break;


case 10:
pageCounter = 10;
break;

case 12:
pageCounter = 12;
break;

case 13:
pageCounter = 13;
break;


case 14:
pageCounter = 14;
break;


case 40: 
pageCounter = 40;
break;



}

}




//------------------------------------------SceneSelecter-------------------------------------------------------------//

public void potionClick1() {
pageCounter = 40;
}
public void introScene() {
image(BossOffice,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);

}

public void LoadingScreenOne() {
image(LoadingYellow,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);
    movement=2;
    moveFar=2;
    moveMid=2;
    moveClo=2;
    backmove=4;
}

public void LoadingScreenTwo() {
image(LoadingBlue,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);
   
}

public void LoadingScreenThree() {
image(LoadingRed,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);
}



public void ButtonForEndChoiceHome() {
  rectMode(CENTER);
  fill(BlueSpiritBorder);
  rect(width/2, height/10, width, height/10);
  textAlign(CENTER);
  fill(BlueSpiritText);
  strokeWeight(1);
  stroke(0);
  textSize(EndingmainscreentextSize);
  text("What do you do with the essence of the relic?", (width/2)+1, (height*2/3)+1, width/3*5, height*12/10);
  rectMode(CORNER);

  rectMode(CENTER);
  stroke(BlueSpiritBorder);
  strokeWeight(10);
  fill(BlueSpiritBorder);
  rect(EndingmainframeX, EndingmainframeY, EndingmainframeW, EndingmainframeH);
  rectMode(CORNER);

}

















class EndingButton {

  float x;
  float y;
  float EndingbuttonNumber;

  float grow = 1;

  String Endingbuttontext;
  boolean exit;
  public int scene;
  
  EndingButton(float EndingbuttonNumber, String Endingbuttontext) { // float og string er parameter til constucten

    this.EndingbuttonNumber = EndingbuttonNumber;
    x = EndingmainframeX;
    y = EndingmainframeY*0.5f * (0.4f + 0.8f * EndingbuttonNumber);
    this.Endingbuttontext=Endingbuttontext; //this er referance til classen som jeg har refereret til i linje 5 (this = linje 5 i dette tilfælde) (parameteret er defineret i linje 14)

   

  }






  public void display() {
    // boolean hvis det under går i opfyldelse --> set grow 1.01 ellers sæt til 1
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
      grow = 1.01f;
    } else grow = 1;      

    if (mousePressed && mouseButton == LEFT && mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {

      grow = 0.99f;
      CurrentButtonColour = EndingstartButtonColour2;
    } else CurrentButtonColour = EndingStartButtonColour;
   




    stroke(1);
    strokeWeight(1);
    fill(CurrentButtonColour);
    rectMode(CENTER);
    rect(x, y, (width*3/4) * grow, (EndingmainframeY/3) * grow);
    displayText();
    rectMode(CORNER);
      
  }

  public void displayText() {

    textAlign(LEFT);
    fill(BlueSpiritText);
    textSize((EndingmainscreentextSize)*grow*grow); // fjern hardcoding
    text(Endingbuttontext, width/6-20, y+20);
  }






  public void Buy_the_forestVOID() {
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
      
        ChoiceValue = 6;
        println("t", " ",ChoiceValue);
         //PatchWork++;
         pageCounter = 41;
   
    }
  }
  public void Settle_down_in_the_forestVOID() {
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
     
        ChoiceValue = 10;
        println("t", " ",ChoiceValue);
         //PatchWork++;
         pageCounter = 41;
    }
   }

  public void Refuse_to_buy_the_forestVOID() {
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
     
        ChoiceValue = 0;
        println("t", " ",ChoiceValue);
         //PatchWork++;
        pageCounter = 41;
    }
   }
} 
















int EndingmainframeX;
int EndingmainframeY;
int EndingmainframeW;
int EndingmainframeH;
float EndingmainscreentextSize;  
  
public void Endingmainframe() {
  
  
  EndingmainframeX = width/2;
  
  EndingmainframeY = height/2;
  
  EndingmainframeW = width*8/10;
  
  EndingmainframeH = height*2/3;

  EndingmainscreentextSize  = 0.035f*width;
}
//counts what "page" the program is on.
//it is important that it is pulic if it is needed somewhere out of normal scope.
public int pageCounter = 0;
//this is used to count what awnser in a convo in the individual scene is to be proceded to and displayed.
int convoCounter = 0;







//The following is used for the shaman page
int GoodOrBad = 0;

boolean upJump = false;

boolean Right = false;

boolean Left = false;

boolean moveRight=true;

boolean moveLeft=false;

boolean connected=true;

float ShamanDetection;

float jump=0;
float jumpSpeed=6;

float ShamanHouseoffset=0.62f;

int personX;
float personY;

float ShamanX;
float ShamanY;
float Etext=width/13.33f;


//The following is used for the frontpage
int backgroundColour = 0xff00755e; 
int jungleVinesColour = 0xff92ca7e;
int startButtonColour = 0xff0c2d12;
int goldColour = 0xffFFD700;
int palegoldenrod = 0xffEEE8AA;
int titleColour = 0xff0028ff;
int blackColour = 0xff000000;

int grow = 105; // not in use currently
int zero = 0; // #mightbeoverkill


int mainframeX, mainframeY, mainframeW, mainframeH;

int controlsXscale, controlsYscale, controlsW, controlsH;

float mainscreentextSize;  

float ButtonXpos;  


  // Floats used to track Startbutton "area".
float StartbuttonX, StartbuttonY, StartbuttonXW, StartbuttonYH;

  
  // Floats used to track Exitbutton "area".
float ExitbuttonX, ExitbuttonY, ExitbuttonXW, ExitbuttonYH;











//-----------------------------------------------Endings----------------------------------------------------------------//
int TreesCut1 = 0;
int TreesCut2 = 0;
int TreesCut = 0;
int TreesCutForEndings = 0;
int treeIncrement = 0;
int ChoiceValue;


int EndingbackgroundColour = 0xff6ac7ed;
int BlueSpiritBorder = 0xff6ae7ed;
int CurrentButtonColour;
int EndingStartButtonColour = 0xff6ac7ed;
int EndingstartButtonColour2 = 0xff6aedd2;
int BlueSpiritText = 0xffcbf5f7;
int Endingpalegoldenrod = 0xffaef2f5;
int EndingtitleColour = 0xff6aedd2;


EndingButton Buy_the_forest;
EndingButton Settle_down_in_the_forest;
EndingButton Refuse_to_buy_the_forest;

int HeightOfContinueText = ((height * 65)/100);

int colorOfContinueText = 0xffd62020;


//fjern når det bliver sat sammen med hovedprogram
int PatchWork = 0;





//-----------------------------------------------NICKS----------------------------------------------------------------//





//---------------------------------------------------------------------//


public void Classes() {
  B2T1 = new Tree();
  B2T2= new Tree();
  B2T3 = new Tree();
  B2T4= new Tree();
  B2T5 = new Tree();
  B2T6= new Tree();
  B2T7 = new Tree();
  B2T8 = new Tree();
  Main = new Characters();

  
}


//---------------------------------------------------------------------//


public void variables() {

  personX = 0;
//  personY=20;
  personY = (-1*(height*0.0575f));
  personW=20;
  personH=93;
  personYOrig = (-1*(height*0.0575f));
  personsizeX=width/10;
  personsizeY=height/4;
}


//---------------------------------------------------------------------//



Tree B2T1;
Tree B2T2;
Tree B2T3;
Tree B2T4;
Tree B2T5;
Tree B2T6;
Tree B2T7;
Tree B2T8;

Characters Main; 



int personW;
int personH;
float personYOrig;
int personsizeX;
int personsizeY;

public int movement=2;
public int moveFar=2;
public int moveMid=2;
public int moveClo=2;
public int backmove=4;

boolean use=false;
boolean use1=false;
boolean use2=false;
boolean use3=false;
boolean use4=false;
boolean use5=false;
boolean use6=false;

boolean RightChoice2=true;
boolean reset=false;
//-------------------------------------startUp000-------------------------------------------------//
public void startUp0() {
BossOffice = loadImage("BossOffice.png");
  BossOffice.resize(width, height);
}





//-------------------------------------startUp-------------------------------------------------//

public void startUp() {

  frontpage_forrest = loadImage("frontpage_forrest.png");
  frontpage_forrest.resize(width, height);
  Controls = loadImage("Controls.png");
  Controls.resize(controlsXscale, controlsYscale);

  //The button images.
  Enter = loadImage("Enter.png");
  Enter.resize(width, height);
  EnterWhite = loadImage("EnterWhite.png");
  EnterWhite.resize(width, height);
  
  Exit = loadImage("Exit.png");
  Exit.resize(width, height);
  ExitWhite = loadImage("ExitWhite.png");
  ExitWhite.resize(width, height);



}



//----------------------------------------startUp2----------------------------------------------//



public void startUp2() {
  ShamanX=(-1*(width/4));
  ShamanY=(-1*(height/10));
  personY=(-1*(height/12));
  ShamanDetection=width*0.35f;
  characterMain=loadImage("Guy1Normal.png");
  characterMainRev=loadImage("Guy1Reverse.png");
  
  backgroundClo2=loadImage("GroundForest1.png");
  background5=loadImage("ShamanHouseAlt.png");
  shaman=loadImage("Shaman1Alt.png");


  characterMain.resize(width,height);
  characterMainRev.resize(width,height);

  backgroundClo2.resize(width, height);
  background5.resize(width,height);
  shaman.resize(width,height);
}



//----------------------------------------startUp3----------------------------------------------//




public void startUp3() {
LoadingYellow = loadImage("LoadingYellow.png");
LoadingYellow.resize(width,height);

LoadingBlue = loadImage("LoadingBlue.png");
LoadingBlue.resize(width,height);

LoadingRed = loadImage("LoadingRed.png");
LoadingRed.resize(width,height);

}








//----------------------------------------object_values----------------------------------------------//





public void object_values() {    // All the values we need for frontpage

//mainframe values, given to the box framing the instructions.
  
  
  mainframeX = width/2;
  
  mainframeY = height/2;
  
  mainframeW = width*63/100;
  
  mainframeH = height*2/4;


//Control values, affected by mainframe

controlsXscale = width*56/100;

controlsYscale = (height*527)/1000;

controlsW = width/5;

controlsH = (height*23)/100;

 
//Made to reposition the enter and exit image position to wished positions.

ButtonXpos = width * 0.013f;



//Mainscreentext Size 
mainscreentextSize  = 0.035f*width;

//Startbutton values for button tracking.

StartbuttonX = width*0.19f;

StartbuttonXW = width*0.48f;

StartbuttonY = height*0.78f;

StartbuttonYH = height*0.905f;

//Exitbutton values for button tracking.

ExitbuttonX = width*0.52f;

ExitbuttonXW = width*0.80f;

ExitbuttonY = height*0.78f;

ExitbuttonYH = height*0.905f;



//grow value



}





//----------------------------------------startUp4----------------------------------------------//
public void startUp4() {
End2 = loadImage("End2.png");
End2.resize(width,height);

End2bad = loadImage("End2bad.png");
End2bad.resize(width,height);

GoodEndFinal = loadImage("GoodEndFinal.png");
GoodEndFinal.resize(width,height);

BadEnd = loadImage("BadEnd.png");
BadEnd.resize(width,height);

BossOffice = loadImage("BossOffice.png");
BossOffice.resize(width,height);

BossOfficeGoodEnd = loadImage("BossOfficeGoodEnd.png");
BossOfficeGoodEnd.resize(width,height);

BadEnd1 = loadImage("BadEnd1.png");
BadEnd1.resize(width,height);


mediumend1 = loadImage("mediumend1.png");
mediumend1.resize(width,height);

MediumEndfinal = loadImage("MediumEndfinal.png");
MediumEndfinal.resize(width,height);

Forrest2Sky = loadImage("Forrest2Sky.png");
Forrest2Sky.resize(width,height);

Endingmainframe();
Buy_the_forest = new EndingButton(1,"Buy the forest");
Settle_down_in_the_forest = new EndingButton(2,"Settle down in the forest");
Refuse_to_buy_the_forest = new EndingButton(3,"Refuse to buy the forest");


}




//----------------------------------------pictures----------------------------------------------//
public void pitcures() {

  Guy1GhostNew=loadImage("Guy1GhostNew.png");
  Guy1GhostReverse=loadImage("Guy1GhostReverse.png");
  backgroundFar2=loadImage("BackgroundJngTrees.png");
  backgroundMid2=loadImage("MiddlegroundJngTrees.png");
  backgroundClo2=loadImage("GroundForest1.png");
  backgroundFar3=loadImage("Forrest2Fields.png");
  backgroundMid3=loadImage("MiddlegroundJngTrees.png");
  backgroundClo3=loadImage("GroundForest1.png");
  background1Ext3=loadImage("Forrest2FieldsRiver.png");
  background2Ext3=loadImage("Forrest2Sky.png");
  background3Ext3=loadImage("BackgroundJngSky.png");

  backgroundFar4=loadImage("Scene3BurntDownBackGround.png");
  backgroundMid4=loadImage("Scene3BurntDown.png");
  backgroundClo4=loadImage("GroundForest2.png");
  treeFull=loadImage("INTERtree1.png");
  treeCut=loadImage("INTERtree2.png");
  
  treeGood=loadImage("INTERtreeSpirit.png");
  treeOkay=loadImage("INTERtreeSpiritAngry.png");
  treeBad=loadImage("INTERtreeSpiritDead.png");
  relic=loadImage("YouSeeItIsAMetaphor.png");
  backgroundFar2.resize(width, height);
  backgroundMid2.resize(width, height);
  backgroundClo2.resize(width, height);

  backgroundFar3.resize(width, height);
  backgroundMid3.resize(width, height);
  backgroundClo3.resize(width, height);
  background1Ext3.resize(width, height);
  background2Ext3.resize(width, height);
  background3Ext3.resize(width, height);


  backgroundFar4.resize(width, height);
  backgroundMid4.resize(width, height);
  backgroundClo4.resize(width, height);
  
  treeGood.resize(width,height);
  treeOkay.resize(width,height);
  treeBad.resize(width,height);
  relic.resize(width,height);
  

  treeFull.resize(width, height);
  treeCut.resize(width, height);
  Guy1GhostNew.resize(width, height);
  Guy1GhostReverse.resize(width, height);
  
}
public void background5() {
  image(background5,0,(-1*(height/8)));
  image(backgroundClo2,0,0);
  image(shaman,ShamanX,ShamanY);
}





  //----------------------------------------------------ENDING SCENE---------------------------------------------------------------//   




public void ending() {
switch(TreesCutForEndings){
  
  //----------------------------------------------------baddest_ending---------------------------------------------------------------//   
  
  
  case 0:
  image(BadEnd1,0,0); //baddest ed 1
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 1:
  image(End2bad,0,0); //baddest ed 2
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 2:
  image(BadEnd,0,0); //baddest ed 2
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
 //----------------------------------------------------best_ending---------------------------------------------------------------//  
  
  case 3:
  image(BossOfficeGoodEnd,0,0); //best ed 1
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 4:
  image(GoodEndFinal,0,0); //best ed 2
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 5:
  image(End2,0,0); //best ed 3
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  
//----------------------------------------------------middle_ending---------------------------------------------------------------//  
  
  case 6: // middle ending
  image(mediumend1,0,0); //best ed 3
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 7:
  image(MediumEndfinal,0,0); //best ed 3
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  
}


}
PImage LoadingYellow;
PImage LoadingRed;
PImage LoadingBlue;

PImage characterMain;
PImage characterMainRev;
PImage backgroundClo2;
PImage background5;
PImage shaman;
PImage frontpage_forrest, Controls;
PImage Enter, EnterWhite, Exit, ExitWhite;
PImage End2;
PImage End2bad;
PImage GoodEndFinal;
PImage BadEnd; 
PImage BossOffice;
PImage BossOfficeGoodEnd;
PImage BadEnd1;
PImage mediumend1;
PImage MediumEndfinal;
PImage Forrest2Sky;







PImage backgroundFar2;
PImage backgroundMid2;


PImage backgroundFar3;
PImage backgroundMid3;
PImage backgroundClo3;
PImage background1Ext3;
PImage background2Ext3;
PImage background3Ext3;
PImage treeGood, treeBad, treeOkay, relic;
  
  

PImage backgroundFar4;
PImage backgroundMid4;
PImage backgroundClo4;
PImage treeFull;
PImage treeCut;


PImage Guy1GhostNew;
PImage Guy1GhostReverse;
  public void settings() {  size(1280,720); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ReAssemble" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
