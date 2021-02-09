


void ButtonForEndChoiceHome() {
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
    y = EndingmainframeY*0.5 * (0.4 + 0.8 * EndingbuttonNumber);
    this.Endingbuttontext=Endingbuttontext; //this er referance til classen som jeg har refereret til i linje 5 (this = linje 5 i dette tilfælde) (parameteret er defineret i linje 14)

   

  }






  void display() {
    // boolean hvis det under går i opfyldelse --> set grow 1.01 ellers sæt til 1
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
      grow = 1.01;
    } else grow = 1;      

    if (mousePressed && mouseButton == LEFT && mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {

      grow = 0.99;
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

  void displayText() {

    textAlign(LEFT);
    fill(BlueSpiritText);
    textSize((EndingmainscreentextSize)*grow*grow); // fjern hardcoding
    text(Endingbuttontext, width/6-20, y+20);
  }






  void Buy_the_forestVOID() {
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
      
        ChoiceValue = 6;
        println("t", " ",ChoiceValue);
         //PatchWork++;
         pageCounter = 41;
   
    }
  }
  void Settle_down_in_the_forestVOID() {
    if (mouseX >= x-width/4*3/2 && mouseX <= x + width/4*3/2 && mouseY >y-EndingmainframeY/3/2 && mouseY <= y + EndingmainframeY/3/2) {
     
        ChoiceValue = 10;
        println("t", " ",ChoiceValue);
         //PatchWork++;
         pageCounter = 41;
    }
   }

  void Refuse_to_buy_the_forestVOID() {
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
  
void Endingmainframe() {
  
  
  EndingmainframeX = width/2;
  
  EndingmainframeY = height/2;
  
  EndingmainframeW = width*8/10;
  
  EndingmainframeH = height*2/3;

  EndingmainscreentextSize  = 0.035*width;
}
