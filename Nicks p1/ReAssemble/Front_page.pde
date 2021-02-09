
//------------------------------------------------------drawFrontpage-----------------------------------------------------------------//


void drawFrontpage() {
  image(frontpage_forrest, zero, zero);
  strokeWeight(10);
  
  instructionFrame = new Box (blackColour, palegoldenrod, mainframeX, mainframeY*0.92, mainframeW, mainframeH);

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
  
  color stroke, fill;
  
  //calls what the box class requires of constructors to create a new box
  Box(color boxstroke, color boxfill, float x, float y, float w, float h) {  
  rectMode(CENTER);
  stroke(boxstroke);
  fill(boxfill);
  rect(x, y, w, h);
 
    
  }
}  
