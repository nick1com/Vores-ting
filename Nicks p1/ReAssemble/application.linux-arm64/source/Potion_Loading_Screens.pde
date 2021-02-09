void introScene() {
image(BossOffice,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);

}

void LoadingScreenOne() {
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

void LoadingScreenTwo() {
image(LoadingBlue,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);
   
}

void LoadingScreenThree() {
image(LoadingRed,0,0);
textSize(70);
fill(colorOfContinueText);
text("CLick To Continue", 20,HeightOfContinueText);
}
