//---------------------------------------------------------------------//


void Scene2() {
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


void Scene3() {

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


void Scene4() {  

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
