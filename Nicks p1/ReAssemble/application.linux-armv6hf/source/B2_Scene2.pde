//---------------------------------------------------------------------//


void Choice2() {
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


void background2Far() {
  for (int i = -1; i <= 10; i++) {    
    image(backgroundFar2, i*width-moveFar, 0);
    image(backgroundMid2, i*width-moveMid, 0);
  }
}


//---------------------------------------------------------------------//


void background2Clo() {
  for (int i = -1; i <= 10; i++) {    
    image(backgroundClo2, i*width-moveClo, 0);
  }
}


//---------------------------------------------------------------------//


void movementB2() {
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



void scene2Trees() {
  tree1();
  tree2();
  tree3();
}


//---------------------------------------------------------------------//


void tree1() {
  B2T1.display(treeCut, width);
  if (!use1) {
    B2T1.display(treeFull, width);
  }

  cutB2T1(1664, 1760, 1856,1968);
}


//---------------------------------------------------------------------//


void tree2() {
  B2T2.display(treeCut, (2*width));
  if (!use2) {
    B2T2.display(treeFull, (2*width));
  }

  cutB2T2(2896, 3040, 3168, 3232);
}


//---------------------------------------------------------------------//


void tree3() {
  B2T3.display(treeCut, (3*width));
  if (!use3) {
    B2T3.display(treeFull, (3*width));
  }

  cutB2T3(4224, 4320, 4432, 4538);
}







 //----------------------------------------------------------------------B2_USE-----------------------------------------------------------------------------------------------------------------//  


void cutB2T1(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
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


void cutB2T2(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
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


void cutB2T3(int minLTemp, int maxLTemp, int minRTemp, int maxRTemp) {
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
