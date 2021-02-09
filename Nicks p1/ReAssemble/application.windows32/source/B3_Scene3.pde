void Choice3() {
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


void background3Far() {
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

void background3Clo() {
  for (int i = -1; i <= 10; i++) {    
    image(backgroundClo3, i*width-moveClo, 0);
  }
}

void movementB3() { 
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


  void scene3Trees() {
    tree4();
    tree5();
    tree6();
  }


  //---------------------------------------------------------------------//


  void tree4() {
    B2T4.display(treeCut, width);
    if (!use4) {
      B2T4.display(treeFull, width);
    }

    cutB2T4(1664, 1760, 1856,1968);
  }


  //---------------------------------------------------------------------//


  void tree5() {
    B2T5.display(treeCut, (2*width));
    if (!use5) {
      B2T4.display(treeFull, (2*width));
    }

    cutB2T5(2896, 3040, 3168, 3232);
  }


  //---------------------------------------------------------------------//


  void tree6() {
    B2T6.display(treeCut, (3*width));
    if (!use6) {
      B2T6.display(treeFull, (3*width));
    }

    cutB2T6(4224, 4320, 4432, 4538);
  }
  
  
  
  
 //----------------------------------------------------------------------B3_USE-----------------------------------------------------------------------------------------------------------------//  

void cutB2T4(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
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


void cutB2T5(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
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


void cutB2T6(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
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
  
  
