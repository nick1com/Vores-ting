void background5() {
  image(background5,0,(-1*(height/8)));
  image(backgroundClo2,0,0);
  image(shaman,ShamanX,ShamanY);
}





  //----------------------------------------------------ENDING SCENE---------------------------------------------------------------//   




void ending() {
switch(TreesCutForEndings){
  
  //----------------------------------------------------baddest_ending---------------------------------------------------------------//   
  
  
  case 0:
  image(BadEnd1,0,0); //baddest ed 1
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 1:
  image(End2bad,0,0); //baddest ed 2
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 2:
  image(BadEnd,0,0); //baddest ed 2
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
 //----------------------------------------------------best_ending---------------------------------------------------------------//  
  
  case 3:
  image(BossOfficeGoodEnd,0,0); //best ed 1
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 4:
  image(GoodEndFinal,0,0); //best ed 2
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 5:
  image(End2,0,0); //best ed 3
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  
//----------------------------------------------------middle_ending---------------------------------------------------------------//  
  
  case 6: // middle ending
  image(mediumend1,0,0); //best ed 3
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  case 7:
  image(MediumEndfinal,0,0); //best ed 3
  fill(colorOfContinueText);
  textSize(70);
  text("CLick To Continue", 20,HeightOfContinueText);
  break;
  
  
}


}
