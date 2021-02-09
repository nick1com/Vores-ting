void keyPressed() {

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


void keyReleased() {

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


void movement(){
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



void mainChar1(PImage mainPicUse,float mainStartX){
   
  image(mainPicUse,mainStartX,personY);
    
  }

void Character(){

      
  if(moveRight){
  mainChar1(characterMain,personX+movement);

  }
  if(moveLeft){
  mainChar1(characterMainRev,personX+movement);
  }
}
