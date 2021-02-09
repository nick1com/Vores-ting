void mouseReleased(){
scrollLock=false;
  }

void mousePressed(){
if(mouseButton==LEFT){
mouseYLock=mouseY;
captureTime=millis();
}

}







  void mouseDragged(){  
  captureTime=millis();
  if (mousePressed){
   if(page1 == true){
      if(mouseX>=255 && mouseX<=338 && mouseYLock>=727 && mouseYLock<=810){
      if(scrollL>=-300 && scrollL<=19){    
      scrollYLock=scrollYLock+mouseY-pmouseY;
     scrollLock=true;
     circkleAnim=0;
     whiteBling=300;
     i=0;
     iCir=0;
     circlehop=0;
     iAnim=0;
  }}}
    if(page2 == true){
      scrollLock=true;
    }
    
    if(page3 == true){
      scrollLock=true;
      if(scrollF>=-846 && scrollF<=20){
    
    scrollYFace=scrollYFace+mouseY-pmouseY;
  }}
  
   if(page4 == true){
   scrollLock=true;
  if(scrollM>=-120 && scrollM<=10){
  scrollYMess=scrollYMess+mouseY-pmouseY;
  }}
  
  if(page5 == true){
    scrollLock=true;
  if(scrollI>=-3600 && scrollI<=60){
  scrollYInsta=scrollYInsta+mouseY-pmouseY;
  }}
  
   if(page6 == true) { 
     scrollLock=true;
     if(scrollMG>=-290-homeDiameterXY && scrollMG<=50){
   scrollYMessG=scrollYMessG+mouseY-pmouseY;
   }}
   
   if(page7 == true) { 
     scrollLock=true;
     if(scrollM2>=-234-homeDiameterXY && scrollM2<=50){
   scrollYMess2=scrollYMess2+mouseY-pmouseY;
   }}
   
   if(page8 == true) { 
     scrollLock=true;
     if(scrollM3>=-200-homeDiameterXY && scrollM3<=50){
   scrollYMess3=scrollYMess3+mouseY-pmouseY;
   }}
   
   if(page9 == true) { 
     scrollLock=true;
     if(scrollM4>=-150-homeDiameterXY && scrollM4<=50){
   scrollYMess4=scrollYMess4+mouseY-pmouseY;
   }}
   
   if(page10 == true) { 
     scrollLock=true;
     if(scrollM5>=-100-homeDiameterXY && scrollM5<=50){
   scrollYMess5=scrollYMess5+mouseY-pmouseY;
   }}
 
   if(page11 == true){
     scrollLock=true;
     if(scrollA>=-600 && scrollA<=60){
    scrollYArb=scrollYArb+mouseY-pmouseY;
  }}

  
  
  
scrollY=scrollY+mouseY-pmouseY;
}}
