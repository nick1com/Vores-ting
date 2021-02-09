void backgroundFar4() {
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


void background4Clo() {
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

void Trees4(int tempX){
  
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


void relic(int tempX){
  int x=tempX-moveClo;
  
  image(relic,x,-50);
  
}


void movementB4() {
  
    Main.moveJump();
    Main.moveJump();
    Main.moveMent(0, 4000, 0, 4020);


  
}
