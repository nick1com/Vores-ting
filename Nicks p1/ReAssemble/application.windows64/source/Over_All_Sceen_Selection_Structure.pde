//------------------------------------------FrontpageMouseClicked-------------------------------------------------------------//



void FrontpageMouseClicked(){
   
    //If the mouse is clicked and the mouse is within the area the program will enter next page.  
    
  if (mouseX>=StartbuttonX && mouseX<=StartbuttonXW && mouseY>=StartbuttonY && mouseY<StartbuttonYH) {
       pageCounter = 100; 
       convoCounter = 100; 
    
}
    
  
  //If the mouse is clicked and the mouse is within the area the program will exit.
  
  if (mouseX>=ExitbuttonX && mouseX<=ExitbuttonXW && mouseY>=ExitbuttonY && mouseY<ExitbuttonYH){
  exit();  
  
  
}
}


//------------------------------------------First_Convo-------------------------------------------------------------//



void SceneSelecter()  {

switch(convoCounter) { 

//screen before sharman house
case 100: 
pageCounter = 1;
convoCounter = 0;
break;
  
  
//Shaman convo getting you to next loading scene or leaving you in this scene  

case 0: //nothing is displayed in shaman conversation
convoCounter = 0;
break;

case 1: //this is the option to say yes or no to the journey in the shaman scene
if (mouseX>=width*0.5875 && mouseX<=width*0.6625 && mouseY>=height*0.625 && mouseY<=height*0.6875){
  convoCounter = 2;
}
else if(mouseX>=width*0.710 && mouseX<=width*0.792 && mouseY>=height*0.625 && mouseY<=height*0.6875){
  convoCounter = 3;
}
break;

case 2: //this is the loadingscreen before quest 1
if (mouseX>=width*0.5875 && mouseX<=width*0.6625 && mouseY>=height*0.6375 && mouseY<=height*0.675){ //
pageCounter = 2;
convoCounter = 10;
}
break;

case 3: //this is when the player refuses the quest
if (mouseX>=width*0.5875 && mouseX<=width*0.6625 && mouseY>=height*0.6375 && mouseY<=height*0.675){
convoCounter = 0;
}
break;


case 10:
pageCounter = 10;
break;

case 12:
pageCounter = 12;
break;

case 13:
pageCounter = 13;
break;


case 14:
pageCounter = 14;
break;


case 40: 
pageCounter = 40;
break;



}

}




//------------------------------------------SceneSelecter-------------------------------------------------------------//

void potionClick1() {
pageCounter = 40;
}
