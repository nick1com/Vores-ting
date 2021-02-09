




void homebutton() {
  

int strokeWeightSmall = 0;
int strokeWeightMedium = 1;
int strokeWeightLarge = 2;
  
int leftLineX1 = (width/HomeScreenWidthLocation) - 20;
int leftLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int leftLineX2 = (width/HomeScreenWidthLocation) - 20;
int leftLiney2 = height - (height/HomeScreenHeightLocation) + 20;

int rightLineX1 = (width/HomeScreenWidthLocation) + 20;
int rightLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int rightLineX2 = (width/HomeScreenWidthLocation) + 20;
int rightLiney2 = height - (height/HomeScreenHeightLocation) + 20;

int bottomLineX1 = (width/HomeScreenWidthLocation) + 20;
int bottomLiney1 = height - (height/HomeScreenHeightLocation) + 20;
int bottomLineX2 = (width/HomeScreenWidthLocation) - 20;
int bottomLiney2 = height - (height/HomeScreenHeightLocation) + 20;

int rightRoofLineX1 = (width/HomeScreenWidthLocation) + 20;
int rightRoofLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int rightRoofLineX2 = (width/HomeScreenWidthLocation);
int rightRoofLiney2 = height - (height/HomeScreenHeightLocation) - 25;

int leftRoofLineX1 = (width/HomeScreenWidthLocation) - 20;
int leftRoofLiney1 = height - (height/HomeScreenHeightLocation) - 5;
int leftRoofLineX2 = (width/HomeScreenWidthLocation);
int leftRoofLiney2 = height - (height/HomeScreenHeightLocation) - 25;

//Homebutton
 stroke(strokeWeightSmall);
 strokeWeight(strokeWeightLarge);
 //left line
 line(leftLineX1,leftLiney1,leftLineX2,leftLiney2);
 //right line
 line(rightLineX1,rightLiney1,rightLineX2,rightLiney2);
 //bottom line
 line(bottomLineX1,bottomLiney1,bottomLineX2,bottomLiney2);
 //right roof
 line(rightRoofLineX1,rightRoofLiney1,rightRoofLineX2,rightRoofLiney2);
 //left roof
 line(leftRoofLineX1,leftRoofLiney1,leftRoofLineX2,leftRoofLiney2);
 fill(trancparancy,trancparancy);
 ellipse(width/HomeScreenWidthLocation, height - (height/HomeScreenHeightLocation), homeDiameterXY,homeDiameterXY);
 fill(invisibleEllipse,invisibleEllipse,invisibleEllipse,invisibleEllipse);
 strokeWeight(strokeWeightMedium);
  if(!scrollLock){
  if (mousePressed) {
   if(mouseX > (width/HomeScreenWidthLocation)-homeRadiusXY && mouseX < (width/HomeScreenWidthLocation)+homeRadiusXY
   && mouseY > (height - (height/HomeScreenHeightLocation)) - homeRadiusXY && mouseY < (height - (height/HomeScreenHeightLocation)) + homeRadiusXY){
     if(mouseButton==LEFT){
     captureTime = millis();
          page1 = false;
          page2 = true;
          page3 = false;
          page4 = false;
          page5 = false;
          page6 = false;
          page7 = false;
          page8 = false;
          page9 = false;
          page10 = false;
          page11 = false;
     
 }}}}
}
