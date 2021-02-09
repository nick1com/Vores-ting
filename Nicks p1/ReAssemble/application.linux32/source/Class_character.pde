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
    gravity=-0.50;
    groundLevel=true;
    y=personY;
    h=100;
    w=24;
  }


  //---------------------------------------------------------------------//


  void moveMent(int minRtemp, int maxRtemp, int minLtemp, int maxLtemp) {
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


  void   mainChar1(PImage mainPicUse) {
    imageX=-60;
    x=personX+movement; 
    y=personY;
    image(mainPicUse, x+imageX, personY);
  }


  //---------------------------------------------------------------------//


  void movementDirection() {

    if (moveRight) {
      mainChar1(Guy1GhostNew);
    }
    if (moveLeft) {
      mainChar1(Guy1GhostReverse);
    }
  }






  //---------------------------------------------------------------------//


  void moveMent2() {
    moveRight(0, width*15);
    moveLeft(0, width*15);   
    //    moveJump(0, width*15);
  }


  //--------------------------------------------------------------int minTemp, int maxTemp-------//


  void moveRight(int minTemp, int maxTemp) {
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


  void moveLeft(int minTemp, int maxTemp) {

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

  void moveCounter() {
    if (Right && Left) {
    }
    if (!Right && !Left) {
    }
  }

  //---------------------------------------------------------------------//


  void moveJump() {

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
