




void topbarlock() {

  //background (backgroundColor);
  rectMode(CORNER);
  fill (255,255,255,0);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  stroke(1);
  
  //Med
  textSize(textTopSize);
  fill(0);
  textAlign(CORNER);
  text("Med",medX,Y,medW,medH);
  
  //reception
  rect(medX+medW,repY,repW,repH);
  rect(medX+medW+rSpace,repY,repW,repH2);
  rect(medX+medW+rSpace+rSpace,repY,repW,repH3);
  
  //wi-fi
  imageMode(CORNER);
  noStroke();
  image(imgWIFI,wifiX,wifiY,wifiW,wifiH);
  stroke(1);
  
  //lock  
  noStroke();
  imageMode(CENTER);
  //for some reason the lockX variable does not work, so value is manually put in here
  image(imgLock,width/2,lockY,lockW,lockH);
  stroke(1);
  
  //101
  textSize(textTopSize);
  fill(0);
  textAlign(CORNER);
  text("101%",X101,Y,W101,H101);
  
  //battery
  imageMode(CORNER);
  noStroke();
  image(imgBattery,X101+W101,yStart,batW,batH);
  stroke(1);
   
  
  
}
