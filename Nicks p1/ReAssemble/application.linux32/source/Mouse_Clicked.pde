//used to detect clicks
//the switch case in the mouseClicked void decides which click funtions to use.
//This is donme so that you cant accidentally click on thing from an onther scene,
//that you are currently not in.
void mouseClicked(){
  switch(pageCounter) {
  case 0:
  FrontpageMouseClicked(); //frontpage clicks //go to Over_All_Sceen_Selection_Structure tab to find function
  break;
  
  case 1:
  SceneSelecter(); //frontpage clicks //go to Over_All_Sceen_Selection_Structure tab to find function
  break;
  
  
  case 100:
  SceneSelecter();
  break;
  
  case 11:
  SceneSelecter();
  break;
  
  
  case 13:
  SceneSelecter();
  break;
  
  case 15:
  SceneSelecter();
  break;
  
  
  case 2:
  SceneSelecter();
  break;
  
  case 40:
  Buy_the_forest.Buy_the_forestVOID();
  Settle_down_in_the_forest.Settle_down_in_the_forestVOID();
  Refuse_to_buy_the_forest.Refuse_to_buy_the_forestVOID();
  ChooseEnding();
  break;
  
  case 41:
  ChooseEnding();
  break;
  
  }
 
}
